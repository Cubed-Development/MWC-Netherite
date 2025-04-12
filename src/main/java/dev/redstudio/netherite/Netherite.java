package dev.redstudio.netherite;

import dev.redstudio.netherite.entity.SitEntity;
import dev.redstudio.netherite.item.ModContent;
import dev.redstudio.netherite.item.ModContentServer;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ObjectHolder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Netherite.MOD_ID)
public class Netherite
{
    public static final String MOD_ID = "mwc_netherite";

    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    public Netherite() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, dev.redstudio.netherite.ModConfig.COMMON_CONFIG);

        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModContent.TILE_ENTITIES.register(eventBus);
        ModContentServer.BLOCKS.register(eventBus);
        ModContentServer.ITEMS.register(eventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {

        @ObjectHolder(MOD_ID + ":sit_entity")
        public static final EntityType<SitEntity> SIT_ENTITY = null;

        @SubscribeEvent
        public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
            event.getRegistry().register(
                    EntityType.Builder.<SitEntity>create(SitEntity::new, EntityClassification.MISC)
                            .size(0.0F, 0.0F) // Invisible entity (no collision box)
                            .setShouldReceiveVelocityUpdates(false)
                            .setTrackingRange(10)
                            .setUpdateInterval(1)
                            .build(new ResourceLocation(MOD_ID, "sit_entity").toString())
                            .setRegistryName(new ResourceLocation(MOD_ID, "sit_entity"))
            );
        }
    }
}
