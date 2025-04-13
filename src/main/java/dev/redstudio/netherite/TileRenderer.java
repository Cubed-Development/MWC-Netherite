package dev.redstudio.netherite;

import dev.redstudio.netherite.item.TileEntityModelInfo;
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
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.HashMap;
import java.util.Map;

@OnlyIn(Dist.CLIENT)
public class TileRenderer extends TileEntityRenderer<TileEntity> {

    private static final Map<TileEntityType<?>, TileEntityModelInfo<?>> MODEL_INFO_MAP = new HashMap<>();

    public static void registerModelInfo(TileEntityModelInfo<?> info) {
        MODEL_INFO_MAP.put(info.type.get(), info);
    }

    public TileRenderer(TileEntityRendererDispatcher dispatcher) {
        super(dispatcher);
    }

    @Override
    public void render(TileEntity tileEntity, float partialTicks, MatrixStack matrixStack,
                       IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
        TileEntityModelInfo<?> info = MODEL_INFO_MAP.get(tileEntity.getType());

        if (info == null) return; // No model info registered

        ResourceLocation texture = info.texture;
        EntityModel<Entity> model = info.model;

        matrixStack.push();
        matrixStack.translate(0.5D, 1.5D, 0.5D);
        matrixStack.scale(1.0F, -1.0F, -1.0F);

        if (tileEntity.hasWorld()) {
            BlockState state = tileEntity.getWorld().getBlockState(tileEntity.getPos());
            if (state.hasProperty(BlockStateProperties.FACING)) {
                Direction facing = state.get(BlockStateProperties.FACING);
                switch (facing) {
                    case EAST: matrixStack.rotate(Vector3f.YP.rotationDegrees(90)); break;
                    case SOUTH: matrixStack.rotate(Vector3f.YP.rotationDegrees(180)); break;
                    case WEST: matrixStack.rotate(Vector3f.YP.rotationDegrees(270)); break;
                    case UP: matrixStack.rotate(Vector3f.XP.rotationDegrees(90)); break;
                    case DOWN: matrixStack.rotate(Vector3f.XP.rotationDegrees(270)); break;
                    default: break;
                }
            }
        }

        IVertexBuilder builder = bufferIn.getBuffer(RenderType.getEntityCutout(texture));
        model.render(matrixStack, builder, combinedLightIn, combinedOverlayIn, 1f, 1f, 1f, 1f);
        matrixStack.pop();
    }
}