package dev.redstudio.netherite.item.desk.rightalt1;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DeskRightAlt1Model extends EntityModel<Entity> {
    //fields
    ModelRenderer desk1;
    ModelRenderer desk2;
    ModelRenderer desk3;
    ModelRenderer desk4;
    ModelRenderer desk5;
    ModelRenderer desk6;
    ModelRenderer desk7;
    ModelRenderer desk8;

    public DeskRightAlt1Model() {
        textureWidth = 256;
        textureHeight = 256;

        desk1 = new ModelRenderer(this, 0, 0);
        desk1.addBox(0F, 0F, 0F, 15, 15, 1);
        desk1.setRotationPoint(-8F, 8F, 6.5F);
        desk1.setTextureSize(64, 32);
        desk1.mirror = true;
        setRotation(desk1, 0F, 0F, 0F);
        desk2 = new ModelRenderer(this, 0, 0);
        desk2.addBox(0F, 0F, 0F, 1, 15, 14);
        desk2.setRotationPoint(6.9F, 8F, -6.5F);
        desk2.setTextureSize(64, 32);
        desk2.mirror = true;
        setRotation(desk2, 0F, 0F, 0F);
        desk3 = new ModelRenderer(this, 0, 0);
        desk3.addBox(0F, 0F, 0F, 15, 1, 13);
        desk3.setRotationPoint(-8F, 8F, -6.5F);
        desk3.setTextureSize(64, 32);
        desk3.mirror = true;
        setRotation(desk3, 0F, 0F, 0F);
        desk4 = new ModelRenderer(this, 0, 0);
        desk4.addBox(0F, 0F, 0F, 2, 16, 2);
        desk4.setRotationPoint(6F, 8.05F, -6.6F);
        desk4.setTextureSize(64, 32);
        desk4.mirror = true;
        setRotation(desk4, 0F, 0F, 0F);
        desk5 = new ModelRenderer(this, 0, 0);
        desk5.addBox(0F, 0F, 0F, 11, 8, 13);
        desk5.setRotationPoint(-4F, 9F, -6.4F);
        desk5.setTextureSize(64, 32);
        desk5.mirror = true;
        setRotation(desk5, 0F, 0F, 0F);
        desk6 = new ModelRenderer(this, 0, 0);
        desk6.addBox(0F, 0F, 0F, 2, 16, 2);
        desk6.setRotationPoint(6F, 8.05F, 5.6F);
        desk6.setTextureSize(64, 32);
        desk6.mirror = true;
        setRotation(desk6, 0F, 0F, 0F);
        desk7 = new ModelRenderer(this, 0, 0);
        desk7.addBox(0F, 0F, 0F, 2, 16, 2);
        desk7.setRotationPoint(-4.1F, 8.05F, -6.7F);
        desk7.setTextureSize(64, 32);
        desk7.mirror = true;
        setRotation(desk7, 0F, 0F, 0F);
        desk8 = new ModelRenderer(this, 0, 0);
        desk8.addBox(0F, 0F, 0F, 8, 1, 1);
        desk8.setRotationPoint(-2F, 12.5F, -6.5F);
        desk8.setTextureSize(64, 32);
        desk8.mirror = true;
        setRotation(desk8, 0F, 0F, 0F);
    }

    @Override
    public void setRotationAngles(Entity entity, float v, float v1, float v2, float v3, float v4) {

    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        desk1.render(matrixStack, buffer, packedLight, packedOverlay);
        desk2.render(matrixStack, buffer, packedLight, packedOverlay);
        desk3.render(matrixStack, buffer, packedLight, packedOverlay);
        desk4.render(matrixStack, buffer, packedLight, packedOverlay);
        desk5.render(matrixStack, buffer, packedLight, packedOverlay);
        desk6.render(matrixStack, buffer, packedLight, packedOverlay);
        desk7.render(matrixStack, buffer, packedLight, packedOverlay);
        desk8.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
