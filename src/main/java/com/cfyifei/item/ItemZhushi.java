package com.cfyifei.item;



import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemZhushi extends ItemFood{
public boolean e;

		public ItemZhushi(int amount, float saturation, boolean isWolfFood, String name) {
			super((int)saturation, saturation/3F, isWolfFood);
			this.setUnlocalizedName(name);

		}
		public ItemZhushi(int amount, float saturation, boolean isWolfFood, String name, boolean is) {
			super((int)saturation, saturation/3F, isWolfFood);
			this.setUnlocalizedName(name);
           e = is;
		}
	    public boolean hasEffect(ItemStack par1ItemStack)
	    {
	        return e;
	    }
	    protected void onFoodEaten(ItemStack is, World w, EntityPlayer ep)
	    {
	    	int o;
	    	if(!w.isRemote){
	    	o = w.rand.nextInt(7);
	    	
	    	switch(o){
	    	case 0:
	    		ep.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 600, 1));
	    		break;
	    	case 1:
	    		ep.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 600, 1));	
	    		break;
	    	case 2:
	    		ep.addPotionEffect(new PotionEffect(Potion.invisibility.id, 600, 1));
	    		break;
	    	case 3:
	    		ep.addPotionEffect(new PotionEffect(Potion.jump.id, 600, 1));	
	    		break;
	    	case 4:
	    		ep.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 600, 1));	
	    		break;
	    	case 5:
	    		ep.addPotionEffect(new PotionEffect(Potion.nightVision.id, 600, 1));	
	    		break;
	    	case 6:
	    		ep.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 600, 1));	
	    		break;
	    	}
	        super.onFoodEaten(is,w,ep);
	    	}
	    }
	}

