package net.garunix.garunixpansion.entity;

import net.garunix.garunixpansion.Garunixpansion;
import net.garunix.garunixpansion.entity.custom.RedCardinalEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class RedCardinalModel extends GeoModel<RedCardinalEntity> {
    @Override
    public Identifier getModelResource(RedCardinalEntity animatable) {
        return new Identifier(Garunixpansion.MOD_ID, "geo/red_cardinal.geo.json");
    }

    @Override
    public Identifier getTextureResource(RedCardinalEntity animatable) {
        return new Identifier(Garunixpansion.MOD_ID, "textures/entity/red_cardinal.png");
    }

    @Override
    public Identifier getAnimationResource(RedCardinalEntity animatable) {
        return new Identifier(Garunixpansion.MOD_ID, "animations/red_cardinal.animation.json");
    }

    @Override
    public void setCustomAnimations(RedCardinalEntity animatable, long instanceId, AnimationState<RedCardinalEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(entityData.headPitch() * MathHelper.RADIANS_PER_DEGREE);
            head.setRotY(entityData.netHeadYaw() * MathHelper.RADIANS_PER_DEGREE);
        }
    }
}
