package dev.redstudio.netherite.event;

import dev.redstudio.netherite.Netherite;
import dev.redstudio.netherite.TileRenderer;
import dev.redstudio.netherite.entity.SitEntityRenderer;
import dev.redstudio.netherite.content.ModContentClient;
import dev.redstudio.netherite.item.TileEntityModelInfo;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import static dev.redstudio.netherite.event.EventServer.SIT_ENTITY;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EventClient {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        ModContentClient.clientSetup(event);

        RenderingRegistry.registerEntityRenderingHandler(SIT_ENTITY, SitEntityRenderer::new);

        // Only register one TileRenderer, but register all model info
        for (TileEntityModelInfo<?> info : ModContentClient.TILE_ENTITY_MODEL_INFOS) {
            TileRenderer.registerModelInfo(info);

            @SuppressWarnings("unchecked")
            TileEntityType<TileEntity> tileEntityType = (TileEntityType<TileEntity>) info.type.get();

            Netherite.LOGGER.debug("Binding shared renderer for: {}", tileEntityType.getRegistryName());

            ClientRegistry.bindTileEntityRenderer(tileEntityType, TileRenderer::new);
        }
    }

}
