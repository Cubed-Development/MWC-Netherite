
package dev.redstudio.netherite.item.containers.filing_cabinet_open;

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
public final class FilingCabinetOpenedModel extends EntityModel<Entity> {

    private final ModelRenderer bone;
    private final ModelRenderer cabinet5_r1;
    private final ModelRenderer cabinet3_r1;
    private final ModelRenderer cabinet7_r1;

    public FilingCabinetOpenedModel() {
        textureWidth = 256;
        textureHeight = 256;

        bone = new ModelRenderer(this);
        bone.setTextureSize(256, 256);
        bone.mirror = true;
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-6.5F, -16.0F, -6.5F, 13.0F, 16.0F, 14.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-5.5F, -8.0F, -6.7F, 11.0F, 6.0F, 1.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-5.5F, -14.5F, -10.7F, 11.0F, 6.0F, 1.0F, 0.0F);
        bone.setTextureOffset(0, 50).addBox(-5.0F, -13.0F, -9.7F, 10.0F, 4.0F, 4.0F, 0.0F);

        cabinet5_r1 = new ModelRenderer(this);
        cabinet5_r1.setTextureSize(256, 256);
        cabinet5_r1.mirror = true;
        cabinet5_r1.setRotationPoint(0.0F, -1.8123F, 1.7274F);
        bone.addChild(cabinet5_r1);
        setRotation(cabinet5_r1, 0.1487F, 0.0F, 0.0F);
        cabinet5_r1.setTextureOffset(0, 0).addBox(-2.5F, -12.5F, -11.3F, 5.0F, 2.0F, 1.0F, 0.0F);

        cabinet3_r1 = new ModelRenderer(this);
        cabinet3_r1.setTextureSize(256, 256);
        cabinet3_r1.mirror = true;
        cabinet3_r1.setRotationPoint(0.0F, -1.1478F, 0.8084F);
        bone.addChild(cabinet3_r1);
        setRotation(cabinet3_r1, 0.1487F, 0.0F, 0.0F);
        cabinet3_r1.setTextureOffset(0, 0).addBox(-2.5F, -6.0F, -7.3F, 5.0F, 2.0F, 1.0F, 0.0F);

        cabinet7_r1 = new ModelRenderer(this);
        cabinet7_r1.setTextureSize(256, 256);
        cabinet7_r1.mirror = true;
        cabinet7_r1.setRotationPoint(0.0F, 0.9951F, -1.574F);
        bone.addChild(cabinet7_r1);
        setRotation(cabinet7_r1, -0.1115F, 0.0F, 0.0F);
        cabinet7_r1.setTextureOffset(0, 100).addBox(-4.5F, -13.6F, -9.7F, 9.0F, 1.0F, 4.0F, 0.0F);
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
