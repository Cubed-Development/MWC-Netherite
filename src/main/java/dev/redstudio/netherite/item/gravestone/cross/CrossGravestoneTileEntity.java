package dev.redstudio.netherite.item.gravestone.cross;

import dev.redstudio.netherite.content.ModContent;
import net.minecraft.tileentity.TileEntity;

public class CrossGravestoneTileEntity extends TileEntity {

    // Constructor for your registered tile entity type
    public CrossGravestoneTileEntity() {
        super(ModContent.CROSS_GRAVESTONE_TILE_ENTITY.get());
    }
}
