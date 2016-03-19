package com.cfyifei.config;


import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.config.Configuration;

public class NERConfigHandler {
    public static boolean booleanwrench;

    private static Configuration NERConfig;

    public static void initConfig(FMLPreInitializationEvent event) {
        NERConfig = new Configuration(event.getSuggestedConfigurationFile());
    }

    public static void getConfig() {
        NERConfigHandler.NERConfig.load();//��ʼ��ȡ

        NERConfigHandler.booleanwrench = NERConfigHandler.NERConfig.get("ItemSetting",
                "wrench", true, "If the value is true, then the wrench will enable.\n" +
                        "If the value is false, then the iron pickaxe will replace the wrench.\n"
                        + "Default: true").getBoolean(true);

        NERConfigHandler.NERConfig.save();//������ȡ
    }
}
