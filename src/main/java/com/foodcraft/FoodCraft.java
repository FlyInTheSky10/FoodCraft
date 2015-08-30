package com.foodcraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.foodcraft.config.NERConfigHandler;
import com.foodcraft.config.NERLogManager;
import com.foodcraft.init.FoodcraftGuiBlocks;
import com.foodcraft.init.FoodcraftItems;
import com.foodcraft.network.NetworkMod;
import com.foodcraft.network.PacketDispatcher;
import com.foodcraft.network.Proxy;
import com.foodcraft.proxy.CommonProxy;
import com.foodcraft.util.FoodcraftSubscribeEvent;

@Mod(modid="foodcraft", name="FoodCraft", version="1.2.0")

public class FoodCraft implements NetworkMod {
	public static boolean NEIIsLoad = false;
	public static final CreativeTabs FcTabMachine = new CreativeTabs("Jiqi") {//机器&工具
		public Item getTabIconItem() {
			return Item.getItemFromBlock(FoodcraftGuiBlocks.Nmj);
		}
	};
	public static final CreativeTabs FcTabPlant = new CreativeTabs("Zhiwu") {//植物
		public Item getTabIconItem() {
			return FoodcraftItems.ItemLajiao;
		}
	};
	public static final CreativeTabs FcTabDrink = new CreativeTabs("Yingliao") {//饮料
		public Item getTabIconItem() {
			return FoodcraftItems.ItemPutaozhi;
		}
	};
	public static final CreativeTabs FcTabStaple = new CreativeTabs("Zhushi") {//主食
		public Item getTabIconItem() {
			return FoodcraftItems.ItemChaotudousifan;
		}
	};
	public static final CreativeTabs FcTabIngredient = new CreativeTabs("Shicai") {//食材
		public Item getTabIconItem() {
			return FoodcraftItems.ItemMianfen;
		}
	};
	public static final CreativeTabs FcTabSnack = new CreativeTabs("Xiaodian") {//零食
		public Item getTabIconItem() {
			return FoodcraftItems.ItemJianjiao;
		}
	};
	
	@SidedProxy(clientSide = "com.foodcraft.proxy.ClientProxy", serverSide = "com.foodcraft.proxy.CommonProxy")
	private static CommonProxy proxy;
		
		@Instance("foodcraft")
	    public static FoodCraft instance;

		@EventHandler
		public void preInit(FMLPreInitializationEvent event) {
			PacketDispatcher.initInstance("foodcraft", this);
			NERLogManager.log("Loading foodcraft, Version: 1.2.0");
			NEIIsLoad = Loader.isModLoaded("NotEnoughItems");
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

		@Override
		public Proxy getProxy() {
			return proxy;
		}

}