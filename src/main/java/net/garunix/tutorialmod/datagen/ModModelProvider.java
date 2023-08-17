package net.garunix.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.garunix.tutorialmod.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;
import net.minecraft.util.Identifier;

import static net.garunix.tutorialmod.block.ModBlocks.MAHOE_LOG;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_MAHOE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.MAHOE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_MAHOE_LOG);
        //blockStateModelGenerator.registerHangingSign(ModBlocks.STRIPPED_MAPLE_LOG, ModBlocks.MAPLE_HANGING_SIGN, ModBlocks.MAPLE_WALL_HANGING_SIGN);
    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        
    }
}
