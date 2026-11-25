
package dev.redstudio.netherite.item.spooky;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class SpookyGhostModel extends EntityModel<Entity> {

    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone;
    private final ModelRenderer bone_r1;
    private final ModelRenderer bone2_r1;

    public SpookyGhostModel() {
        textureWidth = 64;
        textureHeight = 64;

        bone2 = new ModelRenderer(this);
        bone2.setTextureSize(textureWidth, textureHeight);
        bone2.setRotationPoint(0.0F, 24.0F, 0.0F);

        bone3 = new ModelRenderer(this);
        bone3.setTextureSize(textureWidth, textureHeight);
        bone2.addChild(bone3);
        bone3.setTextureOffset(0, 0).addBox(-0.5F, -33.0F, -0.5F, 1, 7, 1, 0.0F);
        bone3.setTextureOffset(40, 14).addBox(-11.0F, -21.0F, 0.0F, 6, 14, 0, 0.0F);
        bone3.setTextureOffset(0, 48).addBox(5.0F, -23.0F, 0.0F, 6, 14, 0, 0.0F);
        bone3.setTextureOffset(0, 0).addBox(-5.0F, -26.0F, -5.0F, 10, 2, 10, 0.0F);
        bone3.setTextureOffset(20, 38).addBox(-5.0F, -24.0F, -5.0F, 10, 18, 0, 0.0F);
        bone3.setTextureOffset(0, 20).addBox(5.0F, -24.0F, -5.0F, 0, 18, 10, 0.0F);
        bone3.setTextureOffset(0, 2).addBox(-5.0F, -24.0F, -5.0F, 0, 18, 10, 0.0F);
        bone3.setTextureOffset(20, 20).addBox(-5.0F, -24.0F, 5.0F, 10, 18, 0, 0.0F);

        bone = new ModelRenderer(this);
        bone.setTextureSize(textureWidth, textureHeight);
        bone.setRotationPoint(-8.4565F, -9.2649F, 0.0F);
        bone2.addChild(bone);

        bone_r1 = new ModelRenderer(this);
        bone_r1.setTextureSize(textureWidth, textureHeight);
        bone.addChild(bone_r1);
        setRotation(bone_r1, 0.0F, 0.0F, 0.6981F);
        bone_r1.setTextureOffset(40, 40).addBox(2.2144F, -22.7821F, -2.0F, 5, 10, 4, 0.0F);

        bone2_r1 = new ModelRenderer(this);
        bone2_r1.setTextureSize(textureWidth, textureHeight);
        bone2_r1.setRotationPoint(16.9129F, 0.0F, 0.0F);
        bone.addChild(bone2_r1);
        setRotation(bone2_r1, 0.0F, 0.0F, -0.6981F);
        bone2_r1.setTextureOffset(40, 0).addBox(-8.5F, -21.25F, -2.0F, 5, 10, 4, 0.0F);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha) {
        bone2.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
