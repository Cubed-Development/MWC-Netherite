
package dev.redstudio.netherite.item.light;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class CeilingLampAltModel extends EntityModel<Entity> {

    private final ModelRenderer light;
    private final ModelRenderer light7_r1;
    private final ModelRenderer light6_r1;
    private final ModelRenderer light5_r1;
    private final ModelRenderer light4_r1;
    private final ModelRenderer light3_r1;
    private final ModelRenderer light2_r1;

    public CeilingLampAltModel() {
        textureWidth = 128;
        textureHeight = 128;

        light = new ModelRenderer(this);
        light.setTextureSize(128, 128);
        light.mirror = true;
        light.setRotationPoint(27.0208F, 24.0F, -7.1924F);

        light.setTextureOffset(0, 0);
        light.addBox(-43.0208F, -10.0F, 3.6924F, 32, 2, 7, 0.0F);

        light7_r1 = new ModelRenderer(this);
        light7_r1.setTextureSize(128, 128);
        light7_r1.mirror = true;
        light7_r1.setRotationPoint(-2.8284F, 0.0F, -6.8284F);
        light.addChild(light7_r1);
        setRotation(light7_r1, -3.1416F, -0.7854F, 3.1416F);

        light7_r1.setTextureOffset(0, 40);
        light7_r1.addBox(15.0F, -14.0F, -2.0F, 1, 4, 1, 0.0F);

        light6_r1 = new ModelRenderer(this);
        light6_r1.setTextureSize(128, 128);
        light6_r1.mirror = true;
        light.addChild(light6_r1);
        setRotation(light6_r1, -3.1416F, -0.7854F, 3.1416F);

        light6_r1.setTextureOffset(0, 40);
        light6_r1.addBox(15.0F, -14.0F, 2.0F, 1, 4, 1, 0.0F);

        light5_r1 = new ModelRenderer(this);
        light5_r1.setTextureSize(128, 128);
        light5_r1.mirror = true;
        light5_r1.setRotationPoint(-32.8284F, 0.0F, -2.8284F);
        light.addChild(light5_r1);
        setRotation(light5_r1, 0.0F, 0.7854F, 0.0F);

        light5_r1.setTextureOffset(0, 40);
        light5_r1.addBox(-15.0F, -14.0F, 2.0F, 1, 4, 1, 0.0F);

        light4_r1 = new ModelRenderer(this);
        light4_r1.setTextureSize(128, 128);
        light4_r1.mirror = true;
        light4_r1.setRotationPoint(-30.0F, 0.0F, -4.0F);
        light.addChild(light4_r1);
        setRotation(light4_r1, 0.0F, 0.7854F, 0.0F);

        light4_r1.setTextureOffset(0, 40);
        light4_r1.addBox(-15.0F, -14.0F, -2.0F, 1, 4, 1, 0.0F);

        light3_r1 = new ModelRenderer(this);
        light3_r1.setTextureSize(128, 128);
        light3_r1.mirror = true;
        light3_r1.setRotationPoint(-27.0208F, -2.5503F, 12.3492F);
        light.addChild(light3_r1);
        setRotation(light3_r1, 0.7854F, 0.0F, 0.0F);

        light3_r1.setTextureOffset(0, 20);
        light3_r1.addBox(-15.0F, -7.5F, -0.5F, 30, 2, 2, 0.0F);

        light2_r1 = new ModelRenderer(this);
        light2_r1.setTextureSize(128, 128);
        light2_r1.mirror = true;
        light2_r1.setRotationPoint(-27.0208F, -3.9645F, 11.7635F);
        light.addChild(light2_r1);
        setRotation(light2_r1, 0.7854F, 0.0F, 0.0F);

        light2_r1.setTextureOffset(0, 20);
        light2_r1.addBox(-15.0F, -7.5F, -2.5F, 30, 2, 2, 0.0F);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha) {
        light.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
