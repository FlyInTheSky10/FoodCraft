package com.cfyifei.proxy;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;

import com.cfyifei.FoodCraft;
import com.cfyifei.GuiIDs;
import com.cfyifei.gui.blocks.ModGui;
import com.cfyifei.gui.guis.*;
import com.cfyifei.modelrenderer.*;
import com.cfyifei.gui.tileentitys.*;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

public class ClientProxy extends CommonProxy {
	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		
		this.registerBlockModels();
		this.registerItemModels();
		this.registerRenders();
        this.registerRenderThings();
        this.rendererItem();
		
		NetworkRegistry.INSTANCE.registerGuiHandler(FoodCraft.instance, this);
	}
	 public static void registerRenderThings() {
    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPDG.class, new PDGRenderer());
    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGuo.class, new GuoRenderer());
    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGyg.class, new GygRenderer());
    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCaiban.class, new CaibanRenderer());
	 }
	    public void rendererItem() {
	        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModGui.PDG), new PDGItemRenderer(new TileEntityPDG(), 0.0D, -0.1D, 0.0D));
	        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModGui.Guo), new GuoItemRenderer(new TileEntityGuo(), 0.0D, -0.1D, 0.0D));
	        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModGui.Gyg), new GygItemRenderer(new TileEntityGyg(), 0.0D, -0.1D, 0.0D));
	        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModGui.Caiban), new CaibanItemRenderer(new TileEntityCaiban(), 0.0D, -0.1D, 0.0D));
	        
	    }

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world,
		int x, int y, int z) {
		switch(id) {
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
	    	default:
			    return null;
		}
	}

}