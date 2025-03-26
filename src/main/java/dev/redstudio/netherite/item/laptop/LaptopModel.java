package dev.redstudio.netherite.item.laptop;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class LaptopModel extends EntityModel<Entity> {
    //fields
    private final ModelRenderer Keyboard1;
    private final ModelRenderer Keyboard2;
    private final ModelRenderer[] KeyboardButtons = new ModelRenderer[36]; // Array for Keyboard buttons
    private final ModelRenderer Monitor1;
    private final ModelRenderer Monitor2;
    private final ModelRenderer Monitor3;
    private final ModelRenderer Monitor4;
    private final ModelRenderer Monitor5;
    private final ModelRenderer Monitor6;
    private final ModelRenderer Monitor7;
    private final ModelRenderer Trackpad;

    public LaptopModel() {
        textureWidth = 512;
        textureHeight = 512;

        Keyboard1 = new ModelRenderer(this, 0, 0);
        Keyboard1.addBox(0F, 0F, 0F, 10, 1, 17);
        Keyboard1.setRotationPoint(-2F, 22F, -9F);
        Keyboard1.setTextureOffset(0, 0);

        Keyboard2 = new ModelRenderer(this, 0, 0);
        Keyboard2.addBox(0F, 0F, 0F, 10, 1, 17);
        Keyboard2.setRotationPoint(-1.9F, 21.55F, -9F);
        Keyboard2.setTextureOffset(0, 0);

        // Loop for setting up all keyboard buttons
        for (int i = 0; i < 36; i++) {
            KeyboardButtons[i] = new ModelRenderer(this, 100, 0);
            KeyboardButtons[i].addBox(0F, 0F, 0F, 1, 1, 1);
            float xOffset = (i < 12) ? -0.5F : 1.3F;
            float zOffset = -8.5F + (i % 12) * 1.5F;
            float yOffset = 21.5F + (i / 12) * 0.1F; // Adjust Y-axis for button positioning
            KeyboardButtons[i].setRotationPoint(xOffset, yOffset, zOffset);
            KeyboardButtons[i].setTextureOffset(100, 0);
        }

        Monitor1 = new ModelRenderer(this, 0, 20);
        Monitor1.addBox(0F, 0F, 0F, 10, 2, 7);
        Monitor1.setRotationPoint(-5F, 19F, -9F);
        Monitor1.setTextureOffset(0, 20);

        Monitor2 = new ModelRenderer(this, 0, 30);
        Monitor2.addBox(0F, 0F, 0F, 10, 2, 7);
        Monitor2.setRotationPoint(-5F, 19F, -2F);
        Monitor2.setTextureOffset(0, 30);

        Monitor3 = new ModelRenderer(this, 0, 40);
        Monitor3.addBox(0F, 0F, 0F, 10, 2, 7);
        Monitor3.setRotationPoint(-5F, 19F, 5F);
        Monitor3.setTextureOffset(0, 40);

        Monitor4 = new ModelRenderer(this, 0, 50);
        Monitor4.addBox(0F, 0F, 0F, 10, 2, 7);
        Monitor4.setRotationPoint(-5F, 19F, 12F);
        Monitor4.setTextureOffset(0, 50);

        Monitor5 = new ModelRenderer(this, 0, 60);
        Monitor5.addBox(0F, 0F, 0F, 10, 2, 7);
        Monitor5.setRotationPoint(-5F, 19F, 19F);
        Monitor5.setTextureOffset(0, 60);

        Monitor6 = new ModelRenderer(this, 0, 70);
        Monitor6.addBox(0F, 0F, 0F, 10, 2, 7);
        Monitor6.setRotationPoint(-5F, 19F, 26F);
        Monitor6.setTextureOffset(0, 70);

        Monitor7 = new ModelRenderer(this, 0, 80);
        Monitor7.addBox(0F, 0F, 0F, 10, 2, 7);
        Monitor7.setRotationPoint(-5F, 19F, 33F);
        Monitor7.setTextureOffset(0, 80);

        Trackpad = new ModelRenderer(this, 0, 90);
        Trackpad.addBox(0F, 0F, 0F, 4, 1, 2);
        Trackpad.setRotationPoint(-2F, 22F, 8F);
        Trackpad.setTextureOffset(0, 90);
    }

    @Override
    public void setRotationAngles(Entity entity, float v, float v1, float v2, float v3, float v4) {

    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Keyboard1.render(matrixStack, buffer, packedLight, packedOverlay);
        Keyboard2.render(matrixStack, buffer, packedLight, packedOverlay);

        // Render all keyboard buttons
        for (ModelRenderer button : KeyboardButtons) {
            button.render(matrixStack, buffer, packedLight, packedOverlay);
        }

        Monitor1.render(matrixStack, buffer, packedLight, packedOverlay);
        Monitor2.render(matrixStack, buffer, packedLight, packedOverlay);
        Monitor3.render(matrixStack, buffer, packedLight, packedOverlay);
        Monitor4.render(matrixStack, buffer, packedLight, packedOverlay);
        Monitor5.render(matrixStack, buffer, packedLight, packedOverlay);
        Monitor6.render(matrixStack, buffer, packedLight, packedOverlay);
        Monitor7.render(matrixStack, buffer, packedLight, packedOverlay);
        Trackpad.render(matrixStack, buffer, packedLight, packedOverlay);
    }

}
