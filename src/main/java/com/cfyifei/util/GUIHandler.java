package com.cfyifei.util;

import com.cfyifei.GuiIDs;
import com.cfyifei.gui.containers.ContainerCaiban;
import com.cfyifei.gui.containers.ContainerGuo;
import com.cfyifei.gui.containers.ContainerGyg;
import com.cfyifei.gui.containers.ContainerNmj;
import com.cfyifei.gui.containers.ContainerNt;
import com.cfyifei.gui.containers.ContainerPDG;
import com.cfyifei.gui.containers.ContainerTpj;
import com.cfyifei.gui.containers.ContainerYZJ;
import com.cfyifei.gui.containers.ContainerZl;
import com.cfyifei.gui.guis.GuiCaiban;
import com.cfyifei.gui.guis.GuiGuo;
import com.cfyifei.gui.guis.GuiGyg;
import com.cfyifei.gui.guis.GuiNmj;
import com.cfyifei.gui.guis.GuiNt;
import com.cfyifei.gui.guis.GuiPDG;
import com.cfyifei.gui.guis.GuiTpj;
import com.cfyifei.gui.guis.GuiYZJ;
import com.cfyifei.gui.guis.GuiZl;
import com.cfyifei.gui.tileentitys.TileEntityCaiban;
import com.cfyifei.gui.tileentitys.TileEntityGuo;
import com.cfyifei.gui.tileentitys.TileEntityGyg;
import com.cfyifei.gui.tileentitys.TileEntityNmj;
import com.cfyifei.gui.tileentitys.TileEntityNt;
import com.cfyifei.gui.tileentitys.TileEntityPDG;
import com.cfyifei.gui.tileentitys.TileEntityTpj;
import com.cfyifei.gui.tileentitys.TileEntityYZJ;
import com.cfyifei.gui.tileentitys.TileEntityZl;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GUIHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world,
	    int x, int y, int z) {
	switch (id) {
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
	    case GuiIDs.GUI_YZJ:
		return new ContainerYZJ(player.inventory, (TileEntityYZJ) world.getTileEntity(x, y, z));
	    case GuiIDs.GUI_Nt:
		return new ContainerNt(player.inventory, (TileEntityNt) world.getTileEntity(x, y, z));
	    case GuiIDs.GUI_Zl:
		return new ContainerZl(player.inventory, (TileEntityZl) world.getTileEntity(x, y, z));
	    case GuiIDs.GUI_Tpj:
		return new ContainerTpj(player.inventory, (TileEntityTpj) world.getTileEntity(x, y, z));
	    default:
		return null;
	}
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world,
	    int x, int y, int z) {
	switch (id) {
	    case GuiIDs.GUI_NMJ:
		return new GuiNmj(player.inventory, (TileEntityNmj) world.getTileEntity(x, y, z));
	    case GuiIDs.GUI_PDG:
		return new GuiPDG(player.inventory, (TileEntityPDG) world.getTileEntity(x, y, z));
	    case GuiIDs.GUI_Guo:
		return new GuiGuo(player.inventory, (TileEntityGuo) world.getTileEntity(x, y, z));
	    case GuiIDs.GUI_Gyg:
		return new GuiGyg(player.inventory, (TileEntityGyg) world.getTileEntity(x, y, z));
	    case GuiIDs.GUI_Caiban:
		return new GuiCaiban(player.inventory, (TileEntityCaiban) world.getTileEntity(x, y, z));
	    case GuiIDs.GUI_YZJ:
		return new GuiYZJ(player.inventory, (TileEntityYZJ) world.getTileEntity(x, y, z));
	    case GuiIDs.GUI_Nt:
		return new GuiNt(player.inventory, (TileEntityNt) world.getTileEntity(x, y, z));
	    case GuiIDs.GUI_Zl:
		return new GuiZl(player.inventory, (TileEntityZl) world.getTileEntity(x, y, z));
	    case GuiIDs.GUI_Tpj:
		return new GuiTpj(player.inventory, (TileEntityTpj) world.getTileEntity(x, y, z));
	    default:
		return null;
	}
    }
}
