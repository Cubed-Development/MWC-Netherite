
package dev.redstudio.netherite.props;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class WoodenCrate extends EntityModel<Entity> {

    private final ModelRenderer WoodenCrate;
    private final ModelRenderer bone6_r1;
    private final ModelRenderer bone5_r1;
    private final ModelRenderer bone4_r1;
    private final ModelRenderer bone3_r1;
    private final ModelRenderer bone2_r1;
    private final ModelRenderer bone_r1;

    public WoodenCrate() {
        textureWidth = 128;
        textureHeight = 128;

        WoodenCrate = new ModelRenderer(this);
        WoodenCrate.setTextureSize(textureWidth, textureHeight);
        WoodenCrate.setRotationPoint(0.0F, 24.0F, 0.0F);
        WoodenCrate.setTextureOffset(82, 82).addBox(-1.0F, -1.0F, -8.0F, 2, 1, 16, 0.0F);
        WoodenCrate.setTextureOffset(62, 70).addBox(6.0F, -3.0F, -8.0F, 2, 3, 16, 0.0F);
        WoodenCrate.setTextureOffset(8, 0).addBox(6.0F, -17.0F, 6.0F, 2, 14, 2, 0.0F);
        WoodenCrate.setTextureOffset(0, 20).addBox(6.0F, -17.0F, -8.0F, 2, 14, 2, 0.0F);
        WoodenCrate.setTextureOffset(8, 20).addBox(-8.0F, -17.0F, -8.0F, 2, 14, 2, 0.0F);
        WoodenCrate.setTextureOffset(0, 40).addBox(-7.0F, -16.0F, -7.0F, 14, 14, 14, 0.0F);
        WoodenCrate.setTextureOffset(0, 0).addBox(-8.0F, -17.0F, 6.0F, 2, 14, 2, 0.0F);
        WoodenCrate.setTextureOffset(54, 37).addBox(6.0F, -17.0F, -6.0F, 2, 2, 12, 0.0F);
        WoodenCrate.setTextureOffset(44, 70).addBox(-8.0F, -17.0F, -6.0F, 2, 2, 12, 0.0F);
        WoodenCrate.setTextureOffset(80, 56).addBox(-6.0F, -17.0F, 6.0F, 12, 2, 2, 0.0F);
        WoodenCrate.setTextureOffset(80, 60).addBox(-6.0F, -17.0F, -8.0F, 12, 2, 2, 0.0F);
        WoodenCrate.setTextureOffset(40, 52).addBox(-6.0F, -3.0F, -8.0F, 12, 2, 16, 0.0F);
        WoodenCrate.setTextureOffset(80, 37).addBox(-8.0F, -3.0F, -8.0F, 2, 3, 16, 0.0F);

        bone6_r1 = new ModelRenderer(this);
        bone6_r1.setTextureSize(textureWidth, textureHeight);
        WoodenCrate.addChild(bone6_r1);
        setRotation(bone6_r1, 0.0F, 0.7854F, 0.0F);
        bone6_r1.setTextureOffset(0, 68).addBox(-1.0F, -16.76F, -9.0F, 2, 2, 18, 0.0F);

        bone5_r1 = new ModelRenderer(this);
        bone5_r1.setTextureSize(textureWidth, textureHeight);
        WoodenCrate.addChild(bone5_r1);
        setRotation(bone5_r1, 0.0F, -0.7854F, 0.0F);
        bone5_r1.setTextureOffset(22, 70).addBox(-1.0F, -16.75F, -9.0F, 2, 2, 18, 0.0F);

        bone4_r1 = new ModelRenderer(this);
        bone4_r1.setTextureSize(textureWidth, textureHeight);
        bone4_r1.setRotationPoint(5.6569F, -2.3432F, 0.0F);
        WoodenCrate.addChild(bone4_r1);
        setRotation(bone4_r1, 0.0F, 0.0F, -0.7854F);
        bone4_r1.setTextureOffset(48, 0).addBox(-8.2929F, -9.7071F, -7.51F, 18, 2, 15, 0.0F);

        bone3_r1 = new ModelRenderer(this);
        bone3_r1.setTextureSize(textureWidth, textureHeight);
        bone3_r1.setRotationPoint(-5.6569F, -2.3432F, 0.0F);
        WoodenCrate.addChild(bone3_r1);
        setRotation(bone3_r1, 0.0F, 0.0F, 0.7854F);
        bone3_r1.setTextureOffset(48, 20).addBox(-9.7071F, -9.7071F, -7.5F, 18, 2, 15, 0.0F);

        bone2_r1 = new ModelRenderer(this);
        bone2_r1.setTextureSize(textureWidth, textureHeight);
        bone2_r1.setRotationPoint(0.0F, -2.3432F, 5.6569F);
        WoodenCrate.addChild(bone2_r1);
        setRotation(bone2_r1, 0.7854F, 0.0F, 0.0F);
        bone2_r1.setTextureOffset(0, 0).addBox(-7.5F, -9.7071F, -8.2929F, 15, 2, 18, 0.0F);

        bone_r1 = new ModelRenderer(this);
        bone_r1.setTextureSize(textureWidth, textureHeight);
        bone_r1.setRotationPoint(0.0F, -2.3432F, -5.6569F);
        WoodenCrate.addChild(bone_r1);
        setRotation(bone_r1, -0.7854F, 0.0F, 0.0F);
        bone_r1.setTextureOffset(0, 20).addBox(-7.49F, -9.7071F, -9.7071F, 15, 2, 18, 0.0F);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha) {
        WoodenCrate.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
