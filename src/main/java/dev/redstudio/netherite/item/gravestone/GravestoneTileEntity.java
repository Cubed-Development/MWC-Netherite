package dev.redstudio.netherite.item.gravestone;

import dev.redstudio.netherite.content.ModContent;
import net.minecraft.tileentity.TileEntity;

public class GravestoneTileEntity extends TileEntity {

    // Constructor for your registered tile entity type
    public GravestoneTileEntity() {
        super(ModContent.GRAVESTONE_TILE_ENTITY.get());
    }
}
