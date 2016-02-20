package com.foodcraft.network.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import com.foodcraft.gui.tileentities.TileEntityPan;
import com.foodcraft.network.AbstractServerMessageHandler;
import com.foodcraft.network.message.HeatMessage;

public class HeatHandler extends AbstractServerMessageHandler<HeatMessage> {

    @Override
    public IMessage handleServerMessage(EntityPlayer player, HeatMessage message, MessageContext ctx) {
        TileEntityPan tile2 =
            (TileEntityPan) ctx.getServerHandler().playerEntity.worldObj.getTileEntity(
                new BlockPos( message.data.getInteger("x"),
                              message.data.getInteger("y"),
                              message.data.getInteger("z")));
        tile2.currentItemBurnTime = 100 - (int) (100 * message.data.getFloat("f1"));
        return null;
    }

}
