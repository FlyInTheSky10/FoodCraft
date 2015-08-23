package com.cfyifei.proxy;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import com.cfyifei.FoodCraft;
import com.cfyifei.GuiIDs;
import com.cfyifei.RegisterModel;
import com.cfyifei.gui.blocks.FoodcraftGuiBlocks;
import com.cfyifei.gui.guis.*;
import com.cfyifei.modelrenderer.*;
import com.cfyifei.nei.NEIAPI;
import com.cfyifei.network.Proxy;
import com.cfyifei.util.GUIHandler;
import com.cfyifei.gui.tileentities.*;



public class ClientProxy extends CommonProxy implements Proxy {
	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
        this.registerRenderThings();
        this.rendererItem();

		RegisterModel.init();
		if(FoodCraft.NEIIsLoad){
	        new NEIAPI().loadConfig();
			}
	}
	
	 public static void registerRenderThings() {
		 ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPot.class, new GuoRenderer());
		 ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPressureCooker.class, new GygRenderer());
		 ClientRegistry.bindTileEntitySpecialRenderer(TileEntityChoppingBoard.class, new CaibanRenderer());
	 }
	 
	 public void rendererItem() {
		 MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(FoodcraftGuiBlocks.Guo), new GuoItemRenderer(new TileEntityPot(), 0.0D, -0.1D, 0.0D));
		 MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(FoodcraftGuiBlocks.Gyg), new GygItemRenderer(new TileEntityPressureCooker(), 0.0D, -0.1D, 0.0D));
		 MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(FoodcraftGuiBlocks.Caiban), new CaibanItemRenderer(new TileEntityChoppingBoard(), 0.0D, -0.1D, 0.0D));
	}

	@Override
	public EntityPlayer getPlayer(MessageContext ctx) {
		return Minecraft.getMinecraft().thePlayer;
	}
}