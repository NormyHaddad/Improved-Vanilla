package net.garunix.garunixpansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.garunix.garunixpansion.block.ModBlocks;

public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {
    public ModBlockLootTableProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate() {
        // use addDrop()
        //addDrop(ModBlocks.STRANGE_TRAPDOOR, ModBlocks.STRANGE_TRAPDOOR.asItem());
        //addDrop(ModBlocks.STRANGE_DOOR, ModBlocks.STRANGE_DOOR.asItem());
    }
}
