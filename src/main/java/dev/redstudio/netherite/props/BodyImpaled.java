
package dev.redstudio.netherite.props;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class BodyImpaled extends EntityModel<Entity> {

    private final ModelRenderer body;
    private final ModelRenderer rightleg_r1;
    private final ModelRenderer leftarm_r1;
    private final ModelRenderer rightarm_r1;
    private final ModelRenderer body_r1;
    private final ModelRenderer head_r1;
    private final ModelRenderer leftleg_r1;
    private final ModelRenderer bar;

    public BodyImpaled() {
        textureWidth = 128;
        textureHeight = 128;

        body = new ModelRenderer(this);
        body.setTextureSize(128, 128);
        body.setRotationPoint(-3.3558F, 24.048F, 0.0F);

        rightleg_r1 = new ModelRenderer(this);
        rightleg_r1.setTextureSize(128, 128);
        body.addChild(rightleg_r1);
        setRotation(rightleg_r1, 0.0F, 0.0F, 0.1487F);
        rightleg_r1.mirror = true;
        rightleg_r1.setTextureOffset(0, 16).addBox(-4.0F, -22.5F, -7.0F, 4, 12, 4, 0.0F);

        leftarm_r1 = new ModelRenderer(this);
        leftarm_r1.setTextureSize(128, 128);
        leftarm_r1.setRotationPoint(3.3558F, -0.6745F, 5.7209F);
        body.addChild(leftarm_r1);
        setRotation(leftarm_r1, 0.1859F, 0.0F, 0.0F);
        leftarm_r1.mirror = true;
        leftarm_r1.setTextureOffset(40, 16).addBox(4.0F, -33.0F, -2.5F, 4, 12, 4, 0.0F);

        rightarm_r1 = new ModelRenderer(this);
        rightarm_r1.setTextureSize(128, 128);
        rightarm_r1.setRotationPoint(-0.1257F, 0.3159F, 0.0F);
        body.addChild(rightarm_r1);
        setRotation(rightarm_r1, 0.0F, 0.0F, 0.1115F);
        rightarm_r1.mirror = true;
        rightarm_r1.setTextureOffset(40, 16).addBox(-8.0F, -33.0F, -2.5F, 4, 12, 4, 0.0F);

        body_r1 = new ModelRenderer(this);
        body_r1.setTextureSize(128, 128);
        body_r1.setRotationPoint(3.3558F, -3.2781F, -14.2392F);
        body.addChild(body_r1);
        setRotation(body_r1, -0.4461F, 0.0F, 0.0F);
        body_r1.mirror = true;
        body_r1.setTextureOffset(16, 16).addBox(-4.0F, -33.0F, -2.0F, 8, 12, 4, 0.0F);

        head_r1 = new ModelRenderer(this);
        head_r1.setTextureSize(128, 128);
        head_r1.setRotationPoint(3.3558F, -14.3019F, -27.1585F);
        body.addChild(head_r1);
        setRotation(head_r1, -0.9666F, 0.0F, 0.0F);
        head_r1.mirror = true;
        head_r1.setTextureOffset(0, 0).addBox(-4.0F, -41.0F, -4.0F, 8, 8, 8, 0.0F);

        leftleg_r1 = new ModelRenderer(this);
        leftleg_r1.setTextureSize(128, 128);
        leftleg_r1.setRotationPoint(3.3558F, -0.4816F, 1.6577F);
        body.addChild(leftleg_r1);
        setRotation(leftleg_r1, 0.0744F, 0.0F, 0.0F);
        leftleg_r1.mirror = true;
        leftleg_r1.setTextureOffset(0, 16).addBox(0.0F, -22.5F, -7.0F, 4, 12, 4, 0.0F);

        bar = new ModelRenderer(this);
        bar.setTextureSize(128, 128);
        bar.setRotationPoint(3.0F, -25.0F, -6.0F);
        setRotation(bar, 0.1859F, 0.0F, 0.0F);
        bar.mirror = true;
        bar.setTextureOffset(0, 36).addBox(-4.0F, 0.0F, -2.0F, 2, 50, 2, 0.0F);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha) {
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        bar.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
