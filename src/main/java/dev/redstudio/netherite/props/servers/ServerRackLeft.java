
package dev.redstudio.netherite.props.servers;

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
public final class ServerRackLeft extends EntityModel<Entity> {

    private final ModelRenderer bone;
    private final ModelRenderer rack9_r1;

    public ServerRackLeft() {
        textureWidth = 256;
        textureHeight = 256;

        bone = new ModelRenderer(this);
        bone.setTextureSize(256, 256);
        bone.mirror = true;
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.setTextureOffset(200, 0).addBox(-4.2F, -15.0F, -5.3F, 10.0F, 8.0F, 1.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-8.0F, -4.0F, -6.0F, 16.0F, 2.0F, 13.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-8.2F, -16.0F, -6.1F, 2.0F, 16.0F, 2.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-8.2F, -16.0F, 5.1F, 2.0F, 16.0F, 2.0F, 0.0F);
        bone.setTextureOffset(0, 50).addBox(-8.1F, -16.0F, -4.1F, 1.0F, 15.0F, 9.0F, 0.0F);
        bone.setTextureOffset(100, 0).addBox(-6.2F, -7.0F, -5.5F, 14.0F, 3.0F, 11.0F, 0.0F);
        bone.setTextureOffset(100, 0).addBox(-6.2F, -16.0F, -5.5F, 14.0F, 1.0F, 11.0F, 0.0F);
        bone.setTextureOffset(100, 0).addBox(-6.2F, -15.0F, -5.5F, 2.0F, 8.0F, 11.0F, 0.0F);
        bone.setTextureOffset(100, 0).addBox(5.8F, -15.0F, -5.5F, 2.0F, 8.0F, 11.0F, 0.0F);
        bone.setTextureOffset(100, 0).addBox(-6.2F, -5.5F, -6.8F, 14.0F, 1.0F, 2.0F, 0.0F);
        bone.setTextureOffset(100, 0).addBox(-6.2F, -5.0F, -6.8F, 14.0F, 1.0F, 2.0F, 0.0F);
        bone.setTextureOffset(100, 0).addBox(-4.2F, -7.5F, -5.5F, 10.0F, 1.0F, 1.0F, 0.0F);
        bone.setTextureOffset(100, 50).addBox(-5.5F, -6.2F, -7.0F, 3.0F, 2.0F, 2.0F, 0.0F);
        bone.setTextureOffset(100, 50).addBox(-1.0F, -6.2F, -7.0F, 3.0F, 2.0F, 2.0F, 0.0F);
        bone.setTextureOffset(100, 50).addBox(3.5F, -6.2F, -7.0F, 3.0F, 2.0F, 2.0F, 0.0F);
        bone.setTextureOffset(100, 0).addBox(-4.2F, -15.0F, 4.5F, 10.0F, 8.0F, 1.0F, 0.0F);

        rack9_r1 = new ModelRenderer(this);
        rack9_r1.setTextureSize(256, 256);
        rack9_r1.mirror = true;
        rack9_r1.setRotationPoint(0.0F, 1.895F, -5.8598F);
        bone.addChild(rack9_r1);
        setRotation(rack9_r1, -0.7064F, 0.0F, 0.0F);
        rack9_r1.setTextureOffset(100, 0).addBox(-6.2F, -7.0F, -5.5F, 14.0F, 2.0F, 2.0F, 0.0F);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha) {
        bone.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
