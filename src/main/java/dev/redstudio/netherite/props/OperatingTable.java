
package dev.redstudio.netherite.props;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class OperatingTable extends EntityModel<Entity> {

    private final ModelRenderer table;
    private final ModelRenderer table13_r1;
    private final ModelRenderer table11_r1;
    private final ModelRenderer table8_r1;
    private final ModelRenderer table6_r1;
    private final ModelRenderer table4_r1;
    private final ModelRenderer table3_r1;

    public OperatingTable() {
        textureWidth = 256;
        textureHeight = 256;

        table = new ModelRenderer(this);
        table.setTextureSize(textureWidth, textureHeight);
        table.mirror = true;
        table.setRotationPoint(0.0F, 9.8388F, 22.9888F);
        table.setTextureOffset(0, 0).addBox(-4.0F, 4.1612F, -26.9888F, 8, 6, 8, 0.0F);
        table.setTextureOffset(0, 30).addBox(-5.0F, 10.1612F, -28.9888F, 10, 2, 15, 0.0F);
        table.setTextureOffset(0, 60).addBox(-3.5F, 0.1612F, -26.4888F, 7, 4, 7, 0.0F);
        table.setTextureOffset(0, 0).addBox(-5.5F, -1.8388F, -40.4888F, 11, 2, 23, 0.0F);
        table.setTextureOffset(0, 90).addBox(-6.0F, -3.8388F, -40.9888F, 12, 2, 24, 0.0F);

        table13_r1 = new ModelRenderer(this);
        table13_r1.setTextureSize(textureWidth, textureHeight);
        table13_r1.mirror = true;
        table.addChild(table13_r1);
        setRotation(table13_r1, 1.8218F, 0.0F, 0.0F);
        table13_r1.setTextureOffset(0, 90).addBox(-6.0F, -16.0F, 6.0F, 12, 12, 2, 0.0F);

        table11_r1 = new ModelRenderer(this);
        table11_r1.setTextureSize(textureWidth, textureHeight);
        table11_r1.mirror = true;
        table11_r1.setRotationPoint(0.0F, 2.0123F, -2.5615F);
        table.addChild(table11_r1);
        setRotation(table11_r1, 1.8218F, 0.0F, 0.0F);
        table11_r1.setTextureOffset(0, 0).addBox(-5.5F, -14.0F, 5.5F, 11, 13, 2, 0.0F);

        table8_r1 = new ModelRenderer(this);
        table8_r1.setTextureSize(textureWidth, textureHeight);
        table8_r1.mirror = true;
        table8_r1.setRotationPoint(0.0F, 18.4645F, -20.3779F);
        table.addChild(table8_r1);
        setRotation(table8_r1, 0.7854F, 0.0F, 0.0F);
        table8_r1.setTextureOffset(0, 30).addBox(-4.5F, -1.0F, 6.5F, 2, 2, 2, 0.0F);
        table8_r1.setTextureOffset(0, 30).addBox(2.5F, -1.0F, 6.5F, 2, 2, 2, 0.0F);

        table6_r1 = new ModelRenderer(this);
        table6_r1.setTextureSize(textureWidth, textureHeight);
        table6_r1.mirror = true;
        table6_r1.setRotationPoint(0.0F, 5.7366F, -25.65F);
        table.addChild(table6_r1);
        setRotation(table6_r1, 0.7854F, 0.0F, 0.0F);
        table6_r1.setTextureOffset(0, 30).addBox(-5.5F, -1.0F, -11.5F, 2, 2, 2, 0.0F);
        table6_r1.setTextureOffset(0, 30).addBox(3.5F, -1.0F, -11.5F, 2, 2, 2, 0.0F);

        table4_r1 = new ModelRenderer(this);
        table4_r1.setTextureSize(textureWidth, textureHeight);
        table4_r1.mirror = true;
        table4_r1.setRotationPoint(-1.9297F, 14.1612F, -24.2873F);
        table.addChild(table4_r1);
        setRotation(table4_r1, 0.0F, -0.1859F, 0.0F);
        table4_r1.setTextureOffset(0, 30).addBox(3.0F, -4.0F, -11.0F, 3, 2, 6, 0.0F);

        table3_r1 = new ModelRenderer(this);
        table3_r1.setTextureSize(textureWidth, textureHeight);
        table3_r1.mirror = true;
        table3_r1.setRotationPoint(1.9297F, 14.1612F, -24.2872F);
        table.addChild(table3_r1);
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
        table.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
