package net.garunix.tutorialmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.garunix.tutorialmod.TutorialMod;
import net.garunix.tutorialmod.entity.custom.RedCardinalEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<RedCardinalEntity> RED_CARDINAL = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(TutorialMod.MOD_ID, "tiger"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, RedCardinalEntity::new)
                    .dimensions(EntityDimensions.fixed(1.5f, 1.75f)).build());
}
