
package dev.redstudio.netherite.props;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class WeaponCaseSmall extends EntityModel<Entity> {

    private final ModelRenderer guncase;
    private final ModelRenderer Shape51Hatch_r1;
    private final ModelRenderer Shape46Hatch_r1;
    private final ModelRenderer Shape44Hatch_r1;
    private final ModelRenderer Shape32Hatch_r1;

    public WeaponCaseSmall() {
        textureWidth = 128;
        textureHeight = 128;

        guncase = new ModelRenderer(this);
        guncase.setTextureSize(textureWidth, textureHeight);
        guncase.setRotationPoint(0.0F, 24.0F, 0.0F);
        guncase.setTextureOffset(56, 0).addBox(6.5F, -8.1F, -6.0F, 2, 2, 12, 0.0F);
        guncase.setTextureOffset(9, 29).addBox(6.7F, -7.0F, -6.0F, 3, 4, 3, 0.0F);
        guncase.setTextureOffset(0, 25).addBox(6.7F, -7.0F, 3.0F, 3, 4, 3, 0.0F);
        guncase.setTextureOffset(52, 25).addBox(6.5F, -6.0F, 8.0F, 3, 3, 1, 0.0F);
        guncase.setTextureOffset(6, 52).addBox(6.5F, -6.0F, -9.0F, 3, 3, 1, 0.0F);
        guncase.setTextureOffset(10, 20).addBox(8.0F, -5.6F, -5.0F, 3, 1, 1, 0.0F);
        guncase.setTextureOffset(8, 10).addBox(8.0F, -5.6F, 4.0F, 3, 1, 1, 0.0F);
        guncase.setTextureOffset(0, 0).addBox(11.0F, -5.6F, -4.5F, 1, 1, 9, 0.0F);
        guncase.setTextureOffset(0, 25).addBox(-9.0F, -7.0F, -11.0F, 15, 5, 22, 0.0F);
        guncase.setTextureOffset(0, 52).addBox(-10.0F, -7.01F, -10.0F, 17, 5, 20, 0.0F);
        guncase.setTextureOffset(0, 42).addBox(6.7F, -5.8F, -1.0F, 2, 2, 2, 0.0F);
        guncase.setTextureOffset(8, 13).addBox(-12.0F, -8.5F, -8.0F, 2, 3, 4, 0.0F);
        guncase.setTextureOffset(0, 10).addBox(-12.0F, -8.5F, 4.0F, 2, 3, 4, 0.0F);
        guncase.setTextureOffset(0, 38).addBox(6.5F, -8.1F, 8.0F, 3, 2, 2, 0.0F);
        guncase.setTextureOffset(8, 36).addBox(6.5F, -8.1F, -10.0F, 3, 2, 2, 0.0F);
        guncase.setTextureOffset(0, 0).addBox(-10.0F, -10.1F, -11.0F, 17, 3, 22, 0.0F);
        guncase.setTextureOffset(54, 60).addBox(-9.0F, -8.1F, -12.5F, 15, 2, 25, 0.0F);
        guncase.setTextureOffset(54, 38).addBox(-11.5F, -8.1F, -10.0F, 2, 2, 20, 0.0F);
        guncase.setTextureOffset(11, 0).addBox(7.0F, -9.3F, -8.0F, 2, 6, 2, 0.0F);
        guncase.setTextureOffset(0, 0).addBox(7.0F, -9.3F, 6.0F, 2, 6, 2, 0.0F);
        guncase.setTextureOffset(52, 25).addBox(-9.99F, -10.3F, -6.0F, 17, 1, 12, 0.0F);
        guncase.setTextureOffset(56, 17).addBox(-9.99F, -10.3F, 8.0F, 17, 1, 2, 0.0F);
        guncase.setTextureOffset(56, 14).addBox(-9.99F, -10.3F, -10.0F, 17, 1, 2, 0.0F);

        Shape51Hatch_r1 = new ModelRenderer(this);
        Shape51Hatch_r1.setTextureSize(textureWidth, textureHeight);
        Shape51Hatch_r1.setRotationPoint(3.8659F, 0.0F, -9.9284F);
        guncase.addChild(Shape51Hatch_r1);
        setRotation(Shape51Hatch_r1, 0.0F, 0.733F, 0.0F);
        Shape51Hatch_r1.setTextureOffset(0, 18).addBox(-11.0F, -8.1F, -10.5F, 3, 2, 2, 0.0F);
        Shape51Hatch_r1.setTextureOffset(14, 52).addBox(-10.0F, -6.0F, -9.5F, 1, 4, 1, 0.0F);

        Shape46Hatch_r1 = new ModelRenderer(this);
        Shape46Hatch_r1.setTextureSize(textureWidth, textureHeight);
        Shape46Hatch_r1.setRotationPoint(2.9888F, 0.0F, 9.1261F);
        guncase.addChild(Shape46Hatch_r1);
        setRotation(Shape46Hatch_r1, 0.0F, -0.8203F, 0.0F);
        Shape46Hatch_r1.setTextureOffset(12, 25).addBox(-9.0F, -8.1F, 9.3F, 3, 2, 2, 0.0F);
        Shape46Hatch_r1.setTextureOffset(16, 10).addBox(-8.0F, -6.0F, 8.3F, 1, 4, 2, 0.0F);

        Shape44Hatch_r1 = new ModelRenderer(this);
        Shape44Hatch_r1.setTextureSize(textureWidth, textureHeight);
        Shape44Hatch_r1.setRotationPoint(-5.6637F, 0.0F, 5.2447F);
        guncase.addChild(Shape44Hatch_r1);
        setRotation(Shape44Hatch_r1, 0.0F, 0.733F, 0.0F);
        Shape44Hatch_r1.setTextureOffset(0, 34).addBox(4.0F, -8.1F, 11.0F, 3, 2, 2, 0.0F);
        Shape44Hatch_r1.setTextureOffset(0, 52).addBox(5.0F, -6.0F, 10.0F, 1, 4, 2, 0.0F);

        Shape32Hatch_r1 = new ModelRenderer(this);
        Shape32Hatch_r1.setTextureSize(textureWidth, textureHeight);
        Shape32Hatch_r1.setRotationPoint(-8.1083F, 0.0F, -11.3521F);
        guncase.addChild(Shape32Hatch_r1);
        setRotation(Shape32Hatch_r1, 0.0F, -0.8203F, 0.0F);
        Shape32Hatch_r1.setTextureOffset(8, 40).addBox(9.0F, -8.1F, -11.2F, 3, 2, 2, 0.0F);
        Shape32Hatch_r1.setTextureOffset(52, 29).addBox(10.0F, -6.0F, -10.2F, 1, 4, 1, 0.0F);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha) {
        guncase.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
