package net.garunix.tutorialmod.world.gen.trunk;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.trunk.GiantTrunkPlacer;

import java.util.List;
import java.util.function.BiConsumer;

public class GiantMapleTrunkPlacer extends GiantTrunkPlacer {
    public static final Codec<GiantMapleTrunkPlacer> CODEC = RecordCodecBuilder.create(
            instance -> GiantTrunkPlacer.fillTrunkPlacerFields(instance).apply(instance, GiantMapleTrunkPlacer::new));
    public GiantMapleTrunkPlacer(int i, int j, int k) { super(i, j, k); }

    private void setLog(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, BlockPos.Mutable tmpPos, TreeFeatureConfig config, BlockPos startPos, int dx, int dy, int dz) {
        tmpPos.set(startPos, dx, dy, dz);
        this.trySetState(world, replacer, random, tmpPos, config);
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        BlockPos blockPos = startPos.down();
        GiantTrunkPlacer.setToDirt(world, replacer, random, blockPos, config);
        GiantTrunkPlacer.setToDirt(world, replacer, random, blockPos.east(), config);
        GiantTrunkPlacer.setToDirt(world, replacer, random, blockPos.south(), config);
        GiantTrunkPlacer.setToDirt(world, replacer, random, blockPos.south().east(), config);
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        for (int i = 0; i < height; ++i) {
            this.setLog(world, replacer, random, mutable, config, startPos, 0, i, 0);
            //if (i >= height - 1) continue;
            this.setLog(world, replacer, random, mutable, config, startPos, 1, i, 0);
            this.setLog(world, replacer, random, mutable, config, startPos, 1, i, 1);
            this.setLog(world, replacer, random, mutable, config, startPos, 0, i, 1);
        }
        int xOffset = 1;
        int zOffset = 1;

        for (int i = 0; i < 3; ++i)
        {
            this.setLog(world, replacer, random, mutable, config, startPos, -xOffset, i + height - 3, 1);
            this.setLog(world, replacer, random, mutable, config, startPos, xOffset + 1, i + height - 3, 0);
            this.setLog(world, replacer, random, mutable, config, startPos, 1, i + height - 3, zOffset + 1);
            this.setLog(world, replacer, random, mutable, config, startPos, 0, i + height - 3, -zOffset);
            xOffset++;
            zOffset++;
        }
        return ImmutableList.of(new FoliagePlacer.TreeNode(startPos.up(height), 0, true));
    }
}
