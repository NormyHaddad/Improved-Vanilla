package net.garunix.garunixpansion;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.garunix.garunixpansion.block.ModBlocks;
import net.garunix.garunixpansion.entity.ModBoats;
import net.garunix.garunixpansion.entity.ModEntities;
import net.garunix.garunixpansion.entity.RedCardinalRenderer;
import net.garunix.garunixpansion.particles.Firefly;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;

public class GarunixpansionClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SMOOTH_SMOKY_QUARTZ_BLOCK, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAPLE_LEAVES, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAPLE_SAPLING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAPLE_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLACIER_LILY, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FIREWEED, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BUNCHBERRY_FLOWER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAPLE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAHOE_LEAVES, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAHOE_SAPLING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAHOE_DOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAHOE_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOSSY_CALCITE_BRICKS, RenderLayer.getCutout());

		ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
			if (world == null || pos == null) { return -1; }
			return BiomeColors.getFoliageColor(world, pos); },
				ModBlocks.MAHOE_LEAVES,
				ModBlocks.MOSSY_CALCITE_BRICKS);

		ParticleFactoryRegistry.getInstance().register(Garunixpansion.FIREFLY, Firefly.Factory::new);

		EntityRendererRegistry.register(ModEntities.RED_CARDINAL, RedCardinalRenderer::new);

		TerraformBoatClientHelper.registerModelLayers(ModBoats.MAHOE_BOAT_ID, false);
		TerraformBoatClientHelper.registerModelLayers(ModBoats.MAHOE_CHEST_BOAT_ID, false);
	}
}