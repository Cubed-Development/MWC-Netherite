
package dev.redstudio.netherite.props;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class WeaponCrateRussian extends EntityModel<Entity> {

    private final ModelRenderer bone;

    public WeaponCrateRussian() {
        textureWidth = 512;
        textureHeight = 512;

        bone = new ModelRenderer(this);
        bone.setTextureSize(textureWidth, textureHeight);
        bone.mirror = true;
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.setTextureOffset(200, 0).addBox(-3.0F, -10.0F, 26.5F, 7, 1, 1, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-12.0F, -4.0F, -24.0F, 25, 1, 50, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-11.0F, -16.0F, -23.0F, 23, 12, 48, 0.0F);
        bone.setTextureOffset(0, 0).addBox(12.0F, -8.1F, -24.0F, 1, 4, 50, 0.0F);
        bone.setTextureOffset(0, 0).addBox(12.0F, -12.2F, -24.0F, 1, 4, 50, 0.0F);
        bone.setTextureOffset(0, 0).addBox(12.0F, -16.3F, -24.0F, 1, 4, 50, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-12.0F, -8.1F, -24.0F, 1, 4, 50, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-12.0F, -12.2F, -24.0F, 1, 4, 50, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-12.0F, -16.3F, -24.0F, 1, 4, 50, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-11.5F, -10.0F, -24.3F, 24, 6, 1, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-11.5F, -16.2F, -24.3F, 24, 6, 1, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-11.5F, -16.2F, 25.3F, 24, 6, 1, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-11.5F, -10.0F, 25.3F, 24, 6, 1, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-11.0F, -16.8F, -24.0F, 5, 1, 50, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-5.8F, -16.8F, -24.0F, 5, 1, 50, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-0.6F, -16.8F, -24.0F, 5, 1, 50, 0.0F);
        bone.setTextureOffset(0, 0).addBox(4.7F, -16.8F, -24.0F, 5, 1, 50, 0.0F);
        bone.setTextureOffset(0, 0).addBox(9.9F, -16.8F, -24.0F, 2, 1, 50, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-11.0F, -17.8F, -19.0F, 23, 1, 5, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-11.0F, -17.8F, 16.0F, 23, 1, 5, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-11.0F, -3.0F, -19.0F, 23, 1, 5, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-11.0F, -3.0F, 17.0F, 23, 1, 5, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-3.0F, -14.0F, -26.0F, 7, 2, 2, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-3.0F, -14.0F, 26.0F, 7, 2, 2, 0.0F);
        bone.setTextureOffset(200, 0).addBox(4.0F, -13.5F, -25.5F, 1, 4, 1, 0.0F);
        bone.setTextureOffset(200, 0).addBox(-4.0F, -13.5F, -25.5F, 1, 4, 1, 0.0F);
        bone.setTextureOffset(200, 0).addBox(-3.0F, -10.0F, -25.5F, 7, 1, 1, 0.0F);
        bone.setTextureOffset(200, 0).addBox(4.0F, -13.5F, 26.5F, 1, 4, 1, 0.0F);
        bone.setTextureOffset(200, 0).addBox(-4.0F, -13.5F, 26.5F, 1, 4, 1, 0.0F);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha) {
        bone.render(matrixStack, buffer, packedLight, packedOverlay);
    }
}
