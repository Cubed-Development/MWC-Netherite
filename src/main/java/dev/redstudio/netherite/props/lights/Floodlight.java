
package dev.redstudio.netherite.props.lights;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class Floodlight extends EntityModel<Entity> {

    private final ModelRenderer bone5;
    private final ModelRenderer bone4;
    private final ModelRenderer bone_r1;
    private final ModelRenderer bone;
    private final ModelRenderer bone3_r1;
    private final ModelRenderer bone2_r1;

    public Floodlight() {
        textureWidth = 64;
        textureHeight = 64;

        bone5 = new ModelRenderer(this);
        bone5.setTextureSize(64, 64);
        bone5.setRotationPoint(0.0F, 24.0F, 0.0F);

        bone4 = new ModelRenderer(this);
        bone4.setTextureSize(64, 64);
        bone5.addChild(bone4);

        bone4.setTextureOffset(0, 40);
        bone4.addBox(-3.0F, -1.0F, 3.0F, 6, 1, 1, 0.0F);

        bone4.setTextureOffset(22, 0);
        bone4.addBox(-1.0F, -2.75F, -4.5F, 2, 2, 9, 0.0F);

        bone4.setTextureOffset(0, 14);
        bone4.addBox(-1.0F, -3.25F, -4.5F, 2, 1, 9, -0.2F);

        bone4.setTextureOffset(6, 46);
        bone4.addBox(-1.0F, -5.75F, -4.5F, 2, 3, 1, -0.2F);

        bone4.setTextureOffset(0, 46);
        bone4.addBox(-1.0F, -5.75F, 3.5F, 2, 3, 1, -0.2F);

        bone4.setTextureOffset(36, 34);
        bone4.addBox(-3.0F, -1.0F, -4.0F, 6, 1, 1, 0.0F);

        bone_r1 = new ModelRenderer(this);
        bone_r1.setTextureSize(64, 64);
        bone_r1.setRotationPoint(2.2771F, -0.5524F, 0.0F);
        bone4.addChild(bone_r1);
        setRotation(bone_r1, 0.0F, 0.0F, -0.3927F);

        bone_r1.setTextureOffset(0, 24);
        bone_r1.addBox(-2.25F, -9.0F, -3.5F, 1, 3, 7, 0.2F);

        bone_r1.setTextureOffset(22, 14);
        bone_r1.addBox(-3.25F, -9.0F, -3.5F, 1, 3, 7, 0.0F);

        bone_r1.setTextureOffset(0, 0);
        bone_r1.addBox(-1.25F, -10.0F, -4.5F, 2, 5, 9, 0.0F);

        bone_r1.setTextureOffset(12, 46);
        bone_r1.addBox(0.193F, -9.9604F, -5.01F, 1, 4, 1, 0.0F);

        bone_r1.setTextureOffset(33, 42);
        bone_r1.addBox(0.1924F, -10.1F, -5.0F, 1, 1, 10, 0.0F);

        bone_r1.setTextureOffset(32, 40);
        bone_r1.addBox(-0.9625F, -11.4387F, -4.75F, 1, 5, 1, 0.0F);

        bone_r1.setTextureOffset(24, 40);
        bone_r1.addBox(-0.9625F, -12.8529F, 0.3358F, 1, 1, 3, 0.0F);

        bone_r1.setTextureOffset(14, 40);
        bone_r1.addBox(-0.9625F, -12.8529F, -3.3358F, 1, 1, 4, 0.0F);

        bone_r1.setTextureOffset(16, 24);
        bone_r1.addBox(-0.9625F, -12.8529F, -2.5858F, 1, 1, 5, 0.1F);

        bone_r1.setTextureOffset(33, 42);
        bone_r1.addBox(0.1924F, -5.9604F, -5.0F, 1, 1, 10, 0.0F);

        bone_r1.setTextureOffset(16, 46);
        bone_r1.addBox(0.193F, -9.9604F, 4.01F, 1, 4, 1, 0.0F);

        bone_r1.setTextureOffset(36, 40);
        bone_r1.addBox(-0.9625F, -11.4387F, 3.75F, 1, 5, 1, 0.0F);

        bone = new ModelRenderer(this);
        bone.setTextureSize(64, 64);
        bone.setRotationPoint(2.2824F, -6.9115F, -7.6157F);
        bone5.addChild(bone);

        bone3_r1 = new ModelRenderer(this);
        bone3_r1.setTextureSize(64, 64);
        bone.addChild(bone3_r1);
        setRotation(bone3_r1, -0.7854F, 0.0F, -0.3927F);

        bone3_r1.setTextureOffset(20, 46);
        bone3_r1.addBox(-3.4009F, -7.9619F, -1.9092F, 1, 2, 1, 0.0F);

        bone2_r1 = new ModelRenderer(this);
        bone2_r1.setTextureSize(64, 64);
        bone2_r1.setRotationPoint(2.4354F, 5.8795F, 17.8675F);
        bone.addChild(bone2_r1);
        setRotation(bone2_r1, 0.7854F, 0.0F, -0.3927F);

        bone2_r1.setTextureOffset(24, 46);
        bone2_r1.addBox(-3.4009F, -14.3259F, 3.5452F, 1, 2, 1, 0.0F);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha) {
        bone5.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
