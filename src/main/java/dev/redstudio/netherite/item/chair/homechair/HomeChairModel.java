package dev.redstudio.netherite.item.chair.homechair;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class HomeChairModel extends EntityModel<Entity> {
    //fields
    ModelRenderer chair1;
    ModelRenderer chair2;
    ModelRenderer chair3;
    ModelRenderer chair4;
    ModelRenderer chair5;
    ModelRenderer chair6;

    public HomeChairModel() {
        textureWidth = 128;
        textureHeight = 128;

        chair1 = new ModelRenderer(this, 0, 0);
        chair1.addBox(0F, 0F, 0F, 14, 4, 13);
        chair1.setRotationPoint(-7F, 13F, -6F);
        chair1.setTextureSize(128, 128);
        chair1.mirror = true;
        setRotation(chair1, 0F, 0F, 0F);
        chair2 = new ModelRenderer(this, 0, 0);
        chair2.addBox(0F, 0F, 0F, 14, 12, 3);
        chair2.setRotationPoint(-7F, 17F, 7F);
        chair2.setTextureSize(128, 128);
        chair2.mirror = true;
        setRotation(chair2, 2.825574F, 0F, 0F);
        chair3 = new ModelRenderer(this, 0, 50);
        chair3.addBox(0F, 0F, 0F, 2, 7, 2);
        chair3.setRotationPoint(-6.5F, 17F, -5.5F);
        chair3.setTextureSize(128, 128);
        chair3.mirror = true;
        setRotation(chair3, 0F, 0F, 0F);
        chair4 = new ModelRenderer(this, 0, 50);
        chair4.addBox(0F, 0F, 0F, 2, 7, 2);
        chair4.setRotationPoint(4.5F, 17F, -5.5F);
        chair4.setTextureSize(128, 128);
        chair4.mirror = true;
        setRotation(chair4, 0F, 0F, 0F);
        chair5 = new ModelRenderer(this, 0, 50);
        chair5.addBox(0F, 0F, 0F, 2, 7, 2);
        chair5.setRotationPoint(4.5F, 17F, 4.5F);
        chair5.setTextureSize(128, 128);
        chair5.mirror = true;
        setRotation(chair5, 0F, 0F, 0F);
        chair6 = new ModelRenderer(this, 0, 50);
        chair6.addBox(0F, 0F, 0F, 2, 7, 2);
        chair6.setRotationPoint(-6.5F, 17F, 4.5F);
        chair6.setTextureSize(128, 128);
        chair6.mirror = true;
        setRotation(chair6, 0F, 0F, 0F);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        // Usually empty unless animated
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        chair1.render(matrixStack, buffer, packedLight, packedOverlay);
        chair2.render(matrixStack, buffer, packedLight, packedOverlay);
        chair3.render(matrixStack, buffer, packedLight, packedOverlay);
        chair4.render(matrixStack, buffer, packedLight, packedOverlay);
        chair5.render(matrixStack, buffer, packedLight, packedOverlay);
        chair6.render(matrixStack, buffer, packedLight, packedOverlay);
    }

}
