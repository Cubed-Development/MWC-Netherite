package dev.redstudio.netherite.item.caution_sign;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class CautionSignModel extends EntityModel<Entity> {
    //fields
    ModelRenderer Caution1;
    ModelRenderer Caution2;
    ModelRenderer Caution3;
    ModelRenderer Caution4;
    ModelRenderer Caution5;
    ModelRenderer Caution6;
    ModelRenderer Caution7;
    ModelRenderer Caution8;
    ModelRenderer Caution9;
    ModelRenderer Caution10;

    public CautionSignModel() {
        textureWidth = 128;
        textureHeight = 128;

        Caution1 = new ModelRenderer(this, 0, 0);
        Caution1.addBox(0F, 0F, 0F, 3, 26, 1);
        Caution1.setRotationPoint(-5F, -1F, -0.5F);
        Caution1.setTextureSize(128, 128);
        Caution1.mirror = true;
        setRotation(Caution1, -0.2230717F, 0F, 0F);
        Caution2 = new ModelRenderer(this, 0, 0);
        Caution2.addBox(0F, 0F, 0F, 3, 26, 1);
        Caution2.setRotationPoint(2F, -1F, -0.5F);
        Caution2.setTextureSize(128, 128);
        Caution2.mirror = true;
        setRotation(Caution2, -0.2230717F, 0F, 0F);
        Caution3 = new ModelRenderer(this, 0, 0);
        Caution3.addBox(0F, 0F, -1F, 3, 26, 1);
        Caution3.setRotationPoint(-5F, -1F, 0.5F);
        Caution3.setTextureSize(128, 128);
        Caution3.mirror = true;
        setRotation(Caution3, 0.2230705F, 0F, 0F);
        Caution4 = new ModelRenderer(this, 0, 0);
        Caution4.addBox(0F, 0F, -1F, 3, 26, 1);
        Caution4.setRotationPoint(2F, -1F, 0.5F);
        Caution4.setTextureSize(128, 128);
        Caution4.mirror = true;
        setRotation(Caution4, 0.2230705F, 0F, 0F);
        Caution5 = new ModelRenderer(this, 0, 0);
        Caution5.addBox(0F, 0F, 0F, 4, 2, 1);
        Caution5.setRotationPoint(-2F, -1F, -0.5F);
        Caution5.setTextureSize(128, 128);
        Caution5.mirror = true;
        setRotation(Caution5, -0.2230717F, 0F, 0F);
        Caution6 = new ModelRenderer(this, 0, 0);
        Caution6.addBox(0F, 6F, 0F, 4, 16, 1);
        Caution6.setRotationPoint(-2F, -1F, -0.5F);
        Caution6.setTextureSize(128, 128);
        Caution6.mirror = true;
        setRotation(Caution6, -0.2230717F, 0F, 0F);
        Caution7 = new ModelRenderer(this, 0, 0);
        Caution7.addBox(0F, 0F, -1F, 4, 2, 1);
        Caution7.setRotationPoint(-2F, -1F, 0.5F);
        Caution7.setTextureSize(128, 128);
        Caution7.mirror = true;
        setRotation(Caution7, 0.2230705F, 0F, 0F);
        Caution8 = new ModelRenderer(this, 0, 0);
        Caution8.addBox(0F, 6F, -1F, 4, 16, 1);
        Caution8.setRotationPoint(-2F, -1F, 0.5F);
        Caution8.setTextureSize(128, 128);
        Caution8.mirror = true;
        setRotation(Caution8, 0.2230705F, 0F, 0F);
        Caution9 = new ModelRenderer(this, 0, 50);
        Caution9.addBox(0F, 9F, -0.1F, 5, 5, 1);
        Caution9.setRotationPoint(-2.5F, -1F, -0.5F);
        Caution9.setTextureSize(128, 128);
        Caution9.mirror = true;
        setRotation(Caution9, -0.2230717F, 0F, 0F);
        Caution10 = new ModelRenderer(this, 0, 50);
        Caution10.addBox(0F, 9F, 0.1F, 5, 5, 1);
        Caution10.setRotationPoint(-2.5F, -1F, -0.5F);
        Caution10.setTextureSize(128, 128);
        Caution10.mirror = true;
        setRotation(Caution10, 0.2230705F, 0F, 0F);
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Caution1.render(matrixStack, buffer, packedLight, packedOverlay);
        Caution2.render(matrixStack, buffer, packedLight, packedOverlay);
        Caution3.render(matrixStack, buffer, packedLight, packedOverlay);
        Caution4.render(matrixStack, buffer, packedLight, packedOverlay);
        Caution5.render(matrixStack, buffer, packedLight, packedOverlay);
        Caution6.render(matrixStack, buffer, packedLight, packedOverlay);
        Caution7.render(matrixStack, buffer, packedLight, packedOverlay);
        Caution8.render(matrixStack, buffer, packedLight, packedOverlay);
        Caution9.render(matrixStack, buffer, packedLight, packedOverlay);
        Caution10.render(matrixStack, buffer, packedLight, packedOverlay);
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

}