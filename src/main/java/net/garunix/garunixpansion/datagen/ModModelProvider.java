package net.garunix.garunixpansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.garunix.garunixpansion.block.ModBlocks;
import net.garunix.garunixpansion.block.custom.CyanRoseCrop;
import net.garunix.garunixpansion.block.custom.OldRoseCrop;
import net.garunix.garunixpansion.item.ModItems;
import net.minecraft.data.client.*;
import net.minecraft.item.Item;
import net.minecraft.structure.rule.BlockStateMatchRuleTest;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MAPLE_SAPLING, ModBlocks.POTTED_MAPLE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MAHOE_SAPLING, ModBlocks.POTTED_MAHOE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.STRANGE_SAPLING, ModBlocks.POTTED_STRANGE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register(ModItems.STRANGE_HANGING_SIGN, Models.GENERATED);
    }
}
