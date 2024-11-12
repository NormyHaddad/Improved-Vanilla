package net.garunix.garunixpansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.garunix.garunixpansion.block.ModBlocks;
import net.garunix.garunixpansion.block.custom.CyanRoseCrop;
import net.garunix.garunixpansion.block.custom.OldRoseCrop;
import net.garunix.garunixpansion.item.ModItems;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;


public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {


    protected ModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        // use addDrop()
        addPottedPlantDrops(ModBlocks.POTTED_MAPLE_SAPLING);
        addPottedPlantDrops(ModBlocks.POTTED_MAHOE_SAPLING);
        addPottedPlantDrops(ModBlocks.POTTED_STRANGE_SAPLING);

    }
}
