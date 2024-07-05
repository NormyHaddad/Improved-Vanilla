package net.garunix.garunixpansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.garunix.garunixpansion.block.ModBlocks;
import net.garunix.garunixpansion.block.custom.CyanRoseCrop;
import net.garunix.garunixpansion.block.custom.OldRoseCrop;
import net.garunix.garunixpansion.item.ModItems;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;


//public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {
//    public ModBlockLootTableProvider(FabricDataOutput output) {
//        super(output);
//    }
//
//    @Override
//    public void generate() {
//        // use addDrop()
//        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.RED_ROSE_CROP).properties(StatePredicate.Builder.create()
//                .exactMatch(OldRoseCrop.AGE, 3));
//        addDrop(ModBlocks.RED_ROSE_CROP, cropDrops(ModBlocks.RED_ROSE_CROP, ModItems.RED_ROSE_SEEDS, ModBlocks.RED_ROSE.asItem(), builder));
//        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.CYAN_ROSE_CROP).properties(StatePredicate.Builder.create()
//                .exactMatch(CyanRoseCrop.AGE, 3));
//        addDrop(ModBlocks.CYAN_ROSE_CROP, cropDrops(ModBlocks.CYAN_ROSE_CROP, ModItems.CYAN_ROSE_SEEDS, ModBlocks.CYAN_ROSE.asItem(), builder));
//    }
//}
