package dev.redstudio.netherite.item.chair.homechair;

import dev.redstudio.netherite.item.BlockSitteable;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class HomeChairBlock extends BlockSitteable {

    public HomeChairBlock() {}

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new HomeChairTileEntity();
    }
}

