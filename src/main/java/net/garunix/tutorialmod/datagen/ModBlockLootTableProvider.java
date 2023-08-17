package net.garunix.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.garunix.tutorialmod.block.ModBlocks;

import static net.garunix.tutorialmod.block.ModBlocks.*;

public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {
    public ModBlockLootTableProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate() {
        // use addDrop()
        addDrop(MAHOE_WOOD, drops(MAHOE_WOOD.asItem()));
        addDrop(STRIPPED_MAHOE_LOG, drops(STRIPPED_MAHOE_LOG.asItem()));
        addDrop(STRIPPED_MAHOE_WOOD, drops(STRIPPED_MAHOE_WOOD.asItem()));
    }
}
