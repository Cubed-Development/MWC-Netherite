package dev.redstudio.netherite.item.tv.ceiling;

import dev.redstudio.netherite.item.BlockBase;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class TVCeilingBlock extends BlockBase {

    public TVCeilingBlock() {}

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new TVCeilingTileEntity();
    }
}

