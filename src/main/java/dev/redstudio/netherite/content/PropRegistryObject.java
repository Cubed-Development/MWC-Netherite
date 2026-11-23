package dev.redstudio.netherite.content;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

public class PropRegistryObject<B extends Block, T extends TileEntity> {
    public final RegistryObject<B> block;
    public final RegistryObject<Item> item;
    public RegistryObject<TileEntityType<T>> tileEntity;

    public PropRegistryObject(
            String blockName,
            String teName,
            Function<Supplier<TileEntityType<?>>, B> blockFactory,
            Function<TileEntityType<T>, T> teFactory,
            Supplier<Supplier<EntityModel<Entity>>> clientModelSupplier,
            String texturePath) {

        this.block = ModContentServer.BLOCKS.register(blockName,
                () -> blockFactory.apply(() -> this.tileEntity.get()));

        this.item = ModContentServer.ITEMS.register(blockName,
                () -> new BlockItem(this.block.get(), new Item.Properties().group(ModContentServer.ModItemGroup.ITEM_GROUP)));

        this.tileEntity = ModContent.TILE_ENTITIES.register(teName,
                () -> TileEntityType.Builder.<T>create(() -> teFactory.apply(this.tileEntity.get()), this.block.get()).build(null));

        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () ->
                ModContentClient.queueModel(this.tileEntity, clientModelSupplier.get(), texturePath)
        );
    }
}