package dev.redstudio.netherite.item.pc;


import dev.redstudio.netherite.content.ModContent;

import net.minecraft.tileentity.TileEntity;

public class PCTileEntity extends TileEntity {

    // Constructor for your registered tile entity type
    public PCTileEntity() {
        super(ModContent.PC_TILE_ENTITY.get());
    }
}

