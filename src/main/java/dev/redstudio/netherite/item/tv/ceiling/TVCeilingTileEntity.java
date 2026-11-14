package dev.redstudio.netherite.item.tv.ceiling;


import dev.redstudio.netherite.content.ModContent;
import net.minecraft.tileentity.TileEntity;

public class TVCeilingTileEntity extends TileEntity {

    // Constructor for your registered tile entity type
    public TVCeilingTileEntity() {
        super(ModContent.TV_CEILING_TILE_ENTITY.get());
    }
}

