
package dev.redstudio.netherite.props;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class Barrel extends EntityModel<Entity> {

    private final ModelRenderer bone13;
    private final ModelRenderer bone2;
    private final ModelRenderer bone;
    private final ModelRenderer bone6;
    private final ModelRenderer bone5;
    private final ModelRenderer bone9;
    private final ModelRenderer bone8;
    private final ModelRenderer bone12;
    private final ModelRenderer bone11;
    private final ModelRenderer bone39;
    private final ModelRenderer bone17;
    private final ModelRenderer bone18;
    private final ModelRenderer bone19;
    private final ModelRenderer bone35;
    private final ModelRenderer bone36;
    private final ModelRenderer bone37;
    private final ModelRenderer bone23;
    private final ModelRenderer bone24;
    private final ModelRenderer bone25;
    private final ModelRenderer bone29;
    private final ModelRenderer bone30;
    private final ModelRenderer bone31;
    private final ModelRenderer bone40;
    private final ModelRenderer bone41;
    private final ModelRenderer bone42;
    private final ModelRenderer bone43;
    private final ModelRenderer bone44;
    private final ModelRenderer bone45;
    private final ModelRenderer bone46;
    private final ModelRenderer bone47;
    private final ModelRenderer bone48;
    private final ModelRenderer bone49;
    private final ModelRenderer bone50;
    private final ModelRenderer bone51;
    private final ModelRenderer bone14;
    private final ModelRenderer bone15;
    private final ModelRenderer bone16;
    private final ModelRenderer bone32;
    private final ModelRenderer bone33;
    private final ModelRenderer bone34;
    private final ModelRenderer bone20;
    private final ModelRenderer bone21;
    private final ModelRenderer bone22;
    private final ModelRenderer bone26;
    private final ModelRenderer bone27;
    private final ModelRenderer bone28;

    public Barrel() {
        textureWidth = 128;
        textureHeight = 128;

        bone13 = new ModelRenderer(this);
        bone13.setTextureSize(128, 128);
        bone13.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone13.setTextureOffset(0, 0).addBox(2.0F, -22.0F, -2.25F, 4, 1, 4, 0.0F);

        bone2 = new ModelRenderer(this);
        bone2.setTextureSize(128, 128);
        bone2.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone13.addChild(bone2);
        setRotation(bone2, 0.0F, -0.4363F, 0.0F);
        bone2.setTextureOffset(25, 25).addBox(0.0F, -2.01F, 0.0F, 6, 21, 13, 0.0F);

        bone = new ModelRenderer(this);
        bone.setTextureSize(128, 128);
        bone.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone13.addChild(bone);
        setRotation(bone, 0.0F, 0.4363F, 0.0F);
        bone.setTextureOffset(0, 59).addBox(-6.0F, -1.99F, 0.0F, 6, 21, 3, 0.0F);

        bone6 = new ModelRenderer(this);
        bone6.setTextureSize(128, 128);
        bone6.setRotationPoint(0.0001F, -19.0F, 8.0F);
        bone13.addChild(bone6);
        setRotation(bone6, -3.1416F, 0.4363F, 3.1416F);
        bone6.setTextureOffset(34, 59).addBox(0.0F, -1.99F, 0.0F, 6, 21, 2, 0.0F);

        bone5 = new ModelRenderer(this);
        bone5.setTextureSize(128, 128);
        bone5.setRotationPoint(0.0001F, -19.0F, 8.0F);
        bone13.addChild(bone5);
        setRotation(bone5, 3.1416F, -0.4363F, -3.1416F);
        bone5.setTextureOffset(58, 0).addBox(-6.0F, -1.99F, 0.0F, 6, 21, 4, 0.0F);

        bone9 = new ModelRenderer(this);
        bone9.setTextureSize(128, 128);
        bone9.setRotationPoint(8.0F, -19.0F, 0.0F);
        bone13.addChild(bone9);
        setRotation(bone9, -3.1416F, -1.1345F, 3.1416F);
        bone9.setTextureOffset(0, 0).addBox(0.0F, -2.0F, 0.0F, 6, 21, 13, 0.0F);

        bone8 = new ModelRenderer(this);
        bone8.setTextureSize(128, 128);
        bone8.setRotationPoint(8.0F, -19.0F, 0.0F);
        bone13.addChild(bone8);
        setRotation(bone8, 0.0F, -1.1345F, 0.0F);
        bone8.setTextureOffset(38, 0).addBox(-6.0F, -1.99F, 0.0F, 6, 21, 4, 0.0F);

        bone12 = new ModelRenderer(this);
        bone12.setTextureSize(128, 128);
        bone12.setRotationPoint(-8.5F, -19.0F, 0.0F);
        bone13.addChild(bone12);
        setRotation(bone12, 0.0F, 1.1345F, 0.0F);
        bone12.setTextureOffset(18, 59).addBox(0.2113F, -2.01F, 0.4532F, 6, 21, 2, 0.0F);

        bone11 = new ModelRenderer(this);
        bone11.setTextureSize(128, 128);
        bone11.setRotationPoint(-8.5F, -19.0F, 0.0F);
        bone13.addChild(bone11);
        setRotation(bone11, -3.1416F, 1.1345F, 3.1416F);
        bone11.setTextureOffset(0, 34).addBox(-6.2113F, -1.99F, 0.4532F, 6, 21, 4, 0.0F);

        bone39 = new ModelRenderer(this);
        bone39.setTextureSize(128, 128);
        bone13.addChild(bone39);

        bone17 = new ModelRenderer(this);
        bone17.setTextureSize(128, 128);
        bone17.setRotationPoint(0.0F, -7.0F, -0.25F);
        bone39.addChild(bone17);

        bone18 = new ModelRenderer(this);
        bone18.setTextureSize(128, 128);
        bone18.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone17.addChild(bone18);
        setRotation(bone18, 0.0F, 0.4363F, 0.0F);
        bone18.setTextureOffset(63, 40).addBox(-6.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F);

        bone19 = new ModelRenderer(this);
        bone19.setTextureSize(128, 128);
        bone19.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone17.addChild(bone19);
        setRotation(bone19, 0.0F, -0.4363F, 0.0F);
        bone19.setTextureOffset(63, 38).addBox(0.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F);

        bone35 = new ModelRenderer(this);
        bone35.setTextureSize(128, 128);
        bone35.setRotationPoint(0.0F, -7.0F, 0.25F);
        bone39.addChild(bone35);
        setRotation(bone35, 0.0F, 3.1416F, 0.0F);

        bone36 = new ModelRenderer(this);
        bone36.setTextureSize(128, 128);
        bone36.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone35.addChild(bone36);
        setRotation(bone36, 0.0F, 0.4363F, 0.0F);
        bone36.setTextureOffset(50, 35).addBox(-6.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F);

        bone37 = new ModelRenderer(this);
        bone37.setTextureSize(128, 128);
        bone37.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone35.addChild(bone37);
        setRotation(bone37, 0.0F, -0.4363F, 0.0F);
        bone37.setTextureOffset(50, 33).addBox(0.0F, 18.01F, 0.0F, 6, 1, 1, 0.0F);

        bone23 = new ModelRenderer(this);
        bone23.setTextureSize(128, 128);
        bone23.setRotationPoint(0.25F, -7.0F, 0.0F);
        bone39.addChild(bone23);
        setRotation(bone23, 0.0F, -1.5708F, 0.0F);

        bone24 = new ModelRenderer(this);
        bone24.setTextureSize(128, 128);
        bone24.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone23.addChild(bone24);
        setRotation(bone24, 0.0F, 0.4363F, 0.0F);
        bone24.setTextureOffset(63, 32).addBox(-6.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F);

        bone25 = new ModelRenderer(this);
        bone25.setTextureSize(128, 128);
        bone25.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone23.addChild(bone25);
        setRotation(bone25, 0.0F, -0.4363F, 0.0F);
        bone25.setTextureOffset(63, 30).addBox(0.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F);

        bone29 = new ModelRenderer(this);
        bone29.setTextureSize(128, 128);
        bone29.setRotationPoint(-0.75F, -7.0F, 0.0F);
        bone39.addChild(bone29);
        setRotation(bone29, 0.0F, 1.5708F, 0.0F);

        bone30 = new ModelRenderer(this);
        bone30.setTextureSize(128, 128);
        bone30.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone29.addChild(bone30);
        setRotation(bone30, 0.0F, 0.4363F, 0.0F);
        bone30.setTextureOffset(50, 63).addBox(-6.2113F, 18.0F, 0.4532F, 6, 1, 1, 0.0F);

        bone31 = new ModelRenderer(this);
        bone31.setTextureSize(128, 128);
        bone31.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone29.addChild(bone31);
        setRotation(bone31, 0.0F, -0.4363F, 0.0F);
        bone31.setTextureOffset(62, 58).addBox(0.2113F, 18.0F, 0.4532F, 6, 1, 1, 0.0F);

        bone40 = new ModelRenderer(this);
        bone40.setTextureSize(128, 128);
        bone40.setRotationPoint(0.0F, -20.25F, -0.25F);
        bone13.addChild(bone40);

        bone41 = new ModelRenderer(this);
        bone41.setTextureSize(128, 128);
        bone41.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone40.addChild(bone41);
        setRotation(bone41, 0.0F, 0.4363F, 0.0F);
        bone41.setTextureOffset(50, 31).addBox(-6.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F);

        bone42 = new ModelRenderer(this);
        bone42.setTextureSize(128, 128);
        bone42.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone40.addChild(bone42);
        setRotation(bone42, 0.0F, -0.4363F, 0.0F);
        bone42.setTextureOffset(50, 29).addBox(0.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F);

        bone43 = new ModelRenderer(this);
        bone43.setTextureSize(128, 128);
        bone43.setRotationPoint(0.0F, 0.0F, 0.5F);
        bone40.addChild(bone43);
        setRotation(bone43, 0.0F, 3.1416F, 0.0F);

        bone44 = new ModelRenderer(this);
        bone44.setTextureSize(128, 128);
        bone44.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone43.addChild(bone44);
        setRotation(bone44, 0.0F, 0.4363F, 0.0F);
        bone44.setTextureOffset(50, 27).addBox(-6.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F);

        bone45 = new ModelRenderer(this);
        bone45.setTextureSize(128, 128);
        bone45.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone43.addChild(bone45);
        setRotation(bone45, 0.0F, -0.4363F, 0.0F);
        bone45.setTextureOffset(50, 25).addBox(0.0F, 18.01F, 0.0F, 6, 1, 1, 0.0F);

        bone46 = new ModelRenderer(this);
        bone46.setTextureSize(128, 128);
        bone46.setRotationPoint(0.25F, 0.0F, 0.25F);
        bone40.addChild(bone46);
        setRotation(bone46, 0.0F, -1.5708F, 0.0F);

        bone47 = new ModelRenderer(this);
        bone47.setTextureSize(128, 128);
        bone47.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone46.addChild(bone47);
        setRotation(bone47, 0.0F, 0.4363F, 0.0F);
        bone47.setTextureOffset(16, 36).addBox(-6.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F);

        bone48 = new ModelRenderer(this);
        bone48.setTextureSize(128, 128);
        bone48.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone46.addChild(bone48);
        setRotation(bone48, 0.0F, -0.4363F, 0.0F);
        bone48.setTextureOffset(16, 34).addBox(0.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F);

        bone49 = new ModelRenderer(this);
        bone49.setTextureSize(128, 128);
        bone49.setRotationPoint(-0.75F, 0.0F, 0.25F);
        bone40.addChild(bone49);
        setRotation(bone49, 0.0F, 1.5708F, 0.0F);

        bone50 = new ModelRenderer(this);
        bone50.setTextureSize(128, 128);
        bone50.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone49.addChild(bone50);
        setRotation(bone50, 0.0F, 0.4363F, 0.0F);
        bone50.setTextureOffset(25, 2).addBox(-6.2113F, 18.0F, 0.4532F, 6, 1, 1, 0.0F);

        bone51 = new ModelRenderer(this);
        bone51.setTextureSize(128, 128);
        bone51.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone49.addChild(bone51);
        setRotation(bone51, 0.0F, -0.4363F, 0.0F);
        bone51.setTextureOffset(25, 0).addBox(0.2113F, 18.0F, 0.4532F, 6, 1, 1, 0.0F);

        bone14 = new ModelRenderer(this);
        bone14.setTextureSize(128, 128);
        bone14.setRotationPoint(0.0F, -14.0F, -0.25F);
        bone13.addChild(bone14);

        bone15 = new ModelRenderer(this);
        bone15.setTextureSize(128, 128);
        bone15.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone14.addChild(bone15);
        setRotation(bone15, 0.0F, 0.4363F, 0.0F);
        bone15.setTextureOffset(63, 44).addBox(-6.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F);

        bone16 = new ModelRenderer(this);
        bone16.setTextureSize(128, 128);
        bone16.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone14.addChild(bone16);
        setRotation(bone16, 0.0F, -0.4363F, 0.0F);
        bone16.setTextureOffset(63, 42).addBox(0.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F);

        bone32 = new ModelRenderer(this);
        bone32.setTextureSize(128, 128);
        bone32.setRotationPoint(0.0F, 0.0F, 0.5F);
        bone14.addChild(bone32);
        setRotation(bone32, 0.0F, 3.1416F, 0.0F);

        bone33 = new ModelRenderer(this);
        bone33.setTextureSize(128, 128);
        bone33.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone32.addChild(bone33);
        setRotation(bone33, 0.0F, 0.4363F, 0.0F);
        bone33.setTextureOffset(50, 61).addBox(-6.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F);

        bone34 = new ModelRenderer(this);
        bone34.setTextureSize(128, 128);
        bone34.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone32.addChild(bone34);
        setRotation(bone34, 0.0F, -0.4363F, 0.0F);
        bone34.setTextureOffset(48, 59).addBox(0.0F, 18.01F, 0.0F, 6, 1, 1, 0.0F);

        bone20 = new ModelRenderer(this);
        bone20.setTextureSize(128, 128);
        bone20.setRotationPoint(0.25F, 0.0F, 0.25F);
        bone14.addChild(bone20);
        setRotation(bone20, 0.0F, -1.5708F, 0.0F);

        bone21 = new ModelRenderer(this);
        bone21.setTextureSize(128, 128);
        bone21.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone20.addChild(bone21);
        setRotation(bone21, 0.0F, 0.4363F, 0.0F);
        bone21.setTextureOffset(63, 36).addBox(-6.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F);

        bone22 = new ModelRenderer(this);
        bone22.setTextureSize(128, 128);
        bone22.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone20.addChild(bone22);
        setRotation(bone22, 0.0F, -0.4363F, 0.0F);
        bone22.setTextureOffset(63, 34).addBox(0.0F, 18.0F, 0.0F, 6, 1, 1, 0.0F);

        bone26 = new ModelRenderer(this);
        bone26.setTextureSize(128, 128);
        bone26.setRotationPoint(-0.75F, 0.0F, 0.25F);
        bone14.addChild(bone26);
        setRotation(bone26, 0.0F, 1.5708F, 0.0F);

        bone27 = new ModelRenderer(this);
        bone27.setTextureSize(128, 128);
        bone27.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone26.addChild(bone27);
        setRotation(bone27, 0.0F, 0.4363F, 0.0F);
        bone27.setTextureOffset(63, 28).addBox(-6.2113F, 18.0F, 0.4532F, 6, 1, 1, 0.0F);

        bone28 = new ModelRenderer(this);
        bone28.setTextureSize(128, 128);
        bone28.setRotationPoint(0.0F, -19.0F, -8.0F);
        bone26.addChild(bone28);
        setRotation(bone28, 0.0F, -0.4363F, 0.0F);
        bone28.setTextureOffset(63, 26).addBox(0.2113F, 18.0F, 0.4532F, 6, 1, 1, 0.0F);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha) {
        bone13.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
