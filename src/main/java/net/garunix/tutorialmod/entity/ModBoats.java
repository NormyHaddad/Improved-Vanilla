package net.garunix.tutorialmod.entity;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.garunix.tutorialmod.TutorialMod;
import net.garunix.tutorialmod.block.ModBlocks;
import net.garunix.tutorialmod.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class ModBoats {
    public static Identifier MAHOE_BOAT_ID = new Identifier(TutorialMod.MOD_ID, "mahoe_boat");
    public static Identifier MAHOE_CHEST_BOAT_ID = new Identifier(TutorialMod.MOD_ID, "mahoe_chest_boat");

    public static final RegistryKey<TerraformBoatType> MAHOE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MAHOE_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> MAHOE_CHEST_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MAHOE_CHEST_BOAT_ID);

    public static void registerBoats() {
        TerraformBoatType mahoeBoat = new TerraformBoatType.Builder()
                .item(ModItems.MAHOE_BOAT)
                .chestItem(ModItems.MAHOE_CHEST_BOAT)
                .planks(ModBlocks.MAHOE_PLANKS.asItem())
                .build();
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, MAHOE_BOAT_KEY, mahoeBoat);
    }
}
