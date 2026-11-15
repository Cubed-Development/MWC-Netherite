
package dev.redstudio.netherite.item.operating_table;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class OperatingTableAltModel extends EntityModel<Entity> {

    private final ModelRenderer bone;
    private final ModelRenderer table14_r1;
    private final ModelRenderer table13_r1;
    private final ModelRenderer table12_r1;
    private final ModelRenderer table11_r1;
    private final ModelRenderer table10_r1;
    private final ModelRenderer table8_r1;
    private final ModelRenderer table6_r1;
    private final ModelRenderer table4_r1;
    private final ModelRenderer table3_r1;

    public OperatingTableAltModel() {
        textureWidth = 256;
        textureHeight = 256;

        bone = new ModelRenderer(this);
        bone.setTextureSize(textureWidth, textureHeight);
        bone.mirror = true;
        bone.setRotationPoint(0.0F, -22.9382F, -7.0596F);
        bone.setTextureOffset(0, 0).addBox(-4.0F, 36.9382F, 3.0596F, 8, 6, 8, 0.0F);
        bone.setTextureOffset(0, 30).addBox(-5.0F, 42.9382F, 1.0596F, 10, 2, 15, 0.0F);
        bone.setTextureOffset(0, 60).addBox(-3.5F, 30.9382F, 3.5596F, 7, 6, 7, 0.0F);


        table14_r1 = new ModelRenderer(this);
        table14_r1.setTextureSize(textureWidth, textureHeight);
        table14_r1.mirror = true;
        table14_r1.setRotationPoint(0.0F, 38.4552F, -15.7255F);
        bone.addChild(table14_r1);
        setRotation(table14_r1, -1.2641F, 0.0F, 0.0F);
        table14_r1.setTextureOffset(0, 90).addBox(-6.0F, -19.8F, -5.6F, 12, 12, 2, 0.0F);

        table13_r1 = new ModelRenderer(this);
        table13_r1.setTextureSize(textureWidth, textureHeight);
        table13_r1.mirror = true;
        table13_r1.setRotationPoint(0.0F, 27.7175F, 29.8413F);
        bone.addChild(table13_r1);
        setRotation(table13_r1, 2.1192F, 0.0F, 0.0F);
        table13_r1.setTextureOffset(0, 90).addBox(-6.0F, -16.0F, 6.0F, 12, 12, 2, 0.0F);

        table12_r1 = new ModelRenderer(this);
        table12_r1.setTextureSize(textureWidth, textureHeight);
        table12_r1.mirror = true;
        table12_r1.setRotationPoint(0.0F, 15.8521F, 21.085F);
        bone.addChild(table12_r1);
        setRotation(table12_r1, 3.0115F, 0.0F, 0.0F);
        table12_r1.setTextureOffset(0, 90).addBox(-6.0F, -16.0F, 6.0F, 12, 2, 12, 0.0F);

        table11_r1 = new ModelRenderer(this);
        table11_r1.setTextureSize(textureWidth, textureHeight);
        table11_r1.mirror = true;
        table11_r1.setRotationPoint(0.0F, 30.3334F, 27.3739F);
        bone.addChild(table11_r1);
        setRotation(table11_r1, 2.1192F, 0.0F, 0.0F);
        table11_r1.setTextureOffset(0, 0).addBox(-5.5F, -14.0F, 5.5F, 11, 13, 2, 0.0F);

        table10_r1 = new ModelRenderer(this);
        table10_r1.setTextureSize(textureWidth, textureHeight);
        table10_r1.mirror = true;
        table10_r1.setRotationPoint(0.0F, 19.7703F, 19.8297F);
        bone.addChild(table10_r1);
        setRotation(table10_r1, 3.0115F, 0.0F, 0.0F);
        table10_r1.setTextureOffset(0, 0).addBox(-5.5F, -14.0F, 5.5F, 11, 2, 12, 0.0F);

        table8_r1 = new ModelRenderer(this);
        table8_r1.setTextureSize(textureWidth, textureHeight);
        table8_r1.mirror = true;
        table8_r1.setRotationPoint(0.0F, 51.2415F, 9.6705F);
        bone.addChild(table8_r1);
        setRotation(table8_r1, 0.7854F, 0.0F, 0.0F);
        table8_r1.setTextureOffset(0, 30).addBox(-4.5F, -1.0F, 6.5F, 2, 2, 2, 0.0F);
        table8_r1.setTextureOffset(0, 30).addBox(2.5F, -1.0F, 6.5F, 2, 2, 2, 0.0F);

        table6_r1 = new ModelRenderer(this);
        table6_r1.setTextureSize(textureWidth, textureHeight);
        table6_r1.mirror = true;
        table6_r1.setRotationPoint(0.0F, 38.5136F, 4.3984F);
        bone.addChild(table6_r1);
        setRotation(table6_r1, 0.7854F, 0.0F, 0.0F);
        table6_r1.setTextureOffset(0, 30).addBox(-5.5F, -1.0F, -11.5F, 2, 2, 2, 0.0F);
        table6_r1.setTextureOffset(0, 30).addBox(3.5F, -1.0F, -11.5F, 2, 2, 2, 0.0F);

        table4_r1 = new ModelRenderer(this);
        table4_r1.setTextureSize(textureWidth, textureHeight);
        table4_r1.mirror = true;
        table4_r1.setRotationPoint(-1.9297F, 46.9382F, 5.7611F);
        bone.addChild(table4_r1);
        setRotation(table4_r1, 0.0F, -0.1859F, 0.0F);
        table4_r1.setTextureOffset(0, 30).addBox(3.0F, -4.0F, -11.0F, 3, 2, 6, 0.0F);

        table3_r1 = new ModelRenderer(this);
        table3_r1.setTextureSize(textureWidth, textureHeight);
        table3_r1.mirror = true;
        table3_r1.setRotationPoint(1.9297F, 46.9382F, 5.7611F);
        bone.addChild(table3_r1);
        setRotation(table3_r1, 0.0F, 0.1859F, 0.0F);
        table3_r1.setTextureOffset(0, 30).addBox(-6.0F, -4.0F, -11.0F, 3, 2, 6, 0.0F);
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
