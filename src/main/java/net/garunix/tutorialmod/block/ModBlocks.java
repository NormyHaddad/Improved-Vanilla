package net.garunix.tutorialmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.garunix.tutorialmod.TutorialMod;
import net.garunix.tutorialmod.item.ModItemGroup;
import net.garunix.tutorialmod.world.tree.MapleSaplingGenerator;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //region Maple Blocks
    // Log/wood blocks
    public static final Block MAPLE_LOG = registerBlock("maple_log", new PillarBlock(
            FabricBlockSettings.copyOf(Blocks.CHERRY_LOG).mapColor(MapColor.TERRACOTTA_BROWN)), ItemGroups.NATURAL);
    public static final Block MAPLE_WOOD = registerBlock("maple_wood", new PillarBlock(
            FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD).mapColor(MapColor.TERRACOTTA_BROWN)), ItemGroups.NATURAL);
    public static final Block STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log", new PillarBlock(
            FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_LOG).mapColor(MapColor.ORANGE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood", new PillarBlock(
            FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD).mapColor(MapColor.OFF_WHITE)), ItemGroups.BUILDING_BLOCKS);

    //Other
    public static final Block MAPLE_PLANKS = registerBlock("maple_planks", new Block(
            FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS).mapColor(MapColor.OFF_WHITE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAPLE_LEAVES = registerBlock("maple_leaves", new LeavesBlock(
            FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES).mapColor(MapColor.ORANGE).nonOpaque()), ItemGroups.NATURAL);
    public static final Block MAPLE_SAPLING = registerBlock("maple_sapling", new SaplingBlock(new MapleSaplingGenerator(),
            FabricBlockSettings.copyOf(Blocks.CHERRY_SAPLING).mapColor(MapColor.ORANGE)), ItemGroups.NATURAL);
    public static final Block MAPLE_SLAB = registerBlock("maple_slab", new SlabBlock(
            FabricBlockSettings.copyOf(Blocks.CHERRY_SLAB).mapColor(MapColor.OFF_WHITE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAPLE_STAIRS = registerBlock("maple_stairs", new StairsBlock(
            ModBlocks.MAPLE_PLANKS.getDefaultState(),
            FabricBlockSettings.copyOf(Blocks.CHERRY_STAIRS).mapColor(MapColor.OFF_WHITE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAPLE_FENCE = registerBlock("maple_fence", new FenceBlock(
            FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE).mapColor(MapColor.OFF_WHITE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAPLE_FENCE_GATE = registerBlock("maple_fence_gate", new FenceGateBlock(
            FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE_GATE).mapColor(MapColor.OFF_WHITE), WoodType.CHERRY), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAPLE_TRAPDOOR = registerBlock("maple_trapdoor", new TrapdoorBlock(
            FabricBlockSettings.copyOf(Blocks.CHERRY_TRAPDOOR).mapColor(MapColor.OFF_WHITE), BlockSetType.CHERRY), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAPLE_DOOR = registerBlock("maple_door", new DoorBlock(
            FabricBlockSettings.copyOf(Blocks.CHERRY_DOOR).mapColor(MapColor.OFF_WHITE), BlockSetType.CHERRY), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAPLE_SIGN = registerSign("maple_sign", new SignBlock(
            FabricBlockSettings.copyOf(Blocks.CHERRY_SIGN).mapColor(MapColor.OFF_WHITE), WoodType.CHERRY));
    public static final Block MAPLE_WALL_SIGN = registerSign("maple_wall_sign", new WallSignBlock(
            FabricBlockSettings.copyOf(Blocks.CHERRY_SIGN).mapColor(MapColor.OFF_WHITE), WoodType.CHERRY));
    public static final Block MAPLE_HANGING_SIGN = registerSign("maple_hanging_sign", new HangingSignBlock(
            FabricBlockSettings.copyOf(Blocks.CHERRY_HANGING_SIGN).mapColor(MapColor.OFF_WHITE), WoodType.CHERRY));
    public static final Block MAPLE_WALL_HANGING_SIGN = registerSign("maple_wall_hanging_sign", new WallHangingSignBlock(
            FabricBlockSettings.copyOf(Blocks.CHERRY_WALL_HANGING_SIGN).mapColor(MapColor.OFF_WHITE), WoodType.CHERRY));
    //endregion

    //region Misc
    public static final Block SMOOTH_SMOKY_QUARTZ_BLOCK = registerBlock("smooth_smoky_quartz_block",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN).nonOpaque()),
            ItemGroups.NATURAL);
    public static final Block SMOKY_QUARTZ_BLOCK = registerBlock("smoky_quartz_block",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN)),
            ItemGroups.NATURAL);
    public static final Block ROTTEN_FLESH_BLOCK = registerBlock("rotten_flesh_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_WART_BLOCK).mapColor(MapColor.TERRACOTTA_RED)),
            ItemGroups.BUILDING_BLOCKS);
    //endregion

    //region Custom Plants
    public static final Block BUNCHBERRY_FLOWER = registerBlock("bunchberry_flower",
            new FlowerbedBlock(FabricBlockSettings.copyOf(Blocks.PINK_PETALS).mapColor(MapColor.TERRACOTTA_WHITE)),
            ItemGroups.NATURAL);
    public static final Block GLACIER_LILY = registerBlock("glacier_lily",
            new FlowerBlock(StatusEffects.SATURATION, 10, FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY)
                    .mapColor(MapColor.DARK_GREEN)), ItemGroups.NATURAL);
    public static final Block FIREWEED = registerBlock("fireweed",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.LILAC) .mapColor(MapColor.DARK_GREEN)),
            ItemGroups.NATURAL);
    //endregion

    //region Glowing wool blocks
    public static final Block GLOW_BLUE_WOOL = registerBlock("glow_blue_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_WOOL).mapColor(MapColor.BLUE).luminance(15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_BROWN_WOOL = registerBlock("glow_brown_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_WOOL).mapColor(MapColor.BROWN).luminance(15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_CYAN_WOOL = registerBlock("glow_cyan_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_WOOL).mapColor(MapColor.CYAN).luminance(15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_GRAY_WOOL = registerBlock("glow_gray_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_WOOL).mapColor(MapColor.GRAY).luminance(15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_GREEN_WOOL = registerBlock("glow_green_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_WOOL).mapColor(MapColor.GREEN).luminance(15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_LIGHT_BLUE_WOOL = registerBlock("glow_light_blue_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_WOOL).mapColor(MapColor.LIGHT_BLUE).luminance(15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_LIGHT_GRAY_WOOL = registerBlock("glow_light_gray_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_WOOL).mapColor(MapColor.LIGHT_GRAY).luminance(15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_LIME_WOOL = registerBlock("glow_lime_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_WOOL).mapColor(MapColor.LIME).luminance(15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_MAGENTA_WOOL = registerBlock("glow_magenta_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_WOOL).mapColor(MapColor.MAGENTA).luminance(15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_ORANGE_WOOL = registerBlock("glow_orange_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_WOOL).mapColor(MapColor.ORANGE).luminance(15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_PINK_WOOL = registerBlock("glow_pink_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_WOOL).mapColor(MapColor.PINK).luminance(15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_PURPLE_WOOL = registerBlock("glow_purple_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_WOOL).mapColor(MapColor.PURPLE).luminance(15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_RED_WOOL = registerBlock("glow_red_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_WOOL).mapColor(MapColor.RED).luminance(15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_WHITE_WOOL = registerBlock("glow_white_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_WOOL).mapColor(MapColor.WHITE).luminance(15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_YELLOW_WOOL = registerBlock("glow_yellow_wool",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_WOOL).mapColor(MapColor.YELLOW).luminance(15)),
            ItemGroups.COLORED_BLOCKS);
    //endregion

    private static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }

    private static Block registerSign(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(content -> {
            content.add(item);
        });
        return item;
    }

    public static void registerModBlocks() {
        //TutorialMod.LOGGER.info("Registering blocks for " + TutorialMod.MOD_ID);

    }
}
