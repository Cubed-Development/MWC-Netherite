package dev.redstudio.netherite.item;

import dev.redstudio.netherite.entity.SitEntity;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.FakePlayer;

public abstract class BlockSitteable extends BlockBase {

    public BlockSitteable() {}

    @Override
    public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, net.minecraft.util.math.BlockRayTraceResult hit) {
        if (!world.isRemote && !(player instanceof FakePlayer)) {
            if (!player.isPassenger()) {
                SitEntity seat = new SitEntity(world, pos);
                world.addEntity(seat);
                player.startRiding(seat);
            }
            return ActionResultType.SUCCESS;
        }
        return ActionResultType.PASS;
    }
}
