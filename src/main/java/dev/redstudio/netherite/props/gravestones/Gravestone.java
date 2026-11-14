
package dev.redstudio.netherite.props.gravestones;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class Gravestone extends EntityModel<Entity> {

    private final ModelRenderer bone;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;
    private final ModelRenderer bone2;
    private final ModelRenderer bone5;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;

    public Gravestone() {
        textureWidth = 64;
        textureHeight = 64;

        bone = new ModelRenderer(this);
        bone.setTextureSize(64, 64);
        bone.setRotationPoint(0.0F, 24.0F, -3.5F);

        bone.setTextureOffset(0, 0);
        bone.addBox(-6.0F, -2.0F, 0.0F, 12, 2, 7, 0.0F);

        bone.setTextureOffset(22, 22);
        bone.addBox(-5.0F, -3.0F, 0.5F, 10, 1, 6, 0.0F);

        bone.setTextureOffset(28, 9);
        bone.addBox(-3.5F, -17.75F, 1.5F, 7, 1, 4, 0.0F);

        bone.setTextureOffset(0, 9);
        bone.addBox(-5.0F, -15.9F, 1.5F, 10, 14, 4, -0.2F);

        bone.setTextureOffset(0, 27);
        bone.addBox(-4.0F, -17.1F, 1.499F, 8, 2, 4, -0.2F);

        bone6 = new ModelRenderer(this);
        bone6.setTextureSize(64, 64);
        bone6.setRotationPoint(-3.5F, -17.75F, 1.5F);
        bone.addChild(bone6);
        setRotation(bone6, 0.0F, 0.0F, -1.0647F);

        bone6.setTextureOffset(31, 0);
        bone6.addBox(-2.0F, 0.0F, -0.001F, 2, 1, 4, 0.0F);

        bone7 = new ModelRenderer(this);
        bone7.setTextureSize(64, 64);
        bone7.setRotationPoint(3.5F, -17.75F, 1.5F);
        bone.addChild(bone7);
        setRotation(bone7, 0.0F, 0.0F, 1.0647F);

        bone7.setTextureOffset(28, 14);
        bone7.addBox(0.0F, 0.0F, -0.001F, 2, 1, 4, 0.0F);

        bone2 = new ModelRenderer(this);
        bone2.setTextureSize(64, 64);
        bone2.setRotationPoint(-5.75F, -15.0F, 1.0F);
        bone.addChild(bone2);
        setRotation(bone2, 0.0F, 0.0F, -0.0698F);

        bone2.setTextureOffset(30, 30);
        bone2.addBox(0.0F, 0.0F, 0.5F, 1, 13, 4, 0.0F);

        bone5 = new ModelRenderer(this);
        bone5.setTextureSize(64, 64);
        bone5.setRotationPoint(-5.75F, -15.0F, 1.0F);
        bone.addChild(bone5);
        setRotation(bone5, 0.0F, 0.0F, -0.6981F);

        bone5.setTextureOffset(0, 33);
        bone5.addBox(0.0F, 0.0F, 0.501F, 2, 1, 4, 0.0F);

        bone3 = new ModelRenderer(this);
        bone3.setTextureSize(64, 64);
        bone3.setRotationPoint(5.75F, -15.0F, 1.0F);
        bone.addChild(bone3);
        setRotation(bone3, 0.0F, 0.0F, 0.0698F);

        bone3.setTextureOffset(20, 29);
        bone3.addBox(-1.0F, 0.0F, 0.5F, 1, 13, 4, 0.0F);

        bone4 = new ModelRenderer(this);
        bone4.setTextureSize(64, 64);
        bone4.setRotationPoint(5.75F, -15.0F, 1.0F);
        bone.addChild(bone4);
        setRotation(bone4, 0.0F, 0.0F, 0.6981F);

        bone4.setTextureOffset(8, 34);
        bone4.addBox(-2.0F, 0.0F, 0.501F, 2, 1, 4, 0.0F);
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
