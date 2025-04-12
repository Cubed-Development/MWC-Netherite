package dev.redstudio.netherite;

import dev.redstudio.netherite.entity.SitEntityRenderer;
import dev.redstudio.netherite.item.ModContentClient;
import dev.redstudio.netherite.item.TileEntityModelInfo;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import static dev.redstudio.netherite.EventServer.SIT_ENTITY;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EventClient {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        ModContentClient.clientSetup(event);

        // Register general entity rendering handlers
        RenderingRegistry.registerEntityRenderingHandler(SIT_ENTITY, SitEntityRenderer::new);

        // Loop through the TILE_ENTITY_MODEL_INFOS list from ModContentClient to register tile entity renderers
        for (TileEntityModelInfo<?> tileEntityModelInfo : ModContentClient.TILE_ENTITY_MODEL_INFOS) {
            @SuppressWarnings("unchecked")
            TileEntityType<TileEntity> tileEntityType = (TileEntityType<TileEntity>) tileEntityModelInfo.type.get();

            Netherite.LOGGER.debug("Loading: {}", tileEntityType.getRegistryName());

            ClientRegistry.bindTileEntityRenderer(tileEntityType, dispatcher ->
                    new TileRenderer(dispatcher)
                            .setTexture(tileEntityModelInfo.texture)
                            .setModel(tileEntityModelInfo.model)
            );
        }
    }
}
