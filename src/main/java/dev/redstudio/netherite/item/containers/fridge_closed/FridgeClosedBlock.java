package dev.redstudio.netherite.item.containers.fridge_closed;

import dev.redstudio.netherite.item.BlockBase;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class FridgeClosedBlock extends BlockBase {

    public FridgeClosedBlock() {}

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new FridgeClosedTileEntity();
    }
}

