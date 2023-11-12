package net.garunix.garunixpansion.entity;

import net.garunix.garunixpansion.Garunixpansion;
import net.garunix.garunixpansion.entity.custom.RedCardinalEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class RedCardinalRenderer extends GeoEntityRenderer<RedCardinalEntity> {
    public RedCardinalRenderer(net.minecraft.client.render.entity.EntityRendererFactory.Context renderManager) {
        super(renderManager, new RedCardinalModel());
    }


    @Override
    public Identifier getTextureLocation(RedCardinalEntity animatable) {
        return new Identifier(Garunixpansion.MOD_ID, "textures/entity/red_cardinal.png");
    }

    @Override
    public void render(RedCardinalEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
