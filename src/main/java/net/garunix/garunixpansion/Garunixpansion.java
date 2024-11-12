package net.garunix.garunixpansion;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.garunix.garunixpansion.block.ModBlocks;
import net.garunix.garunixpansion.block.ModFlammableBlockRegistries;
import net.garunix.garunixpansion.block.ModFuelRegistries;
import net.garunix.garunixpansion.entity.ModBoats;
import net.garunix.garunixpansion.entity.ModEntities;
import net.garunix.garunixpansion.entity.custom.RedCardinalEntity;
import net.garunix.garunixpansion.item.ModItems;
import net.garunix.garunixpansion.particle.ModParticles;
import net.garunix.garunixpansion.world.biome.ModRegion1;
import net.garunix.garunixpansion.world.gen.ModWorldGeneration;
import net.garunix.garunixpansion.world.gen.trunk.ModTrunkPlacerType;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import terrablender.api.Regions;
import terrablender.api.RegionType;
import terrablender.api.TerraBlenderApi;

public class Garunixpansion implements ModInitializer, TerraBlenderApi {

	public static final String MOD_ID = "garunixpansion";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onTerraBlenderInitialized() {
		Regions.register(new ModRegion1(Identifier.of(Garunixpansion.MOD_ID, "overworld_1"), RegionType.OVERWORLD, 2));
	}

	@Override
	public void onInitialize() {

		Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, "firefly"), ModParticles.FIREFLY);

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItems.assignItemGroups();

		ModTrunkPlacerType.init();
		ModWorldGeneration.init();
		ModWorldGeneration.generateModWorldGen();

		ModBoats.registerBoats();

		ModFuelRegistries.registerFuel();

		StrippableBlockRegistry.register(ModBlocks.MAPLE_LOG, ModBlocks.STRIPPED_MAPLE_LOG);
		StrippableBlockRegistry.register(ModBlocks.MAPLE_LOG, ModBlocks.STRIPPED_MAPLE_LOG);
		StrippableBlockRegistry.register(ModBlocks.MAHOE_LOG, ModBlocks.STRIPPED_MAHOE_LOG);
		StrippableBlockRegistry.register(ModBlocks.MAHOE_WOOD, ModBlocks.STRIPPED_MAHOE_WOOD);

		RegistryKey<LootTable> SNIFFER_LOOT_TABLE_ID = LootTables.SNIFFER_DIGGING_GAMEPLAY;

		LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
					if (source.isBuiltin() && SNIFFER_LOOT_TABLE_ID.equals(key)) {
						tableBuilder.modifyPools(poolBuilder -> {
							poolBuilder.with(ItemEntry.builder(Items.TORCHFLOWER_SEEDS).weight(3))
									.with(ItemEntry.builder(Items.PITCHER_POD).weight(3))
									.with(ItemEntry.builder(ModItems.RED_ROSE_SEEDS).weight(2))
									.with(ItemEntry.builder(ModItems.CYAN_ROSE_SEEDS).weight(1));
						}
					);};
				}
		);

		ModFlammableBlockRegistries.registerFlammableBlocks();

		FabricDefaultAttributeRegistry.register(ModEntities.RED_CARDINAL, RedCardinalEntity.setAttributes());
	}
}