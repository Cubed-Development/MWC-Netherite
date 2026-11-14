
package dev.redstudio.netherite.props;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class SCPLocker extends EntityModel<Entity> {

    private final ModelRenderer bone;
    private final ModelRenderer locker13_r1;
    private final ModelRenderer locker12_r1;

    public SCPLocker() {
        textureWidth = 256;
        textureHeight = 256;

        bone = new ModelRenderer(this);
        bone.setTextureSize(textureWidth, textureHeight);
        bone.mirror = true;
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-6.5F, -45.0F, -7.0F, 1, 45, 14, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-5.5F, -35.0F, -7.3F, 9, 32, 1, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-5.5F, -44.0F, -7.3F, 1, 9, 1, 0.0F);
        bone.setTextureOffset(0, 0).addBox(4.5F, -44.0F, -7.3F, 1, 9, 1, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-4.5F, -44.0F, -7.3F, 9, 1, 1, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-4.5F, -39.5F, -7.2F, 9, 1, 1, 0.0F);
        bone.setTextureOffset(0, 0).addBox(5.5F, -45.0F, -7.0F, 1, 45, 14, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-6.5F, -45.0F, 6.0F, 12, 45, 1, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-5.5F, -45.4F, -7.0F, 11, 2, 13, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-4.5F, -38.5F, -7.2F, 1, 4, 1, 0.0F);
        bone.setTextureOffset(0, 0).addBox(3.5F, -38.5F, -7.2F, 1, 4, 1, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-2.0F, -43.2F, -7.2F, 4, 1, 1, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-5.5F, -3.0F, -7.0F, 11, 3, 1, 0.0F);
        bone.setTextureOffset(0, 0).addBox(3.5F, -35.0F, -7.3F, 2, 11, 1, 0.0F);
        bone.setTextureOffset(0, 0).addBox(3.5F, -18.0F, -7.3F, 2, 15, 1, 0.0F);
        bone.setTextureOffset(0, 0).addBox(3.5F, -24.0F, -7.1F, 2, 6, 1, 0.0F);
        bone.setTextureOffset(0, 0).addBox(4.0F, -23.5F, -7.3F, 1, 1, 1, 0.0F);
        bone.setTextureOffset(0, 70).addBox(4.0F, -21.5F, -7.2F, 1, 1, 1, 0.0F);
        bone.setTextureOffset(0, 80).addBox(4.0F, -19.5F, -7.2F, 1, 1, 1, 0.0F);
        bone.setTextureOffset(0, 90).addBox(-4.5F, -43.0F, -6.3F, 9, 8, 1, 0.0F);

        locker13_r1 = new ModelRenderer(this);
        locker13_r1.setTextureSize(textureWidth, textureHeight);
        locker13_r1.mirror = true;
        locker13_r1.setRotationPoint(-31.2364F, -22.0813F, 0.0F);
        bone.addChild(locker13_r1);
        setRotation(locker13_r1, 0.0F, 0.0F, 1.0038F);
        locker13_r1.setTextureOffset(0, 0).addBox(-0.5F, -39.5F, -7.2F, 5, 1, 1, 0.0F);

        locker12_r1 = new ModelRenderer(this);
        locker12_r1.setTextureSize(textureWidth, textureHeight);
        locker12_r1.mirror = true;
        locker12_r1.setRotationPoint(31.2363F, -22.0811F, 0.0F);
        bone.addChild(locker12_r1);
        setRotation(locker12_r1, 0.0F, 0.0F, -1.0038F);
        locker12_r1.setTextureOffset(0, 0).addBox(-4.5F, -39.5F, -7.2F, 5, 1, 1, 0.0F);
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
