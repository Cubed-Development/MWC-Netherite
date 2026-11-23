package dev.redstudio.netherite.content;

import dev.redstudio.netherite.Netherite;
import dev.redstudio.netherite.content.flywheel.FlywheelCompact;
import dev.redstudio.netherite.item.TileEntityModelInfo;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModContentClient {

    public static final List<TileEntityModelInfo<? extends TileEntity>> TILE_ENTITY_MODEL_INFOS = new ArrayList<>();
    private static final List<Runnable> QUEUED_MODELS = new ArrayList<>();

    public static <T extends TileEntity> void queueModel(
            RegistryObject<TileEntityType<T>> tileEntityType,
            Supplier<EntityModel<Entity>> modelSupplier,
            String textureInfo) {
        QUEUED_MODELS.add(() -> registerTileEntityModel(tileEntityType, modelSupplier, textureInfo));
    }

    public static void clientSetup(FMLClientSetupEvent event) {
        QUEUED_MODELS.forEach(Runnable::run);
        QUEUED_MODELS.clear();
    }

    public static <T extends TileEntity> void registerTileEntityModel(
            RegistryObject<TileEntityType<T>> tileEntityType,
            Supplier<EntityModel<Entity>> modelSupplier,
            String textureInfo) {
        EntityModel<Entity> model = modelSupplier.get();
        Netherite.LOGGER.info("Registering tile entity renderer with texture: {}", textureInfo);

        TileEntityModelInfo<T> info = new TileEntityModelInfo<>(tileEntityType, model, textureInfo);
        TILE_ENTITY_MODEL_INFOS.add(info);

        if (ModList.get().isLoaded("flywheel")) {
            ((Runnable) () -> FlywheelCompact.loadInstance(tileEntityType, info)).run();
        }
    }
}