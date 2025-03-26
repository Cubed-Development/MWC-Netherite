package dev.redstudio.netherite.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup GEOPOLRESOURCES_GROUP = new ItemGroup("GeoPol Resources") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModContent.BARRIER_BLOCK.get());
        }
    };
}
