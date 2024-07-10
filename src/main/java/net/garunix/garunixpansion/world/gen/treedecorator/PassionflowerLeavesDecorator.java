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

public class PassionflowerLeavesDecorator extends TreeDecorator {
    public static final MapCodec<PassionflowerLeavesDecorator> CODEC = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(PassionflowerLeavesDecorator::new, (treeDecorator) -> {
        return treeDecorator.probability;
    });
    private final float probability;

    @Override
    protected TreeDecoratorType<?> getType() {
        return ModTreeGen.PASSIONFLOWER_LEAVES_DECORATOR;
    }

    public PassionflowerLeavesDecorator(float probability) {
        this.probability = probability;
    }

    @Override
    public void generate(TreeDecorator.Generator generator) {
        Random random = generator.getRandom();
        generator.getLeavesPositions().forEach((pos) -> {
            BlockPos blockPos;
            if (random.nextFloat() < this.probability) {
                blockPos = pos.west();
                if (generator.isAir(blockPos)) {
                    placeVines(blockPos, VineBlock.EAST, generator);
                }
            }

            if (random.nextFloat() < this.probability) {
                blockPos = pos.east();
                if (generator.isAir(blockPos)) {
                    placeVines(blockPos, VineBlock.WEST, generator);
                }
            }

            if (random.nextFloat() < this.probability) {
                blockPos = pos.north();
                if (generator.isAir(blockPos)) {
                    placeVines(blockPos, VineBlock.SOUTH, generator);
                }
            }

            if (random.nextFloat() < this.probability) {
                blockPos = pos.south();
                if (generator.isAir(blockPos)) {
                    placeVines(blockPos, VineBlock.NORTH, generator);
                }
            }

        });
    }

    private static void placeVines(BlockPos pos, BooleanProperty faceProperty, TreeDecorator.Generator generator) {
        generator.replaceWithVine(pos, faceProperty);
        int i = 4;

        for(pos = pos.down(); generator.isAir(pos) && i > 0; --i) {
            generator.replace(pos, (BlockState) Blocks.VINE.getDefaultState().with(faceProperty, true));
            pos = pos.down();
        }

    }
}
