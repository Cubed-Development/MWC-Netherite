package dev.redstudio.netherite.item;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;

public class TileEntityModelInfo<T extends TileEntity> {
    public final RegistryObject<TileEntityType<T>> type;
    public final EntityModel<Entity> model;
    public final String texture;

    public TileEntityModelInfo(RegistryObject<TileEntityType<T>> type, EntityModel<Entity> model, String texture) {
        this.type = type;
        this.model = model;
        this.texture = texture;
    }
}
