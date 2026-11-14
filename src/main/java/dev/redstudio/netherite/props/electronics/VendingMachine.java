
package dev.redstudio.netherite.props.electronics;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class VendingMachine extends EntityModel<Entity> {

    private final ModelRenderer bone2;
    private final ModelRenderer bone4;
    private final ModelRenderer bone;
    private final ModelRenderer bone3_r1;
    private final ModelRenderer bone2_r1;
    private final ModelRenderer bone_r1;

    public VendingMachine() {
        textureWidth = 256;
        textureHeight = 256;

        bone2 = new ModelRenderer(this);
        bone2.setTextureSize(256, 256);
        bone2.setRotationPoint(0.0F, 24.0F, 0.0F);

        bone4 = new ModelRenderer(this, 0, 0);
        bone4.setTextureSize(256, 256);
        bone2.addChild(bone4);
        bone4.addBox(5.0F, -42.0F, -6.0F, 2, 35, 17);

        bone4.setTextureOffset(62, 67);
        bone4.addBox(-7.0F, -42.0F, 11.0F, 14, 41, 3);

        bone4.setTextureOffset(56, 0);
        bone4.addBox(-7.0F, -42.0F, -14.0F, 14, 41, 8);

        bone4.setTextureOffset(74, 146);
        bone4.addBox(-8.0F, -29.0F, -13.0F, 1, 21, 6);

        bone4.setTextureOffset(36, 173);
        bone4.addBox(-6.0F, -40.0F, -6.0F, 0, 33, 17);

        bone4.setTextureOffset(0, 67);
        bone4.addBox(-7.0F, -7.0F, -6.0F, 14, 6, 17);

        bone4.setTextureOffset(96, 67);
        bone4.addBox(-7.0F, -42.0F, -6.0F, 12, 2, 17);

        bone4.setTextureOffset(38, 146);
        bone4.addBox(-7.0F, -44.5882F, -4.3407F, 14, 3, 4);

        bone4.setTextureOffset(0, 162);
        bone4.addBox(-7.0F, -44.5882F, -0.6593F, 14, 3, 5);

        bone4.setTextureOffset(0, 178);
        bone4.addBox(-7.0F, -1.0F, 9.0F, 14, 1, 4);

        bone4.setTextureOffset(0, 173);
        bone4.addBox(-7.0F, -1.0F, -13.0F, 14, 1, 4);

        bone = new ModelRenderer(this);
        bone.setTextureSize(256, 256);
        bone.setRotationPoint(5.5405F, -0.6596F, 0.0F);
        bone2.addChild(bone);

        bone3_r1 = new ModelRenderer(this, 52, 111);
        bone3_r1.setTextureSize(256, 256);
        bone.addChild(bone3_r1);
        setRotation(bone3_r1, 0.0F, 0.0F, -0.1745F);
        bone3_r1.addBox(-5.9101F, -22.1671F, -6.0F, 9, 2, 17);

        bone3_r1.setTextureOffset(0, 111);
        bone3_r1.addBox(-7.9939F, -10.3494F, -6.0F, 9, 2, 17);

        bone3_r1.setTextureOffset(104, 111);
        bone3_r1.addBox(-4.0F, -33.0F, -6.0F, 9, 2, 17);

        bone2_r1 = new ModelRenderer(this, 0, 130);
        bone2_r1.setTextureSize(256, 256);
        bone2_r1.setRotationPoint(-5.5405F, 0.6009F, 11.4461F);
        bone.addChild(bone2_r1);
        setRotation(bone2_r1, 0.2618F, 0.0F, 0.0F);
        bone2_r1.addBox(-7.0F, -47.0981F, -13.7238F, 14, 3, 10);

        bone_r1 = new ModelRenderer(this, 48, 130);
        bone_r1.setTextureSize(256, 256);
        bone_r1.setRotationPoint(-5.5405F, -2.2462F, -11.0712F);
        bone.addChild(bone_r1);
        setRotation(bone_r1, -0.2618F, 0.0F, 0.0F);
        bone_r1.addBox(-7.0F, -44.2511F, 4.0986F, 14, 3, 10);
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
