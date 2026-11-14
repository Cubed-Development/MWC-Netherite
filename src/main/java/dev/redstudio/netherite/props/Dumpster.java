
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
public final class Dumpster extends EntityModel<Entity> {

    private final ModelRenderer dumpster;
    private final ModelRenderer dumpster26_r1;
    private final ModelRenderer dumpster25_r1;
    private final ModelRenderer dumpster24_r1;
    private final ModelRenderer dumpster10_r1;
    private final ModelRenderer dumpster3_r1;

    public Dumpster() {
        textureWidth = 256;
        textureHeight = 256;

        dumpster = new ModelRenderer(this);
        dumpster.setTextureSize(256, 256);
        dumpster.mirror = true;
        dumpster.setRotationPoint(0.0F, 24.0F, 0.0F);
        dumpster.setTextureOffset(0, 0).addBox(-24.0F, -18.0F, -6.5F, 32.0F, 16.0F, 14.0F, 0.0F);
        dumpster.setTextureOffset(0, 0).addBox(-26.0F, -19.0F, -8.0F, 36.0F, 2.0F, 2.0F, 0.0F);
        dumpster.setTextureOffset(0, 0).addBox(-23.0F, -12.0F, -6.7F, 30.0F, 1.0F, 1.0F, 0.0F);
        dumpster.setTextureOffset(0, 0).addBox(-23.0F, -8.0F, -6.7F, 30.0F, 1.0F, 1.0F, 0.0F);
        dumpster.setTextureOffset(0, 0).addBox(5.0F, -14.0F, -7.0F, 4.0F, 5.0F, 15.0F, 0.0F);
        dumpster.setTextureOffset(0, 0).addBox(-26.0F, -16.0F, -8.0F, 36.0F, 1.0F, 1.0F, 0.0F);
        dumpster.setTextureOffset(0, 0).addBox(9.0F, -17.0F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F);
        dumpster.setTextureOffset(0, 0).addBox(-24.0F, -20.8F, 6.5F, 32.0F, 3.0F, 1.0F, 0.0F);
        dumpster.setTextureOffset(0, 0).addBox(-25.0F, -14.0F, -7.0F, 4.0F, 5.0F, 15.0F, 0.0F);
        dumpster.setTextureOffset(0, 0).addBox(-26.0F, -17.0F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F);

        dumpster26_r1 = new ModelRenderer(this);
        dumpster26_r1.setTextureSize(256, 256);
        dumpster26_r1.mirror = true;
        dumpster26_r1.setRotationPoint(0.0F, -4.3829F, -0.2406F);
        dumpster.addChild(dumpster26_r1);
        setRotation(dumpster26_r1, -0.7436F, 0.0F, 0.0F);
        dumpster26_r1.setTextureOffset(0, 50).addBox(-23.0F, -2.5F, 5.5F, 2.0F, 2.0F, 2.0F, 0.0F);
        dumpster26_r1.setTextureOffset(0, 50).addBox(5.0F, -2.5F, 5.5F, 2.0F, 2.0F, 2.0F, 0.0F);

        dumpster25_r1 = new ModelRenderer(this);
        dumpster25_r1.setTextureSize(256, 256);
        dumpster25_r1.mirror = true;
        dumpster25_r1.setRotationPoint(0.0F, 2.3863F, -2.8801F);
        dumpster.addChild(dumpster25_r1);
        setRotation(dumpster25_r1, -0.7436F, 0.0F, 0.0F);
        dumpster25_r1.setTextureOffset(0, 50).addBox(-23.0F, -2.5F, -4.5F, 2.0F, 2.0F, 2.0F, 0.0F);
        dumpster25_r1.setTextureOffset(0, 50).addBox(5.0F, -2.5F, -4.5F, 2.0F, 2.0F, 2.0F, 0.0F);

        dumpster24_r1 = new ModelRenderer(this);
        dumpster24_r1.setTextureSize(256, 256);
        dumpster24_r1.mirror = true;
        dumpster24_r1.setRotationPoint(0.0F, -29.2507F, 8.6979F);
        dumpster.addChild(dumpster24_r1);
        setRotation(dumpster24_r1, 1.8218F, 0.0F, 0.0F);
        dumpster24_r1.setTextureOffset(0, 50).addBox(-11.0F, -17.5F, -6.5F, 2.0F, 13.0F, 2.0F, 0.0F);
        dumpster24_r1.setTextureOffset(0, 50).addBox(-14.0F, -17.5F, -6.5F, 2.0F, 13.0F, 2.0F, 0.0F);
        dumpster24_r1.setTextureOffset(0, 50).addBox(-17.0F, -17.5F, -6.5F, 2.0F, 13.0F, 2.0F, 0.0F);
        dumpster24_r1.setTextureOffset(0, 50).addBox(-20.0F, -17.5F, -6.5F, 2.0F, 13.0F, 2.0F, 0.0F);
        dumpster24_r1.setTextureOffset(0, 50).addBox(-23.0F, -17.5F, -6.5F, 2.0F, 13.0F, 2.0F, 0.0F);
        dumpster24_r1.setTextureOffset(0, 50).addBox(5.0F, -17.5F, -6.5F, 2.0F, 13.0F, 2.0F, 0.0F);
        dumpster24_r1.setTextureOffset(0, 50).addBox(2.0F, -17.5F, -6.5F, 2.0F, 13.0F, 2.0F, 0.0F);
        dumpster24_r1.setTextureOffset(0, 50).addBox(-1.0F, -17.5F, -6.5F, 2.0F, 13.0F, 2.0F, 0.0F);
        dumpster24_r1.setTextureOffset(0, 50).addBox(-4.0F, -17.5F, -6.5F, 2.0F, 13.0F, 2.0F, 0.0F);
        dumpster24_r1.setTextureOffset(0, 50).addBox(-7.0F, -17.5F, -6.5F, 2.0F, 13.0F, 2.0F, 0.0F);
        dumpster24_r1.setTextureOffset(0, 50).addBox(-24.0F, -18.0F, -7.0F, 32.0F, 14.0F, 2.0F, 0.0F);

        dumpster10_r1 = new ModelRenderer(this);
        dumpster10_r1.setTextureSize(256, 256);
        dumpster10_r1.mirror = true;
        dumpster10_r1.setRotationPoint(0.0F, -22.1045F, -14.9459F);
        dumpster.addChild(dumpster10_r1);
        setRotation(dumpster10_r1, -1.3384F, 0.0F, 0.0F);
        dumpster10_r1.setTextureOffset(0, 0).addBox(-24.0F, -20.5F, 6.5F, 32.0F, 10.0F, 3.0F, 0.0F);

        dumpster3_r1 = new ModelRenderer(this);
        dumpster3_r1.setTextureSize(256, 256);
        dumpster3_r1.mirror = true;
        dumpster3_r1.setRotationPoint(0.0F, -28.0023F, 7.7292F);
        dumpster.addChild(dumpster3_r1);
        setRotation(dumpster3_r1, 1.8218F, 0.0F, 0.0F);
        dumpster3_r1.setTextureOffset(0, 0).addBox(-26.0F, -17.0F, -7.0F, 36.0F, 15.0F, 2.0F, 0.0F);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha) {
        dumpster.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
