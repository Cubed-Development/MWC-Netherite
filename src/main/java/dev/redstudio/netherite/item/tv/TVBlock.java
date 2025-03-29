package dev.redstudio.netherite.item.tv;

import dev.redstudio.netherite.ShapeUtils;
import dev.redstudio.netherite.item.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class TVBlock extends BlockBase {

    //16 = 1 block
    private static final VoxelShape BASE_SHAPE = VoxelShapes.or(
            Block.makeCuboidShape(-16, 0, 4, 32, 26, 8)
    );

    public TVBlock() {}

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
        Direction facing = state.get(FACING);
        return ShapeUtils.rotateShape(facing, BASE_SHAPE);
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new TVTileEntity();
    }
}
