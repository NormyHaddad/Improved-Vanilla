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
        addDrop(MAPLE_BUTTON, drops(MAPLE_BUTTON.asItem()));
        addDrop(MAPLE_PRESSURE_PLATE, drops(MAPLE_PRESSURE_PLATE.asItem()));
        addDrop(MAHOE_BUTTON, drops(MAHOE_BUTTON.asItem()));
        addDrop(MAHOE_PRESSURE_PLATE, drops(MAHOE_PRESSURE_PLATE.asItem()));
    }
}
