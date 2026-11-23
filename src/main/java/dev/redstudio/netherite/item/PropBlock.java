package dev.redstudio.netherite.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.world.IBlockReader;

import java.util.function.Supplier;

public class PropBlock extends Block { // Change Block to your base rotatable block class if you have one
    private final Supplier<TileEntityType<?>> teType;

    public PropBlock(Supplier<TileEntityType<?>> teType) {
        super(Properties.create(Material.IRON).notSolid());
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