package dev.redstudio.netherite.content;

import dev.redstudio.netherite.Netherite;
import dev.redstudio.netherite.item.barrier.BarrierBlock;
import dev.redstudio.netherite.item.caution_sign.CautionBlock;
import dev.redstudio.netherite.item.chair.homechair.HomeChairBlock;
import dev.redstudio.netherite.item.chair.officechair1.OfficeChair1Block;
import dev.redstudio.netherite.item.chair.officechair2.OfficeChair2Block;
import dev.redstudio.netherite.item.chair.outdoor.OutdoorBlock;
import dev.redstudio.netherite.item.desk.corner.DeskCornerBlock;
import dev.redstudio.netherite.item.desk.corneralt1.DeskCornerAlt1Block;
import dev.redstudio.netherite.item.desk.left.DeskLeftBlock;
import dev.redstudio.netherite.item.desk.leftalt1.DeskLeftAlt1Block;
import dev.redstudio.netherite.item.desk.middle.DeskMiddleBlock;
import dev.redstudio.netherite.item.desk.right.DeskRightBlock;
import dev.redstudio.netherite.item.desk.rightalt1.DeskRightAlt1Block;
import dev.redstudio.netherite.item.gravestone.GravestoneBlock;
import dev.redstudio.netherite.item.gravestone.cross.CrossGravestoneBlock;
import dev.redstudio.netherite.item.gravestone.cross2.CrossGravestone2Block;
import dev.redstudio.netherite.item.gravestone.cross3.CrossGravestone3Block;
import dev.redstudio.netherite.item.gravestone.skull.GravestoneSkullBlock;
import dev.redstudio.netherite.item.laptop.LaptopBlock;
import dev.redstudio.netherite.item.pc.PCBlock;
import dev.redstudio.netherite.item.sandbag.basic.SandbagBlock;
import dev.redstudio.netherite.item.sandbag.wall.SandbagWallBlock;
import dev.redstudio.netherite.item.swat_truck.SwatTruckBlock;
import dev.redstudio.netherite.item.tv.ceiling.TVCeilingBlock;
import dev.redstudio.netherite.item.tv.tv.TVBlock;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityType;

import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModContentServer {

    // Block, Item, and TileEntity Deferred Registers
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Netherite.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Netherite.MOD_ID);

    // Blocks with Items
    public static final RegistryObject<Block> TV_BLOCK = registerBlockWithItem("tv_block", TVBlock::new);
    public static final RegistryObject<Block> TV_CEILING_BLOCK = registerBlockWithItem("tv_ceiling_block", TVCeilingBlock::new);
    public static final RegistryObject<Block> PC_BLOCK = registerBlockWithItem("pc_block", PCBlock::new);
    public static final RegistryObject<Block> BARRIER_BLOCK = registerBlockWithItem("barrier_block", BarrierBlock::new);
    public static final RegistryObject<Block> HOME_CHAIR_BLOCK = registerBlockWithItem("home_chair_block", HomeChairBlock::new);
    public static final RegistryObject<Block> OFFICE_CHAIR_1_BLOCK = registerBlockWithItem("office_chair1_block", OfficeChair1Block::new);
    public static final RegistryObject<Block> OFFICE_CHAIR_2_BLOCK = registerBlockWithItem("office_chair2_block", OfficeChair2Block::new);
    public static final RegistryObject<Block> OUTDOOR_CHAIR = registerBlockWithItem("outdoor_chair", OutdoorBlock::new);
    public static final RegistryObject<Block> DESK_LEFT = registerBlockWithItem("desk_left_block", DeskLeftBlock::new);
    public static final RegistryObject<Block> DESK_LEFTALT1 = registerBlockWithItem("desk_leftalt1_block", DeskLeftAlt1Block::new);
    public static final RegistryObject<Block> DESK_RIGHT = registerBlockWithItem("desk_right_block", DeskRightBlock::new);
    public static final RegistryObject<Block> DESK_RIGHTALT1 = registerBlockWithItem("desk_rightalt1_block", DeskRightAlt1Block::new);
    public static final RegistryObject<Block> DESK_MIDDLE = registerBlockWithItem("desk_middle_block", DeskMiddleBlock::new);
    public static final RegistryObject<Block> DESK_CORNER = registerBlockWithItem("desk_corner_block", DeskCornerBlock::new);
    public static final RegistryObject<Block> DESK_CORNERALT1 = registerBlockWithItem("desk_corneralt1_block", DeskCornerAlt1Block::new);
    public static final RegistryObject<Block> LAPTOP_BLOCK = registerBlockWithItem("laptop_block", LaptopBlock::new);
    public static final RegistryObject<Block> CAUTION_BLOCK = registerBlockWithItem("caution_sign_block", CautionBlock::new);
    public static final RegistryObject<Block> SWAT_TRUCK_BLOCK = registerBlockWithItem("swat_truck_block", SwatTruckBlock::new);
    public static final RegistryObject<Block> SANDBAG_BLOCK = registerBlockWithItem("sandbag", SandbagBlock::new);
    public static final RegistryObject<Block> SANDBAG_WALL_BLOCK = registerBlockWithItem("sandbag_wall", SandbagWallBlock::new);

    public static final RegistryObject<Block> GRAVESTONE_BLOCK = registerBlockWithItem("gravestone", GravestoneBlock::new);
    public static final RegistryObject<Block> CROSS_GRAVESTONE_BLOCK = registerBlockWithItem("gravestone_cross", CrossGravestoneBlock::new);
    public static final RegistryObject<Block> CROSS_GRAVESTONE_2_BLOCK = registerBlockWithItem("gravestone_cross_2", CrossGravestone2Block::new);
    public static final RegistryObject<Block> CROSS_GRAVESTONE_3_BLOCK = registerBlockWithItem("gravestone_cross_3", CrossGravestone3Block::new);
    public static final RegistryObject<Block> GRAVESTONE_SKULL_BLOCK = registerBlockWithItem("gravestone_skull", GravestoneSkullBlock::new);



    // Register block and item
    private static RegistryObject<Block> registerBlockWithItem(String name, Supplier<Block> blockSupplier) {
        RegistryObject<Block> block = BLOCKS.register(name, blockSupplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(ModItemGroup.ITEM_GROUP)));
        return block;
    }

    public static class ModItemGroup {
        public static final ItemGroup ITEM_GROUP = new ItemGroup("mwc_netherite") {
            @Override
            public ItemStack createIcon() {
                return new ItemStack(BARRIER_BLOCK.get());
            }
        };
    }
}