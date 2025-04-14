package dev.redstudio.netherite.item.chair.homechair;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import dev.redstudio.netherite.content.ModContent;

public class HomeChairTileEntity extends TileEntity {

    public HomeChairTileEntity(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    // Constructor for your registered tile entity type
    public HomeChairTileEntity() {
        super(ModContent.HOME_CHAIR_TILE_ENTITY.get());
    }
}
