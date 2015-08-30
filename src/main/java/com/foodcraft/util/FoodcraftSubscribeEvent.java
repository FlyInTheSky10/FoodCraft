package com.foodcraft.util;

import com.foodcraft.gui.tileentities.TileEntityPan;
import com.foodcraft.gui.tileentities.TileEntityPot;
import com.foodcraft.init.FoodcraftItems;
import com.foodcraft.init.FoodcraftPlants;

import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class FoodcraftSubscribeEvent {

	@SubscribeEvent
    public void test1(LivingDeathEvent event) {
		if(event.entityLiving instanceof EntitySquid) {
	    	EntitySquid Squid = (EntitySquid)event.entityLiving;
	    	if (!Squid.worldObj.isRemote) {
	    		FoodcraftUtil.dropItemAsEntity(Squid.worldObj,Squid.posX,Squid.posY,Squid.posZ,new ItemStack(FoodcraftItems.ItemYouyurou,3));
	    	}
	    }
    }
	
	@SubscribeEvent
	public void onBreakEvent(BlockEvent.BreakEvent event) {
	  TileEntity te = event.world.getTileEntity(event.pos);
	  if(!event.world.isRemote){
	  if ((te != null) && ((te instanceof TileEntityPan))) {
		  TileEntityPan t = (TileEntityPan)te;
	    ItemStack stack = new ItemStack(event.state.getBlock());
	    setItemStackNBT(stack, "frequencyOfUse", t.frequencyOfUse);
		
	    if(!event.getPlayer().capabilities.isCreativeMode){
	    	event.world.setBlockToAir(event.pos);
	    	FoodcraftUtil.dropItemAsEntity(event.world, event.pos.getX(),event.pos.getY(),event.pos.getZ(), stack);
		}
	  }
	  if ((te != null) && ((te instanceof TileEntityPot))) {
		  TileEntityPot t = (TileEntityPot)te;
	    ItemStack stack = new ItemStack(event.state.getBlock());
	    setItemStackNBT(stack, "frequencyOfUse", t.frequencyOfUse);
		
	    if(!event.getPlayer().capabilities.isCreativeMode) {
	    	event.world.setBlockToAir(event.pos);
	    	FoodcraftUtil.dropItemAsEntity(event.world, event.pos.getX(),event.pos.getY(),event.pos.getZ(), stack);
		}
	  }
	  if(event.state.getBlock() == Blocks.leaves || event.state.getBlock() == Blocks.leaves2) {
		  int o = event.world.rand.nextInt(54);
		  Block b;
		  if(o >= 18 && o < 36){
			  switch(o){
			  case 18:b = FoodcraftPlants.BlockLishu;break;
			  case 19:b = FoodcraftPlants.BlockLizhishu;break;
			  case 20:b = FoodcraftPlants.BlockTaozishu;break;
			  case 21:b = FoodcraftPlants.BlockJuzishu;break;
			  case 22:b = FoodcraftPlants.BlockPipashu;break;
			  case 23:b = FoodcraftPlants.BlockMangguoshu;break;
			  case 24:b = FoodcraftPlants.BlockNingmengshu;break;
			  case 25:b = FoodcraftPlants.BlockYouzishu;break;
			  case 26:b = FoodcraftPlants.BlockShizishu;break;
			  case 27:b = FoodcraftPlants.BlockMuguashu;break;
			  case 28:b = FoodcraftPlants.BlockShanzhashu;break;
			  case 29:b = FoodcraftPlants.BlockLongyanshu;break;
			  case 30:b = FoodcraftPlants.BlockShiliushu;break;
			  case 31:b = FoodcraftPlants.BlockHongzaoshu;break;
			  case 32:b = FoodcraftPlants.BlockYezishu;break;
			  case 33:b = FoodcraftPlants.BlockYingtaoshu;break;
			  case 34:b = FoodcraftPlants.BlockXiangjiaoshu;break;
			  default: b = null; break;
			  }
			  if(b != null){
				  if(!event.getPlayer().capabilities.isCreativeMode){
					  int o2 = event.world.rand.nextInt(10);
					  if(o2 == 2){
				  FoodcraftUtil.dropItemAsEntity(event.world, event.pos.getX(),event.pos.getY(), event.pos.getZ(), new ItemStack(b));
					  }
				  }
			  }
		  }
	  }
	  }
	}
	
	public static void setItemStackNBT(ItemStack item, String str, int value) {
	  if (item.getTagCompound() == null) item.setTagCompound(new NBTTagCompound());
	  item.getTagCompound().setInteger(str, value);
	}
}
