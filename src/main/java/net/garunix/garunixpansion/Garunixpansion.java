package net.garunix.garunixpansion;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.garunix.garunixpansion.block.ModBlocks;
import net.garunix.garunixpansion.block.ModFlammableBlockRegistries;
import net.garunix.garunixpansion.entity.ModBoats;
import net.garunix.garunixpansion.entity.ModEntities;
import net.garunix.garunixpansion.entity.custom.RedCardinalEntity;
//import net.garunix.garunixpansion.entity.custom.RedCardinalEntityOld;
import net.garunix.garunixpansion.item.ModItems;
import net.garunix.garunixpansion.world.biome.ModRegion1;
import net.garunix.garunixpansion.world.gen.ModWorldGeneration;
import net.garunix.garunixpansion.world.gen.trunk.ModTrunkPlacerType;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.BiomeKeys;
import terrablender.api.Regions;
import terrablender.api.RegionType;
import terrablender.api.TerraBlenderApi;

public class Garunixpansion implements ModInitializer, TerraBlenderApi {
	public static final String MOD_ID = "garunixpansion";

	public static final DefaultParticleType FIREFLY = FabricParticleTypes.simple();

	@Override
	public void onTerraBlenderInitialized() {
		Regions.register(new ModRegion1(new Identifier(Garunixpansion.MOD_ID, "overworld_1"), RegionType.OVERWORLD, 2));
	}

	@Override
	public void onInitialize() {
		//ModItemGroup.registerItemGroups();
		Registry.register(Registries.PARTICLE_TYPE, new Identifier(MOD_ID, "firefly"), FIREFLY);
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItems.assignItemGroups();

		ModTrunkPlacerType.init();
		ModWorldGeneration.init();
		ModWorldGeneration.generateModWorldGen();

		var savannaModifier = BiomeModifications.create(new Identifier(Garunixpansion.MOD_ID, "savanna_modifier"));
		var ctx = BiomeSelectors.includeByKey(BiomeKeys.WINDSWEPT_SAVANNA);
		savannaModifier.add(ModificationPhase.REPLACEMENTS, ctx, (bsCtx, bmCtx) -> { bmCtx.getEffects().setFoliageColor(3648000); });
		savannaModifier.add(ModificationPhase.REPLACEMENTS, ctx, (bsCtx, bmCtx) -> { bmCtx.getEffects().setGrassColor(3849472); });

		var cherryModifier = BiomeModifications.create(new Identifier(Garunixpansion.MOD_ID, "cherry_modifier"));
		ctx = BiomeSelectors.includeByKey(BiomeKeys.CHERRY_GROVE);
		cherryModifier.add(ModificationPhase.REPLACEMENTS, ctx, (bsCtx, bmCtx) -> { bmCtx.getEffects().setGrassColor(13427148); });
		cherryModifier.add(ModificationPhase.REPLACEMENTS, ctx, (bsCtx, bmCtx) -> { bmCtx.getEffects().setFoliageColor(11522223); });

		ModBoats.registerBoats();

		StrippableBlockRegistry.register(ModBlocks.MAPLE_LOG, ModBlocks.STRIPPED_MAPLE_LOG);
		StrippableBlockRegistry.register(ModBlocks.MAPLE_LOG, ModBlocks.STRIPPED_MAPLE_LOG);
		StrippableBlockRegistry.register(ModBlocks.MAHOE_LOG, ModBlocks.STRIPPED_MAHOE_LOG);
		StrippableBlockRegistry.register(ModBlocks.MAHOE_WOOD, ModBlocks.STRIPPED_MAHOE_WOOD);

		ModFlammableBlockRegistries.registerFlammableBlocks();

		FabricDefaultAttributeRegistry.register(ModEntities.RED_CARDINAL, RedCardinalEntity.setAttributes());
	}
}