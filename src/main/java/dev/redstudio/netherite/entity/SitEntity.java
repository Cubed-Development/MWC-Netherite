package dev.redstudio.netherite.entity;

import dev.redstudio.netherite.event.EventServer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class SitEntity extends Entity {
    public SitEntity(EntityType<?> entityType, World world) {
        super(entityType, world);
    }

    public SitEntity(World world, BlockPos pos, double yLevel) {
        this(EventServer.SIT_ENTITY, world); // Use armor stand or register your own entity type
        this.setPosition(pos.getX() + 0.5, pos.getY() + yLevel, pos.getZ() + 0.5);
    }

    @Override
    protected void registerData() {}

    @Override
    protected void readAdditional(CompoundNBT compound) {}

    @Override
    protected void writeAdditional(CompoundNBT compound) {}

    @Override
    public IPacket<?> createSpawnPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    public void tick() {
        if (this.getPassengers().isEmpty() || this.world.isAirBlock(this.getPosition())) {
            this.remove();
        }
    }

    @Override
    public boolean canBeCollidedWith() {
        return false;
    }

    @Override
    public boolean canBePushed() {
        return false;
    }
}

