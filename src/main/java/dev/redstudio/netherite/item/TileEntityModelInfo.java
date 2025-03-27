package dev.redstudio.netherite.item;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;

public class TileEntityModelInfo {
    private final RegistryObject<TileEntityType<TileEntity>> tileEntityType;
    public final EntityModel<Entity> modelInfo;
    public final String textureInfo;


    public TileEntityModelInfo(RegistryObject<TileEntityType<TileEntity>> tileEntityType, EntityModel<Entity>  modelInfo, String textureInfo) {
        this.tileEntityType = tileEntityType;
        this.modelInfo = modelInfo;
        this.textureInfo = textureInfo;
    }

    public RegistryObject<TileEntityType<TileEntity>> getTileEntityType() {
        return tileEntityType;
    }
}
