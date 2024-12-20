package net.garunix.garunixpansion.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.garunix.garunixpansion.Garunixpansion;
import net.garunix.garunixpansion.block.custom.*;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //region Maple Blocks
    //region Log/wood blocks
    public static final Block MAPLE_LOG = registerBlock("maple_log", new PillarBlock(
            AbstractBlock.Settings.copy(Blocks.CHERRY_LOG).mapColor(MapColor.TERRACOTTA_BROWN)), ItemGroups.NATURAL);
    public static final Block MAPLE_WOOD = registerBlock("maple_wood", new PillarBlock(
            AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD).mapColor(MapColor.TERRACOTTA_BROWN)), ItemGroups.BUILDING_BLOCKS);
    public static final Block STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log", new PillarBlock(
            AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_LOG).mapColor(MapColor.ORANGE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood", new PillarBlock(
            AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD).mapColor(MapColor.OFF_WHITE)), ItemGroups.BUILDING_BLOCKS);
    //endregion

    //region Plank variants & leaf/sapling
    public static final Block MAPLE_PLANKS = registerBlock("maple_planks", new Block(
            AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS).mapColor(MapColor.OFF_WHITE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAPLE_LEAVES = registerBlock("maple_leaves", new LeavesBlock(
            AbstractBlock.Settings.copy(Blocks.CHERRY_LEAVES).mapColor(MapColor.ORANGE).nonOpaque()), ItemGroups.NATURAL);
    public static final Block MAPLE_SAPLING = registerBlock("maple_sapling", new SaplingBlock(ModSaplingGenerator.MAPLE,
            AbstractBlock.Settings.copy(Blocks.CHERRY_SAPLING).mapColor(MapColor.ORANGE)), ItemGroups.NATURAL);
    public static final Block MAPLE_SLAB = registerBlock("maple_slab", new SlabBlock(
            AbstractBlock.Settings.copy(Blocks.CHERRY_SLAB).mapColor(MapColor.OFF_WHITE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAPLE_STAIRS = registerBlock("maple_stairs", new StairsBlock(
            ModBlocks.MAPLE_PLANKS.getDefaultState(),
            AbstractBlock.Settings.copy(Blocks.CHERRY_STAIRS).mapColor(MapColor.OFF_WHITE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAPLE_FENCE = registerBlock("maple_fence", new FenceBlock(
            AbstractBlock.Settings.copy(Blocks.CHERRY_FENCE).mapColor(MapColor.OFF_WHITE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAPLE_FENCE_GATE = registerBlock("maple_fence_gate", new FenceGateBlock(
            WoodType.CHERRY, AbstractBlock.Settings.copy(Blocks.CHERRY_FENCE_GATE).mapColor(MapColor.OFF_WHITE)), ItemGroups.BUILDING_BLOCKS);
    //endregion

    //Other
    public static final Block MAPLE_TRAPDOOR = registerBlock("maple_trapdoor", new TrapdoorBlock(
            ModBlockSetType.MAPLE, AbstractBlock.Settings.copy(Blocks.CHERRY_TRAPDOOR).mapColor(MapColor.OFF_WHITE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAPLE_DOOR = registerBlock("maple_door", new DoorBlock(
            ModBlockSetType.MAPLE, AbstractBlock.Settings.copy(Blocks.CHERRY_DOOR).mapColor(MapColor.OFF_WHITE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAPLE_SIGN = registerItemlessBlock("maple_sign", new SignBlock(
            ModWoodType.MAPLE, AbstractBlock.Settings.copy(Blocks.CHERRY_SIGN).mapColor(MapColor.OFF_WHITE)));
    public static final Block MAPLE_WALL_SIGN = registerItemlessBlock("maple_wall_sign", new WallSignBlock(
            ModWoodType.MAPLE, AbstractBlock.Settings.copy(Blocks.CHERRY_SIGN).mapColor(MapColor.OFF_WHITE)));
    public static final Block MAPLE_HANGING_SIGN = registerItemlessBlock("maple_hanging_sign", new HangingSignBlock(
            ModWoodType.MAPLE, AbstractBlock.Settings.copy(Blocks.CHERRY_HANGING_SIGN).mapColor(MapColor.OFF_WHITE)));
    public static final Block MAPLE_WALL_HANGING_SIGN = registerItemlessBlock("maple_wall_hanging_sign", new WallHangingSignBlock(
            ModWoodType.MAPLE, AbstractBlock.Settings.copy(Blocks.CHERRY_WALL_HANGING_SIGN).mapColor(MapColor.OFF_WHITE)));
    public static final Block MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate", new PressurePlateBlock(
            ModBlockSetType.MAPLE, AbstractBlock.Settings.copy(Blocks.CHERRY_PRESSURE_PLATE).mapColor(MapColor.OFF_WHITE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAPLE_BUTTON = registerBlock("maple_button", new ButtonBlock(
            ModBlockSetType.MAPLE, 30, AbstractBlock.Settings.copy(Blocks.CHERRY_BUTTON).mapColor(MapColor.OFF_WHITE)), ItemGroups.BUILDING_BLOCKS);
    //endregion

    //region Mahoe blocks
    //Logs/wood
    public static final Block MAHOE_LOG = registerBlock("mahoe_log", new PillarBlock(
            AbstractBlock.Settings.copy(Blocks.JUNGLE_LOG).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)), ItemGroups.NATURAL);
    public static final Block MAHOE_WOOD = registerBlock("mahoe_wood", new PillarBlock(
            AbstractBlock.Settings.copy(Blocks.JUNGLE_LOG).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block STRIPPED_MAHOE_LOG = registerBlock("stripped_mahoe_log", new PillarBlock(
            AbstractBlock.Settings.copy(Blocks.JUNGLE_LOG).mapColor(MapColor.LIGHT_BLUE_GRAY)), ItemGroups.BUILDING_BLOCKS);
    public static final Block STRIPPED_MAHOE_WOOD = registerBlock("stripped_mahoe_wood", new PillarBlock(
            AbstractBlock.Settings.copy(Blocks.JUNGLE_LOG).mapColor(MapColor.LIGHT_BLUE_GRAY)), ItemGroups.BUILDING_BLOCKS);

    //Planks and variants & leaf/sapling
    public static final Block MAHOE_PLANKS = registerBlock("mahoe_planks", new Block(
            AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS).mapColor(MapColor.LIGHT_BLUE_GRAY)), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAHOE_SAPLING = registerBlock("mahoe_sapling", new SaplingBlock(ModSaplingGenerator.MAHOE,
            AbstractBlock.Settings.copy(Blocks.JUNGLE_SAPLING).mapColor(MapColor.DARK_GREEN)), ItemGroups.NATURAL);
    public static final Block MAHOE_LEAVES = registerBlock("mahoe_leaves", new LeavesBlock(
            AbstractBlock.Settings.copy(Blocks.JUNGLE_LEAVES).mapColor(MapColor.EMERALD_GREEN).nonOpaque()), ItemGroups.NATURAL);
    public static final Block MAHOE_SLAB = registerBlock("mahoe_slab", new SlabBlock(
            AbstractBlock.Settings.copy(Blocks.JUNGLE_SLAB).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAHOE_STAIRS = registerBlock("mahoe_stairs", new StairsBlock(
            ModBlocks.MAHOE_PLANKS.getDefaultState(),
            AbstractBlock.Settings.copy(Blocks.JUNGLE_STAIRS).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAHOE_FENCE = registerBlock("mahoe_fence", new FenceBlock(
            AbstractBlock.Settings.copy(Blocks.JUNGLE_FENCE).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAHOE_FENCE_GATE = registerBlock("mahoe_fence_gate", new FenceGateBlock(
            ModWoodType.MAHOE, AbstractBlock.Settings.copy(Blocks.JUNGLE_FENCE_GATE).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)), ItemGroups.BUILDING_BLOCKS);
    //Other
    public static final Block MAHOE_DOOR = registerBlock("mahoe_door", new DoorBlock(
            ModBlockSetType.MAHOE, AbstractBlock.Settings.copy(Blocks.JUNGLE_DOOR).mapColor(MapColor.LIGHT_BLUE_GRAY)), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAHOE_TRAPDOOR = registerBlock("mahoe_trapdoor", new TrapdoorBlock(
            ModBlockSetType.MAHOE, AbstractBlock.Settings.copy(Blocks.JUNGLE_TRAPDOOR).mapColor(MapColor.LIGHT_BLUE_GRAY)), ItemGroups.BUILDING_BLOCKS);

    public static final Block MAHOE_PRESSURE_PLATE = registerBlock("mahoe_pressure_plate", new PressurePlateBlock(
            ModBlockSetType.MAHOE, AbstractBlock.Settings.copy(Blocks.JUNGLE_PRESSURE_PLATE).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)), ItemGroups.BUILDING_BLOCKS);

    public static final Block MAHOE_BUTTON = registerBlock("mahoe_button", new ButtonBlock(
            ModBlockSetType.MAHOE, 30, AbstractBlock.Settings.copy(Blocks.JUNGLE_BUTTON).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block MAHOE_SIGN = registerItemlessBlock("mahoe_sign", new SignBlock(
            ModWoodType.MAHOE, AbstractBlock.Settings.copy(Blocks.CHERRY_SIGN).mapColor(MapColor.LIGHT_BLUE_GRAY)));
    public static final Block MAHOE_WALL_SIGN = registerItemlessBlock("mahoe_wall_sign", new WallSignBlock(
            ModWoodType.MAHOE, AbstractBlock.Settings.copy(Blocks.CHERRY_SIGN).mapColor(MapColor.LIGHT_BLUE_GRAY)));
    public static final Block MAHOE_HANGING_SIGN = registerItemlessBlock("mahoe_hanging_sign", new HangingSignBlock(
            ModWoodType.MAHOE, AbstractBlock.Settings.copy(Blocks.CHERRY_HANGING_SIGN).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block MAHOE_WALL_HANGING_SIGN = registerItemlessBlock("mahoe_wall_hanging_sign", new WallHangingSignBlock(
            ModWoodType.MAHOE, AbstractBlock.Settings.copy(Blocks.CHERRY_WALL_HANGING_SIGN).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    //endregion
    
    //region Strange blocks
    //region Stem/foliage
    public static final Block STRANGE_STEM = registerBlock("strange_stem", new MushroomBlock(
            AbstractBlock.Settings.copy(Blocks.CRIMSON_STEM).mapColor(MapColor.PURPLE)), ItemGroups.NATURAL);
    public static final Block STRANGE_LEAVES = registerBlock("strange_leaves", new TranslucentBlock(
            AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).sounds(BlockSoundGroup.GLASS).mapColor(MapColor.TERRACOTTA_CYAN)), ItemGroups.NATURAL);
    public static final Block STRANGE_SAPLING = registerBlock("strange_sapling", new StrangeSaplingBlock(ModSaplingGenerator.STRANGE,
            AbstractBlock.Settings.copy(Blocks.JUNGLE_SAPLING).mapColor(MapColor.PALE_PURPLE)), ItemGroups.NATURAL);
    //endregion

    //region Planks & variants
    public static final Block STRANGE_PLANKS = registerBlock("strange_planks", new Block(
            AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS).mapColor(MapColor.PALE_PURPLE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block STRANGE_SLAB = registerBlock("strange_slab", new SlabBlock(
            AbstractBlock.Settings.copy(Blocks.CRIMSON_SLAB).mapColor(MapColor.PALE_PURPLE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block STRANGE_STAIRS = registerBlock("strange_stairs", new StairsBlock(
            ModBlocks.STRANGE_PLANKS.getDefaultState(),
            AbstractBlock.Settings.copy(Blocks.CRIMSON_STAIRS).mapColor(MapColor.PALE_PURPLE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block STRANGE_FENCE = registerBlock("strange_fence", new FenceBlock(
            AbstractBlock.Settings.copy(Blocks.CRIMSON_FENCE).mapColor(MapColor.PALE_PURPLE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block STRANGE_FENCE_GATE = registerBlock("strange_fence_gate", new FenceGateBlock(
            ModWoodType.STRANGE, AbstractBlock.Settings.copy(Blocks.CRIMSON_FENCE).mapColor(MapColor.PALE_PURPLE)), ItemGroups.BUILDING_BLOCKS);
    //endregion

    //region Other
    public static final Block STRANGE_DOOR = registerBlock("strange_door", new DoorBlock(
            ModBlockSetType.STRANGE, AbstractBlock.Settings.copy(Blocks.CRIMSON_DOOR).mapColor(MapColor.PALE_PURPLE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block STRANGE_TRAPDOOR = registerBlock("strange_trapdoor", new TrapdoorBlock(
            ModBlockSetType.STRANGE, AbstractBlock.Settings.copy(Blocks.CRIMSON_TRAPDOOR).mapColor(MapColor.PALE_PURPLE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block STRANGE_PRESSURE_PLATE = registerBlock("strange_pressure_plate", new PressurePlateBlock(
            ModBlockSetType.STRANGE, AbstractBlock.Settings.copy(Blocks.CRIMSON_PRESSURE_PLATE).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block STRANGE_BUTTON = registerBlock("strange_button", new ButtonBlock(
            ModBlockSetType.STRANGE,
            30, AbstractBlock.Settings.copy(Blocks.CRIMSON_BUTTON).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)), ItemGroups.BUILDING_BLOCKS);
    public static final Block STRANGE_SIGN = registerItemlessBlock("strange_sign", new SignBlock(
            ModWoodType.STRANGE, AbstractBlock.Settings.copy(Blocks.CHERRY_SIGN).mapColor(MapColor.PALE_PURPLE)));
    public static final Block STRANGE_WALL_SIGN = registerItemlessBlock("strange_wall_sign", new WallSignBlock(
            ModWoodType.STRANGE, AbstractBlock.Settings.copy(ModBlocks.STRANGE_SIGN).mapColor(MapColor.PALE_PURPLE)));
    public static final Block STRANGE_HANGING_SIGN = registerItemlessBlock("strange_hanging_sign", new HangingSignBlock(
            ModWoodType.STRANGE, AbstractBlock.Settings.copy(Blocks.CHERRY_HANGING_SIGN).mapColor(MapColor.PALE_PURPLE)));
    public static final Block STRANGE_WALL_HANGING_SIGN = registerItemlessBlock("strange_wall_hanging_sign", new WallHangingSignBlock(
            ModWoodType.STRANGE, AbstractBlock.Settings.copy(ModBlocks.STRANGE_HANGING_SIGN).mapColor(MapColor.PALE_PURPLE)));
    //endregion
    //endregion

    //region Misc
    public static final Block SMOOTH_SMOKY_QUARTZ_BLOCK = registerBlock("smooth_smoky_quartz_block",
            new TranslucentBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN).nonOpaque()),
            ItemGroups.NATURAL);
    public static final Block SMOKY_QUARTZ_BLOCK = registerBlock("smoky_quartz_block",
            new Block(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN)),
            ItemGroups.NATURAL);
    public static final Block ROTTEN_FLESH_BLOCK = registerBlock("rotten_flesh_block",
            new Block(AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK).mapColor(MapColor.TERRACOTTA_RED)),
            ItemGroups.BUILDING_BLOCKS);
    //endregion

    //region Stone
    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).mapColor(MapColor.WHITE)),
            ItemGroups.BUILDING_BLOCKS);
    public static final Block CRACKED_CALCITE_BRICKS = registerBlock("cracked_calcite_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).mapColor(MapColor.WHITE)),
            ItemGroups.BUILDING_BLOCKS);
    public static final Block MOSSY_CALCITE_BRICKS = registerBlock("mossy_calcite_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).mapColor(MapColor.WHITE)),
            ItemGroups.BUILDING_BLOCKS);
    public static final Block MOSSY_CRACKED_CALCITE_BRICKS = registerBlock("mossy_cracked_calcite_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).mapColor(MapColor.WHITE)),
            ItemGroups.BUILDING_BLOCKS);
    public static final Block MOSSY_CRACKED_STONE_BRICKS = registerBlock("mossy_cracked_stone_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE_BRICKS).mapColor(MapColor.STONE_GRAY)),
            ItemGroups.BUILDING_BLOCKS);
    public static final Block MOSSY_DEEPSLATE_BRICKS = registerBlock("mossy_deepslate_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS).mapColor(MapColor.DEEPSLATE_GRAY)),
            ItemGroups.BUILDING_BLOCKS);
    public static final Block MOSSY_CRACKED_DEEPSLATE_BRICKS = registerBlock("mossy_cracked_deepslate_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS).mapColor(MapColor.DEEPSLATE_GRAY)),
            ItemGroups.BUILDING_BLOCKS);
    //endregion

    //region Custom Plants
    public static final Block BUNCHBERRY_FLOWER = registerBlock("bunchberry_flower",
            new GroundCoverBlock(AbstractBlock.Settings.copy(Blocks.PINK_PETALS).mapColor(MapColor.TERRACOTTA_WHITE)),
            ItemGroups.NATURAL);
    public static final Block GLACIER_LILY = registerBlock("glacier_lily",
            new FlowerBlock(StatusEffects.SATURATION, 10, AbstractBlock.Settings.copy(Blocks.LILY_OF_THE_VALLEY)
                    .mapColor(MapColor.DARK_GREEN)), ItemGroups.NATURAL);
    public static final Block FIREWEED = registerBlock("fireweed",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.LILAC) .mapColor(MapColor.DARK_GREEN)),
            ItemGroups.NATURAL);
    public static final Block BLUEBERRY_BUSH = registerItemlessBlock("blueberry_bush",
            new BlueberryBush(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)
                    .mapColor(MapColor.EMERALD_GREEN)));
    public static final Block PASSIONFLOWER = registerBlock("passionflower",
            new VineBlock(AbstractBlock.Settings.copy(Blocks.VINE)
                    .mapColor(MapColor.DARK_GREEN)), ItemGroups.NATURAL);
    public static final Block GHOST_PIPES = registerBlock("ghost_pipes",
            new FlowerBlock(StatusEffects.INVISIBILITY, 15, AbstractBlock.Settings.copy(Blocks.LILY_OF_THE_VALLEY)
                    .mapColor(MapColor.WHITE)), ItemGroups.NATURAL);
    public static final Block RED_ROSE = registerBlock("red_rose",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 5, AbstractBlock.Settings.copy(Blocks.POPPY)
                    .mapColor(MapColor.DARK_GREEN)), ItemGroups.NATURAL);
    public static final Block CYAN_ROSE = registerBlock("cyan_rose",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 5, AbstractBlock.Settings.copy(Blocks.POPPY)
                    .mapColor(MapColor.DARK_GREEN)), ItemGroups.NATURAL);
    public static final Block RED_ROSE_CROP = registerItemlessBlock("red_rose_crop",
            new OldRoseCrop(AbstractBlock.Settings.copy(Blocks.TORCHFLOWER_CROP)
                    .mapColor(MapColor.DARK_GREEN)));
    public static final Block CYAN_ROSE_CROP = registerItemlessBlock("cyan_rose_crop",
            new CyanRoseCrop(AbstractBlock.Settings.copy(Blocks.TORCHFLOWER_CROP)
                    .mapColor(MapColor.DARK_GREEN)));
    public static final Block BIRD_OF_PARADISE = registerBlock("bird_of_paradise",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.ROSE_BUSH)), ItemGroups.NATURAL);
    public static final Block PINK_ORCHID = registerBlock("pink_orchid",
            new FlowerBlock(StatusEffects.SATURATION, 5, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)), ItemGroups.NATURAL);
    public static final Block JACK_IN_THE_PULPIT = registerBlock("jack_in_the_pulpit",
            new FlowerBlock(StatusEffects.BLINDNESS, 9, AbstractBlock.Settings.copy(Blocks.LILY_OF_THE_VALLEY)), ItemGroups.NATURAL);
    public static final Block TARO_CROP = registerItemlessBlock("taro_crop",
            new CropBlock(AbstractBlock.Settings.copy(Blocks.POTATOES)));
    public static final Block TARO_PLANT = registerBlock("taro_plant",
            new ShortPlantBlock(AbstractBlock.Settings.copy(Blocks.SHORT_GRASS)), ItemGroups.NATURAL);
    public static final Block PINK_LOTUS = Registry.register(Registries.BLOCK, Identifier.of(Garunixpansion.MOD_ID, "pink_lotus"),
            new LilyPadBlock(AbstractBlock.Settings.copy(Blocks.LILY_PAD)));
    public static final Block RED_LOTUS = Registry.register(Registries.BLOCK, Identifier.of(Garunixpansion.MOD_ID, "red_lotus"),
            new LilyPadBlock(AbstractBlock.Settings.copy(Blocks.LILY_PAD)));
    public static final Block BLUE_IRIS = registerBlock("blue_iris",
            new FlowerBlock(StatusEffects.WATER_BREATHING, 11, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)), ItemGroups.NATURAL);
    public static final Block SEA_LAVENDER = registerBlock("sea_lavender",
            new FlowerBlock(StatusEffects.CONDUIT_POWER, 5, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)), ItemGroups.NATURAL);
    public static final Block SWAMPFLOWER = registerBlock("swampflower",
            new GroundCoverBlock(AbstractBlock.Settings.copy(Blocks.PINK_PETALS)), ItemGroups.NATURAL);
    public static final Block CONEFLOWER = registerBlock("coneflower",
            new FlowerBlock(StatusEffects.HASTE, 7.0f, AbstractBlock.Settings.copy(Blocks.DANDELION)), ItemGroups.NATURAL);
    public static final Block BLACK_EYED_DAISY = registerBlock("black_eyed_daisy",
            new FlowerBlock(StatusEffects.REGENERATION, 9.0f, AbstractBlock.Settings.copy(Blocks.OXEYE_DAISY)), ItemGroups.NATURAL);
    public static final Block BLUE_EYED_DAISY = registerBlock("blue_eyed_daisy",
            new FlowerBlock(StatusEffects.INSTANT_DAMAGE, 3.0f, AbstractBlock.Settings.copy(Blocks.OXEYE_DAISY)), ItemGroups.NATURAL);
    public static final Block BLUE_BUSH_DAISY = registerBlock("blue_bush_daisy",
            new FlowerBlock(StatusEffects.HASTE, 14.0f, AbstractBlock.Settings.copy(Blocks.AZURE_BLUET)), ItemGroups.NATURAL);
    public static final Block SAVANNA_BLOOM = registerBlock("savanna_bloom",
            new FlowerBlock(StatusEffects.INSTANT_HEALTH, 2.0f, AbstractBlock.Settings.copy(Blocks.ALLIUM)), ItemGroups.NATURAL);
    public static final Block SNOWY_LUPINE = registerBlock("snowy_lupine",
            new TallFlowerBlock(AbstractBlock.Settings.copy(Blocks.LILAC)), ItemGroups.NATURAL);
    public static final Block TWINFLOWER = registerBlock("twinflower",
            new FlowerBlock(StatusEffects.HEALTH_BOOST, 3.0f, AbstractBlock.Settings.copy(Blocks.PINK_TULIP)), ItemGroups.NATURAL);
    public static final Block BLUEBELL = registerBlock("bluebell",
            new FlowerBlock(StatusEffects.INVISIBILITY, 12.0f, AbstractBlock.Settings.copy(Blocks.LILY_OF_THE_VALLEY)), ItemGroups.NATURAL);
    public static final Block GREEN_ORCHID = registerBlock("green_orchid",
            new FlowerBlock(StatusEffects.BLINDNESS, 8.0f, AbstractBlock.Settings.copy(Blocks.BLUE_ORCHID)), ItemGroups.NATURAL);
    public static final Block WOOD_LILY = registerBlock("wood_lily",
            new FlowerBlock(StatusEffects.ABSORPTION, 1.0f, AbstractBlock.Settings.copy(Blocks.ALLIUM)), ItemGroups.NATURAL);
    public static final Block TONGUE_FERN = registerBlock("tongue_fern",
            new ShortPlantBlock(AbstractBlock.Settings.copy(Blocks.FERN)), ItemGroups.NATURAL);
    //endregion

    //region Potted plants
    public static final Block POTTED_GLACIER_LILY = Registry.register(Registries.BLOCK, Identifier.of(Garunixpansion.MOD_ID, "potted_glacier_lily"),
            new FlowerPotBlock(GLACIER_LILY, AbstractBlock.Settings.copy(Blocks.POTTED_LILY_OF_THE_VALLEY)));

    public static final Block POTTED_RED_ROSE = Registry.register(Registries.BLOCK, Identifier.of(Garunixpansion.MOD_ID, "potted_red_rose"),
            new FlowerPotBlock(RED_ROSE, AbstractBlock.Settings.copy(Blocks.POTTED_POPPY)));

    public static final Block POTTED_CYAN_ROSE = Registry.register(Registries.BLOCK, Identifier.of(Garunixpansion.MOD_ID, "potted_cyan_rose"),
            new FlowerPotBlock(CYAN_ROSE, AbstractBlock.Settings.copy(Blocks.POTTED_POPPY)));

    public static final Block POTTED_PINK_ORCHID = Registry.register(Registries.BLOCK, Identifier.of(Garunixpansion.MOD_ID, "potted_pink_orchid"),
            new FlowerPotBlock(PINK_ORCHID, AbstractBlock.Settings.copy(Blocks.POTTED_BLUE_ORCHID)));

    public static final Block POTTED_JACK_IN_THE_PULPIT = Registry.register(Registries.BLOCK, Identifier.of(Garunixpansion.MOD_ID, "potted_jack_in_the_pulpit"),
            new FlowerPotBlock(JACK_IN_THE_PULPIT, AbstractBlock.Settings.copy(Blocks.POTTED_LILY_OF_THE_VALLEY)));

    public static final Block POTTED_BLUE_IRIS = Registry.register(Registries.BLOCK, Identifier.of(Garunixpansion.MOD_ID, "potted_blue_iris"),
            new FlowerPotBlock(BLUE_IRIS, AbstractBlock.Settings.copy(Blocks.POTTED_BLUE_ORCHID)));

    public static final Block POTTED_SEA_LAVENDER = Registry.register(Registries.BLOCK, Identifier.of(Garunixpansion.MOD_ID, "potted_sea_lavender"),
            new FlowerPotBlock(SEA_LAVENDER, AbstractBlock.Settings.copy(Blocks.POTTED_BLUE_ORCHID)));

    public static final Block POTTED_CONEFLOWER = Registry.register(Registries.BLOCK, Identifier.of(Garunixpansion.MOD_ID, "potted_coneflower"),
            new FlowerPotBlock(CONEFLOWER, AbstractBlock.Settings.copy(Blocks.POTTED_DANDELION)));

    public static final Block POTTED_BLACK_EYED_DAISY = Registry.register(Registries.BLOCK, Identifier.of(Garunixpansion.MOD_ID, "potted_black_eyed_daisy"),
            new FlowerPotBlock(BLACK_EYED_DAISY, AbstractBlock.Settings.copy(Blocks.POTTED_OXEYE_DAISY)));

    public static final Block POTTED_BLUE_EYED_DAISY = Registry.register(Registries.BLOCK, Identifier.of(Garunixpansion.MOD_ID, "potted_blue_eyed_daisy"),
            new FlowerPotBlock(BLUE_EYED_DAISY, AbstractBlock.Settings.copy(Blocks.POTTED_OXEYE_DAISY)));

    public static final Block POTTED_BLUE_BUSH_DAISY = Registry.register(Registries.BLOCK, Identifier.of(Garunixpansion.MOD_ID, "potted_blue_bush_daisy"),
            new FlowerPotBlock(BLUE_BUSH_DAISY, AbstractBlock.Settings.copy(Blocks.POTTED_AZURE_BLUET)));

    public static final Block POTTED_SAVANNA_BLOOM = Registry.register(Registries.BLOCK, Identifier.of(Garunixpansion.MOD_ID, "potted_savanna_bloom"),
            new FlowerPotBlock(SAVANNA_BLOOM, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM)));

    public static final Block POTTED_TWINFLOWER = Registry.register(Registries.BLOCK, Identifier.of(Garunixpansion.MOD_ID, "potted_twinflower"),
            new FlowerPotBlock(TWINFLOWER, AbstractBlock.Settings.copy(Blocks.POTTED_PINK_TULIP)));

    public static final Block POTTED_BLUEBELL = Registry.register(Registries.BLOCK, Identifier.of(Garunixpansion.MOD_ID, "potted_bluebell"),
            new FlowerPotBlock(BLUEBELL, AbstractBlock.Settings.copy(Blocks.POTTED_LILY_OF_THE_VALLEY)));

    public static final Block POTTED_GREEN_ORCHID = Registry.register(Registries.BLOCK, Identifier.of(Garunixpansion.MOD_ID, "potted_green_orchid"),
            new FlowerPotBlock(GREEN_ORCHID, AbstractBlock.Settings.copy(Blocks.POTTED_BLUE_ORCHID)));

    public static final Block POTTED_WOOD_LILY = Registry.register(Registries.BLOCK, Identifier.of(Garunixpansion.MOD_ID, "potted_wood_lily"),
            new FlowerPotBlock(WOOD_LILY, AbstractBlock.Settings.copy(Blocks.POTTED_ALLIUM)));
    
    public static final Block POTTED_MAPLE_SAPLING = Registry.register(Registries.BLOCK, Identifier.of(Garunixpansion.MOD_ID, "potted_maple_sapling"),
            new FlowerPotBlock(MAPLE_SAPLING, AbstractBlock.Settings.copy(Blocks.POTTED_OAK_SAPLING))); 
    
    public static final Block POTTED_MAHOE_SAPLING = Registry.register(Registries.BLOCK, Identifier.of(Garunixpansion.MOD_ID, "potted_mahoe_sapling"),
            new FlowerPotBlock(MAHOE_SAPLING, AbstractBlock.Settings.copy(Blocks.POTTED_OAK_SAPLING)));   
    
    public static final Block POTTED_STRANGE_SAPLING = Registry.register(Registries.BLOCK, Identifier.of(Garunixpansion.MOD_ID, "potted_strange_sapling"),
            new FlowerPotBlock(STRANGE_SAPLING, AbstractBlock.Settings.copy(Blocks.POTTED_OAK_SAPLING)));
    //endregion

    //region Glowing wool blocks
    public static final Block GLOW_BLUE_WOOL = registerBlock("glow_blue_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL).mapColor(MapColor.BLUE).luminance(state -> 15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_BROWN_WOOL = registerBlock("glow_brown_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL).mapColor(MapColor.BROWN).luminance(state -> 15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_CYAN_WOOL = registerBlock("glow_cyan_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL).mapColor(MapColor.CYAN).luminance(state -> 15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_GRAY_WOOL = registerBlock("glow_gray_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL).mapColor(MapColor.GRAY).luminance(state -> 15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_GREEN_WOOL = registerBlock("glow_green_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL).mapColor(MapColor.GREEN).luminance(state -> 15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_LIGHT_BLUE_WOOL = registerBlock("glow_light_blue_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL).mapColor(MapColor.LIGHT_BLUE).luminance(state -> 15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_LIGHT_GRAY_WOOL = registerBlock("glow_light_gray_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL).mapColor(MapColor.LIGHT_GRAY).luminance(state -> 15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_LIME_WOOL = registerBlock("glow_lime_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL).mapColor(MapColor.LIME).luminance(state -> 15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_MAGENTA_WOOL = registerBlock("glow_magenta_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL).mapColor(MapColor.MAGENTA).luminance(state -> 15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_ORANGE_WOOL = registerBlock("glow_orange_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL).mapColor(MapColor.ORANGE).luminance(state -> 15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_PINK_WOOL = registerBlock("glow_pink_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL).mapColor(MapColor.PINK).luminance(state -> 15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_PURPLE_WOOL = registerBlock("glow_purple_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL).mapColor(MapColor.PURPLE).luminance(state -> 15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_RED_WOOL = registerBlock("glow_red_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL).mapColor(MapColor.RED).luminance(state -> 15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_WHITE_WOOL = registerBlock("glow_white_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL).mapColor(MapColor.WHITE).luminance(state -> 15)),
            ItemGroups.COLORED_BLOCKS);
    public static final Block GLOW_YELLOW_WOOL = registerBlock("glow_yellow_wool",
            new Block(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL).mapColor(MapColor.YELLOW).luminance(state -> 15)),
            ItemGroups.COLORED_BLOCKS);
    //endregion

    private static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, Identifier.of(Garunixpansion.MOD_ID, name), block);
    }

    private static Block registerItemlessBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(Garunixpansion.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> group) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(Garunixpansion.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(content -> {
            content.add(item);
        });
        return item;
    }

    public static void orderItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(content -> {
            content.addAfter(Items.PINK_WOOL, GLOW_PINK_WOOL);
            content.addAfter(Items.PINK_WOOL, GLOW_MAGENTA_WOOL);
            content.addAfter(Items.PINK_WOOL, GLOW_PURPLE_WOOL);
            content.addAfter(Items.PINK_WOOL, GLOW_BLUE_WOOL);
            content.addAfter(Items.PINK_WOOL, GLOW_LIGHT_BLUE_WOOL);
            content.addAfter(Items.PINK_WOOL, GLOW_CYAN_WOOL);
            content.addAfter(Items.PINK_WOOL, GLOW_CYAN_WOOL);
            content.addAfter(Items.PINK_WOOL, GLOW_GREEN_WOOL);
            content.addAfter(Items.PINK_WOOL, GLOW_LIME_WOOL);
            content.addAfter(Items.PINK_WOOL, GLOW_YELLOW_WOOL);
            content.addAfter(Items.PINK_WOOL, GLOW_ORANGE_WOOL);
            content.addAfter(Items.PINK_WOOL, GLOW_RED_WOOL);
            content.addAfter(Items.PINK_WOOL, GLOW_BROWN_WOOL);
            content.addAfter(Items.PINK_WOOL, GLOW_GRAY_WOOL);
            content.addAfter(Items.PINK_WOOL, GLOW_LIGHT_GRAY_WOOL);
            content.addAfter(Items.PINK_WOOL, GLOW_WHITE_WOOL);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.addAfter(Items.CHISELED_STONE_BRICKS, MOSSY_CRACKED_STONE_BRICKS);
            content.addAfter(Items.CRACKED_DEEPSLATE_BRICKS, MOSSY_CRACKED_DEEPSLATE_BRICKS);
            content.addAfter(Items.CRACKED_DEEPSLATE_BRICKS, MOSSY_DEEPSLATE_BRICKS);
            content.addAfter(Items.CHISELED_TUFF_BRICKS, MOSSY_CRACKED_CALCITE_BRICKS);
            content.addAfter(Items.CHISELED_TUFF_BRICKS, MOSSY_CALCITE_BRICKS);
            content.addAfter(Items.CHISELED_TUFF_BRICKS, CRACKED_CALCITE_BRICKS);
            content.addAfter(Items.CHISELED_TUFF_BRICKS, CALCITE_BRICKS);

            content.addAfter(Items.CHERRY_BUTTON, STRANGE_BUTTON);
            content.addAfter(Items.CHERRY_BUTTON, STRANGE_PRESSURE_PLATE);
            content.addAfter(Items.CHERRY_BUTTON, STRANGE_TRAPDOOR);
            content.addAfter(Items.CHERRY_BUTTON, STRANGE_DOOR);
            content.addAfter(Items.CHERRY_BUTTON, STRANGE_FENCE_GATE);
            content.addAfter(Items.CHERRY_BUTTON, STRANGE_FENCE);
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

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {
            content.addAfter(Items.PINK_PETALS, RED_ROSE);
            content.addAfter(Items.PINK_PETALS, CYAN_ROSE);
            content.addAfter(Items.PINK_PETALS, TONGUE_FERN);
            content.addAfter(Items.PINK_PETALS, GREEN_ORCHID);
            content.addAfter(Items.PINK_PETALS, WOOD_LILY);
            content.addAfter(Items.PINK_PETALS, BLUEBELL);
            content.addAfter(Items.PINK_PETALS, TWINFLOWER);
            content.addAfter(Items.PINK_PETALS, SAVANNA_BLOOM);
            content.addAfter(Items.PINK_PETALS, BLUE_BUSH_DAISY);
            content.addAfter(Items.PINK_PETALS, BLUE_EYED_DAISY);
            content.addAfter(Items.PINK_PETALS, BLACK_EYED_DAISY);
            content.addAfter(Items.PINK_PETALS, CONEFLOWER);
            content.addAfter(Items.PINK_PETALS, SWAMPFLOWER);
            content.addAfter(Items.PINK_PETALS, SEA_LAVENDER);
            content.addAfter(Items.PINK_PETALS, BLUE_IRIS);
            content.addAfter(Items.PINK_PETALS, PINK_ORCHID);
            content.addAfter(Items.PINK_PETALS, JACK_IN_THE_PULPIT);
            content.addAfter(Items.PINK_PETALS, GHOST_PIPES);
            content.addAfter(Items.PINK_PETALS, BUNCHBERRY_FLOWER);
            content.addAfter(Items.PINK_PETALS, GLACIER_LILY);

            content.addAfter(Items.CHERRY_LOG, MAHOE_LOG);
            content.addAfter(Items.CHERRY_LOG, MAPLE_LOG);
            content.addAfter(Items.WARPED_STEM, STRANGE_STEM);
            content.addAfter(Items.CHERRY_LEAVES, MAHOE_LEAVES);
            content.addAfter(Items.CHERRY_LEAVES, MAPLE_LEAVES);
            content.addAfter(Items.SHROOMLIGHT, STRANGE_LEAVES);
            content.addAfter(Items.CHERRY_SAPLING, MAHOE_SAPLING);
            content.addAfter(Items.CHERRY_SAPLING, MAPLE_SAPLING);
            content.addAfter(Items.WARPED_FUNGUS, STRANGE_SAPLING);

            content.addAfter(Items.PEONY, SNOWY_LUPINE);
            content.addAfter(Items.PEONY, BIRD_OF_PARADISE);
            content.addAfter(Items.PEONY, FIREWEED);

            content.addAfter(Items.LILY_PAD, RED_LOTUS);
            content.addAfter(Items.LILY_PAD, PINK_LOTUS);

            content.addAfter(Items.VINE, PASSIONFLOWER);

            content.addAfter(Items.DEAD_BUSH, TARO_PLANT);

            content.addAfter(Items.AMETHYST_CLUSTER, SMOOTH_SMOKY_QUARTZ_BLOCK);
            content.addAfter(Items.AMETHYST_CLUSTER, SMOKY_QUARTZ_BLOCK);
        });
    }

    public static void registerModBlocks() { orderItems(); }
}
