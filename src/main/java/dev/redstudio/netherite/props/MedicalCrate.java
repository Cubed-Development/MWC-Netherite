
package dev.redstudio.netherite.props;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class MedicalCrate extends EntityModel<Entity> {

    private final ModelRenderer shape;
    private final ModelRenderer Shape69_r1;
    private final ModelRenderer Shape67_r1;
    private final ModelRenderer Shape66_r1;
    private final ModelRenderer Shape64_r1;
    private final ModelRenderer Shape61_r1;
    private final ModelRenderer black;

    public MedicalCrate() {
        textureWidth = 512;
        textureHeight = 512;

        shape = new ModelRenderer(this);
        shape.setTextureSize(textureWidth, textureHeight);
        shape.mirror = true;
        shape.setRotationPoint(0.0F, 0.6672F, 11.2852F);
        shape.setTextureOffset(0, 0).addBox(-7.0F, 13.3328F, -19.2852F, 18, 8, 27, 0.0F);
        shape.setTextureOffset(0, 0).addBox(6.0F, 13.3328F, -22.2852F, 6, 7, 3, 0.0F);
        shape.setTextureOffset(0, 0).addBox(-8.0F, 13.3328F, -22.2852F, 6, 7, 3, 0.0F);
        shape.setTextureOffset(0, 0).addBox(-8.0F, 13.3328F, 7.7148F, 6, 7, 3, 0.0F);
        shape.setTextureOffset(0, 0).addBox(6.0F, 13.3328F, 7.7148F, 6, 7, 3, 0.0F);
        shape.setTextureOffset(0, 0).addBox(11.0F, 13.3328F, -7.2852F, 1, 7, 3, 0.0F);
        shape.setTextureOffset(0, 0).addBox(-8.0F, 13.3328F, -19.2852F, 1, 7, 27, 0.0F);
        shape.setTextureOffset(0, 0).addBox(11.0F, 13.3328F, -17.2852F, 1, 7, 3, 0.0F);
        shape.setTextureOffset(0, 0).addBox(11.0F, 13.3328F, -14.2852F, 1, 2, 2, 0.0F);
        shape.setTextureOffset(0, 0).addBox(11.0F, 13.3328F, -9.2852F, 1, 2, 7, 0.0F);
        shape.setTextureOffset(0, 0).addBox(10.6F, 13.3328F, -19.2852F, 1, 7, 2, 0.0F);
        shape.setTextureOffset(0, 0).addBox(10.6F, 13.3328F, -12.2852F, 1, 2, 13, 0.0F);
        shape.setTextureOffset(0, 0).addBox(11.0F, 13.3328F, 2.7148F, 1, 7, 3, 0.0F);
        shape.setTextureOffset(0, 0).addBox(11.0F, 13.3328F, 0.7148F, 1, 2, 2, 0.0F);
        shape.setTextureOffset(0, 0).addBox(10.6F, 13.3328F, 5.7148F, 1, 7, 2, 0.0F);
        shape.setTextureOffset(0, 0).addBox(-8.0F, 11.2328F, -21.2852F, 19, 2, 30, 0.0F);
        shape.setTextureOffset(0, 0).addBox(-6.0F, 10.8328F, -21.2852F, 16, 2, 30, 0.0F);
        shape.setTextureOffset(0, 0).addBox(11.0F, 11.2328F, -17.2852F, 1, 2, 5, 0.0F);
        shape.setTextureOffset(0, 0).addBox(11.0F, 11.2328F, -9.2852F, 1, 2, 7, 0.0F);
        shape.setTextureOffset(0, 0).addBox(11.0F, 11.2328F, 0.7148F, 1, 2, 5, 0.0F);
        shape.setTextureOffset(0, 0).addBox(10.6F, 11.2328F, 5.7148F, 1, 2, 2, 0.0F);
        shape.setTextureOffset(0, 0).addBox(10.6F, 11.2328F, -12.2852F, 1, 2, 13, 0.0F);
        shape.setTextureOffset(0, 0).addBox(10.6F, 11.2328F, -19.2852F, 1, 2, 2, 0.0F);
        shape.setTextureOffset(0, 0).addBox(3.0F, 11.2328F, -22.2852F, 9, 2, 3, 0.0F);
        shape.setTextureOffset(0, 0).addBox(-8.0F, 11.2328F, -22.2852F, 9, 2, 3, 0.0F);
        shape.setTextureOffset(0, 0).addBox(1.0F, 11.2328F, -21.7852F, 2, 2, 32, 0.0F);
        shape.setTextureOffset(0, 0).addBox(3.0F, 11.2328F, 7.7148F, 9, 2, 3, 0.0F);
        shape.setTextureOffset(0, 0).addBox(-8.0F, 11.2328F, 7.7148F, 9, 2, 3, 0.0F);
        shape.setTextureOffset(0, 0).addBox(-2.0F, 13.3328F, -22.2852F, 3, 2, 33, 0.0F);
        shape.setTextureOffset(0, 0).addBox(3.0F, 13.3328F, -22.2852F, 3, 2, 33, 0.0F);
        shape.setTextureOffset(0, 0).addBox(1.0F, 13.3328F, -21.7852F, 2, 2, 32, 0.0F);
        shape.setTextureOffset(0, 0).addBox(-2.0F, 15.3328F, -20.2852F, 8, 5, 29, 0.0F);
        shape.setTextureOffset(0, 0).addBox(-5.0F, 10.3328F, -18.2852F, 14, 1, 2, 0.0F);
        shape.setTextureOffset(0, 0).addBox(-5.0F, 10.3328F, -11.2852F, 14, 1, 2, 0.0F);
        shape.setTextureOffset(0, 0).addBox(-5.0F, 10.3328F, -2.2852F, 14, 1, 2, 0.0F);
        shape.setTextureOffset(0, 0).addBox(-5.0F, 10.3328F, 4.7148F, 14, 1, 2, 0.0F);
        shape.setTextureOffset(150, 0).addBox(11.2F, 16.3328F, -6.7852F, 1, 1, 2, 0.0F);
        shape.setTextureOffset(150, 0).addBox(11.2F, 15.8328F, -6.2852F, 1, 2, 1, 0.0F);
        shape.setTextureOffset(170, 0).addBox(11.1F, 15.3328F, -6.7852F, 1, 4, 2, 0.0F);

        Shape69_r1 = new ModelRenderer(this);
        Shape69_r1.setTextureSize(textureWidth, textureHeight);
        Shape69_r1.mirror = true;
        shape.addChild(Shape69_r1);
        setRotation(Shape69_r1, -1.2566F, 0.0F, 0.0F);
        Shape69_r1.setTextureOffset(0, 0).addBox(-7.0F, -3.9F, 21.7F, 5, 3, 1, 0.0F);
        Shape69_r1.setTextureOffset(0, 0).addBox(6.0F, -3.9F, 21.7F, 5, 3, 1, 0.0F);
        Shape69_r1.setTextureOffset(0, 0).addBox(-2.0F, -1.9F, 21.7F, 8, 1, 1, 0.0F);

        Shape67_r1 = new ModelRenderer(this);
        Shape67_r1.setTextureSize(textureWidth, textureHeight);
        Shape67_r1.mirror = true;
        Shape67_r1.setRotationPoint(-0.1613F, 16.9335F, -11.2852F);
        shape.addChild(Shape67_r1);
        setRotation(Shape67_r1, 0.0F, 0.0F, -0.7679F);
        Shape67_r1.setTextureOffset(0, 0).addBox(-8.0F, -2.8F, -8.0F, 1, 1, 27, 0.0F);

        Shape66_r1 = new ModelRenderer(this);
        Shape66_r1.setTextureSize(textureWidth, textureHeight);
        Shape66_r1.mirror = true;
        Shape66_r1.setRotationPoint(0.5584F, 14.7506F, -11.2852F);
        shape.addChild(Shape66_r1);
        setRotation(Shape66_r1, 0.0F, 0.0F, 0.7679F);
        Shape66_r1.setTextureOffset(0, 0).addBox(10.9F, -3.6F, 17.0F, 1, 1, 2, 0.0F);
        Shape66_r1.setTextureOffset(0, 0).addBox(10.9F, -3.6F, -8.0F, 1, 1, 2, 0.0F);

        Shape64_r1 = new ModelRenderer(this);
        Shape64_r1.setTextureSize(textureWidth, textureHeight);
        Shape64_r1.mirror = true;
        Shape64_r1.setRotationPoint(0.863F, 15.1969F, -11.2852F);
        shape.addChild(Shape64_r1);
        setRotation(Shape64_r1, 0.0F, 0.0F, 0.7679F);
        Shape64_r1.setTextureOffset(0, 0).addBox(10.5F, -3.8F, 14.0F, 1, 1, 3, 0.0F);
        Shape64_r1.setTextureOffset(0, 0).addBox(10.5F, -3.8F, 4.0F, 1, 1, 3, 0.0F);
        Shape64_r1.setTextureOffset(0, 0).addBox(10.5F, -3.8F, -6.0F, 1, 1, 3, 0.0F);

        Shape61_r1 = new ModelRenderer(this);
        Shape61_r1.setTextureSize(textureWidth, textureHeight);
        Shape61_r1.mirror = true;
        Shape61_r1.setRotationPoint(0.0F, 10.7982F, -16.0329F);
        shape.addChild(Shape61_r1);
        setRotation(Shape61_r1, 1.2566F, 0.0F, 0.0F);
        Shape61_r1.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -11.0F, 8, 1, 1, 0.0F);
        Shape61_r1.setTextureOffset(0, 0).addBox(-7.0F, -3.0F, -11.0F, 5, 3, 1, 0.0F);
        Shape61_r1.setTextureOffset(0, 0).addBox(6.0F, -3.0F, -11.0F, 5, 3, 1, 0.0F);

        black = new ModelRenderer(this);
        black.setTextureSize(textureWidth, textureHeight);
        black.mirror = true;
        black.setRotationPoint(0.0F, 24.0F, 0.0F);
        black.setTextureOffset(0, 100).addBox(11.0F, -11.5F, 0.0F, 1, 3, 1, 0.0F);
        black.setTextureOffset(0, 100).addBox(11.0F, -11.5F, 10.0F, 1, 3, 1, 0.0F);
        black.setTextureOffset(0, 100).addBox(11.0F, -11.5F, -7.5F, 1, 3, 1, 0.0F);
        black.setTextureOffset(0, 100).addBox(11.0F, -11.5F, 17.5F, 1, 3, 1, 0.0F);
        black.setTextureOffset(0, 100).addBox(-8.5F, -11.0F, -8.0F, 1, 2, 27, 0.0F);
        black.setTextureOffset(0, 100).addBox(1.5F, -11.5F, -11.0F, 1, 3, 1, 0.0F);
        black.setTextureOffset(0, 100).addBox(1.5F, -11.5F, 21.0F, 1, 3, 1, 0.0F);
        black.setTextureOffset(0, 100).addBox(10.3F, -7.6F, -2.5F, 1, 2, 6, 0.0F);
        black.setTextureOffset(0, 100).addBox(10.3F, -7.6F, 7.5F, 1, 2, 6, 0.0F);
        black.setTextureOffset(0, 100).addBox(10.6F, -6.8F, -2.5F, 1, 4, 1, 0.0F);
        black.setTextureOffset(0, 100).addBox(10.6F, -6.8F, 2.5F, 1, 4, 1, 0.0F);
        black.setTextureOffset(0, 100).addBox(10.6F, -3.8F, -1.5F, 1, 1, 4, 0.0F);
        black.setTextureOffset(0, 100).addBox(10.6F, -6.8F, 7.5F, 1, 4, 1, 0.0F);
        black.setTextureOffset(0, 100).addBox(10.6F, -6.8F, 12.5F, 1, 4, 1, 0.0F);
        black.setTextureOffset(0, 100).addBox(10.6F, -3.8F, 8.5F, 1, 1, 4, 0.0F);
        black.setTextureOffset(0, 100).addBox(-1.0F, -7.6F, -10.0F, 6, 2, 31, 0.0F);
        black.setTextureOffset(0, 100).addBox(-1.0F, -6.6F, -10.5F, 1, 4, 1, 0.0F);
        black.setTextureOffset(0, 100).addBox(4.0F, -6.56F, -10.5F, 1, 4, 1, 0.0F);
        black.setTextureOffset(0, 100).addBox(0.0F, -3.6F, -10.5F, 4, 1, 1, 0.0F);
        black.setTextureOffset(0, 100).addBox(-1.0F, -6.6F, 20.5F, 1, 4, 1, 0.0F);
        black.setTextureOffset(0, 100).addBox(4.0F, -6.6F, 20.5F, 1, 4, 1, 0.0F);
        black.setTextureOffset(0, 100).addBox(0.0F, -3.6F, 20.5F, 4, 1, 1, 0.0F);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha) {
        shape.render(matrixStack, buffer, packedLight, packedOverlay);
        black.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
