package net.garunix.garunixpansion.world.gen;

import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.garunix.garunixpansion.world.ModPlacedFeatures;
import net.garunix.garunixpansion.world.gen.treedecorator.PassionflowerLeavesDecorator;
import net.garunix.garunixpansion.world.gen.treedecorator.PassionflowerTrunkDecorator;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

import static net.garunix.garunixpansion.Garunixpansion.MOD_ID;

public class ModTreeGeneration {
    public static final TreeDecoratorType<PassionflowerTrunkDecorator> PASSIONFLOWER_TRUNK_DECORATOR = registerTreeDecorator("passionflower_trunk_decorator", PassionflowerTrunkDecorator.CODEC);
    public static final TreeDecoratorType<PassionflowerLeavesDecorator> PASSIONFLOWER_LEAVES_DECORATOR = registerTreeDecorator("passionflower_leaves_decorator", PassionflowerLeavesDecorator.CODEC);

    private static <P extends TreeDecorator> TreeDecoratorType<P> registerTreeDecorator(String id, MapCodec<P> codec) {
        return (TreeDecoratorType) Registry.register(Registries.TREE_DECORATOR_TYPE,  Identifier.of(MOD_ID, id), new TreeDecoratorType(codec));
    }

    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SPARSE_JUNGLE), GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.MAHOE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE), GenerationStep.Feature.VEGETAL_DECORATION,
                ModPlacedFeatures.FLOWER_JUNGLE_PLACED_KEY);

        // For testing purposes
    }
}
