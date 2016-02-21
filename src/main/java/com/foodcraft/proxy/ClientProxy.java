package com.foodcraft.proxy;

import com.foodcraft.RegisterModel;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;


public class ClientProxy extends CommonProxy {
    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        RegisterModel.init();
    }

    @Override
    public EntityPlayer getPlayer(MessageContext ctx) {
        return Minecraft.getMinecraft().thePlayer;
    }
}