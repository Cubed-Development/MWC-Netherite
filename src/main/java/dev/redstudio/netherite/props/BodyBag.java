
package dev.redstudio.netherite.props;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class BodyBag extends EntityModel<Entity> {

    private final ModelRenderer bodybag;
    private final ModelRenderer bodybag10_r1;
    private final ModelRenderer bodybag9_r1;
    private final ModelRenderer bodybag8_r1;
    private final ModelRenderer bodybag7_r1;
    private final ModelRenderer bodybag6_r1;
    private final ModelRenderer bodybag5_r1;
    private final ModelRenderer bodybag4_r1;
    private final ModelRenderer bodybag3_r1;
    private final ModelRenderer bodybag2_r1;
    private final ModelRenderer bodybag1_r1;

    public BodyBag() {
        textureWidth = 256;
        textureHeight = 256;

        bodybag = new ModelRenderer(this);
        bodybag.setTextureSize(256, 256);
        bodybag.setRotationPoint(-4.3106F, 25.0563F, 0.0F);
        bodybag.mirror = true;
        bodybag.setTextureOffset(0, 0).addBox(-4.6894F, -2.0563F, -18.0F, 18, 1, 31, 0.0F);

        bodybag10_r1 = new ModelRenderer(this);
        bodybag10_r1.setTextureSize(256, 256);
        bodybag.addChild(bodybag10_r1);
        setRotation(bodybag10_r1, 0.0F, 0.0F, 0.5577F);
        bodybag10_r1.mirror = true;
        bodybag10_r1.setTextureOffset(0, 0).addBox(-4.0F, -7.0F, 5.0F, 4, 6, 8, 0.0F);

        bodybag9_r1 = new ModelRenderer(this);
        bodybag9_r1.setTextureSize(256, 256);
        bodybag9_r1.setRotationPoint(8.6213F, 0.0F, 0.0F);
        bodybag.addChild(bodybag9_r1);
        setRotation(bodybag9_r1, 0.0F, 0.0F, -0.5577F);
        bodybag9_r1.mirror = true;
        bodybag9_r1.setTextureOffset(0, 0).addBox(0.0F, -7.0F, 5.0F, 4, 6, 8, 0.0F);

        bodybag8_r1 = new ModelRenderer(this);
        bodybag8_r1.setTextureSize(256, 256);
        bodybag8_r1.setRotationPoint(4.3106F, -10.2586F, -3.3156F);
        bodybag.addChild(bodybag8_r1);
        setRotation(bodybag8_r1, -1.2094F, 0.0F, 0.0F);
        bodybag8_r1.mirror = true;
        bodybag8_r1.setTextureOffset(0, 0).addBox(-4.0F, -7.0F, 5.0F, 8, 8, 3, 0.0F);

        bodybag7_r1 = new ModelRenderer(this);
        bodybag7_r1.setTextureSize(256, 256);
        bodybag7_r1.setRotationPoint(4.3106F, 0.8496F, -9.9006F);
        bodybag.addChild(bodybag7_r1);
        setRotation(bodybag7_r1, -1.4742F, 0.0F, 0.0F);
        bodybag7_r1.mirror = true;
        bodybag7_r1.setTextureOffset(0, 0).addBox(-4.0F, -4.5F, -6.0F, 8, 12, 4, 0.0F);

        bodybag6_r1 = new ModelRenderer(this);
        bodybag6_r1.setTextureSize(256, 256);
        bodybag6_r1.setRotationPoint(-2.5772F, -0.2733F, 0.0F);
        bodybag.addChild(bodybag6_r1);
        setRotation(bodybag6_r1, 0.0F, 0.0F, 1.2269F);
        bodybag6_r1.mirror = true;
        bodybag6_r1.setTextureOffset(0, 0).addBox(-4.0F, -4.5F, -6.0F, 3, 5, 12, 0.0F);

        bodybag5_r1 = new ModelRenderer(this);
        bodybag5_r1.setTextureSize(256, 256);
        bodybag5_r1.setRotationPoint(11.1985F, -0.2733F, 0.0F);
        bodybag.addChild(bodybag5_r1);
        setRotation(bodybag5_r1, 0.0F, 0.0F, -1.2269F);
        bodybag5_r1.mirror = true;
        bodybag5_r1.setTextureOffset(0, 0).addBox(1.0F, -4.5F, -6.0F, 3, 5, 12, 0.0F);

        bodybag4_r1 = new ModelRenderer(this);
        bodybag4_r1.setTextureSize(256, 256);
        bodybag4_r1.setRotationPoint(8.6929F, 0.9291F, 0.0F);
        bodybag.addChild(bodybag4_r1);
        setRotation(bodybag4_r1, 0.0F, 0.0F, -1.0038F);
        bodybag4_r1.mirror = true;
        bodybag4_r1.setTextureOffset(0, 0).addBox(2.0F, -3.0F, -18.0F, 2, 4, 24, 0.0F);

        bodybag3_r1 = new ModelRenderer(this);
        bodybag3_r1.setTextureSize(256, 256);
        bodybag3_r1.setRotationPoint(-0.0716F, 0.9291F, 0.0F);
        bodybag.addChild(bodybag3_r1);
        setRotation(bodybag3_r1, 0.0F, 0.0F, 1.0038F);
        bodybag3_r1.mirror = true;
        bodybag3_r1.setTextureOffset(0, 0).addBox(-4.0F, -3.0F, -18.0F, 2, 4, 24, 0.0F);

        bodybag2_r1 = new ModelRenderer(this);
        bodybag2_r1.setTextureSize(256, 256);
        bodybag2_r1.setRotationPoint(4.3106F, -1.3623F, 0.2178F);
        bodybag.addChild(bodybag2_r1);
        setRotation(bodybag2_r1, 0.0501F, 0.0F, 0.0F);
        bodybag2_r1.mirror = true;
        bodybag2_r1.setTextureOffset(0, 0).addBox(-4.0F, -4.5F, -6.0F, 8, 4, 12, 0.0F);

        bodybag1_r1 = new ModelRenderer(this);
        bodybag1_r1.setTextureSize(256, 256);
        bodybag1_r1.setRotationPoint(4.3106F, -1.1226F, 1.7829F);
        bodybag.addChild(bodybag1_r1);
        setRotation(bodybag1_r1, 0.0744F, 0.0F, 0.0F);
        bodybag1_r1.mirror = true;
        bodybag1_r1.setTextureOffset(0, 0).addBox(-4.0F, -7.0F, 5.0F, 8, 8, 8, 0.0F);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha) {
        bodybag.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
