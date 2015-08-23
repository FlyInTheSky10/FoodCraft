package com.cfyifei.network;

import net.minecraft.entity.player.EntityPlayer;

public class GuiHandleUtil
{
	public static void openGui(EntityPlayer player, int id)
	{
		player.openGui(PacketDispatcher.instance.mod, id, null, 0, 0, 0);
	}
}
