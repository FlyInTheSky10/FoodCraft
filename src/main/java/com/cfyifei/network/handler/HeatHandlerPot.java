package com.cfyifei.network.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import com.cfyifei.gui.tileentities.TileEntityPot;
import com.cfyifei.network.AbstractServerMessageHandler;
import com.cfyifei.network.message.HeatMessage;
import com.cfyifei.network.message.HeatMessagePot;


public class HeatHandlerPot extends AbstractServerMessageHandler<HeatMessagePot> {

	@Override
	public IMessage handleServerMessage(EntityPlayer player, HeatMessagePot message, MessageContext ctx) {
		TileEntityPot tile2 = 
				 (TileEntityPot) ctx.getServerHandler().playerEntity.worldObj.getTileEntity( new BlockPos(
						 message.data.getInteger("x"), 
						 message.data.getInteger("y"), 
						 message.data.getInteger("z")));
		 tile2.currentItemBurnTime = 100 - (int) (100 * message.data.getFloat("f1"));
		return null;
	}

}
