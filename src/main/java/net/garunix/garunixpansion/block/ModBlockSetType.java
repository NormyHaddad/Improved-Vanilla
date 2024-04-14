package net.garunix.garunixpansion.block;

import net.garunix.garunixpansion.Garunixpansion;
import net.minecraft.block.BlockSetType;

import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.minecraft.util.Identifier;

public class ModBlockSetType {
    public static final BlockSetType MAPLE = BlockSetTypeBuilder.copyOf(BlockSetType.CHERRY).register(
            new Identifier(Garunixpansion.MOD_ID, "maple"));
    public static final BlockSetType MAHOE = BlockSetTypeBuilder.copyOf(BlockSetType.JUNGLE).register(
            new Identifier(Garunixpansion.MOD_ID, "mahoe"));
    public static final BlockSetType STRANGE = BlockSetTypeBuilder.copyOf(BlockSetType.CRIMSON).register(
            new Identifier(Garunixpansion.MOD_ID, "strange"));
    public void init() {}
}
