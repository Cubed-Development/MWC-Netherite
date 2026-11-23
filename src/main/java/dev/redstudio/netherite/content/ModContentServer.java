package dev.redstudio.netherite.content;

import dev.redstudio.netherite.Netherite;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContentServer {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Netherite.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Netherite.MOD_ID);

    public static class ModItemGroup {
        public static final ItemGroup ITEM_GROUP = new ItemGroup("mwc_netherite") {
            @Override
            public ItemStack createIcon() {
                return new ItemStack(ModContent.BARRIER.block.get());
            }
        };
    }
}