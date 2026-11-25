
package dev.redstudio.netherite.item.containers.weapon;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class WeaponCaseModel extends EntityModel<Entity> {

    private final ModelRenderer guncase;
    private final ModelRenderer Shape86Hatch_r1;
    private final ModelRenderer Shape82Hatch_r1;
    private final ModelRenderer Shape79Hatch_r1;
    private final ModelRenderer Shape75Hatch_r1;
    private final ModelRenderer Shape25_r1;
    private final ModelRenderer Shape24_r1;
    private final ModelRenderer Shape23_r1;
    private final ModelRenderer Shape22_r1;

    public WeaponCaseModel() {
        textureWidth = 256;
        textureHeight = 256;

        guncase = new ModelRenderer(this);
        guncase.setTextureSize(textureWidth, textureHeight);
        guncase.setRotationPoint(17.8353F, 24.0F, -0.723F);
        guncase.setTextureOffset(0, 0).addBox(-22.8353F, -6.0F, -23.277F, 14, 5, 60, 0.0F);
        guncase.setTextureOffset(91, 7).addBox(-23.8353F, -6.01F, -22.277F, 16, 5, 58, 0.0F);
        guncase.setTextureOffset(0, 65).addBox(-25.1353F, -7.5F, -13.277F, 2, 3, 9, 0.0F);
        guncase.setTextureOffset(33, 42).addBox(-25.1353F, -7.5F, 17.723F, 2, 3, 9, 0.0F);
        guncase.setTextureOffset(0, 65).addBox(-23.8353F, -9.1F, -22.827F, 16, 3, 59, 0.0F);
        guncase.setTextureOffset(0, 13).addBox(-23.8253F, -9.3F, 0.723F, 16, 1, 12, 0.0F);
        guncase.setTextureOffset(0, 0).addBox(-23.8253F, -9.3F, -14.277F, 16, 1, 12, 0.0F);
        guncase.setTextureOffset(0, 26).addBox(-23.8253F, -9.3F, 15.723F, 16, 1, 12, 0.0F);
        guncase.setTextureOffset(0, 45).addBox(-23.8253F, -9.3F, 30.723F, 16, 1, 5, 0.0F);
        guncase.setTextureOffset(0, 39).addBox(-23.8253F, -9.3F, -22.277F, 16, 1, 5, 0.0F);
        guncase.setTextureOffset(44, 13).addBox(-8.3353F, -8.1F, -17.277F, 2, 5, 3, 0.0F);
        guncase.setTextureOffset(0, 26).addBox(-8.3353F, -8.1F, -2.277F, 2, 5, 3, 0.0F);
        guncase.setTextureOffset(0, 13).addBox(-8.3353F, -8.1F, 12.723F, 2, 5, 3, 0.0F);
        guncase.setTextureOffset(0, 0).addBox(-8.3353F, -8.1F, 27.723F, 2, 5, 3, 0.0F);
        guncase.setTextureOffset(46, 39).addBox(-16.8353F, -8.1F, -24.777F, 3, 5, 2, 0.0F);
        guncase.setTextureOffset(44, 26).addBox(-16.8353F, -8.1F, 36.223F, 3, 5, 2, 0.0F);
        guncase.setTextureOffset(53, 0).addBox(-6.8353F, -7.1F, -13.777F, 1, 2, 2, 0.0F);
        guncase.setTextureOffset(53, 53).addBox(-6.8353F, -7.1F, -4.777F, 1, 2, 2, 0.0F);
        guncase.setTextureOffset(50, 8).addBox(-6.8353F, -7.1F, 16.223F, 1, 2, 2, 0.0F);
        guncase.setTextureOffset(0, 127).addBox(-7.8353F, -7.1F, -22.277F, 1, 2, 58, 0.0F);
        guncase.setTextureOffset(44, 21).addBox(-6.8353F, -7.1F, 25.223F, 1, 2, 2, 0.0F);
        guncase.setTextureOffset(44, 8).addBox(-6.8353F, -7.1F, 31.223F, 1, 2, 2, 0.0F);
        guncase.setTextureOffset(0, 55).addBox(-22.8353F, -7.1F, 35.723F, 14, 2, 2, 0.0F);
        guncase.setTextureOffset(0, 51).addBox(-22.8353F, -7.1F, -24.277F, 14, 2, 2, 0.0F);
        guncase.setTextureOffset(92, 92).addBox(-24.8353F, -7.1F, -22.277F, 1, 2, 58, 0.0F);
        guncase.setTextureOffset(44, 0).addBox(-6.8353F, -7.1F, -19.777F, 1, 2, 2, 0.0F);
        guncase.setTextureOffset(52, 31).addBox(-8.6353F, -5.0F, 1.723F, 2, 3, 2, 0.0F);
        guncase.setTextureOffset(52, 19).addBox(-8.6353F, -5.0F, 9.723F, 2, 3, 2, 0.0F);
        guncase.setTextureOffset(0, 36).addBox(-7.6353F, -3.5F, 10.223F, 3, 1, 1, 0.0F);
        guncase.setTextureOffset(0, 34).addBox(-7.6353F, -3.5F, 2.223F, 3, 1, 1, 0.0F);
        guncase.setTextureOffset(44, 0).addBox(-5.3353F, -3.5F, 3.223F, 1, 1, 7, 0.0F);

        Shape86Hatch_r1 = new ModelRenderer(this);
        Shape86Hatch_r1.setTextureSize(textureWidth, textureHeight);
        Shape86Hatch_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        guncase.addChild(Shape86Hatch_r1);
        setRotation(Shape86Hatch_r1, 0.0F, 0.7505F, 0.0F);
        Shape86Hatch_r1.setTextureOffset(44, 33).addBox(8.1F, -7.1F, -23.9F, 2, 2, 3, 0.0F);

        Shape82Hatch_r1 = new ModelRenderer(this);
        Shape82Hatch_r1.setTextureSize(textureWidth, textureHeight);
        Shape82Hatch_r1.setRotationPoint(-3.5427F, 0.0F, -9.8993F);
        guncase.addChild(Shape82Hatch_r1);
        setRotation(Shape82Hatch_r1, 0.0F, 0.7679F, 0.0F);
        Shape82Hatch_r1.setTextureOffset(0, 8).addBox(-6.8F, -7.1F, -23.7F, 3, 2, 2, 0.0F);

        Shape79Hatch_r1 = new ModelRenderer(this);
        Shape79Hatch_r1.setTextureSize(textureWidth, textureHeight);
        Shape79Hatch_r1.setRotationPoint(-44.3415F, 0.0F, 6.7316F);
        guncase.addChild(Shape79Hatch_r1);
        setRotation(Shape79Hatch_r1, 0.0F, 0.7854F, 0.0F);
        Shape79Hatch_r1.setTextureOffset(46, 46).addBox(-6.7F, -7.1F, 34.2F, 2, 2, 3, 0.0F);

        Shape75Hatch_r1 = new ModelRenderer(this);
        Shape75Hatch_r1.setTextureSize(textureWidth, textureHeight);
        Shape75Hatch_r1.setRotationPoint(-40.8886F, 0.0F, 17.7037F);
        guncase.addChild(Shape75Hatch_r1);
        setRotation(Shape75Hatch_r1, 0.0F, 0.8203F, 0.0F);
        Shape75Hatch_r1.setTextureOffset(0, 21).addBox(7.2F, -7.1F, 35.1F, 3, 2, 2, 0.0F);

        Shape25_r1 = new ModelRenderer(this);
        Shape25_r1.setTextureSize(textureWidth, textureHeight);
        Shape25_r1.setRotationPoint(-38.4606F, 0.0F, 14.0528F);
        guncase.addChild(Shape25_r1);
        setRotation(Shape25_r1, 0.0F, 0.6981F, 0.0F);
        Shape25_r1.setTextureOffset(0, 39).addBox(8.3F, -5.0F, 35.4F, 1, 4, 1, 0.0F);

        Shape24_r1 = new ModelRenderer(this);
        Shape24_r1.setTextureSize(textureWidth, textureHeight);
        Shape24_r1.setRotationPoint(-4.4554F, 0.0F, -8.5141F);
        guncase.addChild(Shape24_r1);
        setRotation(Shape24_r1, 0.0F, 0.6981F, 0.0F);
        Shape24_r1.setTextureOffset(37, 39).addBox(-5.8F, -5.0F, -23.2F, 1, 4, 1, 0.0F);

        Shape23_r1 = new ModelRenderer(this);
        Shape23_r1.setTextureSize(textureWidth, textureHeight);
        Shape23_r1.setRotationPoint(-41.7356F, 0.0F, 5.0541F);
        guncase.addChild(Shape23_r1);
        setRotation(Shape23_r1, 0.0F, 0.6981F, 0.0F);
        Shape23_r1.setTextureOffset(0, 45).addBox(-6.1F, -5.0F, 35.2F, 1, 4, 1, 0.0F);

        Shape22_r1 = new ModelRenderer(this);
        Shape22_r1.setTextureSize(textureWidth, textureHeight);
        Shape22_r1.setRotationPoint(-1.1803F, 0.0F, 0.4846F);
        guncase.addChild(Shape22_r1);
        setRotation(Shape22_r1, 0.0F, 0.6981F, 0.0F);
        Shape22_r1.setTextureOffset(37, 45).addBox(8.5F, -5.0F, -22.9F, 1, 4, 1, 0.0F);
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
