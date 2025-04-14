package dev.redstudio.netherite.item.caution_sign;


import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import dev.redstudio.netherite.content.ModContent;

public class CautionTileEntity extends TileEntity {

    public CautionTileEntity(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    // Constructor for your registered tile entity type
    public CautionTileEntity() {
        super(ModContent.CAUTION_TILE_ENTITY.get());
    }
}

