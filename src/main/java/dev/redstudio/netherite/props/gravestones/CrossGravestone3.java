
package dev.redstudio.netherite.props.gravestones;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class CrossGravestone3 extends EntityModel<Entity> {

    private final ModelRenderer bone;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;

    public CrossGravestone3() {
        textureWidth = 64;
        textureHeight = 64;

        bone = new ModelRenderer(this);
        bone.setTextureSize(64, 64);
        bone.setRotationPoint(-6.0F, 24.0F, -4.0F);

        bone.setTextureOffset(0, 6);
        bone.addBox(0.0F, -2.0F, 1.0F, 12, 2, 6, 0.0F);

        bone.setTextureOffset(12, 14);
        bone.addBox(1.0F, -4.0F, 2.0F, 10, 2, 4, 0.0F);

        bone.setTextureOffset(0, 14);
        bone.addBox(4.5F, -24.0F, 2.5F, 3, 20, 3, 0.0F);

        bone.setTextureOffset(0, 0);
        bone.addBox(-2.0F, -19.0F, 2.501F, 16, 3, 3, 0.0F);

        bone3 = new ModelRenderer(this);
        bone3.setTextureSize(64, 64);
        bone3.setRotationPoint(4.5F, -23.0F, 2.5F);
        bone.addChild(bone3);
        setRotation(bone3, 0.0F, 0.0F, -1.9897F);

        bone3.setTextureOffset(30, 6);
        bone3.addBox(-2.0F, -3.0F, 0.499F, 2, 3, 2, 0.0F);

        bone3.setTextureOffset(12, 28);
        bone3.addBox(-11.21F, -1.7368F, 0.499F, 2, 3, 2, 0.0F);

        bone3.setTextureOffset(20, 22);
        bone3.addBox(-6.4865F, 2.7744F, 0.5F, 3, 2, 2, 0.0F);

        bone3.setTextureOffset(12, 20);
        bone3.addBox(-7.68F, -6.5F, 0.5F, 3, 2, 2, 0.0F);

        bone4 = new ModelRenderer(this);
        bone4.setTextureSize(64, 64);
        bone4.setRotationPoint(7.5F, -23.0F, 2.5F);
        bone.addChild(bone4);
        setRotation(bone4, 0.0F, 0.0F, 1.9897F);

        bone4.setTextureOffset(20, 30);
        bone4.addBox(0.0F, -3.0F, 0.499F, 2, 3, 2, 0.0F);

        bone4.setTextureOffset(12, 24);
        bone4.addBox(3.4859F, 2.7895F, 0.5F, 3, 2, 2, 0.0F);

        bone4.setTextureOffset(20, 26);
        bone4.addBox(4.6981F, -6.4452F, 0.5F, 3, 2, 2, 0.0F);

        bone4.setTextureOffset(28, 28);
        bone4.addBox(9.1788F, -1.7008F, 0.499F, 2, 3, 2, 0.0F);
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
