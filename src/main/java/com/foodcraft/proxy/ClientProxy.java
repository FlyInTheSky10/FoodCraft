package com.foodcraft.proxy;

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

import com.foodcraft.FoodCraft;
import com.foodcraft.GuiIDs;
import com.foodcraft.RegisterModel;
import com.foodcraft.gui.guis.*;
import com.foodcraft.gui.tileentities.*;
import com.foodcraft.init.FoodcraftGuiBlocks;
import com.foodcraft.network.Proxy;
import com.foodcraft.util.GUIHandler;



public class ClientProxy extends CommonProxy implements Proxy {
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