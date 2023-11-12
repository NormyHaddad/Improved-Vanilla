package net.garunix.garunixpansion.mixin;

import net.garunix.garunixpansion.Garunixpansion;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.text.MutableText;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = Block.class)
public abstract class PitcherFireflies {
    @Shadow public abstract MutableText getName();

    @Inject(at = @At("HEAD"), method = "randomDisplayTick")
    private void spawnFireflies(BlockState state, World world, BlockPos pos, Random random, CallbackInfo ci) {
        if ((Object)this == Blocks.PITCHER_PLANT) {
            if (world.getTimeOfDay() >=14000 && world.getTimeOfDay() <= 22000) {
                int i = pos.getX();
                int j = pos.getY();
                int k = pos.getZ();
                BlockPos.Mutable mutable = new BlockPos.Mutable();
                for (int l = 0; l < 12; ++l) {
                    mutable.set(i + MathHelper.nextInt(random, -10, 10), j + random.nextInt(15), k + MathHelper.nextInt(random, -10, 10));
                    BlockState blockState = world.getBlockState(mutable);
                    if (blockState.isFullCube(world, mutable)) continue;
                    world.addParticle(Garunixpansion.FIREFLY,
                            (double) mutable.getX() + random.nextDouble(), (double) mutable.getY() + random.nextDouble(), (double) mutable.getZ() + random.nextDouble(),
                            (random.nextDouble() / 2) - 0.25, (random.nextDouble() / 2) - 0.25, (random.nextDouble() / 2) - 0.25);
                }
            }
        }
    }
}
