package com.cfyifei.network;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public interface Proxy
{
	EntityPlayer getPlayer(MessageContext ctx);
}
