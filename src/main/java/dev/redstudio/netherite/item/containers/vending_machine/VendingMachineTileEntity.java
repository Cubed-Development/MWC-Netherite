package dev.redstudio.netherite.item.containers.vending_machine;


import dev.redstudio.netherite.content.ModContent;
import net.minecraft.tileentity.TileEntity;

public class VendingMachineTileEntity extends TileEntity {

    // Constructor for your registered tile entity type
    public VendingMachineTileEntity() {
        super(ModContent.VENDING_MACHINE_TILE_ENTITY.get());
    }
}

