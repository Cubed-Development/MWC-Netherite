package dev.redstudio.netherite.item.chair.outdoor;


import dev.redstudio.netherite.content.ModContent;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;


public class OutdoorTileEntity extends TileEntity {

    public OutdoorTileEntity(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    // Constructor for your registered tile entity type
    public OutdoorTileEntity() {
        super(ModContent.OUTDOOR_CHAIR_TILE_ENTITY.get());
    }
}

