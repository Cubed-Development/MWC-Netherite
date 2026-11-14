
package dev.redstudio.netherite.props.shelves;

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
public final class ShelfLeft extends EntityModel<Entity> {

    private final ModelRenderer bone;

    public ShelfLeft() {
        textureWidth = 128;
        textureHeight = 128;

        bone = new ModelRenderer(this);
        bone.setTextureSize(128, 128);
        bone.mirror = true;
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-8.1F, -16.0F, 3.1F, 2.0F, 16.0F, 2.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-8.0F, -3.0F, -5.0F, 16.0F, 2.0F, 10.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-8.1F, -16.0F, -5.1F, 2.0F, 16.0F, 2.0F, 0.0F);
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
