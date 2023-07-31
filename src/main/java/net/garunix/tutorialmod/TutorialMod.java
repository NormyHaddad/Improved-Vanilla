package net.garunix.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.garunix.tutorialmod.block.ModBlocks;
import net.garunix.tutorialmod.datagen.ModWorldGenerator;
import net.garunix.tutorialmod.item.ModItemGroup;
import net.garunix.tutorialmod.item.ModItems;
import net.garunix.tutorialmod.world.gen.ModWorldGeneration;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";

	public static final DefaultParticleType FIREFLY = FabricParticleTypes.simple();

	@Override
	public void onInitialize() {
		//ModItemGroup.registerItemGroups();
		Registry.register(Registries.PARTICLE_TYPE, new Identifier(MOD_ID, "firefly"), FIREFLY);
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItems.assignItemGroups();

		ModWorldGeneration.generateModWorldGen();

		StrippableBlockRegistry.register(ModBlocks.MAPLE_LOG, ModBlocks.STRIPPED_MAPLE_LOG);
		StrippableBlockRegistry.register(ModBlocks.MAPLE_WOOD, ModBlocks.STRIPPED_MAPLE_WOOD);
	}
}