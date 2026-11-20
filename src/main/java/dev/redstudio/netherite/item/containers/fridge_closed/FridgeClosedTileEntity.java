package dev.redstudio.netherite.item.containers.fridge_closed;


import dev.redstudio.netherite.content.ModContent;
import net.minecraft.tileentity.TileEntity;

public class FridgeClosedTileEntity extends TileEntity {

    // Constructor for your registered tile entity type
    public FridgeClosedTileEntity() {
        super(ModContent.FRIDGE_CLOSED_TILE_ENTITY.get());
    }
}

