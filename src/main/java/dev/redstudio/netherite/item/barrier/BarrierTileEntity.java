package dev.redstudio.netherite.item.barrier;

import dev.redstudio.netherite.content.ModContent;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class BarrierTileEntity extends TileEntity {

    public BarrierTileEntity(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    // Constructor for your registered tile entity type
    public BarrierTileEntity() {
        super(ModContent.BARRIER_TILE_ENTITY.get());
    }
}
