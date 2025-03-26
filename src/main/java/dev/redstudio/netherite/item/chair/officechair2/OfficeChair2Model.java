package dev.redstudio.netherite.item.chair.officechair2;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class OfficeChair2Model extends EntityModel<Entity> {
    //fields
    ModelRenderer chair1;
    ModelRenderer chair3;
    ModelRenderer chair4;
    ModelRenderer chair5;
    ModelRenderer chair6;
    ModelRenderer chair7;
    ModelRenderer chair8;
    ModelRenderer chair9;
    ModelRenderer chair10;
    ModelRenderer chair12;
    ModelRenderer chair13;

    public OfficeChair2Model() {
        textureWidth = 256;
        textureHeight = 256;

        chair1 = new ModelRenderer(this, 0, 0);
        chair1.addBox(0F, -3F, 0F, 9, 11, 2);
        chair1.setRotationPoint(-4.5F, 8F, 4F);
        chair1.setTextureSize(64, 32);
        chair1.mirror = true;
        setRotation(chair1, -0.1115358F, 0F, 0F);
        chair3 = new ModelRenderer(this, 0, 50);
        chair3.addBox(0F, 0F, 0F, 2, 6, 2);
        chair3.setRotationPoint(-1F, 16F, -1.5F);
        chair3.setTextureSize(64, 32);
        chair3.mirror = true;
        setRotation(chair3, 0F, 0F, 0F);
        chair4 = new ModelRenderer(this, 0, 50);
        chair4.addBox(0F, 0F, 1.5F, 2, 1, 15);
        chair4.setRotationPoint(-7F, 21.5F, -6F);
        chair4.setTextureSize(64, 32);
        chair4.mirror = true;
        setRotation(chair4, 0F, 0.7853982F, 0F);
        chair5 = new ModelRenderer(this, 0, 50);
        chair5.addBox(-2F, 0F, 1.5F, 2, 1, 15);
        chair5.setRotationPoint(7F, 21.5F, -6F);
        chair5.setTextureSize(64, 32);
        chair5.mirror = true;
        setRotation(chair5, 0F, -0.7853982F, 0F);
        chair6 = new ModelRenderer(this, 0, 0);
        chair6.addBox(0F, 0F, -1F, 10, 2, 9);
        chair6.setRotationPoint(-5F, 14F, -3.5F);
        chair6.setTextureSize(64, 32);
        chair6.mirror = true;
        setRotation(chair6, -0.0743572F, 0F, 0F);
        chair7 = new ModelRenderer(this, 0, 0);
        chair7.addBox(0F, 0F, 0F, 2, 2, 2);
        chair7.setRotationPoint(4F, 22F, -6F);
        chair7.setTextureSize(64, 32);
        chair7.mirror = true;
        setRotation(chair7, 0F, 0F, 0F);
        chair8 = new ModelRenderer(this, 0, 0);
        chair8.addBox(0F, 0F, 0F, 2, 2, 2);
        chair8.setRotationPoint(-6F, 22F, -6F);
        chair8.setTextureSize(64, 32);
        chair8.mirror = true;
        setRotation(chair8, 0F, 0F, 0F);
        chair9 = new ModelRenderer(this, 0, 0);
        chair9.addBox(0F, 0F, 0F, 2, 2, 2);
        chair9.setRotationPoint(4F, 22F, 3.5F);
        chair9.setTextureSize(64, 32);
        chair9.mirror = true;
        setRotation(chair9, 0F, 0F, 0F);
        chair10 = new ModelRenderer(this, 0, 0);
        chair10.addBox(0F, 0F, 0F, 2, 2, 2);
        chair10.setRotationPoint(-6F, 22F, 3.5F);
        chair10.setTextureSize(64, 32);
        chair10.mirror = true;
        setRotation(chair10, 0F, 0F, 0F);
        chair12 = new ModelRenderer(this, 0, 0);
        chair12.addBox(0F, 0F, 0F, 2, 2, 7);
        chair12.setRotationPoint(4F, 10.5F, -2F);
        chair12.setTextureSize(64, 32);
        chair12.mirror = true;
        setRotation(chair12, -0.0371786F, 0F, 0F);
        chair13 = new ModelRenderer(this, 0, 0);
        chair13.addBox(0F, 0F, 0F, 2, 2, 7);
        chair13.setRotationPoint(-6F, 10.5F, -2F);
        chair13.setTextureSize(64, 32);
        chair13.mirror = true;
        setRotation(chair13, -0.0371786F, 0F, 0F);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(Entity entity, float v, float v1, float v2, float v3, float v4) {

    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        chair1.render(matrixStack, buffer, packedLight, packedOverlay);
        chair3.render(matrixStack, buffer, packedLight, packedOverlay);
        chair4.render(matrixStack, buffer, packedLight, packedOverlay);
        chair5.render(matrixStack, buffer, packedLight, packedOverlay);
        chair6.render(matrixStack, buffer, packedLight, packedOverlay);
        chair7.render(matrixStack, buffer, packedLight, packedOverlay);
        chair8.render(matrixStack, buffer, packedLight, packedOverlay);
        chair9.render(matrixStack, buffer, packedLight, packedOverlay);
        chair10.render(matrixStack, buffer, packedLight, packedOverlay);
        chair12.render(matrixStack, buffer, packedLight, packedOverlay);
        chair13.render(matrixStack, buffer, packedLight, packedOverlay);
    }

}
