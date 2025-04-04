package dev.redstudio.netherite.item.caution_sign;


import dev.redstudio.netherite.item.ModContent;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class CautionTileEntity extends TileEntity {

    public CautionTileEntity(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    // Constructor for your registered tile entity type
    public CautionTileEntity() {
        super(ModContent.CAUTION_TILE_ENTITY.get());
    }
}

