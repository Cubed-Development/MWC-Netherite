package dev.redstudio.netherite.item.containers.filing_cabinet_open;

import dev.redstudio.netherite.item.BlockBase;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class FilingCabinetOpenedBlock extends BlockBase {

    public FilingCabinetOpenedBlock() {}

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new FilingCabinetOpenedTileEntity();
    }
}

