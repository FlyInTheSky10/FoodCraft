package com.foodcraft.item;

import java.util.List;






import com.foodcraft.FoodCraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemCookie extends FcFood {
	
	private String[] names = new String[]{"ItemPutaoBG","ItemJinputaoBG","ItemLiBG","ItemTaoziBG","ItemJuziBG","ItemNingmengBG","ItemCaomeiBG","ItemYeziBG"};
	
	public ItemCookie(int amount, float saturation, String name) {
		super((int)saturation, saturation, name);
		 this.setHasSubtypes(true);
		 this.setUnlocalizedName("ItemBinggan");
		 this.setCreativeTab(FoodCraft.FcTabSnack);	
	}

	    @SideOnly(Side.CLIENT)
	    public boolean hasEffect(ItemStack stack) {
	        return stack.getItemDamage() == 1;
	    }
	    
	    @Override
	    protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
	    	
	    	if(par1ItemStack.getItemDamage() == 1){
	                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 1200, 1));
	                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1200, 1));
	                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 1200, 1));
	    	}
	       
	    }
	    
	    @SideOnly(Side.CLIENT)
	    public void getSubItems(Item item, CreativeTabs tabs, List list) {
	    	list.add(new ItemStack(item, 1, 0));
	    	list.add(new ItemStack(item, 1, 1));
	    	list.add(new ItemStack(item, 1, 2));
	    	list.add(new ItemStack(item, 1, 3));
	    	list.add(new ItemStack(item, 1, 4));
	    	list.add(new ItemStack(item, 1, 5));
	    	list.add(new ItemStack(item, 1, 6));
	    	list.add(new ItemStack(item, 1, 7));
	    }	 

	    public String getUnlocalizedName(ItemStack stack) {
	    	 return names[stack.getItemDamage()];
	    }
}
