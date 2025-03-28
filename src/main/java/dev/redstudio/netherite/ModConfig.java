package dev.redstudio.netherite;


import net.minecraftforge.common.ForgeConfigSpec;

public class ModConfig {

    public static final ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec COMMON_CONFIG;

    public static final ForgeConfigSpec.BooleanValue SITTING_ENABLED;

    static {
        COMMON_BUILDER.comment("General settings")
                .push("general");

        SITTING_ENABLED = COMMON_BUILDER
                .comment("Enable or disable sitting")
                .define("enabled", false);

        COMMON_BUILDER.pop();

        COMMON_CONFIG = COMMON_BUILDER.build();
    }
}
