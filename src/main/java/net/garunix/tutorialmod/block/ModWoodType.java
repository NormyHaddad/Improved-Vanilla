package net.garunix.tutorialmod.block;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import net.garunix.tutorialmod.TutorialMod;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.WoodType;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.util.Identifier;

import java.util.Set;

public class ModWoodType {
    public static final WoodType MAPLE = WoodTypeBuilder.copyOf(WoodType.CHERRY).register(
            new Identifier(TutorialMod.MOD_ID, "maple"), ModBlockSetType.MAPLE);

    //public static final Set<WoodType> VALUES = new ObjectArraySet<WoodType>();
    //public static final WoodType MAPLE = register(new WoodType("acacia", BlockSetType.ACACIA));

    public void init() {}
}
