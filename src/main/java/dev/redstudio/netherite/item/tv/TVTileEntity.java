package dev.redstudio.netherite.item.tv;



import dev.redstudio.netherite.item.ModContent;
import net.minecraft.tileentity.TileEntity;

public class TVTileEntity extends TileEntity {

    // Constructor for your registered tile entity type
    public TVTileEntity() {
        super(ModContent.TV_TILE_ENTITY.get());
    }
}

