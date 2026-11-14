
package dev.redstudio.netherite.props.servers;

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
public final class ServerRackRightAlt extends EntityModel<Entity> {

    private final ModelRenderer bone;
    private final ModelRenderer rack37_r1;
    private final ModelRenderer rack36_r1;
    private final ModelRenderer rack35_r1;
    private final ModelRenderer rack30_r1;
    private final ModelRenderer rack24_r1;
    private final ModelRenderer rack14_r1;

    public ServerRackRightAlt() {
        textureWidth = 256;
        textureHeight = 256;

        bone = new ModelRenderer(this);
        bone.setTextureSize(256, 256);
        bone.mirror = true;
        bone.setRotationPoint(0.0F, 16.4832F, 1.3658F);
        bone.setTextureOffset(0, 0).addBox(-8.0F, 3.5168F, -7.3658F, 16.0F, 2.0F, 13.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(6.2F, -8.4832F, -7.4658F, 2.0F, 16.0F, 2.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(6.2F, -8.4832F, 3.7342F, 2.0F, 16.0F, 2.0F, 0.0F);
        bone.setTextureOffset(0, 50).addBox(7.1F, -8.4832F, -5.4658F, 1.0F, 15.0F, 9.0F, 0.0F);
        bone.setTextureOffset(100, 0).addBox(-7.8F, 1.5168F, -5.3658F, 15.0F, 2.0F, 10.0F, 0.0F);
        bone.setTextureOffset(100, 0).addBox(-7.8F, -1.4832F, -5.3658F, 15.0F, 2.0F, 10.0F, 0.0F);
        bone.setTextureOffset(100, 0).addBox(-7.8F, -4.4832F, -5.3658F, 15.0F, 2.0F, 10.0F, 0.0F);
        bone.setTextureOffset(100, 0).addBox(-7.8F, -7.4832F, -5.3658F, 15.0F, 2.0F, 10.0F, 0.0F);
        bone.setTextureOffset(100, 50).addBox(-7.9F, -5.4832F, -5.6658F, 15.0F, 1.0F, 10.0F, 0.0F);
        bone.setTextureOffset(100, 50).addBox(-7.9F, -2.4832F, -5.6658F, 15.0F, 1.0F, 10.0F, 0.0F);
        bone.setTextureOffset(100, 50).addBox(-7.9F, 0.5168F, -5.6658F, 15.0F, 1.0F, 10.0F, 0.0F);
        bone.setTextureOffset(200, 0).addBox(-7.5F, -6.9832F, -5.5658F, 3.0F, 1.0F, 1.0F, 0.0F);
        bone.setTextureOffset(200, 0).addBox(-3.5F, -6.9832F, -5.5658F, 3.0F, 1.0F, 1.0F, 0.0F);
        bone.setTextureOffset(200, 40).addBox(-6.5F, -3.9832F, -6.1658F, 1.0F, 1.0F, 1.0F, 0.0F);
        bone.setTextureOffset(200, 40).addBox(-4.5F, -3.9832F, -6.1658F, 1.0F, 1.0F, 1.0F, 0.0F);
        bone.setTextureOffset(200, 40).addBox(-2.5F, -3.9832F, -6.1658F, 1.0F, 1.0F, 1.0F, 0.0F);
        bone.setTextureOffset(200, 40).addBox(-0.5F, -3.9832F, -6.1658F, 1.0F, 1.0F, 1.0F, 0.0F);
        bone.setTextureOffset(200, 60).addBox(-7.5F, -0.9832F, -5.5658F, 2.0F, 1.0F, 1.0F, 0.0F);
        bone.setTextureOffset(200, 60).addBox(-4.5F, -0.9832F, -5.5658F, 2.0F, 1.0F, 1.0F, 0.0F);
        bone.setTextureOffset(200, 60).addBox(-1.5F, -0.9832F, -5.5658F, 2.0F, 1.0F, 1.0F, 0.0F);
        bone.setTextureOffset(200, 60).addBox(1.5F, -0.9832F, -5.5658F, 2.0F, 1.0F, 1.0F, 0.0F);
        bone.setTextureOffset(200, 60).addBox(4.5F, -0.9832F, -5.5658F, 1.0F, 1.0F, 1.0F, 0.0F);
        bone.setTextureOffset(200, 80).addBox(-1.1F, 1.3168F, -5.5658F, 6.0F, 1.0F, 1.0F, 0.0F);
        bone.setTextureOffset(200, 80).addBox(-1.1F, 2.8168F, -5.5658F, 6.0F, 1.0F, 1.0F, 0.0F);
        bone.setTextureOffset(200, 100).addBox(-7.0F, 0.6168F, -6.9658F, 1.0F, 1.0F, 1.0F, 0.0F);
        bone.setTextureOffset(200, 100).addBox(-1.0F, 0.6168F, -6.9658F, 1.0F, 2.0F, 1.0F, 0.0F);
        bone.setTextureOffset(220, 100).addBox(2.0F, 0.6168F, -6.9658F, 1.0F, 1.0F, 1.0F, 0.0F);
        bone.setTextureOffset(220, 100).addBox(-4.0F, 0.6168F, -6.9658F, 1.0F, 1.0F, 1.0F, 0.0F);

        rack37_r1 = new ModelRenderer(this);
        rack37_r1.setTextureSize(256, 256);
        rack37_r1.mirror = true;
        bone.addChild(rack37_r1);
        setRotation(rack37_r1, 1.0782F, 0.0F, 0.0F);
        rack37_r1.setTextureOffset(200, 100).addBox(-1.0F, -4.9F, -5.6F, 1.0F, 2.0F, 1.0F, 0.0F);

        rack36_r1 = new ModelRenderer(this);
        rack36_r1.setTextureSize(256, 256);
        rack36_r1.mirror = true;
        rack36_r1.setRotationPoint(0.0F, -1.6661F, 0.4768F);
        bone.addChild(rack36_r1);
        setRotation(rack36_r1, 1.2269F, 0.0F, 0.0F);
        rack36_r1.setTextureOffset(220, 100).addBox(2.0F, -5.9F, -5.6F, 1.0F, 2.0F, 1.0F, 0.0F);

        rack35_r1 = new ModelRenderer(this);
        rack35_r1.setTextureSize(256, 256);
        rack35_r1.mirror = true;
        rack35_r1.setRotationPoint(0.0F, 1.5643F, 1.1685F);
        bone.addChild(rack35_r1);
        setRotation(rack35_r1, 0.8179F, 0.0F, 0.0F);
        rack35_r1.setTextureOffset(220, 100).addBox(-4.0F, -5.9F, -5.6F, 1.0F, 2.0F, 1.0F, 0.0F);
        rack35_r1.setTextureOffset(200, 100).addBox(-7.0F, -5.9F, -5.6F, 1.0F, 2.0F, 1.0F, 0.0F);

        rack30_r1 = new ModelRenderer(this);
        rack30_r1.setTextureSize(256, 256);
        rack30_r1.mirror = true;
        rack30_r1.setRotationPoint(0.0F, 8.069F, -8.4238F);
        bone.addChild(rack30_r1);
        setRotation(rack30_r1, -0.7808F, 0.0F, 0.0F);
        rack30_r1.setTextureOffset(220, 100).addBox(-4.0F, -8.3F, -4.2F, 1.0F, 2.0F, 1.0F, 0.0F);
        rack30_r1.setTextureOffset(220, 100).addBox(2.0F, -8.3F, -4.2F, 1.0F, 2.0F, 1.0F, 0.0F);
        rack30_r1.setTextureOffset(200, 100).addBox(-1.0F, -8.3F, -4.2F, 1.0F, 2.0F, 1.0F, 0.0F);
        rack30_r1.setTextureOffset(200, 100).addBox(-7.0F, -8.3F, -4.2F, 1.0F, 2.0F, 1.0F, 0.0F);

        rack24_r1 = new ModelRenderer(this);
        rack24_r1.setTextureSize(256, 256);
        rack24_r1.mirror = true;
        rack24_r1.setRotationPoint(0.0F, 8.0784F, -2.2271F);
        bone.addChild(rack24_r1);
        setRotation(rack24_r1, -0.1487F, 0.0F, 0.0F);
        rack24_r1.setTextureOffset(200, 80).addBox(-7.5F, -5.5F, -4.2F, 6.0F, 1.0F, 1.0F, 0.0F);

        rack14_r1 = new ModelRenderer(this);
        rack14_r1.setTextureSize(256, 256);
        rack14_r1.mirror = true;
        rack14_r1.setRotationPoint(0.0F, 6.7028F, 0.3614F);
        bone.addChild(rack14_r1);
        setRotation(rack14_r1, 0.1487F, 0.0F, 0.0F);
        rack14_r1.setTextureOffset(200, 20).addBox(-7.5F, -12.0F, -4.6F, 13.0F, 2.0F, 1.0F, 0.0F);
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
