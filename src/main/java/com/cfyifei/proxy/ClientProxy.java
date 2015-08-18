package com.cfyifei.proxy;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

import com.cfyifei.FoodCraft;
import com.cfyifei.GuiIDs;
import com.cfyifei.RegisterItemmodel;
import com.cfyifei.gui.blocks.ModGui;
import com.cfyifei.gui.guis.*;
import com.cfyifei.modelrenderer.*;
import com.cfyifei.nei.NEIAPI;
import com.cfyifei.util.GUIHandler;
import com.cfyifei.gui.tileentitys.*;



public class ClientProxy extends CommonProxy {
	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		
		this.registerBlockModels();
		this.registerItemModels();
		this.registerRenders();
        this.registerRenderThings();
        this.rendererItem();

		RegisterItemmodel.init();
		if(FoodCraft.NEIIsLoad){
	        new NEIAPI().loadConfig();
			}
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

	

}