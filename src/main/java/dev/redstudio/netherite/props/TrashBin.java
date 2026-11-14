
package dev.redstudio.netherite.props;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class TrashBin extends EntityModel<Entity> {

    private final ModelRenderer bone;
    private final ModelRenderer trashbin12_r1;
    private final ModelRenderer trashbin9_r1;
    private final ModelRenderer trashbin8_r1;
    private final ModelRenderer trashbin6_r1;

    public TrashBin() {
        textureWidth = 128;
        textureHeight = 128;

        bone = new ModelRenderer(this);
        bone.setTextureSize(textureWidth, textureHeight);
        bone.mirror = true;
        bone.setRotationPoint(0.0F, 20.1678F, 11.0977F);
        setRotation(bone, 0.0F, 3.1416F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-6.0F, -12.1678F, 8.9023F, 12, 16, 8, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-7.0F, -12.1678F, 9.9023F, 14, 16, 6, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-5.5F, -16.1678F, 11.9023F, 4, 4, 4, 0.0F);
        bone.setTextureOffset(0, 0).addBox(1.5F, -16.1678F, 11.9023F, 4, 4, 4, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-6.5F, -14.1678F, 10.9023F, 13, 2, 5, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-5.5F, -15.1678F, 15.4023F, 11, 3, 1, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-2.0F, -15.8678F, 11.7023F, 4, 4, 4, 0.0F);

        trashbin12_r1 = new ModelRenderer(this);
        trashbin12_r1.setTextureSize(textureWidth, textureHeight);
        trashbin12_r1.mirror = true;
        bone.addChild(trashbin12_r1);
        setRotation(trashbin12_r1, -0.5949F, 0.0F, 0.0F);
        trashbin12_r1.setTextureOffset(0, 0).addBox(-2.0F, -19.7F, 0.8F, 4, 5, 4, 0.0F);

        trashbin9_r1 = new ModelRenderer(this);
        trashbin9_r1.setTextureSize(textureWidth, textureHeight);
        trashbin9_r1.mirror = true;
        trashbin9_r1.setRotationPoint(14.7231F, -11.5551F, 10.9023F);
        bone.addChild(trashbin9_r1);
        setRotation(trashbin9_r1, 0.0F, 0.0F, -1.0782F);
        trashbin9_r1.setTextureOffset(0, 0).addBox(-7.5F, -20.0F, 1.0F, 2, 1, 4, 0.0F);

        trashbin8_r1 = new ModelRenderer(this);
        trashbin8_r1.setTextureSize(textureWidth, textureHeight);
        trashbin8_r1.mirror = true;
        trashbin8_r1.setRotationPoint(-14.7231F, -11.5552F, 10.9023F);
        bone.addChild(trashbin8_r1);
        setRotation(trashbin8_r1, 0.0F, 0.0F, 1.0782F);
        trashbin8_r1.setTextureOffset(0, 0).addBox(5.5F, -20.0F, 1.0F, 2, 1, 4, 0.0F);

        trashbin6_r1 = new ModelRenderer(this);
        trashbin6_r1.setTextureSize(textureWidth, textureHeight);
        trashbin6_r1.mirror = true;
        trashbin6_r1.setRotationPoint(0.0F, -0.622F, -0.7203F);
        bone.addChild(trashbin6_r1);
        setRotation(trashbin6_r1, -0.632F, 0.0F, 0.0F);
        trashbin6_r1.setTextureOffset(0, 0).addBox(1.5F, -20.0F, 1.0F, 4, 5, 3, 0.0F);
        trashbin6_r1.setTextureOffset(0, 0).addBox(-5.5F, -20.0F, 1.0F, 4, 5, 3, 0.0F);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha) {
        bone.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
