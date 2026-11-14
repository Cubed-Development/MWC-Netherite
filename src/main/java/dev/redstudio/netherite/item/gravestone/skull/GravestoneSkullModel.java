
package dev.redstudio.netherite.item.gravestone.skull;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class GravestoneSkullModel extends EntityModel<Entity> {

    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;

    public GravestoneSkullModel() {
        textureWidth = 64;
        textureHeight = 64;

        bone = new ModelRenderer(this);
        bone.setTextureSize(64, 64);
        bone.setRotationPoint(-6.0F, 24.0F, -3.5F);

        bone.setTextureOffset(0, 21);
        bone.addBox(-1.0F, -2.0F, 0.0F, 14, 2, 7, 0.0F);

        bone.setTextureOffset(0, 30);
        bone.addBox(-0.5F, -3.0F, 1.0F, 13, 1, 5, 0.0F);

        bone.setTextureOffset(0, 36);
        bone.addBox(0.25F, -12.0F, 1.0F, 1, 9, 5, 0.0F);

        bone.setTextureOffset(35, 10);
        bone.addBox(10.75F, -12.0F, 1.0F, 1, 9, 5, 0.0F);

        bone.setTextureOffset(12, 42);
        bone.addBox(11.3F, -17.0F, 1.0F, 1, 5, 5, 0.0F);

        bone.setTextureOffset(38, 39);
        bone.addBox(-0.3F, -17.0F, 1.0F, 1, 5, 5, 0.0F);

        bone.setTextureOffset(45, 45);
        bone.addBox(0.25F, -18.5F, 1.0F, 1, 2, 5, 0.0F);

        bone.setTextureOffset(24, 44);
        bone.addBox(10.75F, -18.5F, 1.0F, 1, 2, 5, 0.0F);

        bone.setTextureOffset(25, 38);
        bone.addBox(4.0F, -20.5F, 1.0F, 4, 1, 5, 0.0F);

        bone.setTextureOffset(0, 0);
        bone.addBox(0.5F, -18.75F, 1.0F, 11, 16, 5, -0.2F);

        bone.setTextureOffset(31, 31);
        bone.addBox(2.0F, -19.75F, 1.001F, 8, 2, 5, -0.2F);

        bone2 = new ModelRenderer(this);
        bone2.setTextureSize(64, 64);
        bone2.setRotationPoint(4.0F, -20.5F, 1.0F);
        bone.addChild(bone2);
        setRotation(bone2, 0.0F, 0.0F, -0.4712F);

        bone2.setTextureOffset(37, 25);
        bone2.addBox(-4.0F, 0.0F, -0.001F, 4, 1, 5, 0.0F);

        bone3 = new ModelRenderer(this);
        bone3.setTextureSize(64, 64);
        bone3.setRotationPoint(8.0F, -20.5F, 1.0F);
        bone.addChild(bone3);
        setRotation(bone3, 0.0F, 0.0F, 0.4712F);

        bone3.setTextureOffset(12, 36);
        bone3.addBox(0.0F, 0.0F, -0.001F, 4, 1, 5, 0.0F);

        bone4 = new ModelRenderer(this);
        bone4.setTextureSize(64, 64);
        bone4.setRotationPoint(9.0F, -11.0F, 0.0F);
        bone.addChild(bone4);
        setRotation(bone4, 0.1571F, 0.0F, 0.0F);

        bone4.setTextureOffset(32, 0);
        bone4.addBox(-6.0F, -6.0F, 0.0F, 6, 6, 4, 0.0F);
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
