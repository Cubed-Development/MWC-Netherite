
package dev.redstudio.netherite.props.electronics;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class TVCeiling extends EntityModel<Entity> {

    private final ModelRenderer tv;
    private final ModelRenderer tv8_r1;
    private final ModelRenderer tv6_r1;
    private final ModelRenderer tv5_r1;

    public TVCeiling() {
        textureWidth = 256;
        textureHeight = 256;

        tv = new ModelRenderer(this, 0, 0);
        tv.setTextureSize(256, 256);
        tv.setRotationPoint(0.0F, 22.0208F, 9.5438F);
        tv.mirror = true;
        tv.addBox(-1.5F, -21.2208F, -8.4438F, 3, 9, 3);

        tv8_r1 = new ModelRenderer(this, 0, 30);
        tv8_r1.setTextureSize(256, 256);
        tv.addChild(tv8_r1);
        setRotation(tv8_r1, 0.409F, 0.0F, 0.0F);
        tv8_r1.mirror = true;
        tv8_r1.addBox(-11.0F, -17.0F, -4.8F, 22, 12, 1);

        tv6_r1 = new ModelRenderer(this, 0, 0);
        tv6_r1.setTextureSize(256, 256);
        tv6_r1.setRotationPoint(0.0F, -1.2461F, -3.9913F);
        tv.addChild(tv6_r1);
        setRotation(tv6_r1, 0.409F, 0.0F, 0.0F);
        tv6_r1.mirror = true;
        tv6_r1.addBox(-2.0F, -14.5F, -2.5F, 4, 4, 6);

        tv5_r1 = new ModelRenderer(this, 0, 0);
        tv5_r1.setTextureSize(256, 256);
        tv5_r1.setRotationPoint(0.0F, -1.4935F, -2.7983F);
        tv.addChild(tv5_r1);
        setRotation(tv5_r1, 0.409F, 0.0F, 0.0F);
        tv5_r1.mirror = true;
        tv5_r1.addBox(-11.5F, -17.5F, -4.5F, 23, 13, 1);
        tv5_r1.addBox(-12.0F, -5.0F, -5.0F, 24, 1, 1);
        tv5_r1.addBox(11.0F, -17.0F, -5.0F, 1, 12, 1);
        tv5_r1.addBox(-12.0F, -17.0F, -5.0F, 1, 12, 1);
        tv5_r1.addBox(-12.0F, -18.0F, -5.0F, 24, 1, 1);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha) {
        tv.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
