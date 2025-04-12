package dev.redstudio.netherite;

import dev.redstudio.netherite.item.barrier.BarrierModel;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.entity.Entity;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class TileRenderer extends TileEntityRenderer<TileEntity> {

    private ResourceLocation texture = new ResourceLocation(Netherite.MOD_ID, "textures/block/barrier.png");
    private EntityModel<Entity> model = new BarrierModel();

    public TileRenderer(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    public TileRenderer setTexture(String texture){
        this.texture = new ResourceLocation(Netherite.MOD_ID, texture);
        return this;
    }

    public TileRenderer setModel(EntityModel<Entity> newModel) {
        this.model = newModel;
        return this;
    }

    @Override
    public void render(TileEntity tileEntity, float partialTicks, MatrixStack matrixStack, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
        matrixStack.push();

        // Positioning
        matrixStack.translate(0.5D, 1.5D, 0.5D);
        matrixStack.scale(1.0F, -1.0F, -1.0F);

        // Get the facing direction from the tile's BlockState
        if (tileEntity.hasWorld()) {
            BlockState state = tileEntity.getWorld().getBlockState(tileEntity.getPos());
            Direction facing = state.get(BlockStateProperties.FACING);

            // Apply rotation based on the facing direction
            switch (facing) {
                case NORTH:
                    break; // No rotation needed
                case EAST:
                    matrixStack.rotate(Vector3f.YP.rotationDegrees(90));
                    break;
                case SOUTH:
                    matrixStack.rotate(Vector3f.YP.rotationDegrees(180));
                    break;
                case WEST:
                    matrixStack.rotate(Vector3f.YP.rotationDegrees(270));
                    break;
                case UP:
                    matrixStack.rotate(Vector3f.XP.rotationDegrees(90));
                    break;
                case DOWN:
                    matrixStack.rotate(Vector3f.XP.rotationDegrees(270));
                    break;
                default:
                    break;
            }
        }

        IVertexBuilder vertexBuilder = bufferIn.getBuffer(RenderType.getEntityCutout(texture));

        model.render(matrixStack, vertexBuilder, combinedLightIn, combinedOverlayIn, 1.0F, 1.0F, 1.0F, 1.0F);

        matrixStack.pop();
    }


}

