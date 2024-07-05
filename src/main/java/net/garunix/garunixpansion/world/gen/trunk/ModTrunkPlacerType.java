package net.garunix.garunixpansion.world.gen.trunk;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import net.garunix.garunixpansion.Garunixpansion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

public class ModTrunkPlacerType  extends TrunkPlacerType{
    public ModTrunkPlacerType(MapCodec codec) {
        super(codec);
    }

    public static final TrunkPlacerType<GiantMapleTrunkPlacer> GIANT_MAPLE_TRUNK_PLACER = ModTrunkPlacerType.register(
            Identifier.of(Garunixpansion.MOD_ID, "giant_maple_trunk_placer"), GiantMapleTrunkPlacer.CODEC);
    public static final TrunkPlacerType<StrangeTrunkPlacer> STRANGE_TRUNK_PLACER = ModTrunkPlacerType.register(
            Identifier.of(Garunixpansion.MOD_ID, "strange_trunk_placer"), StrangeTrunkPlacer.CODEC);

    private static <P extends TrunkPlacer> TrunkPlacerType<P> register(Identifier id, MapCodec<P> codec) {
        return Registry.register(Registries.TRUNK_PLACER_TYPE, id, new TrunkPlacerType<P>(codec));
    }

    public static void init() {}
}
