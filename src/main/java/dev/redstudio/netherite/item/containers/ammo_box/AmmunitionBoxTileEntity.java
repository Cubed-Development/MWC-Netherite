package dev.redstudio.netherite.item.containers.ammo_box;


import dev.redstudio.netherite.content.ModContent;
import net.minecraft.tileentity.TileEntity;

public class AmmunitionBoxTileEntity extends TileEntity {

    // Constructor for your registered tile entity type
    public AmmunitionBoxTileEntity() {
        super(ModContent.AMMUNITION_BOX_TILE_ENTITY.get());
    }
}

