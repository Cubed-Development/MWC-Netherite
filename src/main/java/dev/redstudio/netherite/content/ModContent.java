package dev.redstudio.netherite.content;

import dev.redstudio.netherite.Netherite;
import dev.redstudio.netherite.item.BlockCustomShape;
import dev.redstudio.netherite.item.PropBlock;
import dev.redstudio.netherite.item.PropTileEntity;
import dev.redstudio.netherite.item.SittablePropBlock;
import dev.redstudio.netherite.item.barrier.BarrierModel;
import dev.redstudio.netherite.item.bodys.BodyBagModel;
import dev.redstudio.netherite.item.bodys.BodyHangingModel;
import dev.redstudio.netherite.item.bodys.BodyImpaledModel;
import dev.redstudio.netherite.item.caution_sign.CautionSignModel;
import dev.redstudio.netherite.item.chair.homechair.HomeChairModel;
import dev.redstudio.netherite.item.chair.officechair1.OfficeChair1Model;
import dev.redstudio.netherite.item.chair.officechair2.OfficeChair2Model;
import dev.redstudio.netherite.item.chair.outdoor.OutdoorChairModel;
import dev.redstudio.netherite.item.containers.ammo_box.AmmunitionBoxModel;
import dev.redstudio.netherite.item.containers.barrel.BarrelModel;
import dev.redstudio.netherite.item.containers.dumpster.DumpsterModel;
import dev.redstudio.netherite.item.containers.electric_box_closed.ElectricBoxClosedModel;
import dev.redstudio.netherite.item.containers.electric_box_open.ElectricBoxOpenModel;
import dev.redstudio.netherite.item.containers.filing_cabinet_closed.FilingCabinetClosedModel;
import dev.redstudio.netherite.item.containers.filing_cabinet_open.FilingCabinetOpenedModel;
import dev.redstudio.netherite.item.containers.fridge_closed.FridgeClosedModel;
import dev.redstudio.netherite.item.containers.fridge_open.FridgeOpenModel;
import dev.redstudio.netherite.item.containers.lockers.LockerModel;
import dev.redstudio.netherite.item.containers.lockers.SCPLockerModel;
import dev.redstudio.netherite.item.containers.weapon.WeaponCaseModel;
import dev.redstudio.netherite.item.containers.weapon.WeaponCaseSmallModel;
import dev.redstudio.netherite.item.containers.weapon.WeaponCrateRussianModel;
import dev.redstudio.netherite.item.containers.trash_bin.TrashBinModel;
import dev.redstudio.netherite.item.containers.vending_machine.VendingMachineModel;
import dev.redstudio.netherite.item.containers.weapon.WeaponLockerModel;
import dev.redstudio.netherite.item.containers.wooden_crate.WoodenCrateModel;
import dev.redstudio.netherite.item.containers.wooden_crate.WoodenCrateOpenedModel;
import dev.redstudio.netherite.item.desk.corner.DeskCornerModel;
import dev.redstudio.netherite.item.desk.corneralt1.DeskCornerAlt1Model;
import dev.redstudio.netherite.item.desk.left.DeskLeftModel;
import dev.redstudio.netherite.item.desk.leftalt1.DeskLeftAlt1Model;
import dev.redstudio.netherite.item.desk.middle.DeskMiddleModel;
import dev.redstudio.netherite.item.desk.right.DeskRightModel;
import dev.redstudio.netherite.item.desk.rightalt1.DeskRightAlt1Model;
import dev.redstudio.netherite.item.forklift.ForkLiftAltModel;
import dev.redstudio.netherite.item.forklift.ForkliftModel;
import dev.redstudio.netherite.item.gravestone.GravestoneModel;
import dev.redstudio.netherite.item.gravestone.cross.CrossGravestoneModel;
import dev.redstudio.netherite.item.gravestone.cross2.CrossGravestone2Model;
import dev.redstudio.netherite.item.gravestone.cross3.CrossGravestone3Model;
import dev.redstudio.netherite.item.gravestone.skull.GravestoneSkullModel;
import dev.redstudio.netherite.item.laptop.LaptopModel;
import dev.redstudio.netherite.item.light.*;
import dev.redstudio.netherite.item.operating_table.OperatingTableAltModel;
import dev.redstudio.netherite.item.operating_table.OperatingTableModel;
import dev.redstudio.netherite.item.pc.PCModel;
import dev.redstudio.netherite.item.sandbag.basic.SandbagModel;
import dev.redstudio.netherite.item.sandbag.wall.SandbagWallModel;
import dev.redstudio.netherite.item.shelves.ShelfLeftModel;
import dev.redstudio.netherite.item.shelves.ShelfRightModel;
import dev.redstudio.netherite.item.shelves.ShelfTopModel;
import dev.redstudio.netherite.item.spooky.SpookyGhostModel;
import dev.redstudio.netherite.item.spooky.SpookyScarecrowModel;
import dev.redstudio.netherite.item.swat_truck.SwatTruckModel;
import dev.redstudio.netherite.item.tv.ceiling.TVCeilingModel;
import dev.redstudio.netherite.item.tv.tv.TVModel;
import dev.redstudio.netherite.item.vent.*;
import dev.redstudio.netherite.item.servers.*;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Function;
import java.util.function.Supplier;

public class ModContent {

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES =
            DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Netherite.MOD_ID);

    private static PropRegistryObject<PropBlock, PropTileEntity> prop(
            String name,
            Supplier<Supplier<EntityModel<Entity>>> model,
            String texture) {
        return prop(name, name + "_tile_entity", model, texture);
    }

    private static PropRegistryObject<PropBlock, PropTileEntity> prop(
            String blockName,
            String teName,
            Supplier<Supplier<EntityModel<Entity>>> model,
            String texture) {
        return new PropRegistryObject<>(blockName, teName, PropBlock::new, PropTileEntity::new, model, texture);
    }

    private static <B extends Block> PropRegistryObject<B, PropTileEntity> customProp(
            String blockName,
            String teName,
            Function<Supplier<TileEntityType<?>>, B> blockFactory,
            Supplier<Supplier<EntityModel<Entity>>> model,
            String texture) {
        return new PropRegistryObject<>(blockName, teName, blockFactory, PropTileEntity::new, model, texture);
    }

    // Electronics & Office
    public static final PropRegistryObject<BlockCustomShape, PropTileEntity> TV =
            customProp("tv_block", "tv_tile_entity",
                    te -> new BlockCustomShape(te, Block.makeCuboidShape(-16, 0, 4, 32, 26, 8)),
                    () -> TVModel::new, "textures/block/tv.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> TV_CEILING =
            prop("tv_ceiling_block", "tv_ceiling_tile_entity", () -> TVCeilingModel::new, "textures/block/tv.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> PC =
            prop("pc_block", "pc_tile_entity", () -> PCModel::new, "textures/block/pc.png");
    public static final PropRegistryObject<BlockCustomShape, PropTileEntity> LAPTOP =
            customProp("laptop_block", "laptop_tile_entity",
                    te -> new BlockCustomShape(te, Block.makeCuboidShape(0.0F, 0.0F, 0.0F, 12.0F, 13.0F, 16.0F)),
                    () -> LaptopModel::new, "textures/block/pc.png");

    // Chairs (Sittable)
    public static final PropRegistryObject<SittablePropBlock, PropTileEntity> HOME_CHAIR =
            customProp("home_chair_block", "home_chair_tile_entity", SittablePropBlock::new, () -> HomeChairModel::new, "textures/block/homechair.png");
    public static final PropRegistryObject<SittablePropBlock, PropTileEntity> OFFICE_CHAIR_1 =
            customProp("office_chair1_block", "office_chair_1_tile_entity", SittablePropBlock::new, () -> OfficeChair1Model::new, "textures/block/officechair.png");
    public static final PropRegistryObject<SittablePropBlock, PropTileEntity> OFFICE_CHAIR_2 =
            customProp("office_chair2_block", "office_chair_2_tile_entity", SittablePropBlock::new, () -> OfficeChair2Model::new, "textures/block/officechair.png");
    public static final PropRegistryObject<SittablePropBlock, PropTileEntity> OUTDOOR_CHAIR =
            customProp("outdoor_chair", "outdoor_chair_tile_entity", SittablePropBlock::new, () -> OutdoorChairModel::new, "textures/block/outdoorchair.png");

    // Desks
    public static final PropRegistryObject<PropBlock, PropTileEntity> DESK_LEFT =
            prop("desk_left_block", "desk_left_tile_entity", () -> DeskLeftModel::new, "textures/block/desk.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> DESK_LEFT_ALT1 =
            prop("desk_leftalt1_block", "desk_leftalt1_tile_entity", () -> DeskLeftAlt1Model::new, "textures/block/desk.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> DESK_RIGHT =
            prop("desk_right_block", "desk_right_tile_entity", () -> DeskRightModel::new, "textures/block/desk.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> DESK_RIGHT_ALT1 =
            prop("desk_rightalt1_block", "desk_rightalt1_tile_entity", () -> DeskRightAlt1Model::new, "textures/block/desk.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> DESK_MIDDLE =
            prop("desk_middle_block", "desk_middle_tile_entity", () -> DeskMiddleModel::new, "textures/block/desk.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> DESK_CORNER =
            prop("desk_corner_block", "desk_corner_tile_entity", () -> DeskCornerModel::new, "textures/block/desk.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> DESK_CORNER_ALT1 =
            prop("desk_corneralt1_block", "desk_corneralt1_tile_entity", () -> DeskCornerAlt1Model::new, "textures/block/desk.png");

    // Street, Military & Medical
    public static final PropRegistryObject<PropBlock, PropTileEntity> BARRIER =
            prop("barrier_block", "barrier_tile_entity", () -> BarrierModel::new, "textures/block/barrier.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> CAUTION_SIGN =
            prop("caution_sign_block", "caution_tile_entity", () -> CautionSignModel::new, "textures/block/cautionsign.png");
    public static final PropRegistryObject<BlockCustomShape, PropTileEntity> SWAT_TRUCK =
            customProp("swat_truck_block", "swat_truck_tile_entity",
                    te -> new BlockCustomShape(te, Block.makeCuboidShape(-12, 0, 0, 28, 16, 64)),
                    () -> SwatTruckModel::new, "textures/block/swattruck.png");
    public static final PropRegistryObject<BlockCustomShape, PropTileEntity> SANDBAG =
            customProp("sandbag", "sandbag_tile_entity",
                    te -> new BlockCustomShape(te, Block.makeCuboidShape(0.0F, 0.0F, 0.0F, 16.0F, 6.5F, 16.0F)),
                    () -> SandbagModel::new, "textures/block/sandbag.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> SANDBAG_WALL =
            prop("sandbag_wall", () -> SandbagWallModel::new, "textures/block/sandbag.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> OPERATING_TABLE =
            prop("operating_table", () -> OperatingTableModel::new, "textures/block/operatingtable.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> OPERATING_TABLE_ALT =
            prop("operating_table_alt", () -> OperatingTableAltModel::new, "textures/block/operatingtable.png");

    // Gravestones
    public static final PropRegistryObject<PropBlock, PropTileEntity> GRAVESTONE =
            prop("gravestone", () -> GravestoneModel::new, "textures/block/gravestone.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> CROSS_GRAVESTONE =
            prop("gravestone_cross", "cross_gravestone_tile_entity", () -> CrossGravestoneModel::new, "textures/block/crossgravestone.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> CROSS_GRAVESTONE_2 =
            prop("gravestone_cross_2", "cross_gravestone_2_tile_entity", () -> CrossGravestone2Model::new, "textures/block/crossgravestone2.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> CROSS_GRAVESTONE_3 =
            prop("gravestone_cross_3", "cross_gravestone_3_tile_entity", () -> CrossGravestone3Model::new, "textures/block/crossgravestone3.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> GRAVESTONE_SKULL =
            prop("gravestone_skull", () -> GravestoneSkullModel::new, "textures/block/gravestoneskull.png");

    // Containers & Appliances
    public static final PropRegistryObject<PropBlock, PropTileEntity> AMMUNITION_BOX =
            prop("ammunition_box", () -> AmmunitionBoxModel::new, "textures/block/ammobox.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> FRIDGE_OPEN =
            prop("fridge_open", () -> FridgeOpenModel::new, "textures/block/fridge.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> FRIDGE_CLOSED =
            prop("fridge_closed", () -> FridgeClosedModel::new, "textures/block/fridge.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> ELECTRIC_BOX_CLOSED =
            prop("electric_box_closed", () -> ElectricBoxClosedModel::new, "textures/block/electricbox.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> ELECTRIC_BOX_OPEN =
            prop("electric_box_open", () -> ElectricBoxOpenModel::new, "textures/block/electricbox.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> VENDING_MACHINE =
            prop("vending_machine", () -> VendingMachineModel::new, "textures/block/vendingmachine.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> FILING_CABINET_OPENED =
            prop("filing_cabinet_opened", () -> FilingCabinetOpenedModel::new, "textures/block/filingcabinet.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> FILING_CABINET_CLOSED =
            prop("filing_cabinet_closed", () -> FilingCabinetClosedModel::new, "textures/block/filingcabinet.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> BARREL =
            prop("barrel", () -> BarrelModel::new, "textures/block/barrel.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> TRASH_BIN =
            prop("trash_bin", () -> TrashBinModel::new, "textures/block/trashbin.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> DUMPSTER =
            prop("dumpster", () -> DumpsterModel::new, "textures/block/dumpster.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> WOODEN_CRATE =
            prop("wooden_crate", () -> WoodenCrateModel::new, "textures/block/todo.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> WOODEN_CRATE_OPENED =
            prop("wooden_crate_opened", () -> WoodenCrateOpenedModel::new, "textures/block/todo.png");

    // Weapon containers
    public static final PropRegistryObject<PropBlock, PropTileEntity> WEAPON_CRATE_RUSSIAN =
            prop("weapon_crate_russian", () -> WeaponCrateRussianModel::new, "textures/block/militarycrate.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> WEAPON_CASE =
            prop("weapon_case", () -> WeaponCaseModel::new, "textures/block/todo.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> WEAPON_CASE_SMALL =
            prop("weapon_case_small", () -> WeaponCaseSmallModel::new, "textures/block/todo.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> WEAPON_LOCKER =
            prop("weapon_locker", () -> WeaponLockerModel::new, "textures/block/todo.png");

    // Vents
    public static final PropRegistryObject<PropBlock, PropTileEntity> VENT =
            prop("vent", () -> VentModel::new, "textures/block/vent.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> VENT_CORNER =
            prop("vent_corner", () -> VentCornerModel::new, "textures/block/vent.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> VENT_END =
            prop("vent_end", () -> VentEndModel::new, "textures/block/vent.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> VENT_INTERSECTION =
            prop("vent_intersection", () -> VentIntersectionModel::new, "textures/block/vent.png");

    // Lights
    public static final PropRegistryObject<PropBlock, PropTileEntity> CEILING_LAMP =
            prop("ceiling_lamp", () -> CeilingLampModel::new, "textures/block/ceilinglamp.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> CEILING_LAMP_ALT =
            prop("ceiling_lamp_alt", () -> CeilingLampAltModel::new, "textures/block/ceilinglampalt.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> FLOODLIGHT =
            prop("floodlight", () -> FloodlightModel::new, "textures/block/floodlight.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> FLOODLIGHT_DUAL =
            prop("floodlight_dual", () -> FloodlightDuelModel::new, "textures/block/duelfloodlight.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> FLOODLIGHT_TOWABLE =
            prop("floodlight_towable", () -> FloodlightTowableModel::new, "textures/block/towablefloodlight.png");

    // Shelf
    public static final PropRegistryObject<PropBlock, PropTileEntity> SHELF_LEFT =
            prop("shelf_left", () -> ShelfLeftModel::new, "textures/block/shelf.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> SHELF_RIGHT =
            prop("shelf_right", () -> ShelfRightModel::new, "textures/block/shelf.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> SHELF_TOP =
            prop("shelf_top", () -> ShelfTopModel::new, "textures/block/shelf.png");

    // Servers
    public static final PropRegistryObject<PropBlock, PropTileEntity> SERVER_RACK_EMPTY_LEFT =
            prop("server_rack_empty_left", () -> ServerRackEmptyLeftModel::new, "textures/block/serverrackempty.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> SERVER_RACK_EMPTY_RIGHT =
            prop("server_rack_empty_right", () -> ServerRackEmptyRightModel::new, "textures/block/serverrackempty.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> SERVER_RACK_LEFT =
            prop("server_rack_left", () -> ServerRackLeftModel::new, "textures/block/serverrackleft.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> SERVER_RACK_LEFT_ALT =
            prop("server_rack_left_alt", () -> ServerRackLeftAltModel::new, "textures/block/serverrackleftalt.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> SERVER_RACK_LEFT_ALT2 =
            prop("server_rack_left_alt2", () -> ServerRackLeftAlt2Model::new, "textures/block/serverrackleftalt2.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> SERVER_RACK_LEFT_ALT3 =
            prop("server_rack_left_alt3", () -> ServerRackLeftAlt3Model::new, "textures/block/serverrackleftalt3.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> SERVER_RACK_RIGHT =
            prop("server_rack_right", () -> ServerRackRightModel::new, "textures/block/serverrackright.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> SERVER_RACK_RIGHT_ALT =
            prop("server_rack_right_alt", () -> ServerRackRightAltModel::new, "textures/block/serverrackrightalt.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> SERVER_RACK_TOP =
            prop("server_rack_top", () -> ServerRackTopModel::new, "textures/block/serverrackleft.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> SERVER_RACK_TOP_RIGHT =
            prop("server_rack_top_right", () -> ServerRackTopRightModel::new, "textures/block/serverrackright.png");

    public static final PropRegistryObject<PropBlock, PropTileEntity> BODY_BAG =
            prop("body_bag", () -> BodyBagModel::new, "textures/block/todo.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> BODY_HANGING =
            prop("body_hanging", () -> BodyHangingModel::new, "textures/block/todo.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> BODY_IMPALED =
            prop("body_impaled", () -> BodyImpaledModel::new, "textures/block/todo.png");

    public static final PropRegistryObject<PropBlock, PropTileEntity> FORKLIFT =
            prop("forklift", () -> ForkliftModel::new, "textures/block/forklift.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> FORKLIFT_ALT =
            prop("forklift_alt", () -> ForkLiftAltModel::new, "textures/block/forkliftalt.png");

    public static final PropRegistryObject<PropBlock, PropTileEntity> SPOOKY_SCARECROW =
            prop("spooky_scarecrow", () -> SpookyScarecrowModel::new, "textures/block/scarecrow.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> SPOOKY_GHOST =
            prop("spooky_ghost", () -> SpookyGhostModel::new, "textures/block/spookyghost.png");

    public static final PropRegistryObject<PropBlock, PropTileEntity> LOCKER =
            prop("locker", () -> LockerModel::new, "textures/block/locker.png");
    public static final PropRegistryObject<PropBlock, PropTileEntity> SCP_LOCKER =
            prop("locker_scp", () -> SCPLockerModel::new, "textures/block/scplocker.png");
}