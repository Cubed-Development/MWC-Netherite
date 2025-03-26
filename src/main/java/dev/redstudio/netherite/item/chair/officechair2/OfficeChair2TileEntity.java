package dev.redstudio.netherite.item.chair.officechair2;


import dev.redstudio.netherite.item.ModContent;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class OfficeChair2TileEntity extends TileEntity {

    public OfficeChair2TileEntity(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    // Constructor for your registered tile entity type
    public OfficeChair2TileEntity() {
        super(ModContent.OFFICE_CHAIR_2_TILE_ENTITY.get());
    }
}

