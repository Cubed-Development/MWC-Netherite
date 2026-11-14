
package dev.redstudio.netherite.props.electronics;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public final class ElectricBoxOpened extends EntityModel<Entity> {

    private final ModelRenderer ElectricBox;
    private final ModelRenderer bone5_r1;
    private final ModelRenderer bone4_r1;
    private final ModelRenderer bone3_r1;
    private final ModelRenderer bone2_r1;
    private final ModelRenderer bone_r1;

    public ElectricBoxOpened() {
        textureWidth = 128;
        textureHeight = 128;

        ElectricBox = new ModelRenderer(this, 18, 16);
        ElectricBox.setTextureSize(128, 128);
        ElectricBox.setRotationPoint(-1.2552F, 24.0F, 1.9697F);
        ElectricBox.addBox(-3.7448F, -24.0F, 2.0303F, 1, 14, 4);

        ElectricBox.setTextureOffset(28, 16);
        ElectricBox.addBox(5.2552F, -24.0F, 2.0303F, 1, 14, 4);

        ElectricBox.setTextureOffset(0, 0);
        ElectricBox.addBox(-2.7448F, -24.0F, 4.0303F, 8, 14, 2);

        ElectricBox.setTextureOffset(0, 16);
        ElectricBox.addBox(-2.2448F, -22.5F, 3.7803F, 7, 11, 2);

        ElectricBox.setTextureOffset(20, 67);
        ElectricBox.addBox(-1.9948F, -12.75F, 3.5303F, 3, 1, 2);

        ElectricBox.setTextureOffset(40, 64);
        ElectricBox.addBox(-1.9948F, -14.75F, 3.5303F, 3, 1, 2);

        ElectricBox.setTextureOffset(20, 64);
        ElectricBox.addBox(-1.9948F, -16.75F, 3.5303F, 3, 1, 2);

        ElectricBox.setTextureOffset(0, 64);
        ElectricBox.addBox(-1.9948F, -18.75F, 3.5303F, 3, 1, 2);

        ElectricBox.setTextureOffset(6, 52);
        ElectricBox.addBox(-1.9948F, -20.75F, 3.5303F, 3, 1, 2);

        ElectricBox.setTextureOffset(10, 67);
        ElectricBox.addBox(1.5052F, -12.75F, 3.5303F, 3, 1, 2);

        ElectricBox.setTextureOffset(0, 67);
        ElectricBox.addBox(1.5052F, -14.75F, 3.5303F, 3, 1, 2);

        ElectricBox.setTextureOffset(30, 64);
        ElectricBox.addBox(1.5052F, -16.75F, 3.5303F, 3, 1, 2);

        ElectricBox.setTextureOffset(10, 64);
        ElectricBox.addBox(1.5052F, -18.75F, 3.5303F, 3, 1, 2);

        ElectricBox.setTextureOffset(6, 55);
        ElectricBox.addBox(1.5052F, -20.75F, 3.5303F, 3, 1, 2);

        ElectricBox.setTextureOffset(6, 49);
        ElectricBox.addBox(-0.2448F, -22.25F, 3.5303F, 3, 1, 2);

        ElectricBox.setTextureOffset(0, 37);
        ElectricBox.addBox(-2.7448F, -24.0F, 2.0303F, 8, 1, 2);

        ElectricBox.setTextureOffset(0, 34);
        ElectricBox.addBox(-2.7448F, -11.0F, 2.0303F, 8, 1, 2);

        bone5_r1 = new ModelRenderer(this, 6, 70);
        bone5_r1.setTextureSize(128, 128);
        ElectricBox.addChild(bone5_r1);
        setRotation(bone5_r1, 0.0F, 0.7854F, 0.0F);

        bone5_r1.addBox(-1.6945F, -16.75F, 4.1517F, 2, 1, 1);

        bone5_r1.setTextureOffset(36, 67);
        bone5_r1.addBox(-4.1694F, -12.75F, 1.6768F, 2, 1, 1);

        bone5_r1.setTextureOffset(30, 67);
        bone5_r1.addBox(-4.1694F, -20.75F, 1.6768F, 2, 1, 1);

        bone5_r1.setTextureOffset(0, 72);
        bone5_r1.addBox(-1.6945F, -18.75F, 4.1517F, 2, 1, 1);

        bone4_r1 = new ModelRenderer(this, 18, 70);
        bone4_r1.setTextureSize(128, 128);
        bone4_r1.setRotationPoint(5.6569F, 0.0F, -1.5962F);
        ElectricBox.addChild(bone4_r1);
        setRotation(bone4_r1, 0.0F, -0.7854F, 0.0F);

        bone4_r1.addBox(0.9571F, -12.75F, 4.8536F, 2, 1, 1);

        bone4_r1.setTextureOffset(0, 70);
        bone4_r1.addBox(0.9571F, -14.75F, 4.8536F, 2, 1, 1);

        bone4_r1.setTextureOffset(42, 67);
        bone4_r1.addBox(0.9571F, -20.75F, 4.8536F, 2, 1, 1);

        bone4_r1.setTextureOffset(12, 72);
        bone4_r1.addBox(-1.5178F, -14.75F, 7.3284F, 2, 1, 1);

        bone4_r1.setTextureOffset(12, 70);
        bone4_r1.addBox(-1.5178F, -16.75F, 7.3284F, 2, 1, 1);

        bone4_r1.setTextureOffset(6, 72);
        bone4_r1.addBox(-1.5178F, -18.75F, 7.3284F, 2, 1, 1);

        bone3_r1 = new ModelRenderer(this, 20, 34);
        bone3_r1.setTextureSize(128, 128);
        bone3_r1.setRotationPoint(-3.6946F, 0.0F, 0.0806F);
        ElectricBox.addChild(bone3_r1);
        setRotation(bone3_r1, 0.0F, 0.7854F, 0.0F);
        bone3_r1.addBox(-0.5F, -10.0F, 6.0F, 1, 13, 2);

        bone2_r1 = new ModelRenderer(this, 0, 49);
        bone2_r1.setTextureSize(128, 128);
        bone2_r1.setRotationPoint(6.205F, 0.0F, 0.0806F);
        ElectricBox.addChild(bone2_r1);
        setRotation(bone2_r1, 0.0F, -0.7854F, 0.0F);
        bone2_r1.addBox(-0.5F, -10.0F, 6.0F, 1, 13, 2);

        bone_r1 = new ModelRenderer(this, 20, 0);
        bone_r1.setTextureSize(128, 128);
        bone_r1.setRotationPoint(-2.1391F, 0.0F, -7.4904F);
        ElectricBox.addChild(bone_r1);
        setRotation(bone_r1, 0.0F, 0.9599F, 0.0F);

        bone_r1.addBox(-3.7722F, -24.0F, 11.5093F, 8, 14, 1);

        bone_r1.setTextureOffset(4, 74);
        bone_r1.addBox(-3.9864F, -23.5F, 11.6939F, 1, 1, 1);

        bone_r1.setTextureOffset(0, 74);
        bone_r1.addBox(-3.9864F, -11.5F, 11.6939F, 1, 1, 1);

        bone_r1.setTextureOffset(24, 70);
        bone_r1.addBox(2.3506F, -18.5F, 11.813F, 1, 3, 1);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing,
                                  float limbSwingAmount, float ageInTicks,
                                  float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer,
                       int packedLight, int packedOverlay,
                       float red, float green, float blue, float alpha) {
        ElectricBox.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
