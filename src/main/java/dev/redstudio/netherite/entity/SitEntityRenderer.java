package dev.redstudio.netherite.entity;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class SitEntityRenderer extends EntityRenderer<SitEntity> {
    public SitEntityRenderer(EntityRendererManager renderManager) {
        super(renderManager);
    }

    @Override
    public ResourceLocation getEntityTexture(SitEntity entity) {
        return null; // No texture needed
    }
}

