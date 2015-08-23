package com.cfyifei.util;

import com.cfyifei.GuiIDs;
import com.cfyifei.gui.containers.ContainerChoppingBoard;
import com.cfyifei.gui.containers.ContainerPot;
import com.cfyifei.gui.containers.ContainerPressureCooker;
import com.cfyifei.gui.containers.ContainerMill;
import com.cfyifei.gui.containers.ContainerBrewBarrel;
import com.cfyifei.gui.containers.ContainerPan;
import com.cfyifei.gui.containers.ContainerBeverageMaking;
import com.cfyifei.gui.containers.ContainerFrying;
import com.cfyifei.gui.containers.ContainerStove;
import com.cfyifei.gui.guis.GuiChoppingBoard;
import com.cfyifei.gui.guis.GuiPot;
import com.cfyifei.gui.guis.GuiPerssureCooker;
import com.cfyifei.gui.guis.GuiMill;
import com.cfyifei.gui.guis.GuiBrewBarrel;
import com.cfyifei.gui.guis.GuiPan;
import com.cfyifei.gui.guis.GuiBeverageMaking;
import com.cfyifei.gui.guis.GuiFrying;
import com.cfyifei.gui.guis.GuiStove;
import com.cfyifei.gui.tileentities.TileEntityBeverageMaking;
import com.cfyifei.gui.tileentities.TileEntityBrewBarrel;
import com.cfyifei.gui.tileentities.TileEntityChoppingBoard;
import com.cfyifei.gui.tileentities.TileEntityFrying;
import com.cfyifei.gui.tileentities.TileEntityMill;
import com.cfyifei.gui.tileentities.TileEntityPan;
import com.cfyifei.gui.tileentities.TileEntityPot;
import com.cfyifei.gui.tileentities.TileEntityPressureCooker;
import com.cfyifei.gui.tileentities.TileEntityStove;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GUIHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world,
		int x, int y, int z) {
		BlockPos bp = new BlockPos(x,y,z);
		switch(id) {
		    case GuiIDs.GUI_NMJ:
			    return new ContainerMill(player.inventory, (TileEntityMill) world.getTileEntity(bp));
		    case GuiIDs.GUI_PDG:
		  	    return new ContainerPan(player.inventory, (TileEntityPan) world.getTileEntity(bp));
		    case GuiIDs.GUI_Guo:
		  	    return new ContainerPot(player.inventory, (TileEntityPot) world.getTileEntity(bp));
		    case GuiIDs.GUI_Gyg:
		  	    return new ContainerPressureCooker(player.inventory, (TileEntityPressureCooker) world.getTileEntity(bp));
		    case GuiIDs.GUI_Caiban:
		  	    return new ContainerChoppingBoard(player.inventory, (TileEntityChoppingBoard) world.getTileEntity(bp));
		    case GuiIDs.GUI_YZJ:
		    	return new ContainerFrying(player.inventory, (TileEntityFrying) world.getTileEntity(bp));	
		    case GuiIDs.GUI_Nt:
		    	return new ContainerBrewBarrel(player.inventory, (TileEntityBrewBarrel) world.getTileEntity(bp));	
		    case GuiIDs.GUI_Zl:
		    	return new ContainerStove(player.inventory, (TileEntityStove) world.getTileEntity(bp));	
		    case GuiIDs.GUI_Tpj:
		    	return new ContainerBeverageMaking(player.inventory, (TileEntityBeverageMaking) world.getTileEntity(bp));	
	        default:
			    return null;
		}
}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world,
		int x, int y, int z) {
		BlockPos bp = new BlockPos(x,y,z);
		switch(id) {
		    case GuiIDs.GUI_NMJ:
		    	return new GuiMill(player.inventory, (TileEntityMill) world.getTileEntity(bp));
		    case GuiIDs.GUI_PDG:
			    return new GuiPan(player.inventory, (TileEntityPan) world.getTileEntity(bp));
		    case GuiIDs.GUI_Guo:
			    return new GuiPot(player.inventory, (TileEntityPot) world.getTileEntity(bp));
		    case GuiIDs.GUI_Gyg:
			    return new GuiPerssureCooker(player.inventory, (TileEntityPressureCooker) world.getTileEntity(bp));
		    case GuiIDs.GUI_Caiban:
			    return new GuiChoppingBoard(player.inventory, (TileEntityChoppingBoard) world.getTileEntity(bp)); 
		    case GuiIDs.GUI_YZJ:
			    return new GuiFrying(player.inventory, (TileEntityFrying) world.getTileEntity(bp));   
		    case GuiIDs.GUI_Nt:
			    return new GuiBrewBarrel(player.inventory, (TileEntityBrewBarrel) world.getTileEntity(bp));   
		    case GuiIDs.GUI_Zl:
			    return new GuiStove(player.inventory, (TileEntityStove) world.getTileEntity(bp));   
		    case GuiIDs.GUI_Tpj:
			    return new GuiBeverageMaking(player.inventory, (TileEntityBeverageMaking) world.getTileEntity(bp));   
	    	default:
			    return null;
		}
	}
}
