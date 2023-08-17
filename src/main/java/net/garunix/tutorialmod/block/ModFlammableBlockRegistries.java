package net.garunix.tutorialmod.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlockRegistries {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        //region Maple blocks
        registry.add(ModBlocks.MAPLE_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_MAPLE_LOG, 5, 5);
        registry.add(ModBlocks.MAPLE_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_MAPLE_WOOD, 5, 5);
        registry.add(ModBlocks.MAPLE_LEAVES, 30, 60);
        registry.add(ModBlocks.MAPLE_PLANKS, 5, 20);
        registry.add(ModBlocks.MAPLE_SLAB, 5, 20);
        registry.add(ModBlocks.MAPLE_STAIRS, 5, 20);
        registry.add(ModBlocks.MAPLE_FENCE, 5, 20);
        registry.add(ModBlocks.MAPLE_FENCE_GATE, 5, 20);
        //endregion
        //region Mahoe blocks
        registry.add(ModBlocks.MAHOE_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_MAHOE_LOG, 5, 5);
        registry.add(ModBlocks.MAHOE_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_MAHOE_WOOD, 5, 5);
        registry.add(ModBlocks.MAHOE_LEAVES, 30, 60);
        //endregion
        //region Glowing wool
        registry.add(ModBlocks.GLOW_BLUE_WOOL, 30, 60);
        registry.add(ModBlocks.GLOW_BROWN_WOOL, 30, 60);
        registry.add(ModBlocks.GLOW_CYAN_WOOL, 30, 60);
        registry.add(ModBlocks.GLOW_GRAY_WOOL, 30, 60);
        registry.add(ModBlocks.GLOW_GREEN_WOOL, 30, 60);
        registry.add(ModBlocks.GLOW_LIME_WOOL, 30, 60);
        registry.add(ModBlocks.GLOW_LIGHT_BLUE_WOOL, 30, 60);
        registry.add(ModBlocks.GLOW_LIGHT_GRAY_WOOL, 30, 60);
        registry.add(ModBlocks.GLOW_MAGENTA_WOOL, 30, 60);
        registry.add(ModBlocks.GLOW_ORANGE_WOOL, 30, 60);
        registry.add(ModBlocks.GLOW_PINK_WOOL, 30, 60);
        registry.add(ModBlocks.GLOW_PURPLE_WOOL, 30, 60);
        registry.add(ModBlocks.GLOW_RED_WOOL, 30, 60);
        registry.add(ModBlocks.GLOW_WHITE_WOOL, 30, 60);
        registry.add(ModBlocks.GLOW_YELLOW_WOOL, 30, 60);
        //endregion
    }
}
