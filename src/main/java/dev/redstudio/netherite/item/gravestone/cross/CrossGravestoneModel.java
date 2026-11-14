package dev.redstudio.netherite.item.gravestone.cross;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class CrossGravestoneModel extends EntityModel<Entity> {

    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;

    public CrossGravestoneModel() {
        textureWidth = 64;
        textureHeight = 64;

        bone = new ModelRenderer(this);
        bone.setTextureSize(64, 64);
        bone.setRotationPoint(-6.0F, 24.0F, -4.0F);

        bone.setTextureOffset(0, 0);
        bone.addBox(0.0F, -2.0F, 1.0F, 12, 2, 6, 0.0F);

        bone.setTextureOffset(8, 33);
        bone.addBox(4.0F, -4.0F, 2.0F, 4, 2, 4, 0.0F);

        bone.setTextureOffset(20, 20);
        bone.addBox(4.0F, -16.0F, 2.5F, 1, 12, 3, 0.0F);

        bone.setTextureOffset(36, 6);
        bone.addBox(4.0F, -24.0F, 2.5F, 1, 6, 3, 0.0F);

        bone.setTextureOffset(12, 14);
        bone.addBox(7.0F, -16.0F, 2.5F, 1, 12, 3, 0.0F);

        bone.setTextureOffset(0, 37);
        bone.addBox(7.0F, -24.0F, 2.5F, 1, 6, 3, 0.0F);

        bone.setTextureOffset(36, 32);
        bone.addBox(5.0F, -24.0F, 2.5F, 2, 1, 3, 0.0F);

        bone.setTextureOffset(0, 14);
        bone.addBox(4.5F, -23.75F, 2.5F, 3, 20, 3, -0.2F);

        bone.setTextureOffset(0, 8);
        bone.addBox(-1.5F, -18.75F, 2.501F, 15, 3, 3, -0.2F);

        bone.setTextureOffset(28, 22);
        bone.addBox(-2.0F, -19.0F, 2.501F, 6, 1, 3, 0.0F);

        bone.setTextureOffset(25, 18);
        bone.addBox(8.0F, -19.0F, 2.501F, 6, 1, 3, 0.0F);

        bone.setTextureOffset(21, 38);
        bone.addBox(13.0F, -18.0F, 2.501F, 1, 2, 3, 0.0F);

        bone.setTextureOffset(37, 37);
        bone.addBox(-2.0F, -18.0F, 2.501F, 1, 2, 3, 0.0F);

        bone.setTextureOffset(28, 28);
        bone.addBox(-2.0F, -16.0F, 2.501F, 6, 1, 3, 0.0F);

        bone.setTextureOffset(20, 14);
        bone.addBox(8.0F, -16.0F, 2.501F, 6, 1, 3, 0.0F);

        bone2 = new ModelRenderer(this);
        bone2.setTextureSize(64, 64);
        bone2.setRotationPoint(4.0F, -4.0F, 2.0F);
        bone.addChild(bone2);
        setRotation(bone2, 0.0F, 0.0F, -0.5585F);

        bone2.setTextureOffset(24, 32);
        bone2.addBox(-4.0F, 0.0F, -0.01F, 4, 2, 4, 0.0F);

        bone3 = new ModelRenderer(this);
        bone3.setTextureSize(64, 64);
        bone3.setRotationPoint(8.0F, -4.0F, 2.0F);
        bone.addChild(bone3);
        setRotation(bone3, 0.0F, 0.0F, 0.5585F);

        bone3.setTextureOffset(30, 0);
        bone3.addBox(0.0F, 0.0F, -0.01F, 4, 2, 4, 0.0F);
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
