package dev.redstudio.netherite.item.chair.officechair1;


import dev.redstudio.netherite.item.BlockSitteable;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class OfficeChair1Block extends BlockSitteable {

    public OfficeChair1Block() {}

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new OfficeChair1TileEntity();
    }

}


