package com.cfyifei.proxy;

import com.cfyifei.FoodCraft;
import com.cfyifei.GuiIDs;
import com.cfyifei.block.ModBlocks;
import com.cfyifei.gui.blocks.ModGui;
import com.cfyifei.gui.containers.*;
import com.cfyifei.gui.tileentitys.*;
import com.cfyifei.item.ModItem;
import com.cfyifei.plant.blocks.Plant;
import com.cfyifei.recipe.Recipe;
import com.cfyifei.util.GUIHandler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class CommonProxy{
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	public void init(FMLInitializationEvent event) {
		ModBlocks.init();
		ModGui.init();
		ModItem.init();
		Recipe.init();
		Plant.init();
		NetworkRegistry.INSTANCE.registerGuiHandler(FoodCraft.instance, new GUIHandler());
	}
	
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	public void registerBlockModels() {
		
	}
	
	public void registerItemModels() {
		
	}
	
	public void registerRenders() {
		
	}
	
	
}
