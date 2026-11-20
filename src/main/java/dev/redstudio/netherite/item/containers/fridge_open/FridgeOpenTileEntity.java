package dev.redstudio.netherite.item.containers.fridge_open;


import dev.redstudio.netherite.content.ModContent;
import net.minecraft.tileentity.TileEntity;

public class FridgeOpenTileEntity extends TileEntity {

    // Constructor for your registered tile entity type
    public FridgeOpenTileEntity() {
        super(ModContent.FRIDGE_OPEN_TILE_ENTITY.get());
    }
}

