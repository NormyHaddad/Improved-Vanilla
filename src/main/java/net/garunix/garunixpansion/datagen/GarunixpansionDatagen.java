package net.garunix.garunixpansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;


public class GarunixpansionDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        final FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModBlockLootTableProvider::new);
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModRecipeGen::new);
        pack.addProvider(ModWorldGenerator::new);
    }

    @Override public void buildRegistry(RegistryBuilder registryBuilder) {
        //registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
        //registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
    }
}
