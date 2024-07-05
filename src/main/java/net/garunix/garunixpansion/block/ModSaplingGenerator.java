package net.garunix.garunixpansion.block;

import net.garunix.garunixpansion.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;
//import software.bernie.shadowed.eliotlash.mclib.math.functions.classic.Mod;

import java.util.Optional;

public class ModSaplingGenerator{
    public static final SaplingGenerator MAPLE = new SaplingGenerator(
            "maple",
            Optional.of(ModConfiguredFeatures.MEGA_MAPLE_KEY),
            Optional.of(ModConfiguredFeatures.MAPLE_KEY),
            Optional.empty());

    public static final SaplingGenerator MAHOE = new SaplingGenerator(
            "maple",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.MAHOE_KEY),
            Optional.empty());

    public static final SaplingGenerator STRANGE = new SaplingGenerator(
            "maple",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.STRANGE_KEY),
            Optional.empty());
}
