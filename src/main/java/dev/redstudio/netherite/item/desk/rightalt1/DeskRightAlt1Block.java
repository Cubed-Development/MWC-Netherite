package dev.redstudio.netherite.item.desk.rightalt1;


import dev.redstudio.netherite.item.BlockBase;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class DeskRightAlt1Block extends BlockBase {

    public DeskRightAlt1Block() {}

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new DeskRightAlt1TileEntity();
    }
}




