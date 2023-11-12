package net.garunix.garunixpansion.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;

import java.util.function.Consumer;

public class ModRecipeGen extends FabricRecipeProvider {
    public ModRecipeGen(FabricDataOutput output) {
        super(output);
    }
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        //offerPlanksRecipe(exporter, ModBlocks.MAPLE_PLANKS, ModBlocks.MAPLE_PLANKS);
    }
/*
    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {

    }

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        // ...
        fabricDataGenerator.addProvider(MyRecipeGenerator::new);
        // ...
    }*/
}


// ...


