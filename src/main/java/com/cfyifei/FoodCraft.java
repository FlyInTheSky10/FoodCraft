package com.cfyifei;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

import com.cfyifei.config.NERConfigHandler;
import com.cfyifei.config.NERLogManager;
import com.cfyifei.gui.blocks.ModGui;
import com.cfyifei.item.ModItem;
import com.cfyifei.proxy.CommonProxy;
import com.cfyifei.util.FoodcraftSubscribeEvent;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "FoodCraft", name = "FoodCraft", version = "1.2.0")

public class FoodCraft {

    public static boolean IC2IsLoad = false, MTIsLoad = false;
    public static final CreativeTabs FcTabJiqi = new CreativeTabs("Jiqi") {
	public Item getTabIconItem() {
	    return Item.getItemFromBlock(ModGui.Nmj);
	}
    };
    public static final CreativeTabs FcTabZhiwu = new CreativeTabs("Zhiwu") {
	public Item getTabIconItem() {
	    return ModItem.ItemLajiao;
	}
    };
    public static final CreativeTabs FcTabYingliao = new CreativeTabs("Yingliao") {
	public Item getTabIconItem() {
	    return ModItem.ItemPutaozhi;
	}
    };
    public static final CreativeTabs FcTabZhushi = new CreativeTabs("Zhushi") {
	public Item getTabIconItem() {
	    return ModItem.ItemChaotudousifan;
	}
    };
    public static final CreativeTabs FcTabShicai = new CreativeTabs("Shicai") {
	public Item getTabIconItem() {
	    return ModItem.ItemMianfen;
	}
    };
    public static final CreativeTabs FcTabXiaodian = new CreativeTabs("Xiaodian") {
	public Item getTabIconItem() {
	    return ModItem.ItemJianjiao;
	}
    };

    @SidedProxy(clientSide = "com.cfyifei.proxy.ClientProxy",
	    serverSide = "com.cfyifei.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Instance("FoodCraft")
    public static FoodCraft instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
	NERLogManager.log("Loading foodcraft, Version: 1.2.0");
	IC2IsLoad = Loader.isModLoaded("IC2");
	MTIsLoad = Loader.isModLoaded("MineTweaker3");
	NERConfigHandler.initConfig(event);
	NERConfigHandler.getConfig();
	proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
	proxy.init(event);
	MinecraftForge.EVENT_BUS.register(new FoodcraftSubscribeEvent());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
	proxy.postInit(event);
    }

}
