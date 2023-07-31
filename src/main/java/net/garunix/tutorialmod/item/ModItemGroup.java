package net.garunix.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
//import net.garunix.tutorialmod.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static net.garunix.tutorialmod.TutorialMod.MOD_ID;

public class ModItemGroup {
    public static final RegistryKey<ItemGroup> GARUNIX = RegistryKey.of(RegistryKeys.ITEM_GROUP,
            new Identifier(MOD_ID, "garunix"));

    public void onInitialize() {

    }
}
