package dev.redstudio.netherite.item;

import dev.redstudio.netherite.Netherite;
import dev.redstudio.netherite.item.barrier.BarrierBlock;
import dev.redstudio.netherite.item.barrier.BarrierTileEntity;
import dev.redstudio.netherite.item.chair.homechair.HomeChairBlock;
import dev.redstudio.netherite.item.chair.homechair.HomeChairTileEntity;
import dev.redstudio.netherite.item.chair.officechair1.OfficeChair1Block;
import dev.redstudio.netherite.item.chair.officechair1.OfficeChair1TileEntity;
import dev.redstudio.netherite.item.chair.officechair2.OfficeChair2Block;
import dev.redstudio.netherite.item.chair.officechair2.OfficeChair2TileEntity;
import dev.redstudio.netherite.item.desk.corner.DeskCornerBlock;
import dev.redstudio.netherite.item.desk.corner.DeskCornerTileEntity;
import dev.redstudio.netherite.item.desk.corneralt1.DeskCornerAlt1Block;
import dev.redstudio.netherite.item.desk.corneralt1.DeskCornerAlt1TileEntity;
import dev.redstudio.netherite.item.desk.left.DeskLeftBlock;
import dev.redstudio.netherite.item.desk.left.DeskLeftTileEntity;
import dev.redstudio.netherite.item.desk.leftalt1.DeskLeftAlt1Block;
import dev.redstudio.netherite.item.desk.leftalt1.DeskLeftAlt1TileEntity;
import dev.redstudio.netherite.item.desk.middle.DeskMiddleBlock;
import dev.redstudio.netherite.item.desk.middle.DeskMiddleTileEntity;
import dev.redstudio.netherite.item.desk.right.DeskRightBlock;
import dev.redstudio.netherite.item.desk.right.DeskRightTileEntity;
import dev.redstudio.netherite.item.desk.rightalt1.DeskRightAlt1Block;
import dev.redstudio.netherite.item.desk.rightalt1.DeskRightAlt1TileEntity;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModContent {

    // Block, Item, and TileEntity Deferred Registers
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Netherite.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Netherite.MOD_ID);
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Netherite.MOD_ID);

    // Blocks with Items
    public static final RegistryObject<Block> BARRIER_BLOCK = registerBlockWithItem("barrier_block", BarrierBlock::new);
    public static final RegistryObject<Block> HOME_CHAIR_BLOCK = registerBlockWithItem("home_chair_block", HomeChairBlock::new);
    public static final RegistryObject<Block> OFFICE_CHAIR_1_BLOCK = registerBlockWithItem("office_chair1_block", OfficeChair1Block::new);
    public static final RegistryObject<Block> OFFICE_CHAIR_2_BLOCK = registerBlockWithItem("office_chair2_block", OfficeChair2Block::new);
    public static final RegistryObject<Block> DESK_LEFT = registerBlockWithItem("desk_left_block", DeskLeftBlock::new);
    public static final RegistryObject<Block> DESK_LEFTALT1 = registerBlockWithItem("desk_leftalt1_block", DeskLeftAlt1Block::new);
    public static final RegistryObject<Block> DESK_RIGHT = registerBlockWithItem("desk_right_block", DeskRightBlock::new);
    public static final RegistryObject<Block> DESK_RIGHTALT1 = registerBlockWithItem("desk_rightalt1_block", DeskRightAlt1Block::new);
    public static final RegistryObject<Block> DESK_MIDDLE = registerBlockWithItem("desk_middle_block", DeskMiddleBlock::new);
    public static final RegistryObject<Block> DESK_CORNER = registerBlockWithItem("desk_corner_block", DeskCornerBlock::new);
    public static final RegistryObject<Block> DESK_CORNERALT1 = registerBlockWithItem("desk_corneralt1_block", DeskCornerAlt1Block::new);

    // Tile Entities
    public static final RegistryObject<TileEntityType<TileEntity>> BARRIER_TILE_ENTITY = registerTileEntity("barrier_tile_entity", BarrierTileEntity::new, BARRIER_BLOCK);
    public static final RegistryObject<TileEntityType<TileEntity>> HOME_CHAIR_TILE_ENTITY = registerTileEntity("home_chair_tile_entity", HomeChairTileEntity::new, HOME_CHAIR_BLOCK);
    public static final RegistryObject<TileEntityType<TileEntity>> OFFICE_CHAIR_1_TILE_ENTITY = registerTileEntity("office_chair_1_tile_entity", OfficeChair1TileEntity::new, OFFICE_CHAIR_1_BLOCK);
    public static final RegistryObject<TileEntityType<TileEntity>> OFFICE_CHAIR_2_TILE_ENTITY = registerTileEntity("office_chair_2_tile_entity", OfficeChair2TileEntity::new, OFFICE_CHAIR_2_BLOCK);
    public static final RegistryObject<TileEntityType<TileEntity>> DESK_LEFT_TILE_ENTITY = registerTileEntity("desk_left_tile_entity", DeskLeftTileEntity::new, DESK_LEFT);
    public static final RegistryObject<TileEntityType<TileEntity>> DESK_RIGHT_TILE_ENTITY = registerTileEntity("desk_right_tile_entity", DeskRightTileEntity::new, DESK_RIGHT);
    public static final RegistryObject<TileEntityType<TileEntity>> DESK_RIGHTALT1_TILE_ENTITY = registerTileEntity("desk_rightalt1_tile_entity", DeskRightAlt1TileEntity::new, DESK_RIGHTALT1);
    public static final RegistryObject<TileEntityType<TileEntity>> DESK_MIDDLE_TILE_ENTITY = registerTileEntity("desk_middle_tile_entity", DeskMiddleTileEntity::new, DESK_MIDDLE);
    public static final RegistryObject<TileEntityType<TileEntity>> DESK_CORNER_TILE_ENTITY = registerTileEntity("desk_corner_tile_entity", DeskCornerTileEntity::new, DESK_CORNER);
    public static final RegistryObject<TileEntityType<TileEntity>> DESK_CORNERALT1_TILE_ENTITY = registerTileEntity("desk_corneralt1_tile_entity", DeskCornerAlt1TileEntity::new, DESK_CORNERALT1);
    public static final  RegistryObject<TileEntityType<TileEntity>> DESK_LEFTALT1_TILE_ENTITY = registerTileEntity("desk_leftalt1_tile_entity",  DeskLeftAlt1TileEntity::new, DESK_LEFTALT1);

    private static RegistryObject<Block> registerBlockWithItem(String name, Supplier<Block> blockSupplier) {
        RegistryObject<Block> block = BLOCKS.register(name, blockSupplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(ModItemGroup.GEOPOLRESOURCES_GROUP)));
        return block;
    }

    private static <T extends net.minecraft.tileentity.TileEntity> RegistryObject<TileEntityType<T>> registerTileEntity(
            String name, Supplier<T> tileSupplier, RegistryObject<Block> block) {
        return TILE_ENTITY_TYPES.register(name,
                () -> TileEntityType.Builder.create(tileSupplier, block.get()).build(null));
    }
}