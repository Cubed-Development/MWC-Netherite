package dev.redstudio.netherite.content;

import dev.redstudio.netherite.Netherite;
import dev.redstudio.netherite.content.flywheel.FlywheelCompact;
import dev.redstudio.netherite.item.TileEntityModelInfo;
import dev.redstudio.netherite.item.barrier.BarrierModel;
import dev.redstudio.netherite.item.caution_sign.CautionSignModel;
import dev.redstudio.netherite.item.chair.homechair.HomeChairModel;
import dev.redstudio.netherite.item.chair.officechair1.OfficeChair1Model;
import dev.redstudio.netherite.item.chair.officechair2.OfficeChair2Model;
import dev.redstudio.netherite.item.chair.outdoor.OutdoorChairModel;
import dev.redstudio.netherite.item.containers.ammo_box.AmmunitionBoxModel;
import dev.redstudio.netherite.item.containers.electric_box_closed.ElectricBoxClosedModel;
import dev.redstudio.netherite.item.containers.electric_box_open.ElectricBoxOpenModel;
import dev.redstudio.netherite.item.containers.filing_cabinet_closed.FilingCabinetClosedBlock;
import dev.redstudio.netherite.item.containers.filing_cabinet_closed.FilingCabinetClosedModel;
import dev.redstudio.netherite.item.containers.filing_cabinet_open.FilingCabinetOpenedModel;
import dev.redstudio.netherite.item.containers.fridge_closed.FridgeClosedModel;
import dev.redstudio.netherite.item.containers.fridge_open.FridgeOpenModel;
import dev.redstudio.netherite.item.containers.russian_crate.WeaponCrateRussianModel;
import dev.redstudio.netherite.item.containers.vending_machine.VendingMachineModel;
import dev.redstudio.netherite.item.desk.corner.DeskCornerModel;
import dev.redstudio.netherite.item.desk.corneralt1.DeskCornerAlt1Model;
import dev.redstudio.netherite.item.desk.left.DeskLeftModel;
import dev.redstudio.netherite.item.desk.leftalt1.DeskLeftAlt1Model;
import dev.redstudio.netherite.item.desk.middle.DeskMiddleModel;
import dev.redstudio.netherite.item.desk.right.DeskRightModel;
import dev.redstudio.netherite.item.desk.rightalt1.DeskRightAlt1Model;
import dev.redstudio.netherite.item.gravestone.GravestoneModel;
import dev.redstudio.netherite.item.gravestone.cross.CrossGravestoneModel;
import dev.redstudio.netherite.item.gravestone.cross2.CrossGravestone2Model;
import dev.redstudio.netherite.item.gravestone.cross3.CrossGravestone3Model;
import dev.redstudio.netherite.item.gravestone.skull.GravestoneSkullModel;
import dev.redstudio.netherite.item.laptop.LaptopModel;
import dev.redstudio.netherite.item.operating_table.OperatingTableAltModel;
import dev.redstudio.netherite.item.operating_table.OperatingTableModel;
import dev.redstudio.netherite.item.pc.PCModel;
import dev.redstudio.netherite.item.sandbag.basic.SandbagModel;
import dev.redstudio.netherite.item.sandbag.wall.SandbagWallModel;
import dev.redstudio.netherite.item.swat_truck.SwatTruckModel;
import dev.redstudio.netherite.item.tv.ceiling.TVCeilingModel;
import dev.redstudio.netherite.item.tv.tv.TVModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.util.ArrayList;
import java.util.function.Supplier;

public class ModContentClient {

    public static final ArrayList<TileEntityModelInfo<? extends TileEntity>> TILE_ENTITY_MODEL_INFOS = new ArrayList<>();

    public static void clientSetup(FMLClientSetupEvent event) {
        registerTileEntityModels();
    }


    private static void registerTileEntityModels() {
        // Ensure all models extend EntityModel<Entity>
        registerTileEntityModel(ModContent.TV_TILE_ENTITY, TVModel::new, "textures/block/tv.png");
        registerTileEntityModel(ModContent.TV_CEILING_TILE_ENTITY, TVCeilingModel::new, "textures/block/tv.png");
        registerTileEntityModel(ModContent.PC_TILE_ENTITY, PCModel::new, "textures/block/pc.png");
        registerTileEntityModel(ModContent.BARRIER_TILE_ENTITY, BarrierModel::new, "textures/block/barrier.png");
        registerTileEntityModel(ModContent.HOME_CHAIR_TILE_ENTITY, HomeChairModel::new, "textures/block/homechair.png");
        registerTileEntityModel(ModContent.OFFICE_CHAIR_1_TILE_ENTITY, OfficeChair1Model::new, "textures/block/officechair.png");
        registerTileEntityModel(ModContent.OFFICE_CHAIR_2_TILE_ENTITY, OfficeChair2Model::new, "textures/block/officechair.png");
        registerTileEntityModel(ModContent.OUTDOOR_CHAIR_TILE_ENTITY, OutdoorChairModel::new, "textures/block/outdoorchair.png");
        registerTileEntityModel(ModContent.DESK_LEFT_TILE_ENTITY, DeskLeftModel::new, "textures/block/desk.png");
        registerTileEntityModel(ModContent.DESK_LEFTALT1_TILE_ENTITY, DeskLeftAlt1Model::new, "textures/block/desk.png");
        registerTileEntityModel(ModContent.DESK_RIGHT_TILE_ENTITY, DeskRightModel::new, "textures/block/desk.png");
        registerTileEntityModel(ModContent.DESK_RIGHTALT1_TILE_ENTITY, DeskRightAlt1Model::new, "textures/block/desk.png");
        registerTileEntityModel(ModContent.DESK_MIDDLE_TILE_ENTITY, DeskMiddleModel::new, "textures/block/desk.png");
        registerTileEntityModel(ModContent.DESK_CORNER_TILE_ENTITY, DeskCornerModel::new, "textures/block/desk.png");
        registerTileEntityModel(ModContent.DESK_CORNERALT1_TILE_ENTITY, DeskCornerAlt1Model::new, "textures/block/desk.png");
        registerTileEntityModel(ModContent.LAPTOP_TILE_ENTITY, LaptopModel::new, "textures/block/pc.png");
        registerTileEntityModel(ModContent.CAUTION_TILE_ENTITY, CautionSignModel::new, "textures/block/cautionsign.png");
        registerTileEntityModel(ModContent.SWAT_TRUCK_TILE_ENTITY, SwatTruckModel::new, "textures/block/swattruck.png");
        registerTileEntityModel(ModContent.SANDBAG_TILE_ENTITY, SandbagModel::new, "textures/block/sandbag.png");
        registerTileEntityModel(ModContent.SANDBAG_WALL_TILE_ENTITY, SandbagWallModel::new, "textures/block/sandbag.png");

        registerTileEntityModel(ModContent.GRAVESTONE_TILE_ENTITY, GravestoneModel::new, "textures/block/gravestone.png");
        registerTileEntityModel(ModContent.CROSS_GRAVESTONE_TILE_ENTITY, CrossGravestoneModel::new, "textures/block/crossgravestone.png");
        registerTileEntityModel(ModContent.CROSS_GRAVESTONE_2_TILE_ENTITY, CrossGravestone2Model::new, "textures/block/crossgravestone2.png");
        registerTileEntityModel(ModContent.CROSS_GRAVESTONE_3_TILE_ENTITY, CrossGravestone3Model::new, "textures/block/crossgravestone3.png");
        registerTileEntityModel(ModContent.GRAVESTONE_SKULL_TILE_ENTITY, GravestoneSkullModel::new, "textures/block/gravestoneskull.png");

        registerTileEntityModel(ModContent.AMMUNITION_BOX_TILE_ENTITY, AmmunitionBoxModel::new, "textures/block/ammobox.png");
        registerTileEntityModel(ModContent.WEAPON_CRATE_TILE_ENTITY, WeaponCrateRussianModel::new, "textures/block/militarycrate.png");
        registerTileEntityModel(ModContent.FRIDGE_OPEN_TILE_ENTITY, FridgeOpenModel::new, "textures/block/fridge.png");
        registerTileEntityModel(ModContent.FRIDGE_CLOSED_TILE_ENTITY, FridgeClosedModel::new, "textures/block/fridge.png");

        registerTileEntityModel(ModContent.ELECTRIC_BOX_CLOSED_TILE_ENTITY, ElectricBoxClosedModel::new, "textures/block/electricbox.png");
        registerTileEntityModel(ModContent.ELECTRIC_BOX_OPEN_TILE_ENTITY, ElectricBoxOpenModel::new, "textures/block/electricbox.png");

        registerTileEntityModel(ModContent.VENDING_MACHINE_TILE_ENTITY, VendingMachineModel::new, "textures/block/vendingmachine.png");
        registerTileEntityModel(ModContent.FILING_CABINET_OPENED_TILE_ENTITY, FilingCabinetOpenedModel::new, "textures/block/filingcabinet.png");
        registerTileEntityModel(ModContent.FILING_CABINET_CLOSED_TILE_ENTITY, FilingCabinetClosedModel::new, "textures/block/filingcabinet.png");


        registerTileEntityModel(ModContent.OPERATING_TABLE_TILE_ENTITY, OperatingTableModel::new, "textures/block/operatingtable.png");
        registerTileEntityModel(ModContent.OPERATING_TABLE_ALT_TILE_ENTITY, OperatingTableAltModel::new, "textures/block/operatingtable.png");


    }


    public static <T extends TileEntity> void registerTileEntityModel(
            RegistryObject<TileEntityType<T>> tileEntityType,
            Supplier<EntityModel<Entity>> modelSupplier,
            String textureInfo) {
        EntityModel<Entity> model = modelSupplier.get();
        Netherite.LOGGER.info("Registering tile entity renderer with texture: {}", textureInfo);

        TileEntityModelInfo<T> info = new TileEntityModelInfo<>(tileEntityType, model, textureInfo);
        TILE_ENTITY_MODEL_INFOS.add(info);

        if (ModList.get().isLoaded("flywheel")) {
            ((Runnable) () -> FlywheelCompact.loadInstance(tileEntityType, info)).run();
        }
    }
}
