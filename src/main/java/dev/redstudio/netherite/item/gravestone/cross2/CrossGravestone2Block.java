package dev.redstudio.netherite.item.gravestone.cross2;

import dev.redstudio.netherite.item.BlockBase;
import dev.redstudio.netherite.item.gravestone.GravestoneTileEntity;
import dev.redstudio.netherite.item.gravestone.cross3.CrossGravestone3TileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class CrossGravestone2Block extends BlockBase {

    public CrossGravestone2Block() {}

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new CrossGravestone2TileEntity();
    }
}

