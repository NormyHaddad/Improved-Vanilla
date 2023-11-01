package net.garunix.tutorialmod.world.gen.trunk;

import com.mojang.serialization.Codec;
import net.garunix.tutorialmod.TutorialMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.trunk.GiantTrunkPlacer;
import net.minecraft.world.gen.trunk.LargeOakTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

public class ModTrunkPlacerType  extends TrunkPlacerType{
    public ModTrunkPlacerType(Codec codec) {
        super(codec);
    }

    public static final TrunkPlacerType<GiantMapleTrunkPlacer> GIANT_MAPLE_TRUNK_PLACER = ModTrunkPlacerType.register(
            new Identifier(TutorialMod.MOD_ID, "giant_maple_trunk_placer"), GiantMapleTrunkPlacer.CODEC);
    public static final TrunkPlacerType<StrangeTrunkPlacer> STRANGE_TRUNK_PLACER = ModTrunkPlacerType.register(
            new Identifier(TutorialMod.MOD_ID, "strange_trunk_placer"), StrangeTrunkPlacer.CODEC);

    private static <P extends TrunkPlacer> TrunkPlacerType<P> register(Identifier id, Codec<P> codec) {
        return Registry.register(Registries.TRUNK_PLACER_TYPE, id, new TrunkPlacerType<P>(codec));
    }

    public static void init() {}
}
