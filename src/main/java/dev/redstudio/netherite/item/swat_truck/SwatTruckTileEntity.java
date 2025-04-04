package dev.redstudio.netherite.item.swat_truck;

import dev.redstudio.netherite.item.ModContent;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class SwatTruckTileEntity extends TileEntity {

    public SwatTruckTileEntity(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    // Constructor for your registered tile entity type
    public SwatTruckTileEntity() {
        super(ModContent.SWAT_TRUCK_TILE_ENTITY.get());
    }
}

