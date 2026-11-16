package dev.redstudio.netherite.item.containers.russian_crate;

import dev.redstudio.netherite.item.BlockBase;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class WeaponCrateRussianBlock extends BlockBase {

    public WeaponCrateRussianBlock() {}

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new WeaponCrateTileEntity();
    }
}

