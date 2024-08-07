package net.garunix.garunixpansion.world;

import net.garunix.garunixpansion.Garunixpansion;
import net.garunix.garunixpansion.block.ModBlocks;
import net.garunix.garunixpansion.world.gen.trunk.GiantMapleTrunkPlacer;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.CherryFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAPLE_KEY = registerKey("maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_MAPLE_KEY = registerKey("mega_maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAHOE_KEY = registerKey("mahoe");
    public static final RegistryKey<ConfiguredFeature<?, ?>> STRANGE_KEY = registerKey("strange");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FLOWER_JUNGLE_KEY = registerKey("flower_jungle");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PASSIONFLOWER_JUNGLE_TREE_KEY = registerKey("passionflower_jungle_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PASSIONFLOWER_MEGA_JUNGLE_TREE_KEY = registerKey("passionflower_mega_jungle_tree");
    
    public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_FOREST_MUSHROOM_PATCH_KEY = registerKey("dark_forest_mushroom_patch");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_FOREST_FLOWER_PATCH_KEY = registerKey("dark_forest_flower_patch");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        register(context, MAPLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
         BlockStateProvider.of(ModBlocks.MAPLE_LOG),
                new StraightTrunkPlacer(5, 6, 3),
                BlockStateProvider.of(ModBlocks.MAPLE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(1), 4),
                new TwoLayersFeatureSize(3, 1, 5)).build());

        register(context, MEGA_MAPLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.MAPLE_LOG),
                new GiantMapleTrunkPlacer(10, 5, 5),
                BlockStateProvider.of(ModBlocks.MAPLE_LEAVES),
                new CherryFoliagePlacer(ConstantIntProvider.create(5), ConstantIntProvider.create(0), ConstantIntProvider.create(5),
                    0.2f, 0.5f, 0.5f, 0.3f),
                new TwoLayersFeatureSize(5, 2, 7)).build());
    }

    public static final RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Garunixpansion.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(
            Registerable<ConfiguredFeature<?, ?>> context, RegistryKey <ConfiguredFeature<?, ?>> key,
            F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
