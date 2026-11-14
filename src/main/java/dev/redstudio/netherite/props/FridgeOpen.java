
package dev.redstudio.netherite.props;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Made with Blockbench 4.8.1
 *
 * @author Developer: Desoroxx
 */
@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class FridgeOpen extends EntityModel<Entity> {

    private final ModelRenderer bone;
    private final ModelRenderer bone4_r1;
    private final ModelRenderer bone3_r1;
    private final ModelRenderer bone2_r1;
    private final ModelRenderer bone_r1;

    public FridgeOpen() {
        textureWidth = 128;
        textureHeight = 128;

        bone = new ModelRenderer(this);
        bone.setTextureSize(128, 128);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.setTextureOffset(4, 99).addBox(4.0F, -1.0F, 4.5F, 2.0F, 1.0F, 2.0F, 0.0F);
        bone.setTextureOffset(4, 102).addBox(4.0F, -1.0F, -6.5F, 2.0F, 1.0F, 2.0F, 0.0F);
        bone.setTextureOffset(0, 46).addBox(-3.0F, -33.0353F, -7.5F, 6.0F, 2.0F, 15.0F, 0.0F);
        bone.setTextureOffset(96, 42).addBox(6.0F, -32.0F, -7.5F, 1.0F, 31.0F, 15.0F, 0.0F);
        bone.setTextureOffset(75, 6).addBox(-6.0F, -32.0F, 6.5F, 12.0F, 31.0F, 1.0F, 0.0F);
        bone.setTextureOffset(2, 111).addBox(-6.0F, -7.0F, -5.5F, 12.0F, 5.0F, 12.0F, 0.0F);
        bone.setTextureOffset(54, 103).addBox(-6.0F, -8.0F, -6.5F, 12.0F, 1.0F, 13.0F, 0.0F);
        bone.setTextureOffset(54, 103).addBox(-6.0F, -14.0F, -6.5F, 12.0F, 1.0F, 13.0F, 0.0F);
        bone.setTextureOffset(54, 103).addBox(-6.0F, -21.0F, -7.5F, 12.0F, 1.0F, 14.0F, 0.0F);
        bone.setTextureOffset(54, 103).addBox(-6.0F, -2.0F, -7.5F, 12.0F, 1.0F, 14.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-7.0F, -32.0F, -7.5F, 1.0F, 31.0F, 15.0F, 0.0F);
        bone.setTextureOffset(4, 105).addBox(-6.0F, -1.0F, -6.5F, 2.0F, 1.0F, 2.0F, 0.0F);
        bone.setTextureOffset(12, 99).addBox(-6.0F, -1.0F, 4.5F, 2.0F, 1.0F, 2.0F, 0.0F);

        bone4_r1 = new ModelRenderer(this);
        bone4_r1.setTextureSize(128, 128);
        bone4_r1.setRotationPoint(-11.7924F, 0.0F, -13.1582F);
        bone.addChild(bone4_r1);
        setRotation(bone4_r1, 0.0F, -1.2217F, 0.0F);
        bone4_r1.setTextureOffset(100, 94).addBox(0.6897F, -10.5F, -14.0F, 10.0F, 2.0F, 2.0F, 0.0F);
        bone4_r1.setTextureOffset(100, 94).addBox(0.6897F, -16.5F, -14.0F, 10.0F, 2.0F, 2.0F, 0.0F);
        bone4_r1.setTextureOffset(0, 80).addBox(-0.25F, -20.0F, -15.0F, 12.0F, 18.0F, 1.0F, 0.0F);
        bone4_r1.setTextureOffset(52, 80).addBox(0.75F, -19.0F, -16.0F, 1.0F, 16.0F, 1.0F, 0.0F);

        bone3_r1 = new ModelRenderer(this);
        bone3_r1.setTextureSize(128, 128);
        bone3_r1.setRotationPoint(-5.5335F, 0.0F, -1.3487F);
        bone.addChild(bone3_r1);
        setRotation(bone3_r1, 0.0F, -0.5236F, 0.0F);
        bone3_r1.setTextureOffset(26, 80).addBox(-5.0245F, -31.0F, -11.2745F, 12.0F, 10.0F, 1.0F, 0.0F);
        bone3_r1.setTextureOffset(0, 99).addBox(-4.0245F, -30.0F, -12.2745F, 1.0F, 8.0F, 1.0F, 0.0F);

        bone2_r1 = new ModelRenderer(this);
        bone2_r1.setTextureSize(128, 128);
        bone2_r1.setRotationPoint(-8.6705F, -1.1415F, 0.0F);
        bone.addChild(bone2_r1);
        setRotation(bone2_r1, 0.0F, 0.0F, 0.2618F);
        bone2_r1.setTextureOffset(38, 46).addBox(3.0F, -33.8628F, -7.5F, 4.0F, 2.0F, 15.0F, 0.0F);

        bone_r1 = new ModelRenderer(this);
        bone_r1.setTextureSize(128, 128);
        bone_r1.setRotationPoint(8.6705F, -1.1415F, 0.0F);
        bone.addChild(bone_r1);
        setRotation(bone_r1, 0.0F, 0.0F, -0.2618F);
        bone_r1.setTextureOffset(0, 63).addBox(-7.0F, -33.8628F, -7.5F, 4.0F, 2.0F, 15.0F, 0.0F);
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
