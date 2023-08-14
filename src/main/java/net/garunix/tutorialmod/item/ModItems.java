package net.garunix.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.garunix.tutorialmod.TutorialMod;
import net.garunix.tutorialmod.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModItems {

    public static final Item SMOKY_QUARTZ = Registry.register(Registries.ITEM,
            new Identifier("tutorialmod", "smoky_quartz"), new Item(new FabricItemSettings()));
    public static final Item MAPLE_SIGN = registerItem("maple_sign",
            (Item)new SignItem(new Item.Settings().maxCount(16), ModBlocks.MAPLE_SIGN, ModBlocks.MAPLE_WALL_SIGN));
    public static final Item MAPLE_HANGING_SIGN = registerItem("maple_hanging_sign",
            (Item)new HangingSignItem(ModBlocks.MAPLE_HANGING_SIGN, ModBlocks.MAPLE_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void assignItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.add(SMOKY_QUARTZ);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {
            content.add(MAPLE_SIGN);
            content.add(MAPLE_HANGING_SIGN);
        });
    }

    public static void registerModItems(){
        //TutorialMod.LOGGER.debug("registering mod items for " + TutorialMod.MOD_ID);
    }
}
