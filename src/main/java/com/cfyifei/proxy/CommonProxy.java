package com.cfyifei.proxy;

import com.cfyifei.FoodCraft;
import com.cfyifei.GuiIDs;
import com.cfyifei.block.FoodcraftBlocks;
import com.cfyifei.gui.blocks.FoodcraftGuiBlocks;
import com.cfyifei.gui.containers.*;
import com.cfyifei.gui.tileentities.*;
import com.cfyifei.item.FoodcraftItems;
import com.cfyifei.network.PacketDispatcher;
import com.cfyifei.network.Proxy;
import com.cfyifei.network.handler.HeatHandler;
import com.cfyifei.network.handler.HeatHandlerPot;
import com.cfyifei.network.message.HeatMessage;
import com.cfyifei.network.message.HeatMessagePot;
import com.cfyifei.plant.blocks.FoodcraftPlants;
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
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;


public class CommonProxy implements Proxy {

	public void preInit(FMLPreInitializationEvent event) {}
	
	public void init(FMLInitializationEvent event) {
		FoodcraftBlocks.init();
		FoodcraftGuiBlocks.init();
		FoodcraftPlants.init();
		FoodcraftItems.init();
		Recipe.init();
		regesterTileEntity();
		registerPacket();
		NetworkRegistry.INSTANCE.registerGuiHandler(FoodCraft.instance, new GUIHandler());
	}
	public void postInit(FMLPostInitializationEvent event) {}
	
	public void regesterTileEntity(){
		 GameRegistry.registerTileEntity(TileEntityMill.class, "TileEntityNmj");
		 GameRegistry.registerTileEntity(TileEntityPan.class, "TileEntityPDG");
		 GameRegistry.registerTileEntity(TileEntityPot.class, "TileEntityGuo");
		 GameRegistry.registerTileEntity(TileEntityPressureCooker.class, "TileEntityGyg");
		 GameRegistry.registerTileEntity(TileEntityChoppingBoard.class, "TileEntityCaiban");
		 GameRegistry.registerTileEntity(TileEntityFrying.class, "TileEntityYZJ");
		 GameRegistry.registerTileEntity(TileEntityBrewBarrel.class, "TileEntityNt");
		 GameRegistry.registerTileEntity(TileEntityStove.class, "TileEntityZl");
		 GameRegistry.registerTileEntity(TileEntityBeverageMaking.class, "TileEntityTpj");
	}

	public void registerPacket() {
		PacketDispatcher.instance.registerMessage(HeatHandler.class, HeatMessage.class);
		PacketDispatcher.instance.registerMessage(HeatHandlerPot.class, HeatMessagePot.class);
	}

	@Override
	public EntityPlayer getPlayer(MessageContext ctx) {
		return ctx.getServerHandler().playerEntity;
	}
}
