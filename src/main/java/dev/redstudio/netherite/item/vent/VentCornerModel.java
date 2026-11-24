
package dev.redstudio.netherite.item.vent;

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
public final class VentCornerModel extends EntityModel<Entity> {

    private final ModelRenderer vent;
    private final ModelRenderer vent3_r1;

    public VentCornerModel() {
        textureWidth = 128;
        textureHeight = 128;

        vent = new ModelRenderer(this);
        vent.setTextureSize(128, 128);
        vent.mirror = true;
        vent.setRotationPoint(0.0F, 24.0F, 0.0F);
        vent.setTextureOffset(0, 0).addBox(-7.0F, -15.0F, 7.0F, 14.0F, 14.0F, 1.0F, 0.0F);
        vent.setTextureOffset(0, 0).addBox(-8.0F, -15.0F, -7.0F, 15.0F, 14.0F, 14.0F, 0.0F);

        vent3_r1 = new ModelRenderer(this);
        vent3_r1.setTextureSize(128, 128);
        vent3_r1.mirror = true;
        vent3_r1.setRotationPoint(-3.3995F, 0.0F, -6.7929F);
        vent.addChild(vent3_r1);
        setRotation(vent3_r1, 0.0F, -0.7854F, 0.0F);
        vent3_r1.setTextureOffset(0, 40).addBox(6.6F, -15.5F, -7.5F, 1.0F, 15.0F, 20.0F, 0.0F);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha) {
        vent.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
