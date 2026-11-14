
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
public final class Locker extends EntityModel<Entity> {

    private final ModelRenderer bone;
    private final ModelRenderer Shape69_r1;
    private final ModelRenderer Shape63_r1;
    private final ModelRenderer door;

    public Locker() {
        textureWidth = 512;
        textureHeight = 512;

        bone = new ModelRenderer(this);
        bone.setTextureSize(512, 512);
        bone.mirror = true;
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(8.5F, -18.0F, 6.7F, 2.0F, 4.0F, 2.0F, 0.0F);
        bone.setTextureOffset(100, 0).addBox(-10.0F, -7.0F, -8.0F, 20.0F, 3.0F, 16.0F, 0.0F);
        bone.setTextureOffset(100, 0).addBox(-8.0F, -7.0F, 8.0F, 16.0F, 3.0F, 2.0F, 0.0F);
        bone.setTextureOffset(100, 0).addBox(-8.0F, -7.0F, -10.0F, 16.0F, 3.0F, 2.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-8.0F, -66.0F, 8.0F, 16.0F, 59.0F, 2.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-8.0F, -66.0F, -10.0F, 16.0F, 59.0F, 2.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-10.0F, -66.0F, -8.0F, 2.0F, 59.0F, 16.0F, 0.0F);
        bone.setTextureOffset(100, 0).addBox(-10.0F, -69.0F, -8.0F, 20.0F, 3.0F, 16.0F, 0.0F);
        bone.setTextureOffset(100, 0).addBox(-8.0F, -69.0F, 8.0F, 16.0F, 3.0F, 2.0F, 0.0F);
        bone.setTextureOffset(100, 0).addBox(-8.0F, -69.0F, -10.0F, 16.0F, 3.0F, 2.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-8.0F, -25.0F, -8.0F, 16.0F, 1.0F, 16.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-8.0F, -53.0F, -8.0F, 16.0F, 1.0F, 16.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(8.5F, -58.0F, 6.7F, 2.0F, 4.0F, 2.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(8.5F, -41.0F, 6.7F, 2.0F, 4.0F, 2.0F, 0.0F);

        Shape69_r1 = new ModelRenderer(this);
        Shape69_r1.setTextureSize(512, 512);
        Shape69_r1.mirror = true;
        Shape69_r1.setRotationPoint(-8.5858F, 0.0F, -4.7279F);
        bone.addChild(Shape69_r1);
        setRotation(Shape69_r1, 0.0F, 0.7854F, 0.0F);
        Shape69_r1.setTextureOffset(100, 0).addBox(14.0F, -69.0F, 8.4F, 2.0F, 3.0F, 2.0F, 0.0F);
        Shape69_r1.setTextureOffset(0, 0).addBox(14.0F, -66.0F, 8.4F, 2.0F, 59.0F, 2.0F, 0.0F);
        Shape69_r1.setTextureOffset(100, 0).addBox(14.0F, -7.0F, 8.4F, 2.0F, 3.0F, 2.0F, 0.0F);
        Shape69_r1.setTextureOffset(100, 0).addBox(-10.0F, -7.0F, 8.4F, 2.0F, 3.0F, 2.0F, 0.0F);
        Shape69_r1.setTextureOffset(0, 0).addBox(-10.0F, -66.0F, 8.4F, 2.0F, 59.0F, 2.0F, 0.0F);
        Shape69_r1.setTextureOffset(100, 0).addBox(-10.0F, -69.0F, 8.4F, 2.0F, 3.0F, 2.0F, 0.0F);

        Shape63_r1 = new ModelRenderer(this);
        Shape63_r1.setTextureSize(512, 512);
        Shape63_r1.mirror = true;
        Shape63_r1.setRotationPoint(-4.0208F, 0.0F, 8.2929F);
        bone.addChild(Shape63_r1);
        setRotation(Shape63_r1, 0.0F, 0.7854F, 0.0F);
        Shape63_r1.setTextureOffset(100, 0).addBox(7.7F, -69.0F, -16.0F, 2.0F, 3.0F, 2.0F, 0.0F);
        Shape63_r1.setTextureOffset(0, 0).addBox(7.7F, -66.0F, -16.0F, 2.0F, 59.0F, 2.0F, 0.0F);
        Shape63_r1.setTextureOffset(100, 0).addBox(7.7F, -7.0F, -16.0F, 2.0F, 3.0F, 2.0F, 0.0F);
        Shape63_r1.setTextureOffset(0, 0).addBox(7.7F, -66.0F, 8.0F, 2.0F, 59.0F, 2.0F, 0.0F);
        Shape63_r1.setTextureOffset(100, 0).addBox(7.7F, -69.0F, 8.0F, 2.0F, 3.0F, 2.0F, 0.0F);
        Shape63_r1.setTextureOffset(100, 0).addBox(7.7F, -7.0F, 8.0F, 2.0F, 3.0F, 2.0F, 0.0F);

        door = new ModelRenderer(this);
        door.setTextureSize(512, 512);
        door.mirror = true;
        door.setRotationPoint(0.0F, 24.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -20.0F, -5.0F, 1.0F, 1.0F, 12.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.0F, -19.0F, -8.0F, 1.0F, 12.0F, 16.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.0F, -66.0F, -8.0F, 1.0F, 8.0F, 16.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.0F, -45.0F, -3.0F, 1.0F, 14.0F, 11.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -57.0F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -55.0F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -53.0F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -51.0F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -49.0F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -47.0F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -58.0F, -7.0F, 1.0F, 13.0F, 2.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -58.0F, 6.0F, 1.0F, 13.0F, 1.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -58.0F, -1.5F, 1.0F, 13.0F, 1.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -58.0F, 1.5F, 1.0F, 13.0F, 1.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -58.0F, 0.0F, 1.0F, 13.0F, 1.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -58.0F, 4.5F, 1.0F, 13.0F, 1.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -58.0F, 3.0F, 1.0F, 13.0F, 1.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -58.0F, -3.0F, 1.0F, 13.0F, 1.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -58.0F, -4.5F, 1.0F, 13.0F, 1.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -64.0F, -7.0F, 1.0F, 6.0F, 14.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(8.8F, -42.0F, -8.0F, 1.0F, 7.0F, 5.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.0F, -41.0F, -5.5F, 1.0F, 5.0F, 1.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.0F, -58.0F, 7.0F, 1.0F, 13.0F, 1.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.0F, -58.0F, -8.0F, 1.0F, 13.0F, 1.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.0F, -45.0F, -8.0F, 1.0F, 3.0F, 5.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.0F, -35.0F, -8.0F, 1.0F, 4.0F, 5.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.0F, -31.0F, -8.0F, 1.0F, 12.0F, 1.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.0F, -31.0F, 7.0F, 1.0F, 12.0F, 1.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -45.0F, -2.0F, 1.0F, 14.0F, 9.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -45.0F, -7.0F, 1.0F, 2.0F, 5.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -34.0F, -7.0F, 1.0F, 3.0F, 5.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -19.0F, -7.0F, 1.0F, 11.0F, 14.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -31.0F, -7.0F, 1.0F, 12.0F, 2.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -32.0F, -4.5F, 1.0F, 13.0F, 1.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -32.0F, -3.0F, 1.0F, 13.0F, 1.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -32.0F, -1.5F, 1.0F, 13.0F, 1.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -32.0F, 0.0F, 1.0F, 13.0F, 1.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -32.0F, 1.5F, 1.0F, 13.0F, 1.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -32.0F, 3.0F, 1.0F, 13.0F, 1.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -32.0F, 4.5F, 1.0F, 13.0F, 1.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -32.0F, 6.0F, 1.0F, 13.0F, 1.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -30.0F, -5.0F, 1.0F, 1.0F, 12.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -28.0F, -5.0F, 1.0F, 1.0F, 12.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -26.0F, -5.0F, 1.0F, 1.0F, 12.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -24.0F, -5.0F, 1.0F, 1.0F, 12.0F, 0.0F);
        door.setTextureOffset(0, 0).addBox(9.3F, -22.0F, -5.0F, 1.0F, 1.0F, 12.0F, 0.0F);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha) {
        bone.render(matrixStack, buffer, packedLight, packedOverlay);
        door.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
