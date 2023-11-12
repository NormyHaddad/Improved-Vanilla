package net.garunix.garunixpansion.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModificationContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.garunix.garunixpansion.Garunixpansion;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.BiomeKeys;

import java.util.Optional;

public abstract class ModWorldGeneration implements BiomeModificationContext.EffectsContext {
    public static void generateModWorldGen() {
        ModTreeGeneration.generateTrees();
    }

    @Override
    public void setGrassColor(Optional<Integer> color) {
        var savannaModifier = BiomeModifications.create(new Identifier(Garunixpansion.MOD_ID, "bright_green"));
        var ctx = BiomeSelectors.includeByKey(BiomeKeys.WINDSWEPT_SAVANNA);
        savannaModifier.add(ModificationPhase.REPLACEMENTS, ctx, (bsCtx, bmCtx) -> {
            bmCtx.getEffects().setGrassColor(7864064);
        });
    }

    @Override
    public void setFoliageColor(Optional<Integer> color) {
        var savannaModifier = BiomeModifications.create(new Identifier(Garunixpansion.MOD_ID, "bright_green"));
        var ctx = BiomeSelectors.includeByKey(BiomeKeys.WINDSWEPT_SAVANNA);
        savannaModifier.add(ModificationPhase.REPLACEMENTS, ctx, (bsCtx, bmCtx) -> {
            bmCtx.getEffects().setFoliageColor(7864064);
        });
    }

    public static void init() {}
}
