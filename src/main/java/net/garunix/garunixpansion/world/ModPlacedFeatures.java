package net.garunix.garunixpansion.world;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.garunix.garunixpansion.Garunixpansion;
import net.garunix.garunixpansion.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> MAPLE_PLACED_KEY = registerKey("maple_placed");
    public static final RegistryKey<PlacedFeature> MEGA_MAPLE_PLACED_KEY = registerKey("mega_maple_placed");
    public static final RegistryKey<PlacedFeature> MAHOE_PLACED_KEY = registerKey("mahoe_placed");
    public static final RegistryKey<PlacedFeature> FLOWER_JUNGLE_PLACED_KEY = registerKey("flower_jungle_placed");
    public static final RegistryKey<PlacedFeature> PASSIONFLOWER_JUNGLE_TREE_PLACED_KEY = registerKey("passionflower_jungle_tree_placed");
    public static final RegistryKey<PlacedFeature> PASSIONFLOWER_MEGA_JUNGLE_TREE_PLACED_KEY = registerKey("passionflower_mega_jungle_tree_placed");

    public static final RegistryKey<PlacedFeature> DARK_FOREST_MUSHROOM_PATCH_PLACED_KEY = registerKey("dark_forest_mushroom_patch_placed");
    public static final RegistryKey<PlacedFeature> DARK_FOREST_FLOWER_PATCH_PLACED_KEY = registerKey("dark_forest_flower_patch_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, MAPLE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(
            ModConfiguredFeatures.MAPLE_KEY), VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                PlacedFeatures.createCountExtraModifier(2, 0.2f, 2), ModBlocks.MAPLE_SAPLING));
        register(context, MEGA_MAPLE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(
            ModConfiguredFeatures.MEGA_MAPLE_KEY), VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                PlacedFeatures.createCountExtraModifier(0, 0.5f, 1), ModBlocks.MAPLE_SAPLING));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Garunixpansion.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                 RegistryEntry<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(
            Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
            RegistryEntry<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
