package dev.redstudio.netherite.item.operating_table;

import dev.redstudio.netherite.item.BlockBase;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class OperatingTableAltBlock extends BlockBase {

    public OperatingTableAltBlock() {}

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new OperatingTableAltTileEntity();
    }
}

