package com.foodcraft.network;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public abstract class AbstractServerMessageHandler<T extends IMessage> extends AbstractMessageHandler<T>
{
	@Override
	public final IMessage handleClientMessage(EntityPlayer player, T message, MessageContext ctx)
	{
		return null;
	}
}
