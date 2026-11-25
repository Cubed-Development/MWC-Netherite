
package dev.redstudio.netherite.item.bodys;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class BodyHangingModel extends EntityModel<Entity> {

    private final ModelRenderer head;
    private final ModelRenderer body;
    private final ModelRenderer rightarm;
    private final ModelRenderer leftarm;
    private final ModelRenderer rightleg;
    private final ModelRenderer leftleg;
    private final ModelRenderer rope1;

    public BodyHangingModel() {
        textureWidth = 256;
        textureHeight = 256;

        head = new ModelRenderer(this);
        head.setTextureSize(256, 256);
        head.setRotationPoint(-4.0F, -8.0F, -6.0F);
        setRotation(head, 0.2974F, 0.0F, 0.0F);
        head.mirror = true;
        head.setTextureOffset(0, 0).addBox(0.0F, 0.0F, 0.0F, 8, 8, 8, 0.0F);

        body = new ModelRenderer(this);
        body.setTextureSize(256, 256);
        body.setRotationPoint(-4.0F, -2.0F, -2.0F);
        setRotation(body, -0.0744F, 0.0F, 0.0F);
        body.mirror = true;
        body.setTextureOffset(16, 16).addBox(0.0F, 0.0F, 0.0F, 8, 12, 4, 0.0F);

        rightarm = new ModelRenderer(this);
        rightarm.setTextureSize(256, 256);
        rightarm.setRotationPoint(-5.0F, 1.0F, 0.0F);
        setRotation(rightarm, -0.0372F, 0.0F, 0.0372F);
        rightarm.mirror = true;
        rightarm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);

        leftarm = new ModelRenderer(this);
        leftarm.setTextureSize(256, 256);
        leftarm.setRotationPoint(3.5F, -1.5F, -2.0F);
        setRotation(leftarm, 0.0F, 0.0F, -0.1115F);
        leftarm.mirror = true;
        leftarm.setTextureOffset(40, 16).addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.0F);

        rightleg = new ModelRenderer(this);
        rightleg.setTextureSize(256, 256);
        rightleg.setRotationPoint(-2.0F, 10.0F, -1.0F);
        setRotation(rightleg, 0.0F, 0.0F, 0.1115F);
        rightleg.mirror = true;
        rightleg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);

        leftleg = new ModelRenderer(this);
        leftleg.setTextureSize(256, 256);
        leftleg.setRotationPoint(0.0F, 10.0F, -3.0F);
        setRotation(leftleg, 0.1859F, 0.0F, 0.0F);
        leftleg.mirror = true;
        leftleg.setTextureOffset(0, 16).addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.0F);

        rope1 = new ModelRenderer(this);
        rope1.setTextureSize(256, 256);
        rope1.setRotationPoint(-4.5F, -0.5F, -4.3F);
        setRotation(rope1, 0.4461F, 0.0F, 0.0F);
        rope1.mirror = true;
        rope1.setTextureOffset(0, 46).addBox(0.0F, 0.0F, 0.0F, 9, 2, 9, 0.0F);
        rope1.setTextureOffset(0, 46).addBox(3.5F, -20.0F, 7.0F, 2, 18, 2, 0.0F);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha) {
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
        leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
        rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
        leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
        rope1.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
