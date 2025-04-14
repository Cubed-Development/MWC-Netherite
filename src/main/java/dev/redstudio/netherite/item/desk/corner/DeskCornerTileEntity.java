package dev.redstudio.netherite.item.desk.corner;

import dev.redstudio.netherite.content.ModContent;

import net.minecraft.tileentity.TileEntity;

public class DeskCornerTileEntity extends TileEntity {

    // Constructor for your registered tile entity type
    public DeskCornerTileEntity() {
        super(ModContent.DESK_CORNER_TILE_ENTITY.get());
    }
}