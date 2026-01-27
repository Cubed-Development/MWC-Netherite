package dev.redstudio.netherite.item.sandbag.basic;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SandbagModel extends EntityModel<Entity> {

    private final ModelRenderer Sandbag;
    private final ModelRenderer bone2;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone3;
    private final ModelRenderer bone;

    public SandbagModel() {
        textureWidth = 64;
        textureHeight = 64;

        Sandbag = new ModelRenderer(this);
        Sandbag.setRotationPoint(0.0F, 24.0F, 0.0F);
        Sandbag.setTextureOffset(0, 0)
                .addBox(-8.0F, -4.9F, -4.5F, 16, 4, 8, 0.0F);

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(0.0F, -6.3F, -0.5F);
        Sandbag.addChild(bone2);
        setRotation(bone2, -0.1222F, 0.0F, 0.0873F);
        bone2.setTextureOffset(28, 30)
                .addBox(0.0396F, 0.0F, 0.0F, 8, 2, 4, -0.001F);

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(0.0F, -6.3F, -0.5F);
        Sandbag.addChild(bone4);
        setRotation(bone4, 0.1222F, 0.0F, 0.0873F);
        bone4.setTextureOffset(28, 18)
                .addBox(0.0396F, 0.0F, -4.0F, 8, 2, 4, -0.001F);

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(0.0F, -6.3F, -0.5F);
        Sandbag.addChild(bone5);
        setRotation(bone5, 0.1222F, 0.0F, -0.0873F);
        bone5.setTextureOffset(24, 12)
                .addBox(-7.9604F, 0.0F, -4.0F, 8, 2, 4, -0.001F);

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(0.0F, -6.3F, -0.5F);
        Sandbag.addChild(bone6);
        setRotation(bone6, -0.1222F, 0.0F, -0.0873F);
        bone6.setTextureOffset(24, 24)
                .addBox(-7.9604F, 0.0F, 0.0F, 8, 2, 4, -0.001F);

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(0.1F, -8.0F, -1.0F);
        Sandbag.addChild(bone3);
        setRotation(bone3, 0.0F, 0.0F, 0.0873F);
        bone3.setTextureOffset(0, 22)
                .addBox(-7.403F, 6.1725F, -3.5F, 8, 2, 8, -0.001F);

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, -7.0F, 0.0F);
        Sandbag.addChild(bone);
        setRotation(bone, 0.0F, 0.0F, -0.0873F);
        bone.setTextureOffset(0, 12)
                .addBox(-0.6576F, 5.1672F, -4.5F, 8, 2, 8, -0.001F);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
        // static model – no animation
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer,
                       int packedLight, int packedOverlay,
                       float red, float green, float blue, float alpha) {
        Sandbag.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
