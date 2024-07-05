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
        blockStateModelGenerator.registerCrop(ModBlocks.CYAN_ROSE_CROP, CyanRoseCrop.AGE, 0, 1, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.RED_ROSE_CROP, OldRoseCrop.AGE, 0, 1, 2, 3);
    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register(ModItems.STRANGE_HANGING_SIGN, Models.GENERATED);
    }
}
