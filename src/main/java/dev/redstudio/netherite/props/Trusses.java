
package dev.redstudio.netherite.props;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class Trusses extends EntityModel<Entity> {

    private final ModelRenderer trusses;
    private final ModelRenderer trusses4_r1;
    private final ModelRenderer trusses3_r1;

    public Trusses() {
        textureWidth = 128;
        textureHeight = 128;

        trusses = new ModelRenderer(this);
        trusses.setTextureSize(textureWidth, textureHeight);
        trusses.mirror = true;
        trusses.setRotationPoint(0.0F, 24.0F, 0.0F);
        trusses.setTextureOffset(0, 0).addBox(-8.0F, -16.0F, -1.0F, 16, 2, 2, 0.0F);
        trusses.setTextureOffset(0, 0).addBox(-8.0F, -6.0F, -1.0F, 16, 2, 2, 0.0F);
        trusses.setTextureOffset(0, 0).addBox(-8.0F, -4.5F, -1.5F, 16, 1, 3, 0.0F);

        trusses4_r1 = new ModelRenderer(this);
        trusses4_r1.setTextureSize(textureWidth, textureHeight);
        trusses4_r1.mirror = true;
        trusses4_r1.setRotationPoint(-1.9957F, -8.0195F, 0.0F);
        trusses.addChild(trusses4_r1);
        setRotation(trusses4_r1, 0.0F, 0.0F, 0.9295F);
        trusses4_r1.setTextureOffset(0, 0).addBox(-4.0F, -6.0F, -0.5F, 12, 1, 1, 0.0F);

        trusses3_r1 = new ModelRenderer(this);
        trusses3_r1.setTextureSize(textureWidth, textureHeight);
        trusses3_r1.mirror = true;
        trusses3_r1.setRotationPoint(1.9956F, -8.0195F, 0.0F);
        trusses.addChild(trusses3_r1);
        setRotation(trusses3_r1, 0.0F, 0.0F, -0.9295F);
        trusses3_r1.setTextureOffset(0, 0).addBox(-7.0F, -6.0F, -0.5F, 11, 1, 1, 0.0F);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha) {
        trusses.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
