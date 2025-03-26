package dev.redstudio.netherite.item.barrier;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.Entity;

public class BarrierModel extends EntityModel<Entity> {
    private final ModelRenderer bone3;
    private final ModelRenderer bone5;
    private final ModelRenderer bone4;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;

    public BarrierModel() {
        textureWidth = 90;
        textureHeight = 90;

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(4.5F, 21.0F, 0.0F);
        setRotationAngle(bone3, 0.0F, 0.0F, 0.6981F);
        bone3.setTextureOffset(44, 44).addBox(-3.4421F, -0.8409F, -7.999F, 6, 3, 16, 0.0F, false);

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(4.5F, 21.0F, 0.0F);
        setRotationAngle(bone5, 0.0F, 0.0F, -0.6981F);
        bone5.setTextureOffset(40, 0).addBox(-9.4523F, -6.626F, -7.999F, 6, 3, 16, 0.0F, false);

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(-2.7057F, 19.2234F, 0.0F);
        setRotationAngle(bone4, 0.0F, 0.0F, 0.0873F);
        bone4.setTextureOffset(24, 24).addBox(-0.5019F, -9.0436F, -8.001F, 2, 12, 16, 0.0F, false);

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(-3.0F, 27.75F, 13.0F);
        setRotationAngle(bone6, 0.0F, 0.0F, -0.0873F);
        bone6.setTextureOffset(0, 36).addBox(4.6621F, -17.0285F, -21.001F, 2, 12, 16, 0.0F, false);

        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone7.setTextureOffset(38, 8).addBox(-7.0F, -2.0F, 4.0F, 5, 2, 4, 0.0F, false);
        bone7.setTextureOffset(24, 6).addBox(2.0F, -2.0F, 4.0F, 5, 2, 4, 0.0F, false);
        bone7.setTextureOffset(38, 2).addBox(-7.0F, -2.0F, -8.0F, 5, 2, 4, 0.0F, false);
        bone7.setTextureOffset(0, 29).addBox(2.0F, -2.0F, -8.0F, 5, 2, 4, 0.0F, false);
        bone7.setTextureOffset(18, 29).addBox(-7.0F, -2.0F, -2.0F, 5, 2, 4, 0.0F, false);
        bone7.setTextureOffset(0, 9).addBox(-7.0F, -2.0F, 2.0F, 5, 1, 2, 0.0F, false);
        bone7.setTextureOffset(0, 6).addBox(-7.0F, -2.0F, -4.0F, 5, 1, 2, 0.0F, false);
        bone7.setTextureOffset(0, 3).addBox(2.0F, -2.0F, -4.0F, 5, 1, 2, 0.0F, false);
        bone7.setTextureOffset(0, 0).addBox(2.0F, -2.0F, 2.0F, 5, 1, 2, 0.0F, false);
        bone7.setTextureOffset(24, 0).addBox(2.0F, -2.0F, -2.0F, 5, 2, 4, 0.0F, false);
        bone7.setTextureOffset(0, 0).addBox(-2.0397F, -13.9737F, -8.01F, 4, 13, 16, 0.0F, false);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        // Usually empty unless animated
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        bone3.render(matrixStack, buffer, packedLight, packedOverlay);
        bone5.render(matrixStack, buffer, packedLight, packedOverlay);
        bone4.render(matrixStack, buffer, packedLight, packedOverlay);
        bone6.render(matrixStack, buffer, packedLight, packedOverlay);
        bone7.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

