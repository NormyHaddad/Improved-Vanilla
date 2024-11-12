package net.garunix.garunixpansion.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.garunix.garunixpansion.Garunixpansion;
import net.garunix.garunixpansion.block.ModBlocks;
import net.garunix.garunixpansion.entity.ModBoats;
import net.garunix.garunixpansion.entity.ModEntities;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModItems {

    public static final Item SMOKY_QUARTZ = Registry.register(Registries.ITEM,
            Identifier.of("garunixpansion", "smoky_quartz"), new Item(new Item.Settings()));
    public static final Item MAPLE_SIGN = registerItem("maple_sign",
            new SignItem(new Item.Settings().maxCount(16), ModBlocks.MAPLE_SIGN, ModBlocks.MAPLE_WALL_SIGN));
    public static final Item MAPLE_HANGING_SIGN = registerItem("maple_hanging_sign",
            new HangingSignItem(ModBlocks.MAPLE_HANGING_SIGN, ModBlocks.MAPLE_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)));

    public static final Item MAHOE_SIGN = registerItem("mahoe_sign",
            new SignItem(new Item.Settings().maxCount(16), ModBlocks.MAHOE_SIGN, ModBlocks.MAHOE_WALL_SIGN));
    public static final Item MAHOE_HANGING_SIGN = registerItem("mahoe_hanging_sign",
            new HangingSignItem(ModBlocks.MAHOE_HANGING_SIGN, ModBlocks.MAHOE_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)));

    public static final Item RED_CARDINAL_SPAWN_EGG = registerItem("red_cardinal_spawn_egg",
            new SpawnEggItem(ModEntities.RED_CARDINAL, 0xE30000, 0x262020, new Item.Settings()));

    public static final Item MAHOE_BOAT = TerraformBoatItemHelper.registerBoatItem(
            ModBoats.MAHOE_BOAT_ID, ModBoats.MAHOE_BOAT_KEY, false);
    public static final Item MAHOE_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(
            ModBoats.MAHOE_CHEST_BOAT_ID, ModBoats.MAHOE_BOAT_KEY, true);   
    public static final Item MAPLE_BOAT = TerraformBoatItemHelper.registerBoatItem(
            ModBoats.MAPLE_BOAT_ID, ModBoats.MAPLE_BOAT_KEY, false);
    public static final Item MAPLE_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(
            ModBoats.MAPLE_CHEST_BOAT_ID, ModBoats.MAPLE_BOAT_KEY, true);
    public static final Item STRANGE_BOAT = TerraformBoatItemHelper.registerBoatItem(
            ModBoats.STRANGE_BOAT_ID, ModBoats.STRANGE_BOAT_KEY, false);
    public static final Item STRANGE_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(
            ModBoats.STRANGE_CHEST_BOAT_ID, ModBoats.STRANGE_BOAT_KEY, true);

    public static final Item BLUEBERRIES = Registry.register(Registries.ITEM, Identifier.of("garunixpansion", "blueberries"),
            new AliasedBlockItem(ModBlocks.BLUEBERRY_BUSH,  new Item.Settings().food(ModFoodComponents.BLUEBERRY)));

    public static final Item STRANGE_SIGN = registerItem("strange_sign",
            new SignItem(new Item.Settings().maxCount(16), ModBlocks.STRANGE_SIGN, ModBlocks.STRANGE_WALL_SIGN));
    public static final Item STRANGE_HANGING_SIGN = registerItem("strange_hanging_sign",
            new HangingSignItem(ModBlocks.STRANGE_HANGING_SIGN, ModBlocks.STRANGE_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)));

    public static final Item RED_ROSE_SEEDS = registerItem("red_rose_seeds",
            new AliasedBlockItem(ModBlocks.RED_ROSE_CROP, new Item.Settings()));
    public static final Item CYAN_ROSE_SEEDS = registerItem("cyan_rose_seeds",
            new AliasedBlockItem(ModBlocks.CYAN_ROSE_CROP, new Item.Settings()));

    public static final Item PINK_LOTUS = registerItem("pink_lotus",
            new PlaceableOnWaterItem(ModBlocks.PINK_LOTUS, new Item.Settings()));
    public static final Item RED_LOTUS = registerItem("red_lotus",
            new PlaceableOnWaterItem(ModBlocks.RED_LOTUS, new Item.Settings()));
    public static final Item TARO = registerItem("taro",
            new AliasedBlockItem(ModBlocks.TARO_CROP, new Item.Settings().food(ModFoodComponents.TARO)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Garunixpansion.MOD_ID, name), item);
    }

    public static void assignItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.addAfter(Items.QUARTZ, SMOKY_QUARTZ);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {
            content.addAfter(Items.CHERRY_HANGING_SIGN, MAHOE_HANGING_SIGN);
            content.addAfter(Items.CHERRY_HANGING_SIGN, MAHOE_SIGN);
            content.addAfter(Items.CHERRY_HANGING_SIGN, MAPLE_HANGING_SIGN);
            content.addAfter(Items.CHERRY_HANGING_SIGN, MAPLE_SIGN);
            content.addAfter(Items.CHERRY_HANGING_SIGN, STRANGE_HANGING_SIGN);
            content.addAfter(Items.CHERRY_HANGING_SIGN, STRANGE_SIGN);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {
            content.addAfter(Items.PITCHER_POD, CYAN_ROSE_SEEDS);
            content.addAfter(Items.PITCHER_POD, RED_ROSE_SEEDS);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(content -> {
            content.addAfter(Items.BEETROOT, TARO);
            content.addAfter(Items.SWEET_BERRIES, BLUEBERRIES);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.addAfter(Items.BAMBOO_CHEST_RAFT, STRANGE_CHEST_BOAT);
            content.addAfter(Items.BAMBOO_CHEST_RAFT, STRANGE_BOAT);
            content.addAfter(Items.BAMBOO_CHEST_RAFT, MAHOE_CHEST_BOAT);
            content.addAfter(Items.BAMBOO_CHEST_RAFT, MAHOE_BOAT);
            content.addAfter(Items.BAMBOO_CHEST_RAFT, MAPLE_CHEST_BOAT);
            content.addAfter(Items.BAMBOO_CHEST_RAFT, MAPLE_BOAT);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(content -> {
            content.add(RED_CARDINAL_SPAWN_EGG);
        });
    }

    public static void registerModItems(){

    }
}
