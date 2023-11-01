package net.garunix.tutorialmod.world.gen.trunk;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.trunk.CherryTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class StrangeTrunkPlacer extends TrunkPlacer {
    public static final Codec<StrangeTrunkPlacer> CODEC = RecordCodecBuilder.create(instance ->
            fillTrunkPlacerFields(instance).apply(instance, StrangeTrunkPlacer::new));

    public StrangeTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return ModTrunkPlacerType.STRANGE_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        setToDirt(world, replacer, random, startPos.down(), config);

        this.getAndSetState(world, replacer, random, startPos.up(height + 1), config);
        for (int i = 1; i <= height; i++) {
            int rand = (int) Math.round(Math.random() * 2);
            if(rand == 1) {
                this.getAndSetState(world, replacer, random, startPos.up(height + 1).north(i), config);}
            else {
                this.getAndSetState(world, replacer, random, startPos.up(height + 1).north(i)
                        .east(random.nextBoolean() ? 1 : -1), config);}

            rand = (int) Math.round(Math.random() * 2);
            if(rand == 1) {
                this.getAndSetState(world, replacer, random, startPos.up(height + 1).south(i), config);}
            else {
                this.getAndSetState(world, replacer, random, startPos.up(height + 1).south(i)
                        .east(random.nextBoolean() ? 1 : -1), config);}

            rand = (int) Math.round(Math.random() * 2);
            if(rand == 1) {
                this.getAndSetState(world, replacer, random, startPos.up(height + 1).east(i), config);}
            else {
                this.getAndSetState(world, replacer, random, startPos.up(height + 1).east(i)
                        .south(random.nextBoolean() ? 1 : -1), config);}

            rand = (int) Math.round(Math.random() * 2);
            //rand = Random.create().nextBetween();
            if(rand == 1) {
                this.getAndSetState(world, replacer, random, startPos.up(height + 1).west(i), config);}
            else {
                this.getAndSetState(world, replacer, random, startPos.up(height + 1).west(i)
                        .south(random.nextBoolean() ? 1 : -1), config);}
        }

        // We create two TreeNodes - one for the first trunk, and the other for the second
        // Put the highest block in the trunk as the center position for the FoliagePlacer to use
        return ImmutableList.of(
                new FoliagePlacer.TreeNode(startPos.up(height + 1).north(height), 0, false),
                new FoliagePlacer.TreeNode(startPos.up(height + 1).east(height), 0, false),
                new FoliagePlacer.TreeNode(startPos.up(height + 1).west(height), 0, false),
                new FoliagePlacer.TreeNode(startPos.up(height + 1).south(height), 0, false));
    }
}
