
package dev.redstudio.netherite.props.electronics;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class Radio extends EntityModel<Entity> {

    private final ModelRenderer bone;
    private final ModelRenderer radio35_r1;
    private final ModelRenderer radio30_r1;
    private final ModelRenderer radio29_r1;
    private final ModelRenderer radio28_r1;
    private final ModelRenderer radio27_r1;
    private final ModelRenderer radio26_r1;
    private final ModelRenderer radio25_r1;
    private final ModelRenderer radio24_r1;
    private final ModelRenderer radio22_r1;
    private final ModelRenderer radio37_r1;

    public Radio() {
        textureWidth = 256;
        textureHeight = 256;

        bone = new ModelRenderer(this, 0, 0);
        bone.setTextureSize(256, 256);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        setRotation(bone, 0.0F, -1.5708F, 0.0F);
        bone.mirror = true;

        bone.addBox(-7.5F, -6.0F, -5.0F, 15, 7, 12);
        bone.addBox(-7.0F, -6.5F, -5.5F, 14, 1, 12);
        bone.addBox(-7.0F, -5.3F, -5.2F, 2, 4, 1);
        bone.addBox(-4.5F, -3.3F, -5.2F, 3, 3, 1);
        bone.addBox(-0.5F, -2.3F, -5.2F, 6, 2, 1);
        bone.addBox(-0.5F, -2.8F, -5.2F, 6, 1, 1);

        bone.setTextureOffset(0, 50);
        bone.addBox(1.3F, -4.0F, -5.2F, 5, 1, 1);
        bone.addBox(0.3F, -6.0F, -5.2F, 1, 3, 1);
        bone.addBox(6.3F, -6.0F, -5.2F, 1, 3, 1);
        bone.addBox(1.3F, -6.2F, -5.2F, 5, 1, 1);
        bone.addBox(-7.2F, -1.1F, -5.3F, 1, 1, 1);
        bone.addBox(-5.8F, -1.1F, -5.3F, 1, 1, 1);
        bone.addBox(0.8F, -3.5F, -5.4F, 1, 2, 1);
        bone.addBox(-0.6F, -5.0F, -5.1F, 1, 1, 1);

        bone.setTextureOffset(0, 100);
        bone.addBox(1.3F, -5.5F, -5.1F, 5, 2, 1);

        bone.setTextureOffset(0, 50);
        bone.addBox(-8.0F, -5.5F, -6.0F, 1, 5, 5);
        bone.addBox(7.0F, -5.5F, -6.0F, 1, 5, 5);
        bone.addBox(4.4F, -2.7F, -5.3F, 1, 1, 1);
        bone.addBox(4.4F, -1.4F, -5.3F, 1, 1, 1);
        bone.addBox(3.0F, -1.4F, -5.3F, 1, 1, 1);
        bone.addBox(3.0F, -2.7F, -5.3F, 1, 1, 1);
        bone.addBox(-6.5F, -5.0F, -5.3F, 1, 1, 1);

        bone.setTextureOffset(50, 50);
        bone.addBox(-4.8F, -5.0F, -5.1F, 1, 1, 1);
        bone.addBox(-2.2F, -5.0F, -5.1F, 1, 1, 1);
        bone.addBox(-4.8F, -4.8F, -5.1F, 1, 1, 1);
        bone.addBox(-2.2F, -4.8F, -5.1F, 1, 1, 1);

        bone.setTextureOffset(0, 50);
        bone.addBox(-3.65F, -4.9F, -5.65F, 1, 1, 1);

        radio35_r1 = new ModelRenderer(this, 0, 50);
        radio35_r1.setTextureSize(256, 256);
        radio35_r1.setRotationPoint(2.0172F, 0.0F, -3.1542F);
        bone.addChild(radio35_r1);
        setRotation(radio35_r1, 0.0F, 0.5577F, 0.0F);
        radio35_r1.mirror = true;
        radio35_r1.addBox(-4.5F, -4.9F, -5.1F, 1, 1, 1);

        radio30_r1 = new ModelRenderer(this, 0, 50);
        radio30_r1.setTextureSize(256, 256);
        radio30_r1.setRotationPoint(1.9733F, -0.9013F, 0.0F);
        bone.addChild(radio30_r1);
        setRotation(radio30_r1, 0.0F, 0.0F, -0.4461F);
        radio30_r1.mirror = true;
        radio30_r1.addBox(-1.0F, -4.8F, -5.2F, 1, 1, 1);

        radio29_r1 = new ModelRenderer(this, 0, 50);
        radio29_r1.setTextureSize(256, 256);
        radio29_r1.setRotationPoint(0.0F, -4.0406F, -0.8452F);
        bone.addChild(radio29_r1);
        setRotation(radio29_r1, 0.7854F, 0.0F, 0.0F);
        radio29_r1.mirror = true;
        radio29_r1.addBox(-4.0F, -1.0F, -5.3F, 2, 1, 1);

        radio28_r1 = new ModelRenderer(this, 0, 50);
        radio28_r1.setTextureSize(256, 256);
        radio28_r1.setRotationPoint(0.0F, -4.2749F, -0.2795F);
        bone.addChild(radio28_r1);
        setRotation(radio28_r1, 0.7854F, 0.0F, 0.0F);
        radio28_r1.mirror = true;
        radio28_r1.addBox(-4.0F, -1.8F, -5.3F, 2, 1, 1);

        radio27_r1 = new ModelRenderer(this, 0, 50);
        radio27_r1.setTextureSize(256, 256);
        radio27_r1.setRotationPoint(0.0F, -4.392F, 0.0033F);
        bone.addChild(radio27_r1);
        setRotation(radio27_r1, 0.7854F, 0.0F, 0.0F);
        radio27_r1.mirror = true;
        radio27_r1.addBox(-4.0F, -2.2F, -5.3F, 2, 1, 1);

        radio26_r1 = new ModelRenderer(this, 0, 50);
        radio26_r1.setTextureSize(256, 256);
        radio26_r1.setRotationPoint(0.0F, -4.5092F, 0.2861F);
        bone.addChild(radio26_r1);
        setRotation(radio26_r1, 0.7854F, 0.0F, 0.0F);
        radio26_r1.mirror = true;
        radio26_r1.addBox(-4.0F, -2.6F, -5.3F, 2, 1, 1);

        radio25_r1 = new ModelRenderer(this, 0, 50);
        radio25_r1.setTextureSize(256, 256);
        radio25_r1.setRotationPoint(0.0F, -4.1577F, -0.5624F);
        bone.addChild(radio25_r1);
        setRotation(radio25_r1, 0.7854F, 0.0F, 0.0F);
        radio25_r1.mirror = true;
        radio25_r1.addBox(-4.0F, -1.4F, -5.3F, 2, 1, 1);

        radio24_r1 = new ModelRenderer(this, 0, 100);
        radio24_r1.setTextureSize(256, 256);
        radio24_r1.setRotationPoint(-5.505F, 0.0F, 2.6903F);
        bone.addChild(radio24_r1);
        setRotation(radio24_r1, 0.0F, -0.7854F, 0.0F);
        radio24_r1.mirror = true;
        radio24_r1.addBox(-6.0F, -3.7F, -5.3F, 1, 2, 1);

        radio22_r1 = new ModelRenderer(this, 0, 50);
        radio22_r1.setTextureSize(256, 256);
        radio22_r1.setRotationPoint(-1.4699F, -1.4278F, 0.0F);
        bone.addChild(radio22_r1);
        setRotation(radio22_r1, 0.0F, 0.0F, 0.7808F);
        radio22_r1.mirror = true;
        radio22_r1.addBox(1.0F, -2.5F, -5.5F, 1, 1, 1);

        radio37_r1 = new ModelRenderer(this, 0, 50);
        radio37_r1.setTextureSize(256, 256);
        radio37_r1.setRotationPoint(-2.6973F, 0.0F, 0.5904F);
        bone.addChild(radio37_r1);
        setRotation(radio37_r1, 0.0F, -0.4461F, 0.0F);
        radio37_r1.mirror = true;
        radio37_r1.addBox(-2.65F, -4.9F, -5.65F, 2, 1, 1);
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
