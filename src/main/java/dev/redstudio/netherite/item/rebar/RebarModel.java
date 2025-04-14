package dev.redstudio.netherite.item.rebar;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class RebarModel extends EntityModel<Entity> {

    private final ModelRenderer rebar;

    public RebarModel() {
        textureWidth = 16;
        textureHeight = 16;
        
        float height = 16.0f * 0.5f;

        // Origin is centered, so we start building the model from -0.5 to 0.5 (x and z) and height on y
        rebar = new ModelRenderer(this);
        rebar.setRotationPoint(0.0F, 24.0F, 0.0F); // Bottom center origin
        rebar.addBox(-1.0F, -height, -1.0F, 4, (int) height, 4); // width: 2, depth: 2
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay,
                       float red, float green, float blue, float alpha) {
        rebar.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    @Override
    public void setRotationAngles(Entity entity, float v, float v1, float v2, float v3, float v4) {

    }
}

