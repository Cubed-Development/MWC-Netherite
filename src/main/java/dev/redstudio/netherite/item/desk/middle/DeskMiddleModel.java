package dev.redstudio.netherite.item.desk.middle;

;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DeskMiddleModel extends EntityModel<Entity> {
    //fields
    ModelRenderer desk1;
    ModelRenderer desk3;
    ModelRenderer desk5;

    public DeskMiddleModel() {
        textureWidth = 256;
        textureHeight = 256;

        desk1 = new ModelRenderer(this, 0, 0);
        desk1.addBox(0F, 0F, 0F, 16, 15, 1);
        desk1.setRotationPoint(-8F, 8F, 6.5F);
        desk1.setTextureSize(64, 32);
        desk1.mirror = true;
        setRotation(desk1, 0F, 0F, 0F);
        desk3 = new ModelRenderer(this, 0, 0);
        desk3.addBox(0F, 0F, 0F, 16, 4, 13);
        desk3.setRotationPoint(-8F, 8F, -6.5F);
        desk3.setTextureSize(64, 32);
        desk3.mirror = true;
        setRotation(desk3, 0F, 0F, 0F);
        desk5 = new ModelRenderer(this, 0, 0);
        desk5.addBox(0F, 0F, 0F, 12, 2, 1);
        desk5.setRotationPoint(-6F, 9F, -6.6F);
        desk5.setTextureSize(64, 32);
        desk5.mirror = true;
        setRotation(desk5, 0F, 0F, 0F);
    }

    @Override
    public void setRotationAngles(Entity entity, float v, float v1, float v2, float v3, float v4) {

    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        desk1.render(matrixStack, buffer, packedLight, packedOverlay);
        desk3.render(matrixStack, buffer, packedLight, packedOverlay);
        desk5.render(matrixStack, buffer, packedLight, packedOverlay);
    }
}