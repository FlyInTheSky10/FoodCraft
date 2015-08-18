package com.cfyifei.util;

import com.cfyifei.gui.tileentitys.TileEntityGuo;
import com.cfyifei.gui.tileentitys.TileEntityPDG;
import com.cfyifei.item.ModItem;

import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class FoodcraftSubscribeEvent {

@SubscribeEvent
    public void test1(LivingDeathEvent event)
    {
    if(event.entityLiving instanceof EntitySquid)
    {
    	EntitySquid Squid = (EntitySquid)event.entityLiving;
    	if (!Squid.worldObj.isRemote){
    		FoodcraftUtil.dropItemAsEntity(Squid.worldObj,Squid.posX,Squid.posY,Squid.posZ,new ItemStack(ModItem.ItemYouyurou,3));
    	}
    }
    }
@SubscribeEvent
public void onBreakEvent(BlockEvent.BreakEvent event)
{
  TileEntity te = event.world.getTileEntity(event.pos);
  if(!event.world.isRemote){
  if ((te != null) && ((te instanceof TileEntityPDG)))
  {
	  TileEntityPDG t = (TileEntityPDG)te;
    ItemStack stack = new ItemStack(event.state.getBlock());
    setItemStackNBT(stack, "frequencyOfUse", t.frequencyOfUse);
	
    if(!event.getPlayer().capabilities.isCreativeMode){
    	event.world.setBlockToAir(event.pos);
    	FoodcraftUtil.dropItemAsEntity(event.world, event.pos.getX(),event.pos.getY(),event.pos.getZ(), stack);
	}
  }
  if ((te != null) && ((te instanceof TileEntityGuo)))
  {
	  TileEntityGuo t = (TileEntityGuo)te;
    ItemStack stack = new ItemStack(event.state.getBlock());
    setItemStackNBT(stack, "frequencyOfUse", t.frequencyOfUse);
	
    if(!event.getPlayer().capabilities.isCreativeMode){
    	event.world.setBlockToAir(event.pos);
    	FoodcraftUtil.dropItemAsEntity(event.world, event.pos.getX(),event.pos.getY(),event.pos.getZ(), stack);
	}
  }
  }
}

public static void setItemStackNBT(ItemStack item, String str, int value)
{
  if (item.getTagCompound() == null) item.setTagCompound(new NBTTagCompound());
  item.getTagCompound().setInteger(str, value);
}

}
