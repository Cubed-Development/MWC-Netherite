package dev.redstudio.netherite.item;

import dev.redstudio.netherite.Netherite;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

public class TileEntityModelInfo<T extends TileEntity> {
    public final RegistryObject<TileEntityType<T>> type;
    public final EntityModel<Entity> model;
    public final ResourceLocation texture;
    public final RenderType renderType;

    public TileEntityModelInfo(RegistryObject<TileEntityType<T>> type, EntityModel<Entity> model, String texture) {
        this.type = type;
        this.model = model;
        this.texture = new ResourceLocation(Netherite.MOD_ID, texture);
        this.renderType = RenderType.getEntityCutout(this.texture);
    }
}
