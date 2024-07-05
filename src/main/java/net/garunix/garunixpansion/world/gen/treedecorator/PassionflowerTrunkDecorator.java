package net.garunix.garunixpansion.world.gen.treedecorator;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import net.garunix.garunixpansion.block.ModBlocks;
import net.garunix.garunixpansion.world.ModTreeGen;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.VineBlock;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

public class PassionflowerTrunkDecorator extends TreeDecorator {

    public static final PassionflowerTrunkDecorator INSTANCE = new PassionflowerTrunkDecorator();

    public static final MapCodec<PassionflowerTrunkDecorator> CODEC = MapCodec.unit(() -> INSTANCE);

    @Override
    protected TreeDecoratorType <?> getType() {
        return ModTreeGen.PASSIONFLOWER_TRUNK_DECORATOR;
    }

    @Override
    public void generate(Generator generator) {
        
    }

    public void generate(ModTreeDecorator.Generator generator) {
        Random random = generator.getRandom();
        generator.getLogPositions().forEach((pos) -> {
            BlockPos blockPos;
            if (random.nextInt(3) > 0) {
                blockPos = pos.west();
                if (generator.isAir(blockPos)) {
                    generator.replaceWithVine(ModBlocks.PASSIONFLOWER, blockPos, VineBlock.EAST);
                }
            }

            if (random.nextInt(3) > 0) {
                blockPos = pos.east();
                if (generator.isAir(blockPos)) {
                    generator.replaceWithVine(ModBlocks.PASSIONFLOWER, blockPos, VineBlock.WEST);
                }
            }

            if (random.nextInt(3) > 0) {
                blockPos = pos.north();
                if (generator.isAir(blockPos)) {
                    generator.replaceWithVine(ModBlocks.PASSIONFLOWER, blockPos, VineBlock.SOUTH);
                }
            }

            if (random.nextInt(3) > 0) {
                blockPos = pos.south();
                if (generator.isAir(blockPos)) {
                    generator.replaceWithVine(ModBlocks.PASSIONFLOWER, blockPos, VineBlock.NORTH);
                }
            }

        });
    }
}
