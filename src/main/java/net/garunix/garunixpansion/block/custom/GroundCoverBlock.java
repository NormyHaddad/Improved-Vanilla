package net.garunix.garunixpansion.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class GroundCoverBlock extends PlantBlock {
    public static final MapCodec<GroundCoverBlock> CODEC = createCodec(GroundCoverBlock::new);
    protected static final VoxelShape SHAPE;

    public GroundCoverBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends PlantBlock> getCodec() { return CODEC; }

    protected boolean isShapeFullCube(BlockState state, BlockView world, BlockPos pos) { return false; }

    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    static {
        SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
    }
}
