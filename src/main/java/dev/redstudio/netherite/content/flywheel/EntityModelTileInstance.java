package dev.redstudio.netherite.content.flywheel;

import com.jozufozu.flywheel.backend.instancing.Instancer;
import com.jozufozu.flywheel.backend.instancing.tile.TileEntityInstance;
import com.jozufozu.flywheel.backend.material.InstanceMaterial;
import com.jozufozu.flywheel.backend.material.MaterialManager;
import com.jozufozu.flywheel.backend.state.TextureRenderState;
import com.jozufozu.flywheel.core.Materials;
import com.jozufozu.flywheel.core.materials.ModelData;
import com.mojang.blaze3d.matrix.MatrixStack;
import dev.redstudio.netherite.item.TileEntityModelInfo;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.vector.Vector3f;

public class EntityModelTileInstance<T extends TileEntity> extends TileEntityInstance<T> {

    protected final ModelData modelData;

    public EntityModelTileInstance(MaterialManager<?> materialManager, T tile, TileEntityModelInfo<T> info) {
        super(materialManager, tile);

        InstanceMaterial<ModelData> material =
                materialManager.cutout(TextureRenderState.get(info.texture))
                        .material(Materials.TRANSFORMED);

        // Uses the TileEntityType registry name as the unique Flywheel cache key
        String modelKey = info.type.getId().toString();

        Instancer<ModelData> instancer =
                material.model(modelKey, () -> ModelRendererBaker.bakeEntityModel(info.model));

        this.modelData = instancer.createInstance();
        updateTransform();
        updateLight();
    }

    protected void updateTransform() {
        MatrixStack matrices = new MatrixStack();

        matrices.translate(instancePos.getX(), instancePos.getY(), instancePos.getZ());
        matrices.translate(0.5D, 1.5D, 0.5D);
        matrices.scale(1.0F, -1.0F, -1.0F);

        if (blockState.hasProperty(BlockStateProperties.FACING)) {
            applyFacing(matrices, blockState.get(BlockStateProperties.FACING));
        } else if (blockState.hasProperty(BlockStateProperties.HORIZONTAL_FACING)) {
            applyFacing(matrices, blockState.get(BlockStateProperties.HORIZONTAL_FACING));
        }

        modelData.setTransform(matrices);
    }

    protected void applyFacing(MatrixStack matrices, Direction facing) {
        switch (facing) {
            case EAST:
                matrices.rotate(Vector3f.YP.rotationDegrees(90));
                break;
            case SOUTH:
                matrices.rotate(Vector3f.YP.rotationDegrees(180));
                break;
            case WEST:
                matrices.rotate(Vector3f.YP.rotationDegrees(270));
                break;
            case UP:
                matrices.rotate(Vector3f.XP.rotationDegrees(90));
                break;
            case DOWN:
                matrices.rotate(Vector3f.XP.rotationDegrees(270));
                break;
            default:
                break;
        }
    }

    @Override
    public void updateLight() {
        relight(pos, modelData);
    }

    @Override
    public void remove() {
        modelData.delete();
    }
}