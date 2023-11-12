package net.garunix.garunixpansion.world.biome;

import net.garunix.garunixpansion.Garunixpansion;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public class ModBiomes {
    public static final RegistryKey<Biome> AUTUMN_FOREST = register("autumn_forest");

    private static RegistryKey<Biome> register(String name)
    {
        return RegistryKey.of(RegistryKeys.BIOME, new Identifier(Garunixpansion.MOD_ID, name));
    }
}
