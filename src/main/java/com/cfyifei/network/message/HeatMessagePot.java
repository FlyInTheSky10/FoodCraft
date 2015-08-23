package com.cfyifei.network.message;

import com.cfyifei.network.AbstractNBTMessage;

import net.minecraft.nbt.NBTTagCompound;
import io.netty.buffer.ByteBuf;

public class HeatMessagePot extends AbstractNBTMessage {

	public HeatMessagePot() {}
	
	public HeatMessagePot(NBTTagCompound nbt) {
		super(nbt);
	}
}
