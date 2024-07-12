package net.garunix.garunixpansion.block.custom;

import net.garunix.garunixpansion.block.ModBlocks;
import net.garunix.garunixpansion.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;

public class OldRoseCrop extends CropBlock {
    public static final int MAX_AGE = 3;
    public static final IntProperty AGE =  IntProperty.of("age", 0, 3);

    public OldRoseCrop(Settings settings) {
        super(settings);
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    public BlockState withAge(int age) {
        return age == 3 ? ModBlocks.RED_ROSE.getDefaultState() : super.withAge(age);
    }

    @Override
    protected IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.RED_ROSE_SEEDS;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}
