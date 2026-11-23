package dev.redstudio.netherite.item;

import dev.redstudio.netherite.ShapeUtils;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

import java.util.function.Supplier;

public class BlockCustomShape extends BlockBase {

    private final Supplier<TileEntityType<?>> teType;
    private final VoxelShape shape;

    public BlockCustomShape(Supplier<TileEntityType<?>> teType, VoxelShape shape) {
        this.teType = teType;
        this.shape = shape;
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new PropTileEntity(teType.get());
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        Direction facing = state.get(FACING);
        return ShapeUtils.rotateShape(facing, shape);
    }
}