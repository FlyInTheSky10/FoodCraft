package com.cfyifei.util;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;

public class FcSubscribeEvent {

@SubscribeEvent

public void test1(LivingDeathEvent event)
{
    if(event.entityLiving instanceof EntitySheep)
    {
    	EntitySheep Sheep = (EntitySheep)event.entityLiving;
    	if (!Sheep.worldObj.isRemote){
    		if(Sheep.isBurning()){
    			FcUtil.dropItemAsEntity(Sheep.worldObj,Sheep.posX,Sheep.posY,Sheep.posZ,new ItemStack(Items.sugar));
    		}
    		else{
    			FcUtil.dropItemAsEntity(Sheep.worldObj,Sheep.posX,Sheep.posY,Sheep.posZ,new ItemStack(Items.carrot));
    		}
    	
    	}
    }
    if(event.entityLiving instanceof EntitySquid)
    {
    	EntitySquid Squid = (EntitySquid)event.entityLiving;
    	if (!Squid.worldObj.isRemote){
    		FcUtil.dropItemAsEntity(Squid.worldObj,Squid.posX,Squid.posY,Squid.posZ,new ItemStack(Items.carrot));
    	}
    }
}
}
