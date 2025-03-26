package dev.redstudio.netherite.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup ITEM_GROUP = new ItemGroup("mwc_netherite") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModContent.BARRIER_BLOCK.get());
        }
    };
}
