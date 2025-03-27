package dev.redstudio.netherite.item.tv;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class TVModel extends EntityModel<Entity> {
    //fields
    ModelRenderer tv1;
    ModelRenderer tv2;
    ModelRenderer tv3;
    ModelRenderer tv4;
    ModelRenderer tv5;
    ModelRenderer tv6;
    ModelRenderer tv7;
    ModelRenderer tv8;

    public TVModel() {
        textureWidth = 128;
        textureHeight = 128;

        tv1 = new ModelRenderer(this, 0, 0);
        tv1.addBox(0F, 0F, 0F, 14, 1, 5);
        tv1.setRotationPoint(-7F, 23F, -3F);
        tv1.setTextureSize(128, 128);
        tv1.mirror = true;
        setRotation(tv1, 0F, 0F, 0F);
        tv2 = new ModelRenderer(this, 0, 0);
        tv2.addBox(0F, -3F, 0F, 7, 11, 3);
        tv2.setRotationPoint(-3.5F, 15.5F, -1.5F);
        tv2.setTextureSize(128, 128);
        tv2.mirror = true;
        setRotation(tv2, -0.0371786F, 0F, 0F);
        tv3 = new ModelRenderer(this, 0, 0);
        tv3.addBox(0F, 0F, 0F, 43, 2, 1);
        tv3.setRotationPoint(-21.5F, 18.5F, -2.5F);
        tv3.setTextureSize(128, 128);
        tv3.mirror = true;
        setRotation(tv3, 0F, 0F, 0F);
        tv4 = new ModelRenderer(this, 0, 0);
        tv4.addBox(0F, 0F, 0F, 1, 19, 1);
        tv4.setRotationPoint(-21.5F, -0.5F, -2.5F);
        tv4.setTextureSize(128, 128);
        tv4.mirror = true;
        setRotation(tv4, 0F, 0F, 0F);
        tv5 = new ModelRenderer(this, 0, 0);
        tv5.addBox(0F, 0F, 0F, 1, 19, 1);
        tv5.setRotationPoint(20.5F, -0.5F, -2.5F);
        tv5.setTextureSize(128, 128);
        tv5.mirror = true;
        setRotation(tv5, 0F, 0F, 0F);
        tv6 = new ModelRenderer(this, 0, 0);
        tv6.addBox(0F, 0F, 0F, 43, 1, 1);
        tv6.setRotationPoint(-21.5F, -1.5F, -2.5F);
        tv6.setTextureSize(128, 128);
        tv6.mirror = true;
        setRotation(tv6, 0F, 0F, 0F);
        tv7 = new ModelRenderer(this, 0, 0);
        tv7.addBox(0F, 0F, 0F, 42, 20, 1);
        tv7.setRotationPoint(-21F, -1F, -1.5F);
        tv7.setTextureSize(128, 128);
        tv7.mirror = true;
        setRotation(tv7, 0F, 0F, 0F);
        tv8 = new ModelRenderer(this, 0, 50);
        tv8.addBox(0F, 0F, 0F, 41, 19, 1);
        tv8.setRotationPoint(-20.5F, -0.5F, -2.4F);
        tv8.setTextureSize(128, 128);
        tv8.mirror = true;
        setRotation(tv8, 0F, 0F, 0F);
    }

    @Override
    public void setRotationAngles(Entity entity, float v, float v1, float v2, float v3, float v4) {

    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        tv1.render(matrixStack, buffer, packedLight, packedOverlay);
        tv2.render(matrixStack, buffer, packedLight, packedOverlay);
        tv3.render(matrixStack, buffer, packedLight, packedOverlay);
        tv4.render(matrixStack, buffer, packedLight, packedOverlay);
        tv5.render(matrixStack, buffer, packedLight, packedOverlay);
        tv6.render(matrixStack, buffer, packedLight, packedOverlay);
        tv7.render(matrixStack, buffer, packedLight, packedOverlay);
        tv8.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
