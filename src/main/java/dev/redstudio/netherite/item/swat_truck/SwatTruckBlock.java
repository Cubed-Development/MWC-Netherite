package dev.redstudio.netherite.item.swat_truck;

import dev.redstudio.netherite.ShapeUtils;
import dev.redstudio.netherite.item.BlockBase;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class SwatTruckBlock extends BlockBase {

    private static final VoxelShape SWAT_TRUCK_SHAPE = Block.makeCuboidShape(-12, 0, 0, 28, 16, 64);

    public SwatTruckBlock() {}

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new SwatTruckTileEntity();
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, net.minecraft.util.math.shapes.ISelectionContext context) {
        Direction facing = state.get(FACING);
        return ShapeUtils.rotateShape(facing, SWAT_TRUCK_SHAPE) ;
    }
}
