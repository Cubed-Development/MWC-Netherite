
package dev.redstudio.netherite.props.electronics;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class Monitor extends EntityModel<Entity> {

    private final ModelRenderer keyboard;
    private final ModelRenderer Keyboard2_r1;
    private final ModelRenderer mouse;
    private final ModelRenderer monitor;
    private final ModelRenderer Monitor9_r1;

    public Monitor() {
        textureWidth = 512;
        textureHeight = 512;

        keyboard = new ModelRenderer(this, 0, 0);
        keyboard.setTextureSize(512, 512);
        keyboard.setRotationPoint(0.0F, 24.0F, 0.0F);
        keyboard.mirror = true;
        keyboard.addBox(-1.0F, -2.0F, -9.0F, 6, 1, 17);

        keyboard.setTextureOffset(100, 0);
        keyboard.addBox(-0.5F, -3.0F, -8.5F, 1, 1, 1);
        keyboard.addBox(-0.5F, -3.0F, -6.5F, 1, 1, 1);
        keyboard.addBox(-0.5F, -3.0F, -5.0F, 1, 1, 1);
        keyboard.addBox(-0.5F, -3.0F, -3.5F, 1, 1, 1);
        keyboard.addBox(-0.5F, -3.0F, -2.0F, 1, 1, 1);
        keyboard.addBox(-0.5F, -3.0F, -0.5F, 1, 1, 1);
        keyboard.addBox(-0.5F, -3.0F, 1.0F, 1, 1, 1);
        keyboard.addBox(-0.5F, -3.0F, 2.5F, 1, 1, 1);
        keyboard.addBox(-0.5F, -3.0F, 6.5F, 1, 1, 1);
        keyboard.addBox(-0.5F, -3.0F, 5.0F, 1, 1, 1);

        keyboard.addBox(1.3F, -2.8F, -8.5F, 1, 1, 1);
        keyboard.addBox(1.3F, -2.8F, -7.0F, 1, 1, 1);
        keyboard.addBox(1.3F, -2.8F, -5.5F, 1, 1, 1);
        keyboard.addBox(1.3F, -2.8F, -4.0F, 1, 1, 1);
        keyboard.addBox(1.3F, -2.8F, -2.5F, 1, 1, 1);
        keyboard.addBox(1.3F, -2.8F, -1.0F, 1, 1, 1);
        keyboard.addBox(1.3F, -2.8F, 0.5F, 1, 1, 1);
        keyboard.addBox(1.3F, -2.8F, 2.0F, 1, 1, 1);
        keyboard.addBox(1.3F, -2.8F, 3.5F, 1, 1, 1);
        keyboard.addBox(1.3F, -2.8F, 5.0F, 1, 1, 1);
        keyboard.addBox(1.3F, -2.8F, 6.5F, 1, 1, 1);

        keyboard.addBox(2.5F, -2.6F, -8.5F, 1, 1, 2);
        keyboard.addBox(2.5F, -2.6F, -6.0F, 1, 1, 1);
        keyboard.addBox(2.5F, -2.6F, -4.5F, 1, 1, 1);
        keyboard.addBox(2.5F, -2.6F, -3.0F, 1, 1, 1);
        keyboard.addBox(2.5F, -2.6F, -1.5F, 1, 1, 1);
        keyboard.addBox(2.5F, -2.6F, 0.0F, 1, 1, 1);
        keyboard.addBox(2.5F, -2.6F, 1.5F, 1, 1, 1);
        keyboard.addBox(2.5F, -2.6F, 3.0F, 1, 1, 1);
        keyboard.addBox(2.5F, -2.6F, 4.5F, 1, 1, 1);
        keyboard.addBox(2.5F, -2.6F, 6.0F, 1, 1, 1);

        keyboard.addBox(3.7F, -2.4F, -8.5F, 1, 1, 1);
        keyboard.addBox(3.7F, -2.4F, -7.0F, 1, 1, 1);
        keyboard.addBox(3.7F, -2.4F, -5.5F, 1, 1, 1);
        keyboard.addBox(3.7F, -2.4F, -4.0F, 1, 1, 6);
        keyboard.addBox(3.7F, -2.4F, 2.5F, 1, 1, 1);
        keyboard.addBox(3.7F, -2.4F, 4.0F, 1, 1, 1);
        keyboard.addBox(3.7F, -2.4F, 5.5F, 1, 1, 2);

        Keyboard2_r1 = new ModelRenderer(this, 0, 0);
        Keyboard2_r1.setTextureSize(512, 512);
        Keyboard2_r1.setRotationPoint(-0.4804F, 0.1039F, 0.0F);
        keyboard.addChild(Keyboard2_r1);
        setRotation(Keyboard2_r1, 0.0F, 0.0F, 0.1571F);
        Keyboard2_r1.mirror = true;
        Keyboard2_r1.addBox(-0.9F, -3.0F, -9.0F, 6, 1, 17);

        mouse = new ModelRenderer(this, 150, 0);
        mouse.setTextureSize(512, 512);
        mouse.setRotationPoint(0.0F, 24.0F, 0.0F);
        mouse.mirror = true;
        mouse.addBox(0.0F, -2.0F, 10.5F, 4, 1, 3);
        mouse.addBox(1.0F, -2.2F, 10.5F, 3, 1, 3);
        mouse.addBox(-0.1F, -2.2F, 10.5F, 1, 1, 1);
        mouse.addBox(-0.1F, -2.2F, 12.5F, 1, 1, 1);

        mouse.setTextureOffset(150, 30);
        mouse.addBox(-0.1F, -2.4F, 11.5F, 1, 1, 1);

        monitor = new ModelRenderer(this, 200, 0);
        monitor.setTextureSize(512, 512);
        monitor.setRotationPoint(2.7153F, 22.8312F, 0.0F);
        monitor.mirror = true;
        monitor.addBox(-10.7153F, -0.8312F, -5.0F, 6, 1, 9);
        monitor.addBox(-8.7153F, -7.8312F, -2.0F, 1, 7, 3);

        Monitor9_r1 = new ModelRenderer(this, 200, 0);
        Monitor9_r1.setTextureSize(512, 512);
        monitor.addChild(Monitor9_r1);
        setRotation(Monitor9_r1, 0.0F, 0.0F, -0.1396F);
        Monitor9_r1.mirror = true;
        Monitor9_r1.addBox(-6.7F, -7.0F, -9.0F, 1, 1, 17);
        Monitor9_r1.addBox(-6.7F, -20.0F, -9.0F, 1, 1, 17);
        Monitor9_r1.addBox(-6.7F, -20.0F, -10.0F, 1, 14, 1);
        Monitor9_r1.addBox(-6.7F, -20.0F, 8.0F, 1, 14, 1);

        Monitor9_r1.setTextureOffset(200, 40);
        Monitor9_r1.addBox(-6.9F, -19.5F, -9.5F, 1, 13, 18);

        Monitor9_r1.setTextureOffset(200, 0);
        Monitor9_r1.addBox(-7.5F, -19.5F, -9.5F, 1, 13, 18);
        Monitor9_r1.addBox(-7.0F, -20.0F, -10.0F, 1, 14, 19);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha) {
        keyboard.render(matrixStack, buffer, packedLight, packedOverlay);
        mouse.render(matrixStack, buffer, packedLight, packedOverlay);
        monitor.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
