
package dev.redstudio.netherite.item.light;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class CeilingLampModel extends EntityModel<Entity> {

    private final ModelRenderer light;
    private final ModelRenderer light3_r1;
    private final ModelRenderer light2_r1;
    private final ModelRenderer light4_r1;

    public CeilingLampModel() {
        textureWidth = 128;
        textureHeight = 128;

        light = new ModelRenderer(this);
        light.setTextureSize(128, 128);
        light.mirror = true;
        light.setRotationPoint(0.0F, 20.5234F, 4.1933F);

        light.setTextureOffset(0, 0);
        light.addBox(-8.0F, -6.5234F, -5.6933F, 16, 3, 3, 0.0F);

        light3_r1 = new ModelRenderer(this);
        light3_r1.setTextureSize(128, 128);
        light3_r1.mirror = true;
        light.addChild(light3_r1);
        setRotation(light3_r1, 0.7854F, 0.0F, 0.0F);

        light3_r1.setTextureOffset(0, 20);
        light3_r1.addBox(-0.5F, -6.8F, -2.1F, 1, 3, 3, 0.0F);

        light2_r1 = new ModelRenderer(this);
        light2_r1.setTextureSize(128, 128);
        light2_r1.mirror = true;
        light2_r1.setRotationPoint(0.0F, 0.5828F, -0.0071F);
        light.addChild(light2_r1);
        setRotation(light2_r1, 0.7854F, 0.0F, 0.0F);

        light2_r1.setTextureOffset(0, 60);
        light2_r1.addBox(-8.0F, -6.5F, -1.4F, 16, 2, 2, 0.0F);

        light4_r1 = new ModelRenderer(this);
        light4_r1.setTextureSize(128, 128);
        light4_r1.mirror = true;
        light4_r1.setRotationPoint(0.0F, 3.4766F, -4.1933F);
        light.addChild(light4_r1);
        setRotation(light4_r1, 0.0F, 0.7854F, 0.0F);

        light4_r1.setTextureOffset(0, 20);
        light4_r1.addBox(-0.7F, -45.0F, 0.0F, 1, 35, 1, 0.0F);
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
