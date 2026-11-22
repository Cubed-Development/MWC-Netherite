package dev.redstudio.netherite.content.flywheel;

import com.jozufozu.flywheel.backend.instancing.InstancedRenderRegistry;
import dev.redstudio.netherite.item.TileEntityModelInfo;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;

public class FlywheelCompact {

    public static <T extends TileEntity>  void loadInstance(RegistryObject<TileEntityType<T>> tileEntityType, TileEntityModelInfo<T>info){
        InstancedRenderRegistry.getInstance().register(
                tileEntityType.get(),
                (materialManager, tile) -> new EntityModelTileInstance<>(materialManager, tile, info));
    }
}
