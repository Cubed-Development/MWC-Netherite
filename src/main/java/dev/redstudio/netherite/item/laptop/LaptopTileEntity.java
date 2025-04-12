package dev.redstudio.netherite.item.laptop;

import net.minecraft.tileentity.TileEntity;
import dev.redstudio.netherite.item.ModContent;

public class LaptopTileEntity extends TileEntity {

    // Constructor for your registered tile entity type
    public LaptopTileEntity() {
        super(ModContent.LAPTOP_TILE_ENTITY.get());
    }
}


