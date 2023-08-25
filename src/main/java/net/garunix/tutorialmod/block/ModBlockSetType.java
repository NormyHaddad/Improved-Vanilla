package net.garunix.tutorialmod.block;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import net.garunix.tutorialmod.TutorialMod;
import net.minecraft.block.BlockSetType;

import java.util.Set;

import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.minecraft.util.Identifier;

public class ModBlockSetType {
    public static final BlockSetType MAPLE = BlockSetTypeBuilder.copyOf(BlockSetType.CHERRY).register(
            new Identifier(TutorialMod.MOD_ID, "maple"));
    public static final BlockSetType MAHOE = BlockSetTypeBuilder.copyOf(BlockSetType.JUNGLE).register(
            new Identifier(TutorialMod.MOD_ID, "mahoe"));
    public void init() {}
}
