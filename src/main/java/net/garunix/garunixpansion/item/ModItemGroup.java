package net.garunix.garunixpansion.item;

//import net.garunix.garunixpansion.Garunixpansion;
import net.minecraft.item.ItemGroup;
        import net.minecraft.registry.RegistryKey;
        import net.minecraft.registry.RegistryKeys;
        import net.minecraft.util.Identifier;

import static net.garunix.garunixpansion.Garunixpansion.MOD_ID;

public class ModItemGroup {
    public static final RegistryKey<ItemGroup> GARUNIX = RegistryKey.of(RegistryKeys.ITEM_GROUP,
            new Identifier(MOD_ID, "garunix"));

    public void onInitialize() {

    }
}
