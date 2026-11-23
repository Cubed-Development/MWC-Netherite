package dev.redstudio.netherite.item;

import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.world.IBlockReader;

import java.util.function.Supplier;

public class SittablePropBlock extends BlockSitteable {
    private final Supplier<TileEntityType<?>> teType;

    public SittablePropBlock(Supplier<TileEntityType<?>> teType) {
        this.teType = teType;
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new PropTileEntity(teType.get());
    }
}