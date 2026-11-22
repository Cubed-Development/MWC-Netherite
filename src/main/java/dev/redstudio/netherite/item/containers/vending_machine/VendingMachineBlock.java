package dev.redstudio.netherite.item.containers.vending_machine;

import dev.redstudio.netherite.item.BlockBase;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class VendingMachineBlock extends BlockBase {

    public VendingMachineBlock() {}

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new VendingMachineTileEntity();
    }
}

