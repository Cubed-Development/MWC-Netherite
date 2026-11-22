package dev.redstudio.netherite.item.containers.electric_box_closed;

import dev.redstudio.netherite.item.BlockBase;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class ElectricBoxClosedBlock extends BlockBase {

    public ElectricBoxClosedBlock() {}

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new ElectricBoxClosedTileEntity();
    }
}

