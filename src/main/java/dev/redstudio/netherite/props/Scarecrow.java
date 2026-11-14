
package dev.redstudio.netherite.props;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class Scarecrow extends EntityModel<Entity> {

    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;
    private final ModelRenderer bone9;
    private final ModelRenderer bone10;
    private final ModelRenderer bone11;
    private final ModelRenderer bone12;
    private final ModelRenderer bone13;
    private final ModelRenderer bone14;
    private final ModelRenderer bone15;
    private final ModelRenderer bone16;
    private final ModelRenderer bone17;
    private final ModelRenderer bone18;
    private final ModelRenderer bone19;

    public Scarecrow() {
        textureWidth = 150;
        textureHeight = 150;

        bone2 = new ModelRenderer(this);
        bone2.setTextureSize(textureWidth, textureHeight);
        bone2.setRotationPoint(-1.0F, -5.0F, -2.0F);
        setRotation(bone2, 0.0F, 0.0F, -0.0175F);

        bone3 = new ModelRenderer(this);
        bone3.setTextureSize(textureWidth, textureHeight);
        bone3.setRotationPoint(0.0F, -3.75F, 2.0F);
        bone2.addChild(bone3);
        setRotation(bone3, -0.0175F, -0.1047F, 0.0F);
        bone3.setTextureOffset(0, 86).addBox(-1.0105F, -7.9983F, -0.0994F, 3, 41, 3, 0.0F);

        bone = new ModelRenderer(this);
        bone.setTextureSize(textureWidth, textureHeight);
        bone.setRotationPoint(4.0F, -7.0F, -4.0F);
        bone2.addChild(bone);
        setRotation(bone, 0.1571F, 0.0F, 0.0F);
        bone.setTextureOffset(0, 37).addBox(-12.0F, -16.0F, 0.0F, 16, 16, 16, -2.5F);

        bone4 = new ModelRenderer(this);
        bone4.setTextureSize(textureWidth, textureHeight);
        bone4.setRotationPoint(-18.0F, -9.5F, -1.0F);
        bone2.addChild(bone4);
        setRotation(bone4, -0.1047F, -0.1047F, 0.0349F);
        bone4.setTextureOffset(0, 0).addBox(-6.0F, -1.0F, 0.0F, 49, 3, 3, 0.0F);

        bone5 = new ModelRenderer(this);
        bone5.setTextureSize(textureWidth, textureHeight);
        bone5.setRotationPoint(3.9F, -20.1F, -5.65F);
        bone2.addChild(bone5);
        setRotation(bone5, 0.1525F, -0.07F, -0.0868F);

        bone6 = new ModelRenderer(this);
        bone6.setTextureSize(textureWidth, textureHeight);
        bone5.addChild(bone6);
        bone6.setTextureOffset(60, 71).addBox(-7.0F, -1.0F, 0.0F, 7, 1, 16, 0.1F);
        bone6.setTextureOffset(78, 59).addBox(-11.5F, -1.0F, 4.5F, 16, 1, 7, 0.1F);

        bone7 = new ModelRenderer(this);
        bone7.setTextureSize(textureWidth, textureHeight);
        bone7.setRotationPoint(-0.25F, 0.0F, 0.0F);
        bone6.addChild(bone7);
        setRotation(bone7, 0.0F, 0.7854F, 0.0F);
        bone7.setTextureOffset(78, 51).addBox(-16.0F, -1.01F, 0.0F, 16, 1, 7, 0.1F);
        bone7.setTextureOffset(30, 70).addBox(-11.4194F, -1.02F, -4.6315F, 7, 1, 16, 0.1F);

        bone8 = new ModelRenderer(this);
        bone8.setTextureSize(textureWidth, textureHeight);
        bone8.setRotationPoint(0.0F, -8.7F, 6.0F);
        bone5.addChild(bone8);
        bone8.setTextureOffset(80, 22).addBox(-7.0F, -1.0F, -1.0F, 7, 1, 7, 0.1F);

        bone9 = new ModelRenderer(this);
        bone9.setTextureSize(textureWidth, textureHeight);
        bone9.setRotationPoint(0.0F, -1.0F, -1.0F);
        bone8.addChild(bone9);
        setRotation(bone9, -0.2618F, 0.0F, 0.0F);
        bone9.setTextureOffset(52, 88).addBox(-7.0F, 0.0F, 0.0F, 7, 9, 3, 0.1F);

        bone10 = new ModelRenderer(this);
        bone10.setTextureSize(textureWidth, textureHeight);
        bone10.setRotationPoint(0.0F, -1.0F, 6.0F);
        bone8.addChild(bone10);
        setRotation(bone10, 0.2618F, 0.0F, 0.0F);
        bone10.setTextureOffset(32, 87).addBox(-7.0F, 0.0F, -3.0F, 7, 9, 3, 0.1F);

        bone11 = new ModelRenderer(this);
        bone11.setTextureSize(textureWidth, textureHeight);
        bone11.setRotationPoint(0.0F, -1.0F, -1.0F);
        bone8.addChild(bone11);
        setRotation(bone11, 0.0F, 0.0F, -0.2618F);
        bone11.setTextureOffset(12, 86).addBox(-3.0F, 0.0F, 0.0F, 3, 9, 7, 0.1F);

        bone12 = new ModelRenderer(this);
        bone12.setTextureSize(textureWidth, textureHeight);
        bone12.setRotationPoint(-7.0F, -1.0F, -1.0F);
        bone8.addChild(bone12);
        setRotation(bone12, 0.0F, 0.0F, 0.2618F);
        bone12.setTextureOffset(80, 6).addBox(0.0F, 0.0F, 0.0F, 3, 9, 7, 0.1F);

        bone13 = new ModelRenderer(this);
        bone13.setTextureSize(textureWidth, textureHeight);
        bone13.setRotationPoint(0.0F, -7.5F, -5.0F);
        bone2.addChild(bone13);
        setRotation(bone13, 0.3142F, -0.1396F, 0.0F);
        bone13.setTextureOffset(0, 69).addBox(-1.0086F, -0.5242F, -0.1533F, 7, 1, 16, 0.0F);

        bone14 = new ModelRenderer(this);
        bone14.setTextureSize(textureWidth, textureHeight);
        bone14.setRotationPoint(-6.6843F, -8.6999F, -3.8F);
        bone2.addChild(bone14);
        setRotation(bone14, 0.3142F, 0.3316F, 0.1047F);
        bone14.setTextureOffset(48, 53).addBox(-1.0083F, -0.5254F, -0.1572F, 7, 1, 16, 0.0F);

        bone15 = new ModelRenderer(this);
        bone15.setTextureSize(textureWidth, textureHeight);
        bone15.setRotationPoint(-11.75F, -10.15F, 1.95F);
        bone2.addChild(bone15);
        setRotation(bone15, 0.2269F, 0.9076F, 0.1745F);
        bone15.setTextureOffset(48, 37).addBox(-3.0F, -1.0F, 0.0F, 9, 1, 13, 0.0F);

        bone16 = new ModelRenderer(this);
        bone16.setTextureSize(textureWidth, textureHeight);
        bone16.setRotationPoint(9.25F, -8.05F, -2.8F);
        bone2.addChild(bone16);
        setRotation(bone16, 0.6283F, -1.0996F, -0.5411F);
        bone16.setTextureOffset(79, 37).addBox(-1.0F, -1.0F, 0.0F, 11, 1, 10, 0.0F);

        bone17 = new ModelRenderer(this);
        bone17.setTextureSize(textureWidth, textureHeight);
        bone17.setRotationPoint(20.0F, -9.6F, 2.5F);
        bone2.addChild(bone17);
        setRotation(bone17, 0.0F, -0.1047F, 0.0297F);
        bone17.setTextureOffset(0, 31).addBox(-40.0F, 0.0F, 0.0F, 40, 1, 5, 0.0F);

        bone18 = new ModelRenderer(this);
        bone18.setTextureSize(textureWidth, textureHeight);
        bone18.setRotationPoint(0.0F, 1.0F, 0.0F);
        bone17.addChild(bone18);
        setRotation(bone18, 0.0349F, 0.0F, -0.0175F);
        bone18.setTextureOffset(0, 6).addBox(-40.0F, -1.0F, 0.0F, 40, 25, 0, 0.0F);
        bone18.setTextureOffset(51, 102).addBox(-40.0F, 24.0F, 0.0F, 40, 7, 0, 0.0F);

        bone19 = new ModelRenderer(this);
        bone19.setTextureSize(textureWidth, textureHeight);
        bone19.setRotationPoint(-39.9865F, 1.9923F, 5.0072F);
        bone17.addChild(bone19);
        setRotation(bone19, 0.0349F, 3.1416F, -0.0175F);
        bone19.setTextureOffset(0, 6).addBox(-40.0F, -1.0F, 0.0F, 40, 25, 0, 0.0F);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha) {
        bone2.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
