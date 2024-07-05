package net.garunix.garunixpansion.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.garunix.garunixpansion.Garunixpansion;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {

    public static final SimpleParticleType FIREFLY = registerParticle("firefly", FabricParticleTypes.simple());

    private static SimpleParticleType registerParticle(String name, SimpleParticleType particleType) {
        return Registry.register(Registries.PARTICLE_TYPE, Identifier.of(Garunixpansion.MOD_ID, name), particleType);
    }

    public static void RegisterParticles() {
        Garunixpansion.LOGGER.info("Registering particles for " + Garunixpansion.MOD_ID);
    }
}
