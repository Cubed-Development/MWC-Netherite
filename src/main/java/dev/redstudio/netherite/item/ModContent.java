package dev.redstudio.netherite.item;

import dev.redstudio.netherite.Netherite;
import dev.redstudio.netherite.item.barrier.BarrierTileEntity;
import dev.redstudio.netherite.item.caution_sign.CautionTileEntity;
import dev.redstudio.netherite.item.chair.homechair.HomeChairTileEntity;
import dev.redstudio.netherite.item.chair.officechair1.OfficeChair1TileEntity;
import dev.redstudio.netherite.item.chair.officechair2.OfficeChair2TileEntity;
import dev.redstudio.netherite.item.desk.left.DeskLeftTileEntity;
import dev.redstudio.netherite.item.desk.leftalt1.DeskLeftAlt1TileEntity;
import dev.redstudio.netherite.item.desk.right.DeskRightTileEntity;
import dev.redstudio.netherite.item.desk.rightalt1.DeskRightAlt1TileEntity;
import dev.redstudio.netherite.item.desk.middle.DeskMiddleTileEntity;
import dev.redstudio.netherite.item.desk.corner.DeskCornerTileEntity;
import dev.redstudio.netherite.item.desk.corneralt1.DeskCornerAlt1TileEntity;
import dev.redstudio.netherite.item.laptop.LaptopTileEntity;
import dev.redstudio.netherite.item.rebar.RebarTileEntity;
import dev.redstudio.netherite.item.swat_truck.SwatTruckTileEntity;
import dev.redstudio.netherite.item.pc.PCTileEntity;
import dev.redstudio.netherite.item.tv.TVTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContent {

    // Deferred register for TileEntities
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Netherite.MOD_ID);

    // Define RegistryObject<TileEntityType> for each TileEntity
    public static final RegistryObject<TileEntityType<TVTileEntity>> TV_TILE_ENTITY = TILE_ENTITIES.register("tv_tile_entity", () -> TileEntityType.Builder.create(() -> new TVTileEntity(), ModContentServer.TV_BLOCK.get()).build(null));
    public static final RegistryObject<TileEntityType<PCTileEntity>> PC_TILE_ENTITY = TILE_ENTITIES.register("pc_tile_entity", () -> TileEntityType.Builder.create(() -> new PCTileEntity(), ModContentServer.PC_BLOCK.get()).build(null));
    public static final RegistryObject<TileEntityType<BarrierTileEntity>> BARRIER_TILE_ENTITY = TILE_ENTITIES.register("barrier_tile_entity", () -> TileEntityType.Builder.create(() -> new BarrierTileEntity(), ModContentServer.BARRIER_BLOCK.get()).build(null));
    public static final RegistryObject<TileEntityType<HomeChairTileEntity>> HOME_CHAIR_TILE_ENTITY = TILE_ENTITIES.register("home_chair_tile_entity", () -> TileEntityType.Builder.create(() -> new HomeChairTileEntity(), ModContentServer.HOME_CHAIR_BLOCK.get()).build(null));
    public static final RegistryObject<TileEntityType<OfficeChair1TileEntity>> OFFICE_CHAIR_1_TILE_ENTITY = TILE_ENTITIES.register("office_chair_1_tile_entity", () -> TileEntityType.Builder.create(() -> new OfficeChair1TileEntity(), ModContentServer.OFFICE_CHAIR_1_BLOCK.get()).build(null));
    public static final RegistryObject<TileEntityType<OfficeChair2TileEntity>> OFFICE_CHAIR_2_TILE_ENTITY = TILE_ENTITIES.register("office_chair_2_tile_entity", () -> TileEntityType.Builder.create(() -> new OfficeChair2TileEntity(), ModContentServer.OFFICE_CHAIR_2_BLOCK.get()).build(null));
    public static final RegistryObject<TileEntityType<DeskLeftTileEntity>> DESK_LEFT_TILE_ENTITY = TILE_ENTITIES.register("desk_left_tile_entity", () -> TileEntityType.Builder.create(() -> new DeskLeftTileEntity(), ModContentServer.DESK_LEFT.get()).build(null));
    public static final RegistryObject<TileEntityType<DeskLeftAlt1TileEntity>> DESK_LEFTALT1_TILE_ENTITY = TILE_ENTITIES.register("desk_leftalt1_tile_entity", () -> TileEntityType.Builder.create(() -> new DeskLeftAlt1TileEntity(), ModContentServer.DESK_LEFTALT1.get()).build(null));
    public static final RegistryObject<TileEntityType<DeskRightTileEntity>> DESK_RIGHT_TILE_ENTITY = TILE_ENTITIES.register("desk_right_tile_entity", () -> TileEntityType.Builder.create(() -> new DeskRightTileEntity(), ModContentServer.DESK_RIGHT.get()).build(null));
    public static final RegistryObject<TileEntityType<DeskRightAlt1TileEntity>> DESK_RIGHTALT1_TILE_ENTITY = TILE_ENTITIES.register("desk_rightalt1_tile_entity", () -> TileEntityType.Builder.create(() -> new DeskRightAlt1TileEntity(), ModContentServer.DESK_RIGHTALT1.get()).build(null));
    public static final RegistryObject<TileEntityType<DeskMiddleTileEntity>> DESK_MIDDLE_TILE_ENTITY = TILE_ENTITIES.register("desk_middle_tile_entity", () -> TileEntityType.Builder.create(() -> new DeskMiddleTileEntity(), ModContentServer.DESK_MIDDLE.get()).build(null));
    public static final RegistryObject<TileEntityType<DeskCornerTileEntity>> DESK_CORNER_TILE_ENTITY = TILE_ENTITIES.register("desk_corner_tile_entity", () -> TileEntityType.Builder.create(() -> new DeskCornerTileEntity(), ModContentServer.DESK_CORNER.get()).build(null));
    public static final RegistryObject<TileEntityType<DeskCornerAlt1TileEntity>> DESK_CORNERALT1_TILE_ENTITY = TILE_ENTITIES.register("desk_corneralt1_tile_entity", () -> TileEntityType.Builder.create(() -> new DeskCornerAlt1TileEntity(), ModContentServer.DESK_CORNERALT1.get()).build(null));
    public static final RegistryObject<TileEntityType<LaptopTileEntity>> LAPTOP_TILE_ENTITY = TILE_ENTITIES.register("laptop_tile_entity", () -> TileEntityType.Builder.create(() -> new LaptopTileEntity(), ModContentServer.LAPTOP_BLOCK.get()).build(null));
    public static final RegistryObject<TileEntityType<CautionTileEntity>> CAUTION_TILE_ENTITY = TILE_ENTITIES.register("caution_tile_entity", () -> TileEntityType.Builder.create(() -> new CautionTileEntity(), ModContentServer.CAUTION_BLOCK.get()).build(null));
    public static final RegistryObject<TileEntityType<SwatTruckTileEntity>> SWAT_TRUCK_TILE_ENTITY = TILE_ENTITIES.register("swat_truck_tile_entity", () -> TileEntityType.Builder.create(() -> new SwatTruckTileEntity(), ModContentServer.SWAT_TRUCK_BLOCK.get()).build(null));
    public static final RegistryObject<TileEntityType<RebarTileEntity>> REBAR_TILE_ENTITY = TILE_ENTITIES.register("rebar_tile_entity", () -> TileEntityType.Builder.create(() -> new RebarTileEntity(), ModContentServer.REBAR_BLOCK.get()).build(null));

}
