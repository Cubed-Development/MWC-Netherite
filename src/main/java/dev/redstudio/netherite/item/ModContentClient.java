package dev.redstudio.netherite.item;

import dev.redstudio.netherite.Netherite;
import dev.redstudio.netherite.item.barrier.BarrierModel;
import dev.redstudio.netherite.item.caution_sign.CautionSignModel;
import dev.redstudio.netherite.item.chair.homechair.HomeChairModel;
import dev.redstudio.netherite.item.chair.officechair1.OfficeChair1Model;
import dev.redstudio.netherite.item.chair.officechair2.OfficeChair2Model;
import dev.redstudio.netherite.item.desk.corner.DeskCornerModel;
import dev.redstudio.netherite.item.desk.corneralt1.DeskCornerAlt1Model;
import dev.redstudio.netherite.item.desk.left.DeskLeftModel;
import dev.redstudio.netherite.item.desk.leftalt1.DeskLeftAlt1Model;
import dev.redstudio.netherite.item.desk.middle.DeskMiddleModel;
import dev.redstudio.netherite.item.desk.right.DeskRightModel;
import dev.redstudio.netherite.item.desk.rightalt1.DeskRightAlt1Model;
import dev.redstudio.netherite.item.laptop.LaptopModel;
import dev.redstudio.netherite.item.pc.PCModel;
import dev.redstudio.netherite.item.swat_truck.SwatTruckModel;
import dev.redstudio.netherite.item.tv.TVModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
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
        registerTileEntityModel(ModContent.PC_TILE_ENTITY, PCModel::new, "textures/block/pc.png");
        registerTileEntityModel(ModContent.BARRIER_TILE_ENTITY, BarrierModel::new, "textures/block/barrier.png");
        registerTileEntityModel(ModContent.HOME_CHAIR_TILE_ENTITY, HomeChairModel::new, "textures/block/homechair.png");
        registerTileEntityModel(ModContent.OFFICE_CHAIR_1_TILE_ENTITY, OfficeChair1Model::new, "textures/block/officechair.png");
        registerTileEntityModel(ModContent.OFFICE_CHAIR_2_TILE_ENTITY, OfficeChair2Model::new, "textures/block/officechair.png");
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
    }


    public static <T extends TileEntity> void registerTileEntityModel(
            RegistryObject<TileEntityType<T>> tileEntityType,
            Supplier<EntityModel<Entity>> modelSupplier,
            String textureInfo) {
        // Register tile entity model with the supplied model and texture information
        EntityModel<Entity> model = modelSupplier.get();
        Netherite.LOGGER.info("Registering tile entity renderer with texture: " + textureInfo);
        TILE_ENTITY_MODEL_INFOS.add(new TileEntityModelInfo<>(tileEntityType, model, textureInfo));
    }



}
