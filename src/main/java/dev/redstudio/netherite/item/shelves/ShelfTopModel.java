
package dev.redstudio.netherite.item.shelves;

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
public final class ShelfTopModel extends EntityModel<Entity> {

    private final ModelRenderer shelf1;

    public ShelfTopModel() {
        textureWidth = 128;
        textureHeight = 128;

        shelf1 = new ModelRenderer(this);
        shelf1.setTextureSize(128, 128);
        shelf1.mirror = true;
        shelf1.setRotationPoint(-8.0F, 22.0F, -5.0F);
        shelf1.setTextureOffset(0, 0).addBox(0.0F, 0.0F, 0.0F, 16.0F, 2.0F, 10.0F, 0.0F);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount,
                                  float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha) {
        shelf1.render(matrixStack, buffer, packedLight, packedOverlay);
    }
}
