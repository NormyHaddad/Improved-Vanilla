package net.garunix.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import static net.garunix.tutorialmod.block.ModBlocks.*;

public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {
    public ModBlockLootTableProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate() {
        addDrop(MAPLE_LOG, drops(MAPLE_LOG.asItem()));
        addDrop(MAPLE_WOOD, drops(MAPLE_WOOD.asItem()));
        addDrop(STRIPPED_MAPLE_WOOD, drops(STRIPPED_MAPLE_WOOD.asItem()));
        addDrop(STRIPPED_MAPLE_LOG, drops(STRIPPED_MAPLE_LOG.asItem()));
        addDrop(MAPLE_PLANKS, drops(MAPLE_PLANKS.asItem()));
    }
}
