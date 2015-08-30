package com.foodcraft.util;

import com.foodcraft.GuiIDs;
import com.foodcraft.gui.containers.ContainerBeverageMaking;
import com.foodcraft.gui.containers.ContainerBrewBarrel;
import com.foodcraft.gui.containers.ContainerChoppingBoard;
import com.foodcraft.gui.containers.ContainerFrying;
import com.foodcraft.gui.containers.ContainerMill;
import com.foodcraft.gui.containers.ContainerPan;
import com.foodcraft.gui.containers.ContainerPot;
import com.foodcraft.gui.containers.ContainerPressureCooker;
import com.foodcraft.gui.containers.ContainerStove;
import com.foodcraft.gui.guis.GuiBeverageMaking;
import com.foodcraft.gui.guis.GuiBrewBarrel;
import com.foodcraft.gui.guis.GuiChoppingBoard;
import com.foodcraft.gui.guis.GuiFrying;
import com.foodcraft.gui.guis.GuiMill;
import com.foodcraft.gui.guis.GuiPan;
import com.foodcraft.gui.guis.GuiPerssureCooker;
import com.foodcraft.gui.guis.GuiPot;
import com.foodcraft.gui.guis.GuiStove;
import com.foodcraft.gui.tileentities.TileEntityBeverageMaking;
import com.foodcraft.gui.tileentities.TileEntityBrewBarrel;
import com.foodcraft.gui.tileentities.TileEntityChoppingBoard;
import com.foodcraft.gui.tileentities.TileEntityFrying;
import com.foodcraft.gui.tileentities.TileEntityMill;
import com.foodcraft.gui.tileentities.TileEntityPan;
import com.foodcraft.gui.tileentities.TileEntityPot;
import com.foodcraft.gui.tileentities.TileEntityPressureCooker;
import com.foodcraft.gui.tileentities.TileEntityStove;

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
