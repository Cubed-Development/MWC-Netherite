package dev.redstudio.netherite.item.containers.trash_bin;


import dev.redstudio.netherite.content.ModContent;
import net.minecraft.tileentity.TileEntity;

public class TrashBinTileEntity extends TileEntity {

    // Constructor for your registered tile entity type
    public TrashBinTileEntity() {
        super(ModContent.TRASH_BIN_TILE_ENTITY.get());
    }
}

