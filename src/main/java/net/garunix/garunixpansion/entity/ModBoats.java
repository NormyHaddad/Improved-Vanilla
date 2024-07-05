package net.garunix.garunixpansion.entity;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.garunix.garunixpansion.Garunixpansion;
import net.garunix.garunixpansion.block.ModBlocks;
import net.garunix.garunixpansion.item.ModItems;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModBoats {
    public static Identifier MAHOE_BOAT_ID = Identifier.of(Garunixpansion.MOD_ID, "mahoe_boat");
    public static Identifier MAHOE_CHEST_BOAT_ID = Identifier.of(Garunixpansion.MOD_ID, "mahoe_chest_boat");

    public static final RegistryKey<TerraformBoatType> MAHOE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MAHOE_BOAT_ID);
    //public static final RegistryKey<TerraformBoatType> MAHOE_CHEST_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MAHOE_CHEST_BOAT_ID);

    public static void registerBoats() {
        TerraformBoatType mahoeBoat = new TerraformBoatType.Builder()
                .item(ModItems.MAHOE_BOAT)
                .chestItem(ModItems.MAHOE_CHEST_BOAT)
                .planks(ModBlocks.MAHOE_PLANKS.asItem())
                .build();
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, MAHOE_BOAT_KEY, mahoeBoat);
    }
}
