package dev.redstudio.netherite.item.gravestone.skull;

import dev.redstudio.netherite.content.ModContent;
import net.minecraft.tileentity.TileEntity;

public class GravestoneSkullTileEntity extends TileEntity {

    // Constructor for your registered tile entity type
    public GravestoneSkullTileEntity() {
        super(ModContent.GRAVESTONE_SKULL_TILE_ENTITY.get());
    }
}
