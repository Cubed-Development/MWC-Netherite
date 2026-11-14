package dev.redstudio.netherite.item.gravestone.cross;

import dev.redstudio.netherite.item.BlockBase;
import dev.redstudio.netherite.item.gravestone.GravestoneTileEntity;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class CrossGravestoneBlock extends BlockBase {

    public CrossGravestoneBlock() {}

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new CrossGravestoneTileEntity();
    }
}

