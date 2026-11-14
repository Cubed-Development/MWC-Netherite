
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
public final class ForkLiftAlt extends EntityModel<Entity> {

    private final ModelRenderer bone;
    private final ModelRenderer forklift49_r1;
    private final ModelRenderer forklift43_r1;
    private final ModelRenderer forklift40_r1;
    private final ModelRenderer forklift37_r1;
    private final ModelRenderer forklift36_r1;
    private final ModelRenderer forklift35_r1;
    private final ModelRenderer forklift33_r1;
    private final ModelRenderer forklift31_r1;
    private final ModelRenderer forklift12_r1;
    private final ModelRenderer forklift11_r1;
    private final ModelRenderer forklift9_r1;
    private final ModelRenderer forklift7_r1;
    private final ModelRenderer forklift4_r1;
    private final ModelRenderer forklift3_r1;

    public ForkLiftAlt() {
        textureWidth = 256;
        textureHeight = 256;

        bone = new ModelRenderer(this);
        bone.setTextureSize(256, 256);
        bone.mirror = true;
        bone.setRotationPoint(9.5348F, 24.0F, -3.8679F);
        bone.setTextureOffset(0, 0).addBox(-22.5348F, -8.0F, -7.1321F, 26.0F, 4.0F, 21.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-22.5348F, -13.0F, -1.1321F, 26.0F, 5.0F, 15.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-19.5348F, -13.0F, -9.1321F, 20.0F, 5.0F, 8.0F, 0.0F);
        bone.setTextureOffset(0, 50).addBox(-21.5348F, -18.0F, -0.6321F, 24.0F, 5.0F, 8.0F, 0.0F);
        bone.setTextureOffset(0, 50).addBox(-21.5348F, -20.05F, 7.0679F, 24.0F, 2.0F, 5.0F, 0.0F);
        bone.setTextureOffset(0, 50).addBox(-22.5348F, -9.0F, -17.6321F, 5.0F, 9.0F, 9.0F, 0.0F);
        bone.setTextureOffset(0, 50).addBox(-1.5348F, -9.0F, -17.6321F, 5.0F, 9.0F, 9.0F, 0.0F);
        bone.setTextureOffset(0, 50).addBox(-1.5348F, -9.0F, 15.3679F, 5.0F, 9.0F, 9.0F, 0.0F);
        bone.setTextureOffset(0, 50).addBox(-22.5348F, -9.0F, 15.3679F, 5.0F, 9.0F, 9.0F, 0.0F);
        bone.setTextureOffset(0, 50).addBox(-17.5348F, -12.0F, -18.6321F, 16.0F, 9.0F, 42.0F, 0.0F);
        bone.setTextureOffset(0, 50).addBox(-17.0348F, -63.0F, -20.6321F, 2.0F, 60.0F, 4.0F, 0.0F);
        bone.setTextureOffset(0, 50).addBox(-4.0348F, -63.0F, -20.6321F, 2.0F, 60.0F, 4.0F, 0.0F);
        bone.setTextureOffset(0, 50).addBox(-17.0348F, -63.0F, -16.6321F, 15.0F, 2.0F, 2.0F, 0.0F);
        bone.setTextureOffset(0, 50).addBox(-24.0348F, -54.0F, -22.6321F, 29.0F, 2.0F, 2.0F, 0.0F);
        bone.setTextureOffset(0, 50).addBox(-24.0348F, -52.0F, -22.6321F, 2.0F, 20.0F, 2.0F, 0.0F);
        bone.setTextureOffset(0, 50).addBox(2.9652F, -52.0F, -22.6321F, 2.0F, 20.0F, 2.0F, 0.0F);
        bone.setTextureOffset(0, 50).addBox(-22.0348F, -43.0F, -22.6321F, 25.0F, 1.0F, 2.0F, 0.0F);
        bone.setTextureOffset(0, 50).addBox(-22.0348F, -40.0F, -21.6321F, 25.0F, 2.0F, 1.0F, 0.0F);
        bone.setTextureOffset(0, 50).addBox(-22.0348F, -34.0F, -21.6321F, 25.0F, 2.0F, 1.0F, 0.0F);
        bone.setTextureOffset(0, 50).addBox(-20.0348F, -32.5F, -46.6321F, 3.0F, 1.0F, 25.0F, 0.0F);
        bone.setTextureOffset(0, 50).addBox(-2.0348F, -32.5F, -46.6321F, 3.0F, 1.0F, 25.0F, 0.0F);
        bone.setTextureOffset(0, 50).addBox(-22.0348F, -43.0F, -7.6321F, 25.0F, 2.0F, 19.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-22.5348F, -22.0F, 13.1679F, 26.0F, 8.0F, 13.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-16.5348F, -23.0F, 13.8679F, 14.0F, 18.0F, 13.0F, 0.0F);
        bone.setTextureOffset(0, 50).addBox(-23.0348F, -19.0F, 15.0679F, 27.0F, 5.0F, 12.0F, 0.0F);
        bone.setTextureOffset(0, 50).addBox(-16.5348F, -22.0F, 0.3679F, 14.0F, 4.0F, 10.0F, 0.0F);

        forklift49_r1 = new ModelRenderer(this);
        forklift49_r1.setTextureSize(256, 256);
        forklift49_r1.mirror = true;
        bone.addChild(forklift49_r1);
        setRotation(forklift49_r1, 0.0F, 0.2231F, 0.0F);
        forklift49_r1.setTextureOffset(0, 160).addBox(3.5F, -35.5F, -46.5F, 3.0F, 1.0F, 20.0F, 0.0F);
        forklift49_r1.setTextureOffset(0, 160).addBox(-1.5F, -35.5F, -46.5F, 3.0F, 1.0F, 20.0F, 0.0F);
        forklift49_r1.setTextureOffset(0, 160).addBox(-6.5F, -35.5F, -46.5F, 3.0F, 1.0F, 20.0F, 0.0F);
        forklift49_r1.setTextureOffset(0, 160).addBox(-11.5F, -35.5F, -46.5F, 3.0F, 1.0F, 20.0F, 0.0F);
        forklift49_r1.setTextureOffset(0, 160).addBox(-13.5F, -34.5F, -30.5F, 27.0F, 2.0F, 2.0F, 0.0F);
        forklift49_r1.setTextureOffset(0, 160).addBox(-13.5F, -34.5F, -44.5F, 27.0F, 2.0F, 2.0F, 0.0F);
        forklift49_r1.setTextureOffset(0, 160).addBox(8.5F, -35.5F, -46.5F, 3.0F, 1.0F, 20.0F, 0.0F);

        forklift43_r1 = new ModelRenderer(this);
        forklift43_r1.setTextureSize(256, 256);
        forklift43_r1.mirror = true;
        forklift43_r1.setRotationPoint(-9.5348F, -39.8342F, 21.7047F);
        bone.addChild(forklift43_r1);
        setRotation(forklift43_r1, 2.8999F, 0.0F, 0.0F);
        forklift43_r1.setTextureOffset(0, 50).addBox(-7.0F, -21.0F, 6.5F, 14.0F, 8.0F, 3.0F, 0.0F);

        forklift40_r1 = new ModelRenderer(this);
        forklift40_r1.setTextureSize(256, 256);
        forklift40_r1.mirror = true;
        forklift40_r1.setRotationPoint(-9.5348F, 1.8701F, 25.3532F);
        bone.addChild(forklift40_r1);
        setRotation(forklift40_r1, 0.7854F, 0.0F, 0.0F);
        forklift40_r1.setTextureOffset(0, 130).addBox(-9.0F, -25.0F, 13.0F, 18.0F, 6.0F, 6.0F, 0.0F);

        forklift37_r1 = new ModelRenderer(this);
        forklift37_r1.setTextureSize(256, 256);
        forklift37_r1.mirror = true;
        forklift37_r1.setRotationPoint(-9.5348F, -5.7809F, -0.7627F);
        bone.addChild(forklift37_r1);
        setRotation(forklift37_r1, -0.3346F, 0.0F, 0.0F);
        forklift37_r1.setTextureOffset(0, 0).addBox(-13.0F, -16.6F, 14.8F, 26.0F, 4.0F, 8.0F, 0.0F);

        forklift36_r1 = new ModelRenderer(this);
        forklift36_r1.setTextureSize(256, 256);
        forklift36_r1.mirror = true;
        forklift36_r1.setRotationPoint(-9.5348F, -5.004F, 26.3188F);
        bone.addChild(forklift36_r1);
        setRotation(forklift36_r1, 2.2307F, 0.0F, 0.0F);
        forklift36_r1.setTextureOffset(0, 0).addBox(-13.0F, -8.0F, 10.0F, 26.0F, 9.0F, 4.0F, 0.0F);

        forklift35_r1 = new ModelRenderer(this);
        forklift35_r1.setTextureSize(256, 256);
        forklift35_r1.mirror = true;
        forklift35_r1.setRotationPoint(-9.5348F, -43.6404F, -32.2765F);
        bone.addChild(forklift35_r1);
        setRotation(forklift35_r1, -1.4128F, 0.0F, 0.0F);
        forklift35_r1.setTextureOffset(0, 50).addBox(-12.5F, -43.0F, 7.5F, 3.0F, 3.0F, 24.0F, 0.0F);
        forklift35_r1.setTextureOffset(0, 50).addBox(9.5F, -43.0F, 7.5F, 3.0F, 3.0F, 24.0F, 0.0F);

        forklift33_r1 = new ModelRenderer(this);
        forklift33_r1.setTextureSize(256, 256);
        forklift33_r1.mirror = true;
        forklift33_r1.setRotationPoint(-9.5348F, 2.084F, -1.9752F);
        bone.addChild(forklift33_r1);
        setRotation(forklift33_r1, -0.1859F, 0.0F, 0.0F);
        forklift33_r1.setTextureOffset(0, 50).addBox(-12.5F, -30.3F, -14.1F, 2.0F, 19.0F, 2.0F, 0.0F);
        forklift33_r1.setTextureOffset(0, 50).addBox(10.5F, -30.3F, -14.1F, 2.0F, 19.0F, 2.0F, 0.0F);

        forklift31_r1 = new ModelRenderer(this);
        forklift31_r1.setTextureSize(256, 256);
        forklift31_r1.mirror = true;
        forklift31_r1.setRotationPoint(-9.5348F, 1.5034F, -5.7085F);
        bone.addChild(forklift31_r1);
        setRotation(forklift31_r1, -0.2231F, 0.0F, 0.0F);
        forklift31_r1.setTextureOffset(0, 50).addBox(10.5F, -42.0F, -11.5F, 2.0F, 13.0F, 2.0F, 0.0F);
        forklift31_r1.setTextureOffset(0, 50).addBox(-12.5F, -42.0F, -11.5F, 2.0F, 13.0F, 2.0F, 0.0F);

        forklift12_r1 = new ModelRenderer(this);
        forklift12_r1.setTextureSize(256, 256);
        forklift12_r1.mirror = true;
        forklift12_r1.setRotationPoint(-9.5348F, 3.475F, -0.1053F);
        bone.addChild(forklift12_r1);
        setRotation(forklift12_r1, -0.2231F, 0.0F, 0.0F);
        forklift12_r1.setTextureOffset(0, 50).addBox(-12.0F, -16.0F, -18.5F, 24.0F, 5.0F, 8.0F, 0.0F);

        forklift11_r1 = new ModelRenderer(this);
        forklift11_r1.setTextureSize(256, 256);
        forklift11_r1.mirror = true;
        forklift11_r1.setRotationPoint(-9.5348F, -27.3308F, 1.1312F);
        bone.addChild(forklift11_r1);
        setRotation(forklift11_r1, 1.3756F, 0.0F, 0.0F);
        forklift11_r1.setTextureOffset(0, 50).addBox(-5.0F, -12.0F, -18.0F, 10.0F, 5.0F, 14.0F, 0.0F);

        forklift9_r1 = new ModelRenderer(this);
        forklift9_r1.setTextureSize(256, 256);
        forklift9_r1.mirror = true;
        forklift9_r1.setRotationPoint(-9.5348F, -1.7641F, 8.3482F);
        bone.addChild(forklift9_r1);
        setRotation(forklift9_r1, 0.2602F, 0.0F, 0.0F);
        forklift9_r1.setTextureOffset(0, 50).addBox(-12.0F, -18.0F, -4.5F, 24.0F, 2.0F, 8.0F, 0.0F);

        forklift7_r1 = new ModelRenderer(this);
        forklift7_r1.setTextureSize(256, 256);
        forklift7_r1.mirror = true;
        forklift7_r1.setRotationPoint(-9.5348F, -0.9428F, 9.4507F);
        bone.addChild(forklift7_r1);
        setRotation(forklift7_r1, 0.3346F, 0.0F, 0.0F);
        forklift7_r1.setTextureOffset(0, 0).addBox(-13.0F, -17.0F, 0.0F, 26.0F, 8.0F, 11.0F, 0.0F);

        forklift4_r1 = new ModelRenderer(this);
        forklift4_r1.setTextureSize(256, 256);
        forklift4_r1.mirror = true;
        forklift4_r1.setRotationPoint(-9.5348F, 2.9186F, -15.8422F);
        bone.addChild(forklift4_r1);
        setRotation(forklift4_r1, -1.3384F, 0.0F, 0.0F);
        forklift4_r1.setTextureOffset(0, 0).addBox(-14.0F, -11.0F, -11.7F, 28.0F, 1.0F, 7.0F, 0.0F);

        forklift3_r1 = new ModelRenderer(this);
        forklift3_r1.setTextureSize(256, 256);
        forklift3_r1.mirror = true;
        forklift3_r1.setRotationPoint(-9.5348F, -2.9081F, -21.7033F);
        bone.addChild(forklift3_r1);
        setRotation(forklift3_r1, -1.8589F, 0.0F, 0.0F);
        forklift3_r1.setTextureOffset(0, 0).addBox(-14.0F, -11.0F, -11.7F, 28.0F, 8.0F, 1.0F, 0.0F);
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
