package net.garunix.garunixpansion.block;

import net.garunix.garunixpansion.Garunixpansion;
import net.minecraft.block.WoodType;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.util.Identifier;

public class ModWoodType {
    public static final WoodType MAPLE = WoodTypeBuilder.copyOf(WoodType.CHERRY).register(
            Identifier.of(Garunixpansion.MOD_ID, "maple"), ModBlockSetType.MAPLE);
    public static final WoodType MAHOE = WoodTypeBuilder.copyOf(WoodType.JUNGLE).register(
            Identifier.of(Garunixpansion.MOD_ID, "mahoe"), ModBlockSetType.MAHOE);
    public static final WoodType STRANGE = WoodTypeBuilder.copyOf(WoodType.CRIMSON).register(
            Identifier.of(Garunixpansion.MOD_ID, "strange"), ModBlockSetType.STRANGE);

    //public static final Set<WoodType> VALUES = new ObjectArraySet<WoodType>();
    //public static final WoodType MAPLE = register(new WoodType("acacia", BlockSetType.ACACIA));

    public void init() {}
}
