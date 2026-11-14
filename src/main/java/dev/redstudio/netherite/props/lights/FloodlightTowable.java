
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
public final class FloodlightTowable extends EntityModel<Entity> {

    private final ModelRenderer Floodlight;
    private final ModelRenderer bone15;
    private final ModelRenderer bone9;
    private final ModelRenderer bone8;
    private final ModelRenderer bone7;
    private final ModelRenderer bone2;
    private final ModelRenderer bone;
    private final ModelRenderer bone4;

    public FloodlightTowable() {
        textureWidth = 300;
        textureHeight = 300;

        Floodlight = new ModelRenderer(this);
        Floodlight.setTextureSize(300, 300);
        Floodlight.setRotationPoint(0.0F, 24.0F, 0.0F);

        bone15 = new ModelRenderer(this);
        bone15.setTextureSize(300, 300);
        bone15.setRotationPoint(-1.0F, -14.25F, -1.25F);
        Floodlight.addChild(bone15);
        bone15.setTextureOffset(90, 0).addBox(-7.0F, 0.25F, -8.751F, 16.0F, 10.0F, 26.0F, 0.0F);
        bone15.setTextureOffset(43, 280).addBox(-6.0F, 3.25F, -9.25F, 14.0F, 2.0F, 1.0F, 0.0F);
        bone15.setTextureOffset(0, 0).addBox(0.0F, 7.25F, -2.75F, 2.0F, 1.0F, 43.0F, 0.0F);
        bone15.setTextureOffset(94, 249).addBox(0.0F, 6.25F, 38.25F, 2.0F, 1.0F, 4.0F, 0.0F);
        bone15.setTextureOffset(42, 243).addBox(0.0F, 2.25F, 29.25F, 2.0F, 9.0F, 2.0F, -0.5F);
        bone15.setTextureOffset(58, 116).addBox(-11.0F, 1.25F, -0.75F, 24.0F, 2.0F, 10.0F, 0.0F);
        bone15.setTextureOffset(34, 196).addBox(-4.0F, -1.75F, 17.251F, 10.0F, 8.0F, 1.0F, 0.0F);
        bone15.setTextureOffset(64, 83).addBox(-4.5944F, -7.3797F, -8.751F, 11.0F, 7.0F, 26.0F, 0.0F);
        bone15.setTextureOffset(44, 222).addBox(-2.4965F, -6.5186F, 17.252F, 7.0F, 7.0F, 1.0F, 0.0F);
        bone15.setTextureOffset(131, 165).addBox(-0.4056F, -49.1297F, 11.0F, 3.0F, 42.0F, 3.0F, -0.3F);
        bone15.setTextureOffset(50, 144).addBox(-12.4056F, -51.1297F, 11.0F, 27.0F, 3.0F, 3.0F, -0.3F);
        bone15.setTextureOffset(136, 233).addBox(12.4F, -54.8797F, 11.01F, 2.0F, 11.0F, 2.0F, -0.3F);
        bone15.setTextureOffset(136, 233).addBox(-6.4056F, -54.8797F, 11.01F, 2.0F, 11.0F, 2.0F, -0.3F);
        bone15.setTextureOffset(136, 233).addBox(6.5944F, -54.8797F, 11.01F, 2.0F, 10.0F, 2.0F, -0.3F);
        bone15.setTextureOffset(136, 233).addBox(-12.4F, -54.8797F, 11.01F, 2.0F, 10.0F, 2.0F, -0.3F);
        bone15.setTextureOffset(28, 243).addBox(-10.51F, 12.4216F, 2.25F, 3.0F, 2.0F, 4.0F, 0.0F);
        bone15.setTextureOffset(28, 243).addBox(9.49F, 12.4216F, 2.25F, 3.0F, 2.0F, 4.0F, 0.0F);
        bone15.setTextureOffset(14, 243).addBox(-10.51F, 4.7647F, 2.25F, 3.0F, 2.0F, 4.0F, 0.0F);
        bone15.setTextureOffset(14, 243).addBox(9.49F, 4.7647F, 2.25F, 3.0F, 2.0F, 4.0F, 0.0F);
        bone15.setTextureOffset(70, 254).addBox(-10.51F, 7.5931F, -0.5784F, 3.0F, 4.0F, 2.0F, 0.0F);
        bone15.setTextureOffset(70, 254).addBox(9.49F, 7.5931F, -0.5784F, 3.0F, 4.0F, 2.0F, 0.0F);
        bone15.setTextureOffset(60, 254).addBox(-10.51F, 7.5931F, 7.0784F, 3.0F, 4.0F, 2.0F, 0.0F);
        bone15.setTextureOffset(60, 254).addBox(9.49F, 7.5931F, 7.0784F, 3.0F, 4.0F, 2.0F, 0.0F);
        bone15.setTextureOffset(72, 196).addBox(-10.0F, 6.3F, 1.2F, 2.0F, 7.0F, 6.0F, 0.0F);

        bone15.mirror = true;
        bone15.setTextureOffset(72, 196).addBox(10.0F, 6.3F, 1.2F, 2.0F, 7.0F, 6.0F, 0.0F);
        bone15.mirror = false;

        bone9 = new ModelRenderer(this);
        bone9.setTextureSize(300, 300);
        bone9.setRotationPoint(-9.4056F, -71.8797F, 11.85F);
        Floodlight.addChild(bone9);
        setRotation(bone9, -0.0873F, -0.3927F, 0.0F);
        bone9.setTextureOffset(66, 217).addBox(3.0F, -5.0F, -1.1F, 2.0F, 10.0F, 3.0F, -0.3F);
        bone9.setTextureOffset(66, 217).addBox(20.5537F, -4.3663F, -8.3433F, 2.0F, 10.0F, 3.0F, -0.3F);
        bone9.setTextureOffset(66, 217).addBox(20.3241F, 11.6211F, -7.501F, 2.0F, 10.0F, 3.0F, -0.3F);
        bone9.setTextureOffset(66, 217).addBox(2.7704F, 10.9874F, -0.2577F, 2.0F, 10.0F, 3.0F, -0.3F);
        bone9.setTextureOffset(76, 217).addBox(-5.0F, -5.0F, -1.1F, 2.0F, 10.0F, 3.0F, -0.3F);
        bone9.setTextureOffset(76, 217).addBox(12.5537F, -4.3663F, -8.3433F, 2.0F, 10.0F, 3.0F, -0.3F);
        bone9.setTextureOffset(76, 217).addBox(12.3241F, 11.6211F, -7.501F, 2.0F, 10.0F, 3.0F, -0.3F);
        bone9.setTextureOffset(76, 217).addBox(-5.2296F, 10.9874F, -0.2577F, 2.0F, 10.0F, 3.0F, -0.3F);
        bone9.setTextureOffset(72, 209).addBox(-4.0F, -5.0F, -1.1F, 8.0F, 2.0F, 3.0F, -0.3F);
        bone9.setTextureOffset(72, 209).addBox(13.5537F, -4.3663F, -8.3433F, 8.0F, 2.0F, 3.0F, -0.3F);
        bone9.setTextureOffset(72, 209).addBox(13.3241F, 11.6211F, -7.501F, 8.0F, 2.0F, 3.0F, -0.3F);
        bone9.setTextureOffset(72, 209).addBox(-4.2296F, 10.9874F, -0.2577F, 8.0F, 2.0F, 3.0F, -0.3F);
        bone9.setTextureOffset(94, 196).addBox(-4.0F, 3.0F, -1.1F, 8.0F, 2.0F, 3.0F, -0.3F);
        bone9.setTextureOffset(94, 196).addBox(13.5537F, 3.6337F, -8.3433F, 8.0F, 2.0F, 3.0F, -0.3F);
        bone9.setTextureOffset(94, 196).addBox(13.3241F, 19.6211F, -7.501F, 8.0F, 2.0F, 3.0F, -0.3F);
        bone9.setTextureOffset(94, 196).addBox(-4.2296F, 18.9874F, -0.2577F, 8.0F, 2.0F, 3.0F, -0.3F);
        bone9.setTextureOffset(54, 168).addBox(-4.0F, -4.0F, -3.1F, 8.0F, 8.0F, 3.0F, -0.3F);
        bone9.setTextureOffset(54, 168).addBox(13.5537F, -3.3663F, -10.3433F, 8.0F, 8.0F, 3.0F, -0.3F);
        bone9.setTextureOffset(54, 168).addBox(13.3241F, 12.6211F, -9.501F, 8.0F, 8.0F, 3.0F, -0.3F);
        bone9.setTextureOffset(54, 168).addBox(-4.2296F, 11.9874F, -2.2577F, 8.0F, 8.0F, 3.0F, -0.3F);

        bone8 = new ModelRenderer(this);
        bone8.setTextureSize(300, 300);
        bone8.setRotationPoint(5.0F, -6.0F, 9.0F);
        Floodlight.addChild(bone8);
        setRotation(bone8, 0.0F, 0.48F, 0.0F);
        bone8.setTextureOffset(180, 75).addBox(-1.0F, -1.0F, -26.0F, 2.0F, 1.0F, 40.0F, 0.0F);
        bone8.setTextureOffset(66, 243).addBox(-1.0F, -1.5F, 12.0F, 2.0F, 8.0F, 2.0F, -0.3F);
        bone8.setTextureOffset(58, 243).addBox(-1.0313F, -1.5F, -26.0523F, 2.0F, 8.0F, 2.0F, -0.3F);

        bone7 = new ModelRenderer(this);
        bone7.setTextureSize(300, 300);
        bone7.setRotationPoint(-5.0F, -6.0F, 9.0F);
        Floodlight.addChild(bone7);
        setRotation(bone7, 0.0F, -0.48F, 0.0F);
        bone7.setTextureOffset(0, 116).addBox(-1.0F, -1.0F, -26.0F, 2.0F, 1.0F, 40.0F, 0.0F);
        bone7.setTextureOffset(74, 243).addBox(-1.0F, -1.5F, 12.0F, 2.0F, 8.0F, 2.0F, -0.3F);
        bone7.setTextureOffset(50, 243).addBox(-1.0191F, -1.5F, -26.1676F, 2.0F, 8.0F, 2.0F, -0.3F);

        bone2 = new ModelRenderer(this);
        bone2.setTextureSize(300, 300);
        bone2.setRotationPoint(0.0F, -13.5F, 4.5F);
        Floodlight.addChild(bone2);
        setRotation(bone2, 0.0F, 0.0F, 1.2654F);
        bone2.setTextureOffset(0, 44).addBox(-6.0712F, -7.7801F, -14.498F, 8.0F, 13.0F, 26.0F, 0.0F);
        bone2.setTextureOffset(82, 243).addBox(-5.8808F, -5.5203F, 11.5F, 5.0F, 5.0F, 1.0F, 0.0F);

        bone = new ModelRenderer(this);
        bone.setTextureSize(300, 300);
        bone.setRotationPoint(0.0F, -13.5F, 4.5F);
        Floodlight.addChild(bone);
        setRotation(bone, 0.0F, 0.0F, -1.2654F);
        bone.setTextureOffset(68, 44).addBox(-1.9288F, -7.7801F, -14.499F, 8.0F, 13.0F, 26.0F, 0.0F);
        bone.setTextureOffset(94, 243).addBox(0.8808F, -5.5203F, 11.5F, 5.0F, 5.0F, 1.0F, 0.0F);

        bone4 = new ModelRenderer(this);
        bone4.setTextureSize(300, 300);
        bone4.setRotationPoint(0.5F, 0.0F, 4.0F);
        Floodlight.addChild(bone4);
        setRotation(bone4, 0.7854F, 0.0F, 0.0F);
        bone4.setTextureOffset(0, 243).addBox(-12.01F, -1.1716F, 0.5858F, 3.0F, 2.0F, 4.0F, 0.0F);
        bone4.setTextureOffset(0, 243).addBox(7.99F, -1.1716F, 0.5858F, 3.0F, 2.0F, 4.0F, 0.0F);
        bone4.setTextureOffset(50, 254).addBox(-12.01F, -6.0F, 5.4142F, 3.0F, 4.0F, 2.0F, 0.0F);
        bone4.setTextureOffset(50, 254).addBox(7.99F, -6.0F, 5.4142F, 3.0F, 4.0F, 2.0F, 0.0F);
        bone4.setTextureOffset(50, 156).addBox(-12.5F, -6.364F, 10.0208F, 24.0F, 4.0F, 2.0F, 0.0F);
        bone4.setTextureOffset(40, 254).addBox(-12.01F, -6.0F, -2.2426F, 3.0F, 4.0F, 2.0F, 0.0F);
        bone4.setTextureOffset(40, 254).addBox(7.99F, -6.0F, -2.2426F, 3.0F, 4.0F, 2.0F, 0.0F);
        bone4.setTextureOffset(78, 230).addBox(-12.01F, -8.8284F, 0.5858F, 3.0F, 2.0F, 4.0F, 0.0F);
        bone4.setTextureOffset(78, 230).addBox(7.99F, -8.8284F, 0.5858F, 3.0F, 2.0F, 4.0F, 0.0F);
        bone4.setTextureOffset(50, 150).addBox(-12.5F, -13.435F, 0.9497F, 24.0F, 2.0F, 4.0F, 0.0F);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha) {
        Floodlight.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
