package com.cfyifei.proxy;

import com.cfyifei.GuiIDs;
import com.cfyifei.block.ModBlocks;
import com.cfyifei.gui.blocks.ModGui;
import com.cfyifei.gui.containers.*;
import com.cfyifei.gui.tileentitys.*;
import com.cfyifei.item.ModItem;
import com.cfyifei.recipe.Recipe;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;

public class CommonProxy implements IGuiHandler {
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	public void init(FMLInitializationEvent event) {
		ModBlocks.init();
		ModGui.init();
		ModItem.init();
		Recipe.init();
	}
	
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	public void registerBlockModels() {
		
	}
	
	public void registerItemModels() {
		
	}
	
	public void registerRenders() {
		
	}
	
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world,
		int x, int y, int z) {
	switch(id) {
		    case GuiIDs.GUI_NMJ:
			    return new ContainerNmj(player.inventory, (TileEntityNmj) world.getTileEntity(x, y, z));
		    case GuiIDs.GUI_PDG:
		  	    return new ContainerPDG(player.inventory, (TileEntityPDG) world.getTileEntity(x, y, z));
		    case GuiIDs.GUI_Guo:
		  	    return new ContainerGuo(player.inventory, (TileEntityGuo) world.getTileEntity(x, y, z));
		    case GuiIDs.GUI_Gyg:
		  	    return new ContainerGyg(player.inventory, (TileEntityGyg) world.getTileEntity(x, y, z));
		    case GuiIDs.GUI_Caiban:
		  	    return new ContainerCaiban(player.inventory, (TileEntityCaiban) world.getTileEntity(x, y, z));
	        default:
			    return null;
		}
}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
		int x, int y, int z) {
		return null; //NO
	}
}
