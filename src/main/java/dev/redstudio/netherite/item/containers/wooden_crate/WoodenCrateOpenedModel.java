
package dev.redstudio.netherite.item.containers.wooden_crate;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class WoodenCrateOpenedModel extends EntityModel<Entity> {

    private final ModelRenderer woodenCrateOpened;
    private final ModelRenderer bone_r1;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone11;
    private final ModelRenderer bone12;
    private final ModelRenderer bone13;
    private final ModelRenderer bone14;
    private final ModelRenderer bone10;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;
    private final ModelRenderer bone9;

    public WoodenCrateOpenedModel() {
        textureWidth = 256;
        textureHeight = 256;

        woodenCrateOpened = new ModelRenderer(this);
        woodenCrateOpened.setTextureSize(textureWidth, textureHeight);
        woodenCrateOpened.setRotationPoint(0.0F, 24.0F, 0.0F);

        bone_r1 = new ModelRenderer(this);
        bone_r1.setTextureSize(textureWidth, textureHeight);
        bone_r1.setRotationPoint(0.0F, -1.0F, -15.0F);
        woodenCrateOpened.addChild(bone_r1);
        setRotation(bone_r1, -1.5708F, 0.0F, 0.0F);
        bone_r1.setTextureOffset(18, 75).addBox(6.0F, -9.0F, -16.0F, 2, 2, 14, 0.0F);
        bone_r1.setTextureOffset(0, 57).addBox(-8.0F, -9.0F, -16.0F, 2, 2, 14, 0.0F);

        bone2 = new ModelRenderer(this);
        bone2.setTextureSize(textureWidth, textureHeight);
        bone2.setRotationPoint(7.0F, -8.0F, 7.0F);
        woodenCrateOpened.addChild(bone2);
        setRotation(bone2, -1.5708F, 0.0F, 0.0F);
        bone2.setTextureOffset(0, 73).addBox(-1.0F, -1.0F, -9.0F, 2, 2, 14, 0.0F);
        bone2.setTextureOffset(18, 59).addBox(-15.0F, -1.0F, -9.0F, 2, 2, 14, 0.0F);

        bone3 = new ModelRenderer(this);
        bone3.setTextureSize(textureWidth, textureHeight);
        bone3.setRotationPoint(-21.0F, -14.0F, 15.0F);
        woodenCrateOpened.addChild(bone3);
        bone3.setTextureOffset(52, 52).addBox(14.0F, -1.0F, -22.0F, 14, 12, 14, 0.0F);
        bone3.setTextureOffset(0, 89).addBox(27.0F, -3.0F, -21.0F, 2, 2, 12, 0.0F);
        bone3.setTextureOffset(82, 84).addBox(13.0F, -3.0F, -21.0F, 2, 2, 12, 0.0F);
        bone3.setTextureOffset(48, 20).addBox(13.0F, 11.0F, -23.0F, 16, 2, 16, 0.0F);
        bone3.setTextureOffset(36, 57).addBox(15.0F, -3.0F, -23.0F, 12, 2, 2, 0.0F);
        bone3.setTextureOffset(94, 51).addBox(13.0F, 13.0F, -9.0F, 16, 1, 2, 0.0F);
        bone3.setTextureOffset(90, 46).addBox(13.0F, 13.0F, -16.0F, 16, 1, 2, 0.0F);
        bone3.setTextureOffset(66, 17).addBox(13.0F, 13.0F, -23.0F, 16, 1, 2, 0.0F);
        bone3.setTextureOffset(36, 61).addBox(15.0F, -3.0F, -9.0F, 12, 2, 2, 0.0F);

        bone11 = new ModelRenderer(this);
        bone11.setTextureSize(textureWidth, textureHeight);
        bone11.setRotationPoint(24.0F, -4.9167F, -16.0F);
        bone3.addChild(bone11);
        setRotation(bone11, 0.0F, -1.2217F, 0.0F);
        bone11.setTextureOffset(54, 38).addBox(-6.0F, 0.9167F, -6.0F, 12, 1, 12, 0.0F);
        bone11.setTextureOffset(38, 82).addBox(-8.0F, -0.0833F, -6.0F, 2, 2, 12, 0.0F);
        bone11.setTextureOffset(90, 42).addBox(-8.0F, -0.0833F, -8.0F, 16, 2, 2, 0.0F);
        bone11.setTextureOffset(90, 38).addBox(-8.0F, -0.0833F, 6.0F, 16, 2, 2, 0.0F);
        bone11.setTextureOffset(66, 82).addBox(6.0F, -0.0833F, -6.0F, 2, 2, 12, 0.0F);

        bone12 = new ModelRenderer(this);
        bone12.setTextureSize(textureWidth, textureHeight);
        bone12.setRotationPoint(0.0F, 0.6667F, 0.0F);
        bone11.addChild(bone12);
        setRotation(bone12, 0.0F, -0.7854F, 0.0F);
        bone12.setTextureOffset(76, 78).addBox(-9.0F, -0.5F, -1.0F, 18, 2, 2, 0.0F);

        bone13 = new ModelRenderer(this);
        bone13.setTextureSize(textureWidth, textureHeight);
        bone13.setRotationPoint(0.0F, 0.5F, 0.0F);
        bone12.addChild(bone13);
        setRotation(bone13, 0.0F, 1.5708F, 0.0F);

        bone14 = new ModelRenderer(this);
        bone14.setTextureSize(textureWidth, textureHeight);
        bone14.setRotationPoint(0.0F, 0.5F, 0.0F);
        bone12.addChild(bone14);
        setRotation(bone14, 0.0F, 1.5708F, 0.0F);
        bone14.setTextureOffset(36, 78).addBox(-9.0F, -1.01F, -1.0F, 18, 2, 2, 0.0F);

        bone10 = new ModelRenderer(this);
        bone10.setTextureSize(textureWidth, textureHeight);
        bone10.setRotationPoint(20.5F, 7.5F, -4.0F);
        bone3.addChild(bone10);
        setRotation(bone10, -1.0472F, 0.0F, 0.0F);

        bone4 = new ModelRenderer(this);
        bone4.setTextureSize(textureWidth, textureHeight);
        bone4.setRotationPoint(14.0F, 5.0F, -15.0F);
        bone3.addChild(bone4);
        setRotation(bone4, 0.7854F, 0.0F, 0.0F);
        bone4.setTextureOffset(0, 0).addBox(-0.5F, -1.0F, -9.0F, 15, 2, 18, 0.0F);

        bone5 = new ModelRenderer(this);
        bone5.setTextureSize(textureWidth, textureHeight);
        bone5.setRotationPoint(14.25F, 5.0F, -15.0F);
        bone3.addChild(bone5);
        setRotation(bone5, -0.7854F, 0.0F, 0.0F);
        bone5.setTextureOffset(0, 20).addBox(-0.74F, -1.0F, -9.0F, 15, 2, 18, 0.0F);

        bone6 = new ModelRenderer(this);
        bone6.setTextureSize(textureWidth, textureHeight);
        bone6.setRotationPoint(21.0F, 5.0F, -22.0F);
        bone3.addChild(bone6);
        setRotation(bone6, 0.0F, 0.0F, -0.7854F);
        bone6.setTextureOffset(0, 40).addBox(-9.0F, -1.0F, -0.51F, 18, 2, 15, 0.0F);

        bone7 = new ModelRenderer(this);
        bone7.setTextureSize(textureWidth, textureHeight);
        bone7.setRotationPoint(21.0F, 5.0F, -21.75F);
        bone3.addChild(bone7);
        setRotation(bone7, 0.0F, 0.0F, 0.7854F);
        bone7.setTextureOffset(48, 0).addBox(-9.0F, -1.0F, -0.75F, 18, 2, 15, 0.0F);

        bone8 = new ModelRenderer(this);
        bone8.setTextureSize(textureWidth, textureHeight);
        bone8.setRotationPoint(21.0F, -2.0F, 1.0F);
        bone3.addChild(bone8);
        setRotation(bone8, 0.0F, -0.7854F, 0.0F);

        bone9 = new ModelRenderer(this);
        bone9.setTextureSize(textureWidth, textureHeight);
        bone9.setRotationPoint(21.0F, 12.0F, -15.0F);
        bone3.addChild(bone9);
        setRotation(bone9, 0.0F, 0.7854F, 0.0F);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha) {
        woodenCrateOpened.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
