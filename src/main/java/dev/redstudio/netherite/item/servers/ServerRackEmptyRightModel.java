
package dev.redstudio.netherite.item.servers;

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
public final class ServerRackEmptyRightModel extends EntityModel<Entity> {

    private final ModelRenderer bone;

    public ServerRackEmptyRightModel() {
        textureWidth = 256;
        textureHeight = 256;

        bone = new ModelRenderer(this);
        bone.setTextureSize(256, 256);
        bone.mirror = true;
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.setTextureOffset(0, 50).addBox(7.1F, -16.0F, -4.1F, 1.0F, 15.0F, 9.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(-8.0F, -4.0F, -6.0F, 16.0F, 2.0F, 13.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(6.2F, -16.0F, -6.1F, 2.0F, 16.0F, 2.0F, 0.0F);
        bone.setTextureOffset(0, 0).addBox(6.2F, -16.0F, 5.1F, 2.0F, 16.0F, 2.0F, 0.0F);
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
