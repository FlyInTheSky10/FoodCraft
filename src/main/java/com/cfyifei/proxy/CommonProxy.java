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
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.relauncher.Side;


public class CommonProxy {
	public static Side side;
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
