package net.garunix.tutorialmod.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import net.minecraft.block.WoodType;

@Mixin(WoodType.class)
public interface WoodTypeAccessor {

    /*@Invoker("<init>")
    static WoodType newWoodType(String name) {
        throw new AssertionError();
    }

    @Invoker("register")
    static WoodType registerNew(WoodType type) {
        throw new AssertionError();
    }*/
}