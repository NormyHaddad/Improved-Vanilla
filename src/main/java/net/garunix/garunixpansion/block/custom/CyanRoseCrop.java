package net.garunix.garunixpansion.block.custom;

import net.garunix.garunixpansion.block.ModBlocks;
import net.garunix.garunixpansion.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;

public class CyanRoseCrop extends CropBlock {
    public static final int MAX_AGE = 5;
    public static final IntProperty AGE =  IntProperty.of("age", 0, 5);

    public CyanRoseCrop(Settings settings) {
        super(settings);
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected IntProperty getAgeProperty() {
        return AGE;
    }

    public BlockState withAge(int age) {
        return age == 3 ? ModBlocks.CYAN_ROSE.getDefaultState() : super.withAge(age);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.CYAN_ROSE_SEEDS;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}
