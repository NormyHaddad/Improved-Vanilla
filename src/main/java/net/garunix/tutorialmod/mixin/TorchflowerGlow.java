package net.garunix.tutorialmod.mixin;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin(value = Blocks.class)
public class TorchflowerGlow {
	@ModifyArg(
			method = "<clinit>",
			slice = @Slice(
					from = @At(value = "CONSTANT", args = "stringValue=torchflower"),
					to = @At(value = "CONSTANT", args = "stringValue=poppy")),
			at = @At(
					value = "INVOKE",
					target = "Lnet/minecraft/block/FlowerBlock;<init>" +
							"(Lnet/minecraft/entity/effect/StatusEffect;ILnet/minecraft/block/AbstractBlock$Settings;)V"),
			index = 2)

	private static AbstractBlock.Settings changeLuminance(AbstractBlock.Settings addLum) {

		return addLum.luminance(state -> 15);
	}
}