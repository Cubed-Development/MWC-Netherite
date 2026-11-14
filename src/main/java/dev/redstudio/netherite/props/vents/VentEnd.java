
package dev.redstudio.netherite.props.vents;

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
public final class VentEnd extends EntityModel<Entity> {

    private final ModelRenderer bone;

    public VentEnd() {
        textureWidth = 128;
        textureHeight = 128;

        bone = new ModelRenderer(this);
        bone.setTextureSize(128, 128);
        bone.mirror = true;
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-7.0F, -15.0F, -8.0F, 14.0F, 14.0F, 16.0F, 0.0F);
        bone.setTextureOffset(0, 40).addBox(-7.5F, -15.5F, -0.5F, 15.0F, 15.0F, 1.0F, 0.0F);
        bone.setTextureOffset(0, 40).addBox(-7.5F, -15.5F, -9.0F, 15.0F, 1.0F, 1.0F, 0.0F);
        bone.setTextureOffset(0, 40).addBox(-7.5F, -1.5F, -9.0F, 15.0F, 1.0F, 1.0F, 0.0F);
        bone.setTextureOffset(0, 40).addBox(-7.5F, -14.5F, -9.0F, 1.0F, 13.0F, 1.0F, 0.0F);
        bone.setTextureOffset(0, 40).addBox(6.5F, -14.5F, -9.0F, 1.0F, 13.0F, 1.0F, 0.0F);
        bone.setTextureOffset(0, 40).addBox(-6.5F, -13.5F, -8.8F, 13.0F, 2.0F, 1.0F, 0.0F);
        bone.setTextureOffset(0, 40).addBox(-6.5F, -10.5F, -8.8F, 13.0F, 2.0F, 1.0F, 0.0F);
        bone.setTextureOffset(0, 40).addBox(-6.5F, -7.5F, -8.8F, 13.0F, 2.0F, 1.0F, 0.0F);
        bone.setTextureOffset(0, 40).addBox(-6.5F, -4.5F, -8.8F, 13.0F, 2.0F, 1.0F, 0.0F);
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
}
