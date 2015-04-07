package com.cfyifei;

import com.cfyifei.item.ModItem;
import com.cfyifei.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;



@Mod(modid="FoodCraft", name="FoodCraft", version="1.1.0")

public class FoodCraft{
	public static final FcTab FcTab = new FcTab();

	@SidedProxy(clientSide = "com.cfyifei.proxy.ClientProxy",
		    serverSide = "com.cfyifei.proxy.CommonProxy")
		public static CommonProxy proxy;
		
		@Instance("FoodCraft")
	    public static FoodCraft instance;

		@EventHandler
		public void preInit(FMLPreInitializationEvent event) {
			proxy.preInit(event);
		}
		
		@EventHandler
		public void init(FMLInitializationEvent event) {
			proxy.init(event);
		}
		
		@EventHandler
		public void postInit(FMLPostInitializationEvent event) {
			proxy.postInit(event);
		}

}



