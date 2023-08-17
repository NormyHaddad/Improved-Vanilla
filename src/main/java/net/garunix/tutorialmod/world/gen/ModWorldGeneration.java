package net.garunix.tutorialmod.world.gen;

import net.garunix.tutorialmod.TutorialMod;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.OverworldBiomeCreator;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        ModTreeGeneration.generateTrees();
    }
}
