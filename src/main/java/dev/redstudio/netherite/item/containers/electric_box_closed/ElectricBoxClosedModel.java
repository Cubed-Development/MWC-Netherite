
package dev.redstudio.netherite.item.containers.electric_box_closed;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public final class ElectricBoxClosedModel extends EntityModel<Entity> {

    private final ModelRenderer ElectricBox;
    private final ModelRenderer bone3_r1;
    private final ModelRenderer bone2_r1;
    private final ModelRenderer bone_r1;

    public ElectricBoxClosedModel() {
        textureWidth = 128;
        textureHeight = 128;

        ElectricBox = new ModelRenderer(this, 18, 16);
        ElectricBox.setTextureSize(128, 128);
        ElectricBox.setRotationPoint(0.0F, 24.0F, 0.0F);
        ElectricBox.addBox(-5.0F, -24.0F, 4.0F, 10, 14, 4);

        bone3_r1 = new ModelRenderer(this, 20, 34);
        bone3_r1.setTextureSize(128, 128);
        bone3_r1.setRotationPoint(-4.9498F, 0.0F, 2.0503F);
        ElectricBox.addChild(bone3_r1);
        setRotation(bone3_r1, 0.0F, 0.7854F, 0.0F);
        bone3_r1.addBox(-0.5F, -10.0F, 6.0F, 1, 13, 2);

        bone2_r1 = new ModelRenderer(this, 0, 49);
        bone2_r1.setTextureSize(128, 128);
        bone2_r1.setRotationPoint(4.9498F, 0.0F, 2.0503F);
        ElectricBox.addChild(bone2_r1);
        setRotation(bone2_r1, 0.0F, -0.7854F, 0.0F);
        bone2_r1.addBox(-0.5F, -10.0F, 6.0F, 1, 13, 2);

        bone_r1 = new ModelRenderer(this, 24, 70);
        bone_r1.setTextureSize(128, 128);
        bone_r1.setRotationPoint(2.0528F, 0.0F, 7.8552F);
        ElectricBox.addChild(bone_r1);
        setRotation(bone_r1, 3.1416F, 0.0F, -3.1416F);

        bone_r1.addBox(4.3506F, -18.5F, 3.563F, 1, 3, 1);

        bone_r1.setTextureOffset(0, 74);
        bone_r1.addBox(-1.9864F, -11.5F, 3.444F, 1, 1, 1);

        bone_r1.setTextureOffset(4, 74);
        bone_r1.addBox(-1.9864F, -23.5F, 3.444F, 1, 1, 1);

        bone_r1.setTextureOffset(20, 0);
        bone_r1.addBox(-1.7722F, -24.01F, 3.2594F, 8, 14, 1);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing,
                                  float limbSwingAmount, float ageInTicks,
                                  float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer,
                       int packedLight, int packedOverlay,
                       float red, float green, float blue, float alpha) {
        ElectricBox.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
