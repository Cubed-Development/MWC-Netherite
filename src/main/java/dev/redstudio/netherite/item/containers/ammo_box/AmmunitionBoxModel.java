
package dev.redstudio.netherite.item.containers.ammo_box;

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
public final class AmmunitionBoxModel extends EntityModel<Entity> {

    private final ModelRenderer ammobox;
    private final ModelRenderer Shape;
    private final ModelRenderer Shape24_r1;
    private final ModelRenderer Shape23_r1;
    private final ModelRenderer Shape8_r1;
    private final ModelRenderer handle;
    private final ModelRenderer text;

    public AmmunitionBoxModel() {

        ammobox = new ModelRenderer(this);
        ammobox.setTextureSize(512, 512);
        ammobox.setRotationPoint(0.0F, 51.0F, 0.0F);

        Shape = new ModelRenderer(this);
        Shape.setTextureSize(512, 512);
        Shape.mirror = true;
        ammobox.addChild(Shape);
        Shape.setTextureOffset(0, 0).addBox(-3.0F, -17.0F, -11.0F, 6.0F, 4.0F, 1.0F, 0.0F);
        Shape.setTextureOffset(0, 0).addBox(-6.0F, -4.0F, -10.0F, 12.0F, 1.0F, 25.0F, 0.0F);
        Shape.setTextureOffset(0, 0).addBox(5.0F, -22.0F, -10.0F, 1.0F, 18.0F, 25.0F, 0.0F);
        Shape.setTextureOffset(0, 0).addBox(-6.0F, -22.0F, -10.0F, 1.0F, 18.0F, 25.0F, 0.0F);
        Shape.setTextureOffset(0, 0).addBox(-5.0F, -22.0F, -10.0F, 10.0F, 18.0F, 1.0F, 0.0F);
        Shape.setTextureOffset(0, 0).addBox(-5.0F, -22.0F, 14.0F, 10.0F, 18.0F, 1.0F, 0.0F);
        Shape.setTextureOffset(0, 0).addBox(-6.5F, -23.0F, -11.0F, 13.0F, 1.0F, 27.0F, 0.0F);
        Shape.setTextureOffset(0, 0).addBox(-6.5F, -22.0F, -10.0F, 13.0F, 1.0F, 24.0F, 0.0F);
        Shape.setTextureOffset(0, 0).addBox(-6.5F, -21.0F, -10.0F, 13.0F, 2.0F, 14.0F, 0.0F);
        Shape.setTextureOffset(0, 0).addBox(-6.5F, -20.0F, -10.0F, 13.0F, 3.0F, 1.0F, 0.0F);
        Shape.setTextureOffset(0, 0).addBox(-6.5F, -22.3F, 13.0F, 13.0F, 2.0F, 1.0F, 0.0F);
        Shape.setTextureOffset(0, 0).addBox(-5.0F, -23.2F, 15.5F, 10.0F, 2.0F, 1.0F, 0.0F);
        Shape.setTextureOffset(0, 0).addBox(-5.0F, -23.2F, 14.5F, 10.0F, 1.0F, 1.0F, 0.0F);
        Shape.setTextureOffset(0, 0).addBox(-5.0F, -21.5F, 14.8F, 10.0F, 3.0F, 1.0F, 0.0F);
        Shape.setTextureOffset(0, 0).addBox(-1.0F, -23.8F, 7.0F, 2.0F, 1.0F, 4.0F, 0.0F);
        Shape.setTextureOffset(0, 0).addBox(-1.0F, -23.8F, -6.0F, 2.0F, 1.0F, 4.0F, 0.0F);
        Shape.setTextureOffset(0, 0).addBox(-5.0F, -23.2F, -11.5F, 10.0F, 2.0F, 1.0F, 0.0F);
        Shape.setTextureOffset(0, 0).addBox(-5.0F, -23.2F, -10.5F, 10.0F, 1.0F, 1.0F, 0.0F);
        Shape.setTextureOffset(0, 0).addBox(-3.5F, -20.0F, -10.5F, 7.0F, 2.0F, 1.0F, 0.0F);
        Shape.setTextureOffset(0, 0).addBox(-4.0F, -19.0F, -11.5F, 8.0F, 1.0F, 1.0F, 0.0F);
        Shape.setTextureOffset(0, 0).addBox(-4.0F, -18.5F, -11.7F, 8.0F, 6.0F, 1.0F, 0.0F);

        Shape24_r1 = new ModelRenderer(this);
        Shape24_r1.setTextureSize(512, 512);
        Shape24_r1.mirror = true;
        Shape24_r1.setRotationPoint(5.5236F, -2.0437F, 0.0F);
        Shape.addChild(Shape24_r1);
        setRotation(Shape24_r1, 0.0F, 0.0F, -0.2618F);
        Shape24_r1.setTextureOffset(0, 0).addBox(-5.0F, -23.0F, -11.3F, 1.0F, 6.0F, 1.0F, 0.0F);

        Shape23_r1 = new ModelRenderer(this);
        Shape23_r1.setTextureSize(512, 512);
        Shape23_r1.mirror = true;
        Shape23_r1.setRotationPoint(-5.5577F, -1.7849F, 0.0F);
        Shape.addChild(Shape23_r1);
        setRotation(Shape23_r1, 0.0F, 0.0F, 0.2618F);
        Shape23_r1.setTextureOffset(0, 0).addBox(4.0F, -23.0F, -11.3F, 1.0F, 6.0F, 1.0F, 0.0F);

        Shape8_r1 = new ModelRenderer(this);
        Shape8_r1.setTextureSize(512, 512);
        Shape8_r1.mirror = true;
        Shape8_r1.setRotationPoint(0.0F, -1.5669F, 2.4078F);
        Shape.addChild(Shape8_r1);
        setRotation(Shape8_r1, 0.1396F, 0.0F, 0.0F);
        Shape8_r1.setTextureOffset(0, 0).addBox(-6.5F, -19.0F, -9.5F, 13.0F, 2.0F, 23.0F, 0.0F);

        handle = new ModelRenderer(this);
        handle.setTextureSize(512, 512);
        handle.mirror = true;
        ammobox.addChild(handle);
        handle.setTextureOffset(0, 0).addBox(-3.5F, -13.0F, -11.5F, 1.0F, 4.0F, 1.0F, 0.0F);
        handle.setTextureOffset(0, 0).addBox(2.5F, -13.0F, -11.5F, 1.0F, 4.0F, 1.0F, 0.0F);
        handle.setTextureOffset(0, 0).addBox(-3.0F, -9.5F, -11.5F, 6.0F, 1.0F, 1.0F, 0.0F);
        handle.setTextureOffset(0, 0).addBox(0.5F, -27.5F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F);
        handle.setTextureOffset(0, 0).addBox(-1.5F, -27.5F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F);
        handle.setTextureOffset(0, 0).addBox(0.5F, -27.5F, 8.0F, 1.0F, 4.0F, 1.0F, 0.0F);
        handle.setTextureOffset(0, 0).addBox(-1.5F, -27.5F, 8.0F, 1.0F, 4.0F, 1.0F, 0.0F);
        handle.setTextureOffset(0, 0).addBox(-1.5F, -28.0F, -3.5F, 3.0F, 1.0F, 12.0F, 0.0F);

        text = new ModelRenderer(this);
        text.setTextureSize(512, 512);
        text.mirror = true;
        ammobox.addChild(text);
        text.setTextureOffset(0, 0).addBox(5.1F, -17.0F, -4.0F, 1.0F, 9.0F, 13.0F, 0.0F);
        text.setTextureOffset(0, 0).addBox(-6.1F, -17.0F, -4.0F, 1.0F, 9.0F, 13.0F, 0.0F);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer,
                       int packedLight, int packedOverlay,
                       float red, float green, float blue, float alpha) {

        matrixStack.push();
        matrixStack.scale(0.5F, 0.5F, 0.5F);

        ammobox.render(matrixStack, buffer, packedLight, packedOverlay);

        matrixStack.pop();
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
