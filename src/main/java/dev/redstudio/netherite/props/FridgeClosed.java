
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
public final class FridgeClosed extends EntityModel<Entity> {

    private final ModelRenderer bone;
    private final ModelRenderer bone2_r1;
    private final ModelRenderer bone_r1;

    public FridgeClosed() {
        textureWidth = 128;
        textureHeight = 128;

        bone = new ModelRenderer(this);
        bone.setTextureSize(128, 128);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.setTextureOffset(0, 99).addBox(-5.0245F, -30.0F, -8.0245F, 1.0F, 8.0F, 1.0F, 0.0F);
        bone.setTextureOffset(26, 80).addBox(-6.0245F, -31.0F, -7.0245F, 12.0F, 10.0F, 1.0F, 0.0F);
        bone.setTextureOffset(52, 80).addBox(-5.0F, -19.0F, -8.25F, 1.0F, 16.0F, 1.0F, 0.0F);
        bone.setTextureOffset(0, 80).addBox(-6.0F, -20.0F, -7.25F, 12.0F, 18.0F, 1.0F, 0.0F);
        bone.setTextureOffset(100, 94).addBox(-5.0603F, -16.5F, -6.25F, 10.0F, 2.0F, 2.0F, 0.0F);
        bone.setTextureOffset(100, 94).addBox(-5.0603F, -10.5F, -6.25F, 10.0F, 2.0F, 2.0F, 0.0F);
        bone.setTextureOffset(4, 99).addBox(4.0F, -1.0F, 4.5F, 2.0F, 1.0F, 2.0F, 0.0F);
        bone.setTextureOffset(4, 102).addBox(4.0F, -1.0F, -6.5F, 2.0F, 1.0F, 2.0F, 0.0F);
        bone.setTextureOffset(0, 46).addBox(-3.0F, -33.0353F, -7.5F, 6.0F, 2.0F, 15.0F, 0.0F);
        bone.setTextureOffset(96, 42).addBox(6.0F, -32.0F, -7.5F, 1.0F, 31.0F, 15.0F, 0.0F);
        bone.setTextureOffset(75, 6).addBox(-6.0F, -32.0F, 6.5F, 12.0F, 31.0F, 1.0F, 0.0F);
        bone.setTextureOffset(54, 103).addBox(-6.0F, -21.0F, -7.5F, 12.0F, 1.0F, 14.0F, 0.0F);
        bone.setTextureOffset(54, 103).addBox(-6.0F, -2.0F, -7.5F, 12.0F, 1.0F, 14.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-7.0F, -32.0F, -7.5F, 1.0F, 31.0F, 15.0F, 0.0F);
        bone.setTextureOffset(4, 105).addBox(-6.0F, -1.0F, -6.5F, 2.0F, 1.0F, 2.0F, 0.0F);
        bone.setTextureOffset(12, 99).addBox(-6.0F, -1.0F, 4.5F, 2.0F, 1.0F, 2.0F, 0.0F);

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
