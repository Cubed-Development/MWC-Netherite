package dev.redstudio.netherite.item.rebar;


import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import dev.redstudio.netherite.item.ModContent;

public class RebarTileEntity extends TileEntity {


    // Constructor for your registered tile entity type
    public RebarTileEntity() {
        super(ModContent.REBAR_TILE_ENTITY.get());
    }
}

