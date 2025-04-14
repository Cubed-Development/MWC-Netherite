package dev.redstudio.netherite;

import dev.redstudio.netherite.content.ModContent;
import dev.redstudio.netherite.content.ModContentServer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
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
    }
}
