package com.cfyifei.network.message;

import com.cfyifei.network.AbstractNBTMessage;

import net.minecraft.nbt.NBTTagCompound;
import io.netty.buffer.ByteBuf;

public class HeatMessage extends AbstractNBTMessage {

	public HeatMessage() {}
	
	public HeatMessage(NBTTagCompound nbt) {
		super(nbt);
	}
}
