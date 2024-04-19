package net.garunix.garunixpansion.block;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import jdk.jshell.Snippet;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.garunix.garunixpansion.Garunixpansion;
import net.garunix.garunixpansion.world.tree.MahoeSaplingGenerator;
import net.garunix.garunixpansion.world.tree.MapleSaplingGenerator;
import net.garunix.garunixpansion.world.tree.StrangeSaplingGenerator;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //region Maple Blocks
    //region Log/wood blocks
    public static final Block MAPLE_LOG = registerBlock("maple_log", new PillarBlock(
            FabricBlockSettings.copyOf(Blocks.CHERRY_LOG).mapColor(MapColor.TERRACOTTA_BROWN)), ItemGroups.NATURAL);
    public static final Block MAPLE_WOOD = registerBlock("maple_wood", new PillarBlock(
            FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD).mapColor(MapColor.TERRACOTTA_BROWN)), ItemGroups.NATURAL);
    public static final Block STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log", new PillarBlock(
            FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_LOG).mapColor(MapColor.ORANGE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood", new PillarBlock(
            FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD).mapColor(MapColor.OFF_WHITE)), ItemGroups.BUILDING_BLOCKS);
    //endregion

    //region Plank variants & leaf/sapling
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
    //endregion

    //Other
    public static final Block MAPLE_TRAPDOOR = registerBlock("maple_trapdoor", new TrapdoorBlock(
            FabricBlockSettings.copyOf(Blocks.CHERRY_TRAPDOOR).mapColor(MapColor.OFF_WHITE), ModBlockSetType.MAPLE), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAPLE_DOOR = registerBlock("maple_door", new DoorBlock(
            FabricBlockSettings.copyOf(Blocks.CHERRY_DOOR).mapColor(MapColor.OFF_WHITE), ModBlockSetType.MAPLE), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAPLE_SIGN = registerItemlessBlock("maple_sign", new SignBlock(
            FabricBlockSettings.copyOf(Blocks.CHERRY_SIGN).mapColor(MapColor.OFF_WHITE), ModWoodType.MAPLE));
    public static final Block MAPLE_WALL_SIGN = registerItemlessBlock("maple_wall_sign", new WallSignBlock(
            FabricBlockSettings.copyOf(Blocks.CHERRY_SIGN).mapColor(MapColor.OFF_WHITE), ModWoodType.MAPLE));
    public static final Block MAPLE_HANGING_SIGN = registerItemlessBlock("maple_hanging_sign", new HangingSignBlock(
            FabricBlockSettings.copyOf(Blocks.CHERRY_HANGING_SIGN).mapColor(MapColor.OFF_WHITE), ModWoodType.MAPLE));
    public static final Block MAPLE_WALL_HANGING_SIGN = registerItemlessBlock("maple_wall_hanging_sign", new WallHangingSignBlock(
            FabricBlockSettings.copyOf(Blocks.CHERRY_WALL_HANGING_SIGN).mapColor(MapColor.OFF_WHITE), ModWoodType.MAPLE));
    public static final Block MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate", new PressurePlateBlock(
            PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.CHERRY_PRESSURE_PLATE).mapColor(MapColor.OFF_WHITE),
            ModBlockSetType.MAPLE), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAPLE_BUTTON = registerBlock("maple_button", new ButtonBlock(
            FabricBlockSettings.copyOf(Blocks.CHERRY_BUTTON).mapColor(MapColor.OFF_WHITE),
            ModBlockSetType.MAPLE, 30, true), ItemGroups.BUILDING_BLOCKS);
    //endregion

    //region Mahoe blocks
    //Logs/wood
    public static final Block MAHOE_LOG = registerBlock("mahoe_log", new PillarBlock(
            FabricBlockSettings.copyOf(Blocks.JUNGLE_LOG).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)), ItemGroups.NATURAL);
    public static final Block MAHOE_WOOD = registerBlock("mahoe_wood", new PillarBlock(
            FabricBlockSettings.copyOf(Blocks.JUNGLE_LOG).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)), ItemGroups.NATURAL);
    public static final Block STRIPPED_MAHOE_LOG = registerBlock("stripped_mahoe_log", new PillarBlock(
            FabricBlockSettings.copyOf(Blocks.JUNGLE_LOG).mapColor(MapColor.LIGHT_BLUE_GRAY)), ItemGroups.NATURAL);
    public static final Block STRIPPED_MAHOE_WOOD = registerBlock("stripped_mahoe_wood", new PillarBlock(
            FabricBlockSettings.copyOf(Blocks.JUNGLE_LOG).mapColor(MapColor.LIGHT_BLUE_GRAY)), ItemGroups.NATURAL);

    //Planks and variants & leaf/sapling
    public static final Block MAHOE_PLANKS = registerBlock("mahoe_planks", new Block(
            FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS).mapColor(MapColor.LIGHT_BLUE_GRAY)), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAHOE_SAPLING = registerBlock("mahoe_sapling", new SaplingBlock(new MahoeSaplingGenerator(),
            FabricBlockSettings.copyOf(Blocks.JUNGLE_SAPLING).mapColor(MapColor.DARK_GREEN)), ItemGroups.NATURAL);
    public static final Block MAHOE_LEAVES = registerBlock("mahoe_leaves", new LeavesBlock(
            FabricBlockSettings.copyOf(Blocks.JUNGLE_LEAVES).mapColor(MapColor.EMERALD_GREEN).nonOpaque()), ItemGroups.NATURAL);
    public static final Block MAHOE_SLAB = registerBlock("mahoe_slab", new SlabBlock(
            FabricBlockSettings.copyOf(Blocks.JUNGLE_SLAB).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAHOE_STAIRS = registerBlock("mahoe_stairs", new StairsBlock(
            ModBlocks.MAHOE_PLANKS.getDefaultState(),
            FabricBlockSettings.copyOf(Blocks.JUNGLE_STAIRS).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAHOE_FENCE = registerBlock("mahoe_fence", new FenceBlock(
            FabricBlockSettings.copyOf(Blocks.JUNGLE_FENCE).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAHOE_FENCE_GATE = registerBlock("mahoe_fence_gate", new FenceGateBlock(
            FabricBlockSettings.copyOf(Blocks.JUNGLE_FENCE_GATE).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE), ModWoodType.MAHOE), ItemGroups.BUILDING_BLOCKS);
    //Other
    public static final Block MAHOE_DOOR = registerBlock("mahoe_door", new DoorBlock(
            FabricBlockSettings.copyOf(Blocks.JUNGLE_DOOR).mapColor(MapColor.LIGHT_BLUE_GRAY), ModBlockSetType.MAHOE), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAHOE_TRAPDOOR = registerBlock("mahoe_trapdoor", new TrapdoorBlock(
            FabricBlockSettings.copyOf(Blocks.JUNGLE_TRAPDOOR).mapColor(MapColor.LIGHT_BLUE_GRAY), ModBlockSetType.MAHOE), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAHOE_PRESSURE_PLATE = registerBlock("mahoe_pressure_plate", new PressurePlateBlock(
            PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.JUNGLE_PRESSURE_PLATE).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE),
            ModBlockSetType.MAHOE), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAHOE_BUTTON = registerBlock("mahoe_button", new ButtonBlock(
            FabricBlockSettings.copyOf(Blocks.JUNGLE_BUTTON).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE),
            ModBlockSetType.MAHOE, 30, true), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAHOE_SIGN = registerItemlessBlock("mahoe_sign", new SignBlock(
            FabricBlockSettings.copyOf(Blocks.CHERRY_SIGN).mapColor(MapColor.LIGHT_BLUE_GRAY), ModWoodType.MAHOE));
    public static final Block MAHOE_WALL_SIGN = registerItemlessBlock("mahoe_wall_sign", new WallSignBlock(
            FabricBlockSettings.copyOf(Blocks.CHERRY_SIGN).mapColor(MapColor.LIGHT_BLUE_GRAY), ModWoodType.MAHOE));
    public static final Block MAHOE_HANGING_SIGN = registerItemlessBlock("mahoe_hanging_sign", new HangingSignBlock(
            FabricBlockSettings.copyOf(Blocks.CHERRY_HANGING_SIGN).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE), ModWoodType.MAHOE));
    public static final Block MAHOE_WALL_HANGING_SIGN = registerItemlessBlock("mahoe_wall_hanging_sign", new WallHangingSignBlock(
            FabricBlockSettings.copyOf(Blocks.CHERRY_WALL_HANGING_SIGN).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE), ModWoodType.MAHOE));
    //endregion
    
    //region Strange blocks
    //region Stem/foliage
    public static final Block STRANGE_STEM = registerBlock("strange_stem", new MushroomBlock(
            FabricBlockSettings.copyOf(Blocks.CRIMSON_STEM).mapColor(MapColor.PURPLE)), ItemGroups.NATURAL);
    public static final Block STRANGE_LEAVES = registerBlock("strange_leaves", new Block(
            FabricBlockSettings.copyOf(Blocks.NETHER_WART_BLOCK).mapColor(MapColor.LICHEN_GREEN)), ItemGroups.NATURAL);
    //endregion

    //region Planks & variants
    public static final Block STRANGE_PLANKS = registerBlock("strange_planks", new Block(
            FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS).mapColor(MapColor.PALE_PURPLE)), ItemGroups.NATURAL);
    public static final Block STRANGE_SLAB = registerBlock("strange_slab", new SlabBlock(
            FabricBlockSettings.copyOf(Blocks.CRIMSON_SLAB).mapColor(MapColor.PALE_PURPLE)), ItemGroups.NATURAL);
    public static final Block STRANGE_STAIRS = registerBlock("strange_stairs", new StairsBlock(
            ModBlocks.STRANGE_PLANKS.getDefaultState(),
            FabricBlockSettings.copyOf(Blocks.CRIMSON_STAIRS).mapColor(MapColor.PALE_PURPLE)), ItemGroups.NATURAL);
    public static final Block STRANGE_FENCE = registerBlock("strange_fence", new FenceBlock(
            FabricBlockSettings.copyOf(Blocks.CRIMSON_FENCE).mapColor(MapColor.PALE_PURPLE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block STRANGE_FENCE_GATE = registerBlock("strange_fence_gate", new FenceGateBlock(
            FabricBlockSettings.copyOf(Blocks.CRIMSON_FENCE).mapColor(MapColor.PALE_PURPLE), ModWoodType.STRANGE), ItemGroups.BUILDING_BLOCKS);
    //endregion

    //region Other
    public static final Block STRANGE_DOOR = registerBlock("strange_door", new DoorBlock(
            FabricBlockSettings.copyOf(Blocks.CRIMSON_DOOR).mapColor(MapColor.PALE_PURPLE), ModBlockSetType.STRANGE), ItemGroups.BUILDING_BLOCKS);
    public static final Block STRANGE_TRAPDOOR = registerBlock("strange_trapdoor", new TrapdoorBlock(
            FabricBlockSettings.copyOf(Blocks.CRIMSON_TRAPDOOR).mapColor(MapColor.PALE_PURPLE), ModBlockSetType.STRANGE), ItemGroups.BUILDING_BLOCKS);
    public static final Block STRANGE_PRESSURE_PLATE = registerBlock("strange_pressure_plate", new PressurePlateBlock(
            PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.CRIMSON_PRESSURE_PLATE).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE),
            ModBlockSetType.STRANGE), ItemGroups.BUILDING_BLOCKS);
    public static final Block STRANGE_BUTTON = registerBlock("strange_button", new ButtonBlock(
            FabricBlockSettings.copyOf(Blocks.CRIMSON_BUTTON).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE),
            ModBlockSetType.STRANGE, 30, true), ItemGroups.BUILDING_BLOCKS);
    public static final Block STRANGE_SIGN = registerItemlessBlock("strange_sign", new SignBlock(
            FabricBlockSettings.copyOf(Blocks.CHERRY_SIGN).mapColor(MapColor.PALE_PURPLE), ModWoodType.STRANGE));
    public static final Block STRANGE_WALL_SIGN = registerItemlessBlock("strange_wall_sign", new WallSignBlock(
            FabricBlockSettings.copyOf(ModBlocks.STRANGE_SIGN).mapColor(MapColor.PALE_PURPLE), ModWoodType.STRANGE));
    public static final Block STRANGE_HANGING_SIGN = registerItemlessBlock("strange_hanging_sign", new HangingSignBlock(
            FabricBlockSettings.copyOf(Blocks.CHERRY_HANGING_SIGN).mapColor(MapColor.PALE_PURPLE), ModWoodType.STRANGE));
    public static final Block STRANGE_WALL_HANGING_SIGN = registerItemlessBlock("strange_wall_hanging_sign", new WallHangingSignBlock(
            FabricBlockSettings.copyOf(ModBlocks.STRANGE_HANGING_SIGN).mapColor(MapColor.PALE_PURPLE), ModWoodType.STRANGE));
//    //endregion
    //endregion
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
    public static final Block STRANGE_SAPLING = registerBlock("strange_sapling", new SaplingBlock(new StrangeSaplingGenerator(),
            FabricBlockSettings.copyOf(Blocks.JUNGLE_SAPLING).mapColor(MapColor.PALE_PURPLE)), ItemGroups.NATURAL);
    //endregion

    //region Stone
    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.WHITE)),
            ItemGroups.BUILDING_BLOCKS);
    public static final Block CRACKED_CALCITE_BRICKS = registerBlock("cracked_calcite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.WHITE)),
            ItemGroups.BUILDING_BLOCKS);
    public static final Block MOSSY_CALCITE_BRICKS = registerBlock("mossy_calcite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.WHITE)),
            ItemGroups.BUILDING_BLOCKS);
    public static final Block MOSSY_CRACKED_CALCITE_BRICKS = registerBlock("mossy_cracked_calcite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.WHITE)),
            ItemGroups.BUILDING_BLOCKS);
    public static final Block MOSSY_CRACKED_STONE_BRICKS = registerBlock("mossy_cracked_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.STONE_GRAY)),
            ItemGroups.BUILDING_BLOCKS);
    public static final Block MOSSY_DEEPSLATE_BRICKS = registerBlock("mossy_deepslate_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS).mapColor(MapColor.DEEPSLATE_GRAY)),
            ItemGroups.BUILDING_BLOCKS);
    public static final Block MOSSY_CRACKED_DEEPSLATE_BRICKS = registerBlock("mossy_cracked_deepslate_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_BRICKS).mapColor(MapColor.DEEPSLATE_GRAY)),
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
    public static final Block BLUEBERRY_BUSH = registerBlock("blueberry_bush",
            new BlueberryBush(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH)
                    .mapColor(MapColor.EMERALD_GREEN)), ItemGroups.NATURAL);
    public static final Block PASSIONFLOWER = registerBlock("passionflower",
            new VineBlock(FabricBlockSettings.copyOf(Blocks.VINE)
                    .mapColor(MapColor.DARK_GREEN)), ItemGroups.NATURAL);
    public static final Block GHOST_PIPES = registerBlock("ghost_pipes",
            new FlowerBlock(StatusEffects.INVISIBILITY, 15, FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY)
                    .mapColor(MapColor.WHITE)), ItemGroups.NATURAL);
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
        return Registry.register(Registries.BLOCK, new Identifier(Garunixpansion.MOD_ID, name), block);
    }

    private static Block registerItemlessBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(Garunixpansion.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Garunixpansion.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(content -> {
            content.add(item);
        });
        return item;
    }

    public static void orderItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.addAfter(Items.CHERRY_BUTTON, STRANGE_SLAB);
            content.addAfter(Items.CHERRY_BUTTON, STRANGE_STAIRS);
            content.addAfter(Items.CHERRY_BUTTON, STRANGE_PLANKS);
            content.addAfter(Items.CHERRY_BUTTON, STRANGE_STEM);

            content.addAfter(Items.CHERRY_BUTTON, MAHOE_BUTTON);
            content.addAfter(Items.CHERRY_BUTTON, MAHOE_PRESSURE_PLATE);
            content.addAfter(Items.CHERRY_BUTTON, MAHOE_TRAPDOOR);
            content.addAfter(Items.CHERRY_BUTTON, MAHOE_DOOR);
            content.addAfter(Items.CHERRY_BUTTON, MAHOE_FENCE_GATE);
            content.addAfter(Items.CHERRY_BUTTON, MAHOE_FENCE);
            content.addAfter(Items.CHERRY_BUTTON, MAHOE_SLAB);
            content.addAfter(Items.CHERRY_BUTTON, MAHOE_STAIRS);
            content.addAfter(Items.CHERRY_BUTTON, MAHOE_PLANKS);
            content.addAfter(Items.CHERRY_BUTTON, STRIPPED_MAHOE_WOOD);
            content.addAfter(Items.CHERRY_BUTTON, STRIPPED_MAHOE_LOG);
            content.addAfter(Items.CHERRY_BUTTON, MAHOE_WOOD);
            content.addAfter(Items.CHERRY_BUTTON, MAHOE_LOG);
            
            content.addAfter(Items.CHERRY_BUTTON, MAPLE_BUTTON);
            content.addAfter(Items.CHERRY_BUTTON, MAPLE_PRESSURE_PLATE);
            content.addAfter(Items.CHERRY_BUTTON, MAPLE_TRAPDOOR);
            content.addAfter(Items.CHERRY_BUTTON, MAPLE_DOOR);
            content.addAfter(Items.CHERRY_BUTTON, MAPLE_FENCE_GATE);
            content.addAfter(Items.CHERRY_BUTTON, MAPLE_FENCE);
            content.addAfter(Items.CHERRY_BUTTON, MAPLE_SLAB);
            content.addAfter(Items.CHERRY_BUTTON, MAPLE_STAIRS);
            content.addAfter(Items.CHERRY_BUTTON, MAPLE_PLANKS);
            content.addAfter(Items.CHERRY_BUTTON, STRIPPED_MAPLE_WOOD);
            content.addAfter(Items.CHERRY_BUTTON, STRIPPED_MAPLE_LOG);
            content.addAfter(Items.CHERRY_BUTTON, MAPLE_WOOD);
            content.addAfter(Items.CHERRY_BUTTON, MAPLE_LOG);
        });
    }

    public static void registerModBlocks() { orderItems(); }
}
