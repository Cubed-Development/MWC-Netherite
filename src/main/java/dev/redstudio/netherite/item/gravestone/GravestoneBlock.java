package dev.redstudio.netherite.item.gravestone;

import dev.redstudio.netherite.item.BlockBase;
import dev.redstudio.netherite.item.pc.PCTileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class GravestoneBlock extends BlockBase {

    public GravestoneBlock() {}

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new GravestoneTileEntity();
    }
}

