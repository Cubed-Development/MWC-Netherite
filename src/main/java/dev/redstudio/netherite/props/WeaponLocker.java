
package dev.redstudio.netherite.props;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class WeaponLocker extends EntityModel<Entity> {

    private final ModelRenderer gunrack;

    public WeaponLocker() {
        textureWidth = 256;
        textureHeight = 256;

        gunrack = new ModelRenderer(this);
        gunrack.setTextureSize(textureWidth, textureHeight);
        gunrack.setRotationPoint(0.0F, 24.0F, 0.0F);
        gunrack.setTextureOffset(187, 117).addBox(-2.0F, -48.0F, 28.0F, 11, 44, 0, 0.0F);
        gunrack.setTextureOffset(187, 117).addBox(-2.0F, -48.0F, -19.0F, 11, 44, 0, 0.0F);
        gunrack.setTextureOffset(0, 61).addBox(10.5F, -48.0F, -17.0F, 0, 44, 43, 0.0F);
        gunrack.setTextureOffset(0, 52).addBox(10.0F, -32.0F, 22.5F, 1, 11, 3, 0.0F);
        gunrack.setTextureOffset(83, 40).addBox(-1.0F, -39.0F, -15.0F, 7, 2, 7, 0.0F);
        gunrack.setTextureOffset(83, 71).addBox(-1.0F, -39.0F, -7.0F, 7, 2, 7, 0.0F);
        gunrack.setTextureOffset(83, 83).addBox(-2.0F, -35.0F, -11.0F, 10, 4, 12, 0.0F);
        gunrack.setTextureOffset(86, 104).addBox(-2.0F, -23.0F, -12.0F, 6, 4, 13, 0.0F);
        gunrack.setTextureOffset(0, 72).addBox(-2.0F, -29.0F, -17.0F, 10, 4, 12, 0.0F);
        gunrack.setTextureOffset(0, 52).addBox(-2.0F, -17.0F, -16.0F, 8, 4, 16, 0.0F);
        gunrack.setTextureOffset(0, 88).addBox(0.0F, -11.0F, -9.0F, 7, 4, 9, 0.0F);
        gunrack.setTextureOffset(28, 168).addBox(-2.0F, -24.0F, 21.0F, 6, 20, 1, 0.0F);
        gunrack.setTextureOffset(14, 168).addBox(-2.0F, -24.0F, 18.0F, 6, 20, 1, 0.0F);
        gunrack.setTextureOffset(163, 0).addBox(-2.0F, -24.0F, 12.0F, 6, 20, 1, 0.0F);
        gunrack.setTextureOffset(48, 163).addBox(-2.0F, -24.0F, 8.75F, 6, 20, 1, 0.0F);
        gunrack.setTextureOffset(32, 52).addBox(-2.0F, -41.0F, 21.0F, 6, 4, 1, 0.0F);
        gunrack.setTextureOffset(32, 57).addBox(-2.0F, -41.0F, 18.0F, 6, 4, 1, 0.0F);
        gunrack.setTextureOffset(32, 72).addBox(-2.0F, -41.0F, 12.0F, 6, 4, 1, 0.0F);
        gunrack.setTextureOffset(83, 0).addBox(-2.0F, -41.0F, 9.25F, 6, 4, 1, 0.0F);
        gunrack.setTextureOffset(123, 41).addBox(-2.0F, -37.0F, -17.0F, 11, 1, 18, 0.0F);
        gunrack.setTextureOffset(123, 22).addBox(-2.0F, -31.0F, -17.0F, 11, 1, 18, 0.0F);
        gunrack.setTextureOffset(83, 21).addBox(-2.0F, -25.0F, -17.0F, 11, 1, 18, 0.0F);
        gunrack.setTextureOffset(83, 52).addBox(-2.0F, -19.0F, -17.0F, 11, 1, 18, 0.0F);
        gunrack.setTextureOffset(123, 3).addBox(-2.0F, -13.0F, -17.0F, 11, 1, 18, 0.0F);
        gunrack.setTextureOffset(83, 0).addBox(-2.0F, -7.0F, -17.0F, 11, 3, 18, 0.0F);
        gunrack.setTextureOffset(0, 0).addBox(-2.0F, -48.0F, 1.0F, 10, 44, 2, 0.0F);
        gunrack.setTextureOffset(89, 89).addBox(-3.0F, -48.0F, -17.0F, 1, 44, 43, 0.0F);
        gunrack.setTextureOffset(24, 0).addBox(-5.0F, -48.0F, 26.0F, 3, 44, 3, 0.0F);
        gunrack.setTextureOffset(36, 0).addBox(9.0F, -48.0F, 26.0F, 3, 44, 3, 0.0F);
        gunrack.setTextureOffset(134, 79).addBox(9.0F, -48.0F, -20.0F, 3, 44, 3, 0.0F);
        gunrack.setTextureOffset(146, 79).addBox(-5.0F, -48.0F, -20.0F, 3, 44, 3, 0.0F);
        gunrack.setTextureOffset(0, 0).addBox(-5.0F, -51.0F, -20.0F, 17, 3, 49, 0.0F);
        gunrack.setTextureOffset(0, 52).addBox(-5.0F, -4.0F, -20.0F, 17, 3, 49, 0.0F);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha) {
        gunrack.render(matrixStack, buffer, packedLight, packedOverlay);
    }
}
