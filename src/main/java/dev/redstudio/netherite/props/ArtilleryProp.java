
package dev.redstudio.netherite.props;

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
public final class ArtilleryProp extends EntityModel<Entity> {

    private final ModelRenderer ArtilleryProp;
    private final ModelRenderer gun;
    private final ModelRenderer Place2_r1;
    private final ModelRenderer FiringPin_r1;
    private final ModelRenderer ValveTwo2_r1;
    private final ModelRenderer Support5_r1;
    private final ModelRenderer Gunholder2_r1;
    private final ModelRenderer Gunholder1_r1;
    private final ModelRenderer MiddleDown5_r1;
    private final ModelRenderer MiddleDown4_r1;
    private final ModelRenderer MiddleDown3_r1;
    private final ModelRenderer LGround4_r1;
    private final ModelRenderer RGround4_r1;
    private final ModelRenderer Gun20_r1;
    private final ModelRenderer Gun10DirectionCorrector_r1;
    private final ModelRenderer Gun8DirectionCorrector_r1;
    private final ModelRenderer muzzle;
    private final ModelRenderer Muzzle14_r1;
    private final ModelRenderer Muzzle13_r1;
    private final ModelRenderer shield;
    private final ModelRenderer Shield4_r1;
    private final ModelRenderer ShieldOnGun_r1;
    private final ModelRenderer Wheel;

    public ArtilleryProp() {
        textureWidth = 512;
        textureHeight = 512;

        ArtilleryProp = new ModelRenderer(this);
        ArtilleryProp.setTextureSize(512, 512);
        ArtilleryProp.setRotationPoint(0.0F, 24.0F, 0.0F);

        gun = new ModelRenderer(this);
        gun.setTextureSize(512, 512);
        gun.mirror = true;
        gun.setRotationPoint(0.0F, 1.1845F, 5.6039F);
        ArtilleryProp.addChild(gun);
        gun.setTextureOffset(0, 0).addBox(-4.0F, -15.1845F, -2.6039F, 7.0F, 2.0F, 2.0F, 0.0F);
        gun.setTextureOffset(0, 0).addBox(-9.0F, -16.1845F, -0.6039F, 17.0F, 5.0F, 7.0F, 0.0F);
        gun.setTextureOffset(0, 0).addBox(-4.0F, -16.1845F, 6.3961F, 7.0F, 4.0F, 9.0F, 0.0F);
        gun.setTextureOffset(0, 0).addBox(-3.5F, -14.8845F, 15.1961F, 2.0F, 2.0F, 1.0F, 0.0F);
        gun.setTextureOffset(0, 0).addBox(0.5F, -14.8845F, 15.1961F, 2.0F, 2.0F, 1.0F, 0.0F);
        gun.setTextureOffset(0, 0).addBox(0.0F, -17.6845F, 14.8961F, 3.0F, 5.0F, 1.0F, 0.0F);
        gun.setTextureOffset(0, 0).addBox(-4.0F, -17.6845F, 14.8961F, 3.0F, 5.0F, 1.0F, 0.0F);
        gun.setTextureOffset(0, 0).addBox(-4.5F, -18.1845F, 14.3961F, 8.0F, 2.0F, 2.0F, 0.0F);
        gun.setTextureOffset(0, 0).addBox(-7.0F, -6.1845F, 6.3961F, 13.0F, 2.0F, 13.0F, 0.0F);
        gun.setTextureOffset(0, 0).addBox(-1.5F, -7.1845F, 11.8961F, 2.0F, 1.0F, 2.0F, 0.0F);
        gun.setTextureOffset(0, 0).addBox(-6.5F, -9.1845F, 11.8961F, 12.0F, 2.0F, 2.0F, 0.0F);
        gun.setTextureOffset(0, 0).addBox(-4.5F, -15.1845F, 12.5961F, 8.0F, 2.0F, 2.0F, 0.0F);
        gun.setTextureOffset(0, 0).addBox(-7.0F, -19.1845F, -0.6039F, 4.0F, 1.0F, 1.0F, 0.0F);
        gun.setTextureOffset(0, 100).addBox(-8.0F, -20.1845F, -1.6039F, 3.0F, 3.0F, 1.0F, 0.0F);
        gun.setTextureOffset(0, 0).addBox(-8.0F, -21.1845F, 0.3961F, 5.0F, 1.0F, 1.0F, 0.0F);

        Place2_r1 = new ModelRenderer(this);
        Place2_r1.setTextureSize(512, 512);
        Place2_r1.mirror = true;
        Place2_r1.setRotationPoint(0.0F, -0.4755F, 0.1737F);
        gun.addChild(Place2_r1);
        setRotation(Place2_r1, 0.2269F, 0.0F, 0.0F);
        Place2_r1.setTextureOffset(0, 0).addBox(-4.0F, -25.0F, -7.0F, 1.0F, 4.0F, 10.0F, 0.0F);
        Place2_r1.setTextureOffset(0, 0).addBox(2.0F, -25.0F, -7.0F, 1.0F, 4.0F, 10.0F, 0.0F);
        Place2_r1.setTextureOffset(0, 0).addBox(-2.8F, -24.0F, 3.5F, 2.0F, 3.0F, 2.0F, 0.0F);
        Place2_r1.setTextureOffset(0, 0).addBox(-3.5F, -25.0F, 3.0F, 1.0F, 5.0F, 10.0F, 0.0F);
        Place2_r1.setTextureOffset(0, 0).addBox(1.5F, -25.0F, 3.0F, 1.0F, 5.0F, 10.0F, 0.0F);
        Place2_r1.setTextureOffset(0, 0).addBox(-1.5F, -20.0F, 18.0F, 2.0F, 1.0F, 2.0F, 0.0F);
        Place2_r1.setTextureOffset(0, 0).addBox(1.0F, -25.0F, 3.0F, 1.0F, 5.0F, 60.0F, 0.0F);
        Place2_r1.setTextureOffset(0, 0).addBox(-3.0F, -25.0F, 3.0F, 1.0F, 5.0F, 60.0F, 0.0F);
        Place2_r1.setTextureOffset(0, 0).addBox(-3.0F, -21.0F, 3.0F, 5.0F, 1.0F, 60.0F, 0.0F);
        Place2_r1.setTextureOffset(0, 0).addBox(-2.0F, -25.0F, -4.0F, 3.0F, 1.0F, 7.0F, 0.0F);
        Place2_r1.setTextureOffset(0, 0).addBox(1.0F, -25.0F, -7.0F, 1.0F, 4.0F, 10.0F, 0.0F);
        Place2_r1.setTextureOffset(0, 0).addBox(-3.0F, -25.0F, -7.0F, 1.0F, 4.0F, 10.0F, 0.0F);
        Place2_r1.setTextureOffset(0, 0).addBox(-4.0F, -21.0F, -7.0F, 7.0F, 1.0F, 10.0F, 0.0F);
        Place2_r1.setTextureOffset(0, 0).addBox(-3.5F, -20.0F, 3.0F, 6.0F, 4.0F, 10.0F, 0.0F);
        Place2_r1.setTextureOffset(0, 0).addBox(-3.0F, -25.0F, 3.0F, 5.0F, 1.0F, 60.0F, 0.0F);

        FiringPin_r1 = new ModelRenderer(this);
        FiringPin_r1.setTextureSize(512, 512);
        FiringPin_r1.mirror = true;
        FiringPin_r1.setRotationPoint(0.0F, -0.4499F, -0.0513F);
        gun.addChild(FiringPin_r1);
        setRotation(FiringPin_r1, 0.2269F, 0.0F, 0.0F);
        FiringPin_r1.setTextureOffset(0, 0).addBox(-5.0F, -24.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F);

        ValveTwo2_r1 = new ModelRenderer(this);
        ValveTwo2_r1.setTextureSize(512, 512);
        ValveTwo2_r1.mirror = true;
        ValveTwo2_r1.setRotationPoint(0.0F, -12.8803F, -19.3023F);
        gun.addChild(ValveTwo2_r1);
        setRotation(ValveTwo2_r1, -0.8203F, 0.0F, 0.0F);
        ValveTwo2_r1.setTextureOffset(0, 100).addBox(-9.0F, -21.6F, 6.6F, 1.0F, 3.0F, 3.0F, 0.0F);

        Support5_r1 = new ModelRenderer(this);
        Support5_r1.setTextureSize(512, 512);
        Support5_r1.mirror = true;
        Support5_r1.setRotationPoint(0.0F, -4.2196F, -7.5686F);
        gun.addChild(Support5_r1);
        setRotation(Support5_r1, -0.1571F, 0.0F, 0.0F);
        Support5_r1.setTextureOffset(0, 0).addBox(-6.5F, -14.0F, 18.3F, 2.0F, 6.0F, 2.0F, 0.0F);
        Support5_r1.setTextureOffset(0, 0).addBox(3.5F, -14.0F, 18.3F, 2.0F, 6.0F, 2.0F, 0.0F);

        Gunholder2_r1 = new ModelRenderer(this);
        Gunholder2_r1.setTextureSize(512, 512);
        Gunholder2_r1.mirror = true;
        Gunholder2_r1.setRotationPoint(-6.8F, -1.2198F, -5.6039F);
        gun.addChild(Gunholder2_r1);
        setRotation(Gunholder2_r1, 0.0F, 0.0F, 0.3491F);
        Gunholder2_r1.setTextureOffset(200, 0).addBox(-3.8F, -19.3F, 12.5F, 2.0F, 5.0F, 2.0F, 0.0F);

        Gunholder1_r1 = new ModelRenderer(this);
        Gunholder1_r1.setTextureSize(512, 512);
        Gunholder1_r1.mirror = true;
        Gunholder1_r1.setRotationPoint(6.5888F, -1.8173F, -5.6039F);
        gun.addChild(Gunholder1_r1);
        setRotation(Gunholder1_r1, 0.0F, 0.0F, -0.3491F);
        Gunholder1_r1.setTextureOffset(200, 0).addBox(1.0F, -19.0F, 12.5F, 2.0F, 5.0F, 2.0F, 0.0F);

        MiddleDown5_r1 = new ModelRenderer(this);
        MiddleDown5_r1.setTextureSize(512, 512);
        MiddleDown5_r1.mirror = true;
        MiddleDown5_r1.setRotationPoint(0.0F, 0.135F, -4.1776F);
        gun.addChild(MiddleDown5_r1);
        setRotation(MiddleDown5_r1, 0.1222F, 0.0F, 0.0F);
        MiddleDown5_r1.setTextureOffset(0, 0).addBox(-4.0F, -11.0F, 11.5F, 7.0F, 1.0F, 9.0F, 0.0F);

        MiddleDown4_r1 = new ModelRenderer(this);
        MiddleDown4_r1.setTextureSize(512, 512);
        MiddleDown4_r1.mirror = true;
        MiddleDown4_r1.setRotationPoint(-1.4997F, -1.1845F, -6.1238F);
        gun.addChild(MiddleDown4_r1);
        setRotation(MiddleDown4_r1, 0.0F, 0.1222F, 0.0F);
        MiddleDown4_r1.setTextureOffset(0, 0).addBox(-5.0F, -15.0F, 11.0F, 3.0F, 4.0F, 9.0F, 0.0F);

        MiddleDown3_r1 = new ModelRenderer(this);
        MiddleDown3_r1.setTextureSize(512, 512);
        MiddleDown3_r1.mirror = true;
        MiddleDown3_r1.setRotationPoint(1.4699F, -1.1845F, -5.6363F);
        gun.addChild(MiddleDown3_r1);
        setRotation(MiddleDown3_r1, 0.0F, -0.1222F, 0.0F);
        MiddleDown3_r1.setTextureOffset(0, 0).addBox(1.0F, -15.0F, 11.0F, 3.0F, 4.0F, 9.0F, 0.0F);

        LGround4_r1 = new ModelRenderer(this);
        LGround4_r1.setTextureSize(512, 512);
        LGround4_r1.mirror = true;
        LGround4_r1.setRotationPoint(7.0626F, -1.1845F, -13.5496F);
        gun.addChild(LGround4_r1);
        setRotation(LGround4_r1, 0.0F, 0.3491F, 0.0F);
        LGround4_r1.setTextureOffset(0, 0).addBox(-21.0F, -6.0F, -39.0F, 8.0F, 2.0F, 8.0F, 0.0F);
        LGround4_r1.setTextureOffset(0, 0).addBox(-19.0F, -10.0F, -40.0F, 4.0F, 4.0F, 10.0F, 0.0F);
        LGround4_r1.setTextureOffset(0, 0).addBox(-19.0F, -14.0F, -4.0F, 4.0F, 4.0F, 11.0F, 0.0F);
        LGround4_r1.setTextureOffset(0, 0).addBox(-19.0F, -12.0F, -30.0F, 4.0F, 4.0F, 26.0F, 0.0F);

        RGround4_r1 = new ModelRenderer(this);
        RGround4_r1.setTextureSize(512, 512);
        RGround4_r1.mirror = true;
        RGround4_r1.setRotationPoint(-7.3642F, -1.1845F, -11.8395F);
        gun.addChild(RGround4_r1);
        setRotation(RGround4_r1, 0.0F, -0.3491F, 0.0F);
        RGround4_r1.setTextureOffset(0, 0).addBox(12.0F, -6.0F, -39.0F, 8.0F, 2.0F, 8.0F, 0.0F);
        RGround4_r1.setTextureOffset(0, 0).addBox(14.0F, -10.0F, -40.0F, 4.0F, 4.0F, 10.0F, 0.0F);
        RGround4_r1.setTextureOffset(0, 0).addBox(14.0F, -14.0F, -4.0F, 4.0F, 4.0F, 11.0F, 0.0F);
        RGround4_r1.setTextureOffset(0, 0).addBox(14.0F, -12.0F, -30.0F, 4.0F, 4.0F, 26.0F, 0.0F);

        Gun20_r1 = new ModelRenderer(this);
        Gun20_r1.setTextureSize(512, 512);
        Gun20_r1.mirror = true;
        gun.addChild(Gun20_r1);
        setRotation(Gun20_r1, 0.2269F, 0.0F, 0.0F);
        Gun20_r1.setTextureOffset(0, 0).addBox(-3.0F, -28.0F, -4.5F, 1.0F, 1.0F, 28.0F, 0.0F);
        Gun20_r1.setTextureOffset(0, 0).addBox(1.0F, -28.0F, -6.5F, 1.0F, 1.0F, 30.0F, 0.0F);
        Gun20_r1.setTextureOffset(0, 0).addBox(1.0F, -28.0F, 22.0F, 2.0F, 4.0F, 1.0F, 0.0F);
        Gun20_r1.setTextureOffset(0, 0).addBox(-4.0F, -28.0F, 22.0F, 2.0F, 4.0F, 1.0F, 0.0F);
        Gun20_r1.setTextureOffset(0, 0).addBox(0.5F, -28.5F, -6.0F, 2.0F, 2.0F, 29.0F, 0.0F);
        Gun20_r1.setTextureOffset(0, 0).addBox(-3.0F, -28.0F, -2.8F, 5.0F, 3.0F, 24.0F, 0.0F);
        Gun20_r1.setTextureOffset(0, 0).addBox(-3.5F, -28.5F, -4.0F, 2.0F, 2.0F, 27.0F, 0.0F);

        Gun10DirectionCorrector_r1 = new ModelRenderer(this);
        Gun10DirectionCorrector_r1.setTextureSize(512, 512);
        Gun10DirectionCorrector_r1.mirror = true;
        Gun10DirectionCorrector_r1.setRotationPoint(0.0F, -3.0179F, -10.5357F);
        gun.addChild(Gun10DirectionCorrector_r1);
        setRotation(Gun10DirectionCorrector_r1, -0.2443F, 0.0F, 0.0F);
        Gun10DirectionCorrector_r1.setTextureOffset(200, 0).addBox(-2.0F, -18.0F, 5.0F, 1.0F, 5.0F, 1.0F, 0.0F);

        Gun8DirectionCorrector_r1 = new ModelRenderer(this);
        Gun8DirectionCorrector_r1.setTextureSize(512, 512);
        Gun8DirectionCorrector_r1.mirror = true;
        Gun8DirectionCorrector_r1.setRotationPoint(0.0F, -2.5065F, -9.3707F);
        gun.addChild(Gun8DirectionCorrector_r1);
        setRotation(Gun8DirectionCorrector_r1, -0.2443F, 0.0F, 0.0F);
        Gun8DirectionCorrector_r1.setTextureOffset(0, 0).addBox(0.5F, -19.0F, 3.5F, 2.0F, 5.0F, 2.0F, 0.0F);

        muzzle = new ModelRenderer(this);
        muzzle.setTextureSize(512, 512);
        muzzle.mirror = true;
        muzzle.setRotationPoint(0.0F, -1.7996F, -0.205F);
        gun.addChild(muzzle);

        Muzzle14_r1 = new ModelRenderer(this);
        Muzzle14_r1.setTextureSize(512, 512);
        Muzzle14_r1.mirror = true;
        muzzle.addChild(Muzzle14_r1);
        setRotation(Muzzle14_r1, 0.2269F, 0.0F, 0.0F);
        Muzzle14_r1.setTextureOffset(0, 0).addBox(-3.0F, -21.0F, 70.0F, 5.0F, 1.0F, 1.0F, 0.0F);

        Muzzle13_r1 = new ModelRenderer(this);
        Muzzle13_r1.setTextureSize(512, 512);
        Muzzle13_r1.mirror = true;
        Muzzle13_r1.setRotationPoint(0.0F, 1.3241F, 0.3787F);
        muzzle.addChild(Muzzle13_r1);
        setRotation(Muzzle13_r1, 0.2269F, 0.0F, 0.0F);
        Muzzle13_r1.setTextureOffset(0, 0).addBox(-3.0F, -25.0F, 70.0F, 5.0F, 1.0F, 1.0F, 0.0F);
        Muzzle13_r1.setTextureOffset(0, 0).addBox(-4.0F, -25.0F, 63.0F, 1.0F, 1.0F, 8.0F, 0.0F);
        Muzzle13_r1.setTextureOffset(0, 0).addBox(-4.0F, -21.0F, 63.0F, 1.0F, 1.0F, 8.0F, 0.0F);
        Muzzle13_r1.setTextureOffset(0, 0).addBox(-4.0F, -24.0F, 70.0F, 2.0F, 3.0F, 1.0F, 0.0F);
        Muzzle13_r1.setTextureOffset(0, 0).addBox(-4.0F, -24.0F, 66.5F, 1.0F, 3.0F, 2.0F, 0.0F);
        Muzzle13_r1.setTextureOffset(0, 0).addBox(1.0F, -24.0F, 70.0F, 2.0F, 3.0F, 1.0F, 0.0F);
        Muzzle13_r1.setTextureOffset(0, 0).addBox(2.0F, -24.0F, 66.5F, 1.0F, 3.0F, 2.0F, 0.0F);
        Muzzle13_r1.setTextureOffset(0, 0).addBox(-4.0F, -24.0F, 63.0F, 1.0F, 3.0F, 1.0F, 0.0F);
        Muzzle13_r1.setTextureOffset(0, 0).addBox(2.0F, -24.0F, 63.0F, 1.0F, 3.0F, 1.0F, 0.0F);
        Muzzle13_r1.setTextureOffset(0, 0).addBox(2.0F, -21.0F, 63.0F, 1.0F, 1.0F, 8.0F, 0.0F);
        Muzzle13_r1.setTextureOffset(0, 0).addBox(2.0F, -25.0F, 63.0F, 1.0F, 1.0F, 8.0F, 0.0F);
        Muzzle13_r1.setTextureOffset(0, 0).addBox(-4.0F, -20.5F, 63.0F, 7.0F, 1.0F, 8.0F, 0.0F);
        Muzzle13_r1.setTextureOffset(0, 0).addBox(-4.0F, -25.5F, 63.0F, 7.0F, 1.0F, 8.0F, 0.0F);

        shield = new ModelRenderer(this);
        shield.setTextureSize(512, 512);
        shield.mirror = true;
        ArtilleryProp.addChild(shield);
        shield.setTextureOffset(0, 0).addBox(2.0F, -23.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F);
        shield.setTextureOffset(0, 0).addBox(-5.0F, -23.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F);
        shield.setTextureOffset(0, 0).addBox(-4.5F, -24.0F, 7.0F, 1.0F, 2.0F, 1.0F, 0.0F);
        shield.setTextureOffset(0, 0).addBox(-4.5F, -24.0F, 5.0F, 1.0F, 2.0F, 1.0F, 0.0F);
        shield.setTextureOffset(0, 0).addBox(-4.5F, -22.0F, 5.0F, 1.0F, 2.0F, 4.0F, 0.0F);
        shield.setTextureOffset(0, 0).addBox(2.5F, -24.0F, 7.0F, 1.0F, 2.0F, 1.0F, 0.0F);
        shield.setTextureOffset(0, 0).addBox(2.5F, -24.0F, 5.0F, 1.0F, 2.0F, 1.0F, 0.0F);
        shield.setTextureOffset(0, 0).addBox(2.5F, -22.0F, 5.0F, 1.0F, 2.0F, 4.0F, 0.0F);
        shield.setTextureOffset(0, 0).addBox(-10.5F, -24.0F, 9.0F, 7.0F, 8.0F, 2.0F, 0.0F);
        shield.setTextureOffset(0, 0).addBox(2.5F, -24.0F, 9.0F, 7.0F, 8.0F, 2.0F, 0.0F);
        shield.setTextureOffset(0, 0).addBox(4.0F, -17.0F, 9.0F, 3.0F, 2.0F, 2.0F, 0.0F);
        shield.setTextureOffset(0, 0).addBox(-8.0F, -17.0F, 9.0F, 3.0F, 2.0F, 2.0F, 0.0F);

        Shield4_r1 = new ModelRenderer(this);
        Shield4_r1.setTextureSize(512, 512);
        Shield4_r1.mirror = true;
        Shield4_r1.setRotationPoint(0.0F, 0.7128F, 7.9948F);
        shield.addChild(Shield4_r1);
        setRotation(Shield4_r1, 0.2443F, 0.0F, 0.0F);
        Shield4_r1.setTextureOffset(0, 0).addBox(2.5F, -33.2F, 6.9F, 12.0F, 10.0F, 2.0F, 0.0F);
        Shield4_r1.setTextureOffset(0, 0).addBox(-15.5F, -33.2F, 6.9F, 9.0F, 10.0F, 2.0F, 0.0F);
        Shield4_r1.setTextureOffset(0, 0).addBox(-6.5F, -33.2F, 6.9F, 2.0F, 3.0F, 2.0F, 0.0F);
        Shield4_r1.setTextureOffset(0, 0).addBox(-6.5F, -27.2F, 6.9F, 2.0F, 4.0F, 2.0F, 0.0F);
        Shield4_r1.setTextureOffset(0, 0).addBox(-4.5F, -33.2F, 6.9F, 1.0F, 10.0F, 2.0F, 0.0F);
        Shield4_r1.setTextureOffset(0, 0).addBox(5.5F, -31.2F, 4.9F, 5.0F, 5.0F, 2.0F, 0.0F);
        Shield4_r1.setTextureOffset(0, 0).addBox(-13.5F, -29.2F, 4.9F, 2.0F, 5.0F, 2.0F, 0.0F);

        ShieldOnGun_r1 = new ModelRenderer(this);
        ShieldOnGun_r1.setTextureSize(512, 512);
        ShieldOnGun_r1.mirror = true;
        ShieldOnGun_r1.setRotationPoint(0.0F, 0.7187F, 7.9465F);
        shield.addChild(ShieldOnGun_r1);
        setRotation(ShieldOnGun_r1, 0.2443F, 0.0F, 0.0F);
        ShieldOnGun_r1.setTextureOffset(0, 0).addBox(-3.0F, -33.5F, 7.3F, 5.0F, 5.0F, 2.0F, 0.0F);

        Wheel = new ModelRenderer(this);
        Wheel.setTextureSize(512, 512);
        Wheel.mirror = true;
        ArtilleryProp.addChild(Wheel);
        Wheel.setTextureOffset(0, 0).addBox(-16.5F, -15.0F, 4.0F, 5.0F, 9.0F, 9.0F, 0.0F);
        Wheel.setTextureOffset(0, 0).addBox(10.5F, -15.0F, 4.0F, 5.0F, 9.0F, 9.0F, 0.0F);
        Wheel.setTextureOffset(0, 0).addBox(-12.0F, -11.5F, 7.5F, 23.0F, 2.0F, 2.0F, 0.0F);
        Wheel.setTextureOffset(250, 0).addBox(11.0F, -18.0F, 3.0F, 4.0F, 15.0F, 11.0F, 0.0F);
        Wheel.setTextureOffset(250, 0).addBox(11.0F, -16.0F, 1.0F, 4.0F, 11.0F, 15.0F, 0.0F);
        Wheel.setTextureOffset(250, 0).addBox(-16.0F, -18.0F, 3.0F, 4.0F, 15.0F, 11.0F, 0.0F);
        Wheel.setTextureOffset(250, 0).addBox(-16.0F, -16.0F, 1.0F, 4.0F, 11.0F, 15.0F, 0.0F);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha) {
        ArtilleryProp.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
