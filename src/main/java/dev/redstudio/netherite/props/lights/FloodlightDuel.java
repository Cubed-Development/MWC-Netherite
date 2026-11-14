
package dev.redstudio.netherite.props.lights;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Made with Blockbench 4.8.1
 *
 * @author Developer: Desoroxx
 */
@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class FloodlightDuel extends EntityModel<Entity> {

    private final ModelRenderer bone11;
    private final ModelRenderer bone10;
    private final ModelRenderer bone9;
    private final ModelRenderer bone8;
    private final ModelRenderer bone7;
    private final ModelRenderer bone3;
    private final ModelRenderer bone2;
    private final ModelRenderer bone;

    public FloodlightDuel() {
        textureWidth = 128;
        textureHeight = 128;

        bone11 = new ModelRenderer(this);
        bone11.setTextureSize(128, 128);
        bone11.setRotationPoint(0.0F, 24.0F, -0.5F);
        setRotation(bone11, 0.0F, -1.5708F, 0.0F);

        bone10 = new ModelRenderer(this);
        bone10.setTextureSize(128, 128);
        bone10.setRotationPoint(0.5F, -9.25F, 0.5F);
        bone11.addChild(bone10);
        bone10.setTextureOffset(28, 58).addBox(-1.0F, -12.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.2F);
        bone10.setTextureOffset(40, 0).addBox(-1.0F, -14.25F, 0.0F, 1.0F, 22.0F, 1.0F, 0.0F);
        bone10.setTextureOffset(0, 0).addBox(-10.0F, -15.25F, 0.0F, 19.0F, 1.0F, 1.0F, 0.0F);
        bone10.setTextureOffset(16, 48).addBox(-8.0F, -15.5F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F);
        bone10.setTextureOffset(12, 58).addBox(-8.0F, -18.25F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F);
        bone10.setTextureOffset(8, 58).addBox(6.0F, -18.25F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F);
        bone10.setTextureOffset(4, 58).addBox(1.0F, -19.25F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F);
        bone10.setTextureOffset(0, 58).addBox(-3.0F, -19.25F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F);
        bone10.setTextureOffset(8, 52).addBox(6.0F, -15.5F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F);
        bone10.setTextureOffset(8, 48).addBox(-1.0F, -15.5F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F);
        bone10.setTextureOffset(4, 63).addBox(-1.0F, 4.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.2F);
        bone10.setTextureOffset(0, 63).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.2F);

        bone9 = new ModelRenderer(this);
        bone9.setTextureSize(128, 128);
        bone9.setRotationPoint(0.0F, -23.0F, 2.25F);
        bone11.addChild(bone9);
        setRotation(bone9, -0.7854F, 0.0F, 0.0F);
        bone9.setTextureOffset(16, 34).addBox(-2.5F, -0.1161F, -1.8839F, 5.0F, 2.0F, 2.0F, 0.0F);

        bone8 = new ModelRenderer(this);
        bone8.setTextureSize(128, 128);
        bone8.setRotationPoint(-4.5F, -30.0F, 0.8333F);
        bone11.addChild(bone8);
        setRotation(bone8, -0.0873F, 0.1745F, 0.0F);
        bone8.setTextureOffset(0, 23).addBox(-3.0F, -1.5F, -0.3333F, 6.0F, 4.0F, 2.0F, 0.0F);
        bone8.setTextureOffset(18, 38).addBox(-4.0434F, -2.5215F, -1.0881F, 1.0F, 6.0F, 2.0F, 0.0F);
        bone8.setTextureOffset(12, 38).addBox(2.9566F, -2.5215F, -1.0881F, 1.0F, 6.0F, 2.0F, 0.0F);
        bone8.setTextureOffset(0, 34).addBox(-3.0434F, 2.4785F, -1.0881F, 6.0F, 1.0F, 2.0F, 0.0F);
        bone8.setTextureOffset(0, 29).addBox(-3.0434F, -2.5215F, -1.0881F, 6.0F, 1.0F, 2.0F, 0.0F);

        bone7 = new ModelRenderer(this);
        bone7.setTextureSize(128, 128);
        bone7.setRotationPoint(4.5F, -30.0F, 0.8333F);
        bone11.addChild(bone7);
        setRotation(bone7, -0.0873F, -0.1745F, 0.0F);
        bone7.setTextureOffset(14, 23).addBox(-3.0F, -1.5F, -0.3333F, 6.0F, 4.0F, 2.0F, 0.0F);
        bone7.setTextureOffset(6, 38).addBox(3.0434F, -2.5215F, -1.0881F, 1.0F, 6.0F, 2.0F, 0.0F);
        bone7.setTextureOffset(0, 38).addBox(-3.9566F, -2.5215F, -1.0881F, 1.0F, 6.0F, 2.0F, 0.0F);
        bone7.setTextureOffset(30, 29).addBox(-2.9566F, 2.4785F, -1.0881F, 6.0F, 1.0F, 2.0F, 0.0F);
        bone7.setTextureOffset(28, 23).addBox(-2.9566F, -2.5215F, -1.0881F, 6.0F, 1.0F, 2.0F, 0.0F);

        bone3 = new ModelRenderer(this);
        bone3.setTextureSize(128, 128);
        bone3.setRotationPoint(0.25F, -2.0F, -3.25F);
        bone11.addChild(bone3);
        setRotation(bone3, -0.9599F, 0.0F, 0.0F);
        bone3.setTextureOffset(24, 38).addBox(-0.7266F, -5.3943F, -0.5F, 1.0F, 9.0F, 1.0F, 0.0F);
        bone3.setTextureOffset(16, 63).addBox(-0.7266F, 2.6057F, -0.5F, 1.0F, 1.0F, 1.0F, 0.2F);

        bone2 = new ModelRenderer(this);
        bone2.setTextureSize(128, 128);
        bone2.setRotationPoint(4.005F, -2.5F, 3.3335F);
        bone11.addChild(bone2);
        setRotation(bone2, 0.4538F, -0.192F, -1.0821F);
        bone2.setTextureOffset(0, 48).addBox(-0.9532F, -5.2887F, -0.5F, 1.0F, 9.0F, 1.0F, 0.0F);
        bone2.setTextureOffset(8, 63).addBox(-0.9532F, 2.7113F, -0.5F, 1.0F, 1.0F, 1.0F, 0.2F);

        bone = new ModelRenderer(this);
        bone.setTextureSize(128, 128);
        bone.setRotationPoint(-3.6515F, -2.5F, 3.1213F);
        bone11.addChild(bone);
        setRotation(bone, 0.4538F, 0.3316F, 1.0821F);
        bone.setTextureOffset(4, 48).addBox(-0.0468F, -5.2887F, -0.5F, 1.0F, 9.0F, 1.0F, 0.0F);
        bone.setTextureOffset(12, 63).addBox(-0.0468F, 2.7113F, -0.5F, 1.0F, 1.0F, 1.0F, 0.2F);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha) {
        bone11.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
