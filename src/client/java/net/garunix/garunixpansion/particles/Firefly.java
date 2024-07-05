package net.garunix.garunixpansion.particles;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.util.math.MathHelper;

@Environment(EnvType.CLIENT)
public class Firefly extends SpriteBillboardParticle {
    private final SpriteProvider spriteProvider;

    private float desiredVelocityX;
    private float desiredVelocityY;
    private float desiredVelocityZ;
    private float velChangeX;
    private float velChangeY;
    private float velChangeZ;
    //Leave at least one line of space here for later

    Firefly(ClientWorld world, double x, double y, double z, double velX, double velY, double velZ, SpriteProvider spriteProvider) {
        super(world, x, y, z);
        this.spriteProvider = spriteProvider;
        this.maxAge = 50;
        this.scale = 0.1f;
        this.collidesWithWorld = true;
        this.velocityX = velX; this.velocityY = velY; this.velocityZ = velZ;
        this.x = x; this.y = y; this.z = z;
        this.alpha = 0.0f;
        this.setSpriteForAge(spriteProvider);
    }

    public void tick() {
        //Tick particle method
        //Activated every single tick the particle is alive
        this.prevPosX = this.x;
        this.prevPosY = this.y;
        this.prevPosZ = this.z;
        this.prevAngle = this.angle; //required for rotating the particle
        if (this.age <= 25) { this.alpha += 0.04f; this.alpha = MathHelper.clamp(this.alpha, 0.0f, 1.0f); }
        if (this.age > 25) { this.alpha -= 0.04f; }

        if(this.age++ >= this.maxAge || this.scale <= 0 || this.alpha <= 0) { //Despawns the particle if the age has reached the max age, or if the scale is 0
            this.markDead(); //Despawns the particle
        }
        else {
            this.setSpriteForAge(this.spriteProvider); //Animates the particle if needed
            this.move(this.velocityX, this.velocityY, this.velocityZ);
        }

        if(this.age % 5 == 0) {
            this.desiredVelocityX += (random.nextDouble()) - 0.5;
            this.desiredVelocityY += (random.nextDouble()) - 0.3;
            this.desiredVelocityZ += (random.nextDouble()) - 0.5;
            this.velChangeX = desiredVelocityX / 5;
            this.velChangeY = desiredVelocityY / 5;
            this.velChangeZ = desiredVelocityZ / 5;
        }
        this.velocityX += velChangeX;
        this.velocityY += velChangeY;
        this.velocityZ += velChangeZ;
        this.velocityX = MathHelper.clamp(velocityX, -0.2, 0.2);
        this.velocityY = MathHelper.clamp(velocityY, -0.2, 0.2);
        this.velocityZ = MathHelper.clamp(velocityZ, -0.2, 0.2);

    }

    @Override
    public int getBrightness(float tint) {
        float f = 1.0f;//((float)this.age + tint) / (float)this.maxAge;
        f = MathHelper.clamp((float)f, (float)0.0f, (float)1.0f);
        int i = super.getBrightness(tint);
        int j = i & 0xFF;
        int k = i >> 16 & 0xFF;
        if ((j += (int)(f * 15.0f * 16.0f)) > 240) {
            j = 240;
        }
        return j | k << 16;
    }

    @Override
    public ParticleTextureSheet getType() {
        //Particle texture sheet method. Allows for the particle to determine its texture "type" to a degree
        return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
    }

    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<SimpleParticleType> {
        //The factory used in a particle's registry
        private final SpriteProvider spriteProvider;
        public Factory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }
        public Particle createParticle(SimpleParticleType defaultParticleType, ClientWorld clientWorld, double x, double y, double z, double velX, double velY, double velZ) {
            return new Firefly(clientWorld, x, y, z, velX, velY, velZ, this.spriteProvider);
        }
    }
}
