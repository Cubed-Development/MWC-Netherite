package dev.redstudio.netherite.item.containers.barrel;


import dev.redstudio.netherite.content.ModContent;
import net.minecraft.tileentity.TileEntity;

public class BarrelTileEntity extends TileEntity {

    // Constructor for your registered tile entity type
    public BarrelTileEntity() {
        super(ModContent.BARREL_TILE_ENTITY.get());
    }
}

