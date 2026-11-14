
package dev.redstudio.netherite.item.gravestone.cross2;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class CrossGravestone2Model extends EntityModel<Entity> {

    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bb_main;

    public CrossGravestone2Model() {
        textureWidth = 64;
        textureHeight = 64;

        bone = new ModelRenderer(this);
        bone.setTextureSize(64, 64);
        bone.setRotationPoint(-5.5F, 24.0F, -3.5F);

        bone.setTextureOffset(0, 0);
        bone.addBox(-1.0F, -3.0F, 0.0F, 13, 3, 7, 0.0F);

        bone.setTextureOffset(0, 10);
        bone.addBox(0.0F, -14.0F, 1.0F, 11, 11, 5, 0.0F);

        bone.setTextureOffset(25, 27);
        bone.addBox(3.0F, -16.0F, 0.999F, 5, 2, 5, 0.0F);

        bone.setTextureOffset(24, 34);
        bone.addBox(4.5F, -26.0F, 2.499F, 2, 12, 2, 0.0F);

        bone.setTextureOffset(27, 10);
        bone.addBox(2.0F, -23.5F, 2.5F, 7, 2, 2, 0.0F);

        bone.setTextureOffset(0, 26);
        bone.addBox(0.5F, -15.0F, 1.001F, 10, 1, 5, 0.0F);

        bone2 = new ModelRenderer(this);
        bone2.setTextureSize(64, 64);
        bone2.setRotationPoint(5.5F, -17.0F, 1.0F);
        bone.addChild(bone2);
        setRotation(bone2, 0.0F, 0.0F, -1.9373F);

        bone2.setTextureOffset(12, 32);
        bone2.addBox(-1.0F, -7.0F, 0.0F, 1, 7, 5, 0.0F);

        bone3 = new ModelRenderer(this);
        bone3.setTextureSize(64, 64);
        bone3.setRotationPoint(5.5F, -17.0F, 1.0F);
        bone.addChild(bone3);
        setRotation(bone3, 0.0F, 0.0F, 1.9373F);

        bone3.setTextureOffset(0, 32);
        bone3.addBox(0.0F, -7.0F, 0.0F, 1, 7, 5, 0.0F);

        bb_main = new ModelRenderer(this);
        bb_main.setTextureSize(64, 64);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);

        bb_main.setTextureOffset(0, 0);
        bb_main.addBox(-8.0F, -16.0F, -8.0F, 16, 16, 16, 0.0F);
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
