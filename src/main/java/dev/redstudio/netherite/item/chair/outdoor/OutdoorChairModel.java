
package dev.redstudio.netherite.item.chair.outdoor;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class OutdoorChairModel extends EntityModel<Entity> {

    private final ModelRenderer bone;
    private final ModelRenderer chair14_r1;
    private final ModelRenderer chair13_r1;
    private final ModelRenderer chair12_r1;
    private final ModelRenderer chair8_r1;
    private final ModelRenderer chair7_r1;
    private final ModelRenderer chair5_r1;
    private final ModelRenderer chair4_r1;

    public OutdoorChairModel() {
        textureWidth = 128;
        textureHeight = 128;

        bone = new ModelRenderer(this);
        bone.setTextureSize(textureWidth, textureHeight);
        bone.mirror = true;
        bone.setRotationPoint(15.2039F, 21.1616F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-21.2039F, -8.1616F, -6.0F, 12, 3, 12, 0.0F);
        bone.setTextureOffset(0, 50).addBox(-22.2039F, -7.1616F, -6.0F, 1, 3, 12, 0.0F);
        bone.setTextureOffset(0, 50).addBox(-9.2039F, -7.1616F, -6.0F, 1, 3, 12, 0.0F);

        chair14_r1 = new ModelRenderer(this);
        chair14_r1.setTextureSize(textureWidth, textureHeight);
        chair14_r1.mirror = true;
        chair14_r1.setRotationPoint(-29.5283F, -0.9927F, 0.0F);
        bone.addChild(chair14_r1);
        setRotation(chair14_r1, 0.0F, 0.0F, 1.45F);
        chair14_r1.setTextureOffset(0, 50).addBox(-9.4F, -9.9F, -6.4F, 1, 2, 13, 0.0F);

        chair13_r1 = new ModelRenderer(this);
        chair13_r1.setTextureSize(textureWidth, textureHeight);
        chair13_r1.mirror = true;
        bone.addChild(chair13_r1);
        setRotation(chair13_r1, 0.0F, 0.0F, -1.45F);
        chair13_r1.setTextureOffset(0, 50).addBox(9.3F, -10.9F, -6.4F, 1, 2, 13, 0.0F);
        chair13_r1.setTextureOffset(0, 50).addBox(6.0F, -10.0F, -6.3F, 4, 1, 2, 0.0F);

        chair12_r1 = new ModelRenderer(this);
        chair12_r1.setTextureSize(textureWidth, textureHeight);
        chair12_r1.mirror = true;
        chair12_r1.setRotationPoint(-30.4077F, 0.0F, 0.0F);
        bone.addChild(chair12_r1);
        setRotation(chair12_r1, 0.0F, 0.0F, 1.45F);
        chair12_r1.setTextureOffset(0, 50).addBox(-10.0F, -10.0F, -6.3F, 4, 1, 2, 0.0F);

        chair8_r1 = new ModelRenderer(this);
        chair8_r1.setTextureSize(textureWidth, textureHeight);
        chair8_r1.mirror = true;
        chair8_r1.setRotationPoint(-15.2039F, -10.9008F, 14.1892F);
        bone.addChild(chair8_r1);
        setRotation(chair8_r1, 2.8256F, 0.0F, 0.0F);
        chair8_r1.setTextureOffset(0, 0).addBox(-6.0F, -8.0F, 6.0F, 12, 12, 2, 0.0F);

        chair7_r1 = new ModelRenderer(this);
        chair7_r1.setTextureSize(textureWidth, textureHeight);
        chair7_r1.mirror = true;
        chair7_r1.setRotationPoint(-15.2039F, 3.5198F, 2.3163F);
        bone.addChild(chair7_r1);
        setRotation(chair7_r1, 0.2231F, 0.0F, 0.0F);
        chair7_r1.setTextureOffset(0, 50).addBox(-6.9F, -10.0F, 4.2F, 2, 11, 2, 0.0F);
        chair7_r1.setTextureOffset(0, 50).addBox(5.1F, -10.0F, 4.2F, 2, 11, 2, 0.0F);

        chair5_r1 = new ModelRenderer(this);
        chair5_r1.setTextureSize(textureWidth, textureHeight);
        chair5_r1.mirror = true;
        chair5_r1.setRotationPoint(-16.3481F, 3.3328F, 0.0F);
        bone.addChild(chair5_r1);
        setRotation(chair5_r1, 0.0F, 0.0F, 0.1115F);
        chair5_r1.setTextureOffset(0, 50).addBox(-7.0F, -10.0F, -6.3F, 2, 11, 2, 0.0F);

        chair4_r1 = new ModelRenderer(this);
        chair4_r1.setTextureSize(textureWidth, textureHeight);
        chair4_r1.mirror = true;
        chair4_r1.setRotationPoint(-14.0598F, 3.3328F, 0.0F);
        bone.addChild(chair4_r1);
        setRotation(chair4_r1, 0.0F, 0.0F, -0.1115F);
        chair4_r1.setTextureOffset(0, 50).addBox(5.0F, -10.0F, -6.3F, 2, 11, 2, 0.0F);
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
