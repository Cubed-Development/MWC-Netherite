package dev.redstudio.netherite;

import dev.redstudio.netherite.entity.SitEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import static dev.redstudio.netherite.Netherite.MOD_ID;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class EventServer {

    @ObjectHolder(MOD_ID + ":sit_entity")
    public static final EntityType<SitEntity> SIT_ENTITY = null;

    @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
        event.getRegistry().register(
                EntityType.Builder.<SitEntity>create(SitEntity::new, EntityClassification.MISC)
                        .size(0.0F, 0.0F) // Invisible entity (no collision box)
                        .setShouldReceiveVelocityUpdates(true)
                        .setTrackingRange(10)
                        .setUpdateInterval(1)
                        .build(new ResourceLocation(MOD_ID, "sit_entity").toString())
                        .setRegistryName(new ResourceLocation(MOD_ID, "sit_entity"))
        );
    }
}