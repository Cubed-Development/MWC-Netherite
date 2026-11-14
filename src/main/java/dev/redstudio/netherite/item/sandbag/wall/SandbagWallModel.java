
package dev.redstudio.netherite.item.sandbag.wall;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class SandbagWallModel extends EntityModel<Entity> {

	private final ModelRenderer Sandbag;
	private final ModelRenderer bone2;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone3;
	private final ModelRenderer bone;
	private final ModelRenderer Sandbag2;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer Sandbag3;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer Sandbag4;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;

	public SandbagWallModel() {
		textureWidth = 64;
		textureHeight = 64;

		Sandbag = new ModelRenderer(this);
		Sandbag.setTextureSize(textureWidth, textureHeight);
		Sandbag.setRotationPoint(0.0F, 24.0F, 0.0F);
		Sandbag.setTextureOffset(0, 0).addBox(-8.0F, -4.9F, -4.5F, 16, 4, 8, 0.0F);

		bone2 = new ModelRenderer(this);
		bone2.setTextureSize(textureWidth, textureHeight);
		bone2.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag.addChild(bone2);
		setRotation(bone2, -0.1222F, 0.0F, 0.0873F);
		bone2.setTextureOffset(28, 30).addBox(0.0396F, 0.0F, 0.0F, 8, 2, 4, -0.001F);

		bone4 = new ModelRenderer(this);
		bone4.setTextureSize(textureWidth, textureHeight);
		bone4.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag.addChild(bone4);
		setRotation(bone4, 0.1222F, 0.0F, 0.0873F);
		bone4.setTextureOffset(28, 18).addBox(0.0396F, 0.0F, -4.0F, 8, 2, 4, -0.001F);

		bone5 = new ModelRenderer(this);
		bone5.setTextureSize(textureWidth, textureHeight);
		bone5.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag.addChild(bone5);
		setRotation(bone5, 0.1222F, 0.0F, -0.0873F);
		bone5.setTextureOffset(24, 12).addBox(-7.9604F, 0.0F, -4.0F, 8, 2, 4, -0.001F);

		bone6 = new ModelRenderer(this);
		bone6.setTextureSize(textureWidth, textureHeight);
		bone6.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag.addChild(bone6);
		setRotation(bone6, -0.1222F, 0.0F, -0.0873F);
		bone6.setTextureOffset(24, 24).addBox(-7.9604F, 0.0F, 0.0F, 8, 2, 4, -0.001F);

		bone3 = new ModelRenderer(this);
		bone3.setTextureSize(textureWidth, textureHeight);
		bone3.setRotationPoint(0.1F, -8.0F, -1.0F);
		Sandbag.addChild(bone3);
		setRotation(bone3, 0.0F, 0.0F, 0.0873F);
		bone3.setTextureOffset(0, 22).addBox(-7.403F, 6.1725F, -3.5F, 8, 2, 8, -0.001F);

		bone = new ModelRenderer(this);
		bone.setTextureSize(textureWidth, textureHeight);
		bone.setRotationPoint(0.0F, -7.0F, 0.0F);
		Sandbag.addChild(bone);
		setRotation(bone, 0.0F, 0.0F, -0.0873F);
		bone.setTextureOffset(0, 12).addBox(-0.6576F, 5.1672F, -4.5F, 8, 2, 8, -0.001F);

		Sandbag2 = new ModelRenderer(this);
		Sandbag2.setTextureSize(textureWidth, textureHeight);
		Sandbag2.setRotationPoint(8.1F, 18.6F, 0.0F);
		Sandbag2.setTextureOffset(0, 0).addBox(-8.0F, -5.1F, -4.5F, 16, 4, 8, 0.0F);

		bone7 = new ModelRenderer(this);
		bone7.setTextureSize(textureWidth, textureHeight);
		bone7.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag2.addChild(bone7);
		setRotation(bone7, -0.1222F, 0.0F, 0.0873F);
		bone7.setTextureOffset(28, 30).addBox(0.0222F, -0.1978F, -0.0243F, 8, 2, 4, -0.001F);

		bone8 = new ModelRenderer(this);
		bone8.setTextureSize(textureWidth, textureHeight);
		bone8.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag2.addChild(bone8);
		setRotation(bone8, 0.1222F, 0.0F, 0.0873F);
		bone8.setTextureOffset(28, 18).addBox(0.0222F, -0.1978F, -3.9757F, 8, 2, 4, -0.001F);

		bone9 = new ModelRenderer(this);
		bone9.setTextureSize(textureWidth, textureHeight);
		bone9.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag2.addChild(bone9);
		setRotation(bone9, 0.1222F, 0.0F, -0.0873F);
		bone9.setTextureOffset(24, 12).addBox(-7.9429F, -0.1978F, -3.9757F, 8, 2, 4, -0.001F);

		bone10 = new ModelRenderer(this);
		bone10.setTextureSize(textureWidth, textureHeight);
		bone10.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag2.addChild(bone10);
		setRotation(bone10, -0.1222F, 0.0F, -0.0873F);
		bone10.setTextureOffset(24, 24).addBox(-7.9429F, -0.1978F, -0.0243F, 8, 2, 4, -0.001F);

		bone11 = new ModelRenderer(this);
		bone11.setTextureSize(textureWidth, textureHeight);
		bone11.setRotationPoint(0.1F, -8.0F, -1.0F);
		Sandbag2.addChild(bone11);
		setRotation(bone11, 0.0F, 0.0F, 0.0873F);
		bone11.setTextureOffset(0, 22).addBox(-7.4205F, 5.9733F, -3.5F, 8, 2, 8, -0.001F);

		bone12 = new ModelRenderer(this);
		bone12.setTextureSize(textureWidth, textureHeight);
		bone12.setRotationPoint(0.0F, -7.0F, 0.0F);
		Sandbag2.addChild(bone12);
		setRotation(bone12, 0.0F, 0.0F, -0.0873F);
		bone12.setTextureOffset(0, 12).addBox(-0.6402F, 4.968F, -4.5F, 8, 2, 8, -0.001F);

		Sandbag3 = new ModelRenderer(this);
		Sandbag3.setTextureSize(textureWidth, textureHeight);
		Sandbag3.setRotationPoint(-8.0F, 18.6F, 0.0F);
		Sandbag3.setTextureOffset(0, 0).addBox(-8.0F, -5.1F, -4.5F, 16, 4, 8, 0.0F);

		bone13 = new ModelRenderer(this);
		bone13.setTextureSize(textureWidth, textureHeight);
		bone13.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag3.addChild(bone13);
		setRotation(bone13, -0.1222F, 0.0F, 0.0873F);
		bone13.setTextureOffset(28, 30).addBox(0.0222F, -0.1978F, -0.0243F, 8, 2, 4, -0.001F);

		bone14 = new ModelRenderer(this);
		bone14.setTextureSize(textureWidth, textureHeight);
		bone14.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag3.addChild(bone14);
		setRotation(bone14, 0.1222F, 0.0F, 0.0873F);
		bone14.setTextureOffset(28, 18).addBox(0.0222F, -0.1978F, -3.9757F, 8, 2, 4, -0.001F);

		bone15 = new ModelRenderer(this);
		bone15.setTextureSize(textureWidth, textureHeight);
		bone15.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag3.addChild(bone15);
		setRotation(bone15, 0.1222F, 0.0F, -0.0873F);
		bone15.setTextureOffset(24, 12).addBox(-7.9429F, -0.1978F, -3.9757F, 8, 2, 4, -0.001F);

		bone16 = new ModelRenderer(this);
		bone16.setTextureSize(textureWidth, textureHeight);
		bone16.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag3.addChild(bone16);
		setRotation(bone16, -0.1222F, 0.0F, -0.0873F);
		bone16.setTextureOffset(24, 24).addBox(-7.9429F, -0.1978F, -0.0243F, 8, 2, 4, -0.001F);

		bone17 = new ModelRenderer(this);
		bone17.setTextureSize(textureWidth, textureHeight);
		bone17.setRotationPoint(0.1F, -8.0F, -1.0F);
		Sandbag3.addChild(bone17);
		setRotation(bone17, 0.0F, 0.0F, 0.0873F);
		bone17.setTextureOffset(0, 22).addBox(-7.4205F, 5.9733F, -3.5F, 8, 2, 8, -0.001F);

		bone18 = new ModelRenderer(this);
		bone18.setTextureSize(textureWidth, textureHeight);
		bone18.setRotationPoint(0.0F, -7.0F, 0.0F);
		Sandbag3.addChild(bone18);
		setRotation(bone18, 0.0F, 0.0F, -0.0873F);
		bone18.setTextureOffset(0, 12).addBox(-0.6402F, 4.968F, -4.5F, 8, 2, 8, -0.001F);

		Sandbag4 = new ModelRenderer(this);
		Sandbag4.setTextureSize(textureWidth, textureHeight);
		Sandbag4.setRotationPoint(0.0F, 12.7F, 0.0F);
		Sandbag4.setTextureOffset(0, 0).addBox(-8.0F, -4.9F, -4.5F, 16, 4, 8, 0.0F);

		bone19 = new ModelRenderer(this);
		bone19.setTextureSize(textureWidth, textureHeight);
		bone19.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag4.addChild(bone19);
		setRotation(bone19, -0.1222F, 0.0F, 0.0873F);
		bone19.setTextureOffset(28, 30).addBox(0.0396F, 0.0F, 0.0F, 8, 2, 4, -0.001F);

		bone20 = new ModelRenderer(this);
		bone20.setTextureSize(textureWidth, textureHeight);
		bone20.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag4.addChild(bone20);
		setRotation(bone20, 0.1222F, 0.0F, 0.0873F);
		bone20.setTextureOffset(28, 18).addBox(0.0396F, 0.0F, -4.0F, 8, 2, 4, -0.001F);

		bone21 = new ModelRenderer(this);
		bone21.setTextureSize(textureWidth, textureHeight);
		bone21.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag4.addChild(bone21);
		setRotation(bone21, 0.1222F, 0.0F, -0.0873F);
		bone21.setTextureOffset(24, 12).addBox(-7.9604F, 0.0F, -4.0F, 8, 2, 4, -0.001F);

		bone22 = new ModelRenderer(this);
		bone22.setTextureSize(textureWidth, textureHeight);
		bone22.setRotationPoint(0.0F, -6.3F, -0.5F);
		Sandbag4.addChild(bone22);
		setRotation(bone22, -0.1222F, 0.0F, -0.0873F);
		bone22.setTextureOffset(24, 24).addBox(-7.9604F, 0.0F, 0.0F, 8, 2, 4, -0.001F);

		bone23 = new ModelRenderer(this);
		bone23.setTextureSize(textureWidth, textureHeight);
		bone23.setRotationPoint(0.1F, -8.0F, -1.0F);
		Sandbag4.addChild(bone23);
		setRotation(bone23, 0.0F, 0.0F, 0.0873F);
		bone23.setTextureOffset(0, 22).addBox(-7.403F, 6.1725F, -3.5F, 8, 2, 8, -0.001F);

		bone24 = new ModelRenderer(this);
		bone24.setTextureSize(textureWidth, textureHeight);
		bone24.setRotationPoint(0.0F, -7.0F, 0.0F);
		Sandbag4.addChild(bone24);
		setRotation(bone24, 0.0F, 0.0F, -0.0873F);
		bone24.setTextureOffset(0, 12).addBox(-0.6576F, 5.1672F, -4.5F, 8, 2, 8, -0.001F);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
								  float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
					   int packedOverlay, float red, float green, float blue, float alpha) {
		Sandbag.render(matrixStack, buffer, packedLight, packedOverlay);
		Sandbag2.render(matrixStack, buffer, packedLight, packedOverlay);
		Sandbag3.render(matrixStack, buffer, packedLight, packedOverlay);
		Sandbag4.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
