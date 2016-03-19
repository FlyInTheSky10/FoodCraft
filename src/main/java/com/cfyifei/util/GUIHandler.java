package com.cfyifei.util;

import com.cfyifei.GuiID;
import com.cfyifei.gui.containers.*;
import com.cfyifei.gui.guis.*;
import com.cfyifei.gui.tileentitys.*;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world,
                                      int x, int y, int z) {
        switch (id) {
            case GuiID.GUI_NMJ:
                return new ContainerNmj(player.inventory, (TileEntityNmj) world.getTileEntity(x, y, z));
            case GuiID.GUI_PDG:
                return new ContainerPDG(player.inventory, (TileEntityPDG) world.getTileEntity(x, y, z));
            case GuiID.GUI_Guo:
                return new ContainerGuo(player.inventory, (TileEntityGuo) world.getTileEntity(x, y, z));
            case GuiID.GUI_Gyg:
                return new ContainerGyg(player.inventory, (TileEntityGyg) world.getTileEntity(x, y, z));
            case GuiID.GUI_Caiban:
                return new ContainerCaiban(player.inventory, (TileEntityCaiban) world.getTileEntity(x, y, z));
            case GuiID.GUI_YZJ:
                return new ContainerYZJ(player.inventory, (TileEntityYZJ) world.getTileEntity(x, y, z));
            case GuiID.GUI_Nt:
                return new ContainerNt(player.inventory, (TileEntityNt) world.getTileEntity(x, y, z));
            case GuiID.GUI_Zl:
                return new ContainerZl(player.inventory, (TileEntityZl) world.getTileEntity(x, y, z));
            case GuiID.GUI_Tpj:
                return new ContainerTpj(player.inventory, (TileEntityTpj) world.getTileEntity(x, y, z));
            default:
                return null;
        }
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world,
                                      int x, int y, int z) {
        switch (id) {
            case GuiID.GUI_NMJ:
                return new GuiNmj(player.inventory, (TileEntityNmj) world.getTileEntity(x, y, z));
            case GuiID.GUI_PDG:
                return new GuiPDG(player.inventory, (TileEntityPDG) world.getTileEntity(x, y, z));
            case GuiID.GUI_Guo:
                return new GuiGuo(player.inventory, (TileEntityGuo) world.getTileEntity(x, y, z));
            case GuiID.GUI_Gyg:
                return new GuiGyg(player.inventory, (TileEntityGyg) world.getTileEntity(x, y, z));
            case GuiID.GUI_Caiban:
                return new GuiCaiban(player.inventory, (TileEntityCaiban) world.getTileEntity(x, y, z));
            case GuiID.GUI_YZJ:
                return new GuiYZJ(player.inventory, (TileEntityYZJ) world.getTileEntity(x, y, z));
            case GuiID.GUI_Nt:
                return new GuiNt(player.inventory, (TileEntityNt) world.getTileEntity(x, y, z));
            case GuiID.GUI_Zl:
                return new GuiZl(player.inventory, (TileEntityZl) world.getTileEntity(x, y, z));
            case GuiID.GUI_Tpj:
                return new GuiTpj(player.inventory, (TileEntityTpj) world.getTileEntity(x, y, z));
            default:
                return null;
        }
    }
}
