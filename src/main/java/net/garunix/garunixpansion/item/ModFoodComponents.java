package net.garunix.garunixpansion.item;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent BLUEBERRY = (new FoodComponent.Builder()).nutrition(2).saturationModifier(0.1F).build();
    public static final FoodComponent TARO = (new FoodComponent.Builder()).nutrition(1).saturationModifier(0.3F).build();
    public static final FoodComponent COOKED_TARO = (new FoodComponent.Builder()).nutrition(3).saturationModifier(0.7F).build();
}
