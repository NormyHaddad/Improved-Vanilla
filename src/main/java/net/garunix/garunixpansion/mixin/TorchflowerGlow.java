package net.garunix.garunixpansion.mixin;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.TorchflowerBlock;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

//@Debug(export = true)
@Mixin(value = Blocks.class)
public class TorchflowerGlow {
	@ModifyArg(
			method = "<clinit>",
			slice = @Slice(
					from = @At(value = "CONSTANT", args = "stringValue=torchflower"),
					to = @At(value = "CONSTANT", args = "stringValue=poppy")),
			at = @At(
					value = "INVOKE",
					target = "Lnet/minecraft/block/FlowerBlock;<init>(Lnet/minecraft/registry/entry/RegistryEntry;FLnet/minecraft/block/AbstractBlock$Settings;)V"),
			index = 2)

	private static AbstractBlock.Settings changeLuminance(AbstractBlock.Settings addLum) {

		return addLum.luminance(state -> 15);
	}
}