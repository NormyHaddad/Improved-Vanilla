package net.garunix.garunixpansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.garunix.garunixpansion.block.ModBlocks;
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
    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register(ModItems.STRANGE_HANGING_SIGN, Models.GENERATED);
    }
}
