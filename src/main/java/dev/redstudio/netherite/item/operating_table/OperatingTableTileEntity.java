package dev.redstudio.netherite.item.operating_table;


import dev.redstudio.netherite.content.ModContent;
import net.minecraft.tileentity.TileEntity;

public class OperatingTableTileEntity extends TileEntity {

    // Constructor for your registered tile entity type
    public OperatingTableTileEntity() {
        super(ModContent.OPERATING_TABLE_TILE_ENTITY.get());
    }
}

