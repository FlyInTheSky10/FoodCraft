package com.foodcraft.gui.recipes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.foodcraft.init.FoodcraftItems;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;



public class RecipeMill {
	
	private static final RecipeMill smeltingBase = new RecipeMill();
    private Map smeltingList = new HashMap();
    private Map experienceList = new HashMap();
    
    public static RecipeMill smelting() {
        return smeltingBase;
    }
    
    private RecipeMill() {
        this.itemregister(FoodcraftItems.ItemRice, new ItemStack(FoodcraftItems.ItemMilledRice), 0.7F);
        this.itemregister(Items.wheat, new ItemStack(FoodcraftItems.ItemFlour , 2), 0.5F);
        this.itemregister(FoodcraftItems.ItemPeanut, new ItemStack(FoodcraftItems.ItemPeanutOil), 0.5F);
        this.itemregister(FoodcraftItems.ItemBeans, new ItemStack(FoodcraftItems.ItemSoybeanMilk), 0.5F);
        this.itemregister(Items.potato, new ItemStack(FoodcraftItems.ItemStarches,8), 0.5F);
        this.register(new ItemStack(Items.dye,1,3), new ItemStack(FoodcraftItems.ItemChocolateDust), 0.5F);
        this.itemregister(FoodcraftItems.ItemStickyRice,  new ItemStack(FoodcraftItems.ItemStickyRiceFlour,3), 0.5F);
        this.itemregister(FoodcraftItems.ItemHongdou,  new ItemStack(FoodcraftItems.ItemDousha,2), 0.5F);
    }
   
	     
	
	public void blockregister(Block Block, ItemStack ItemStack, float xp) {
        this.itemregister(Item.getItemFromBlock(Block), ItemStack, xp);
    }
	  
	public void itemregister(Item Item, ItemStack ItemStack, float xp) {
	        this.register(new ItemStack(Item, 1, 32767), ItemStack, xp);
	}

	public void register(ItemStack ItemStack, ItemStack ItemStack2, float xp) {
	        this.smeltingList.put(ItemStack, ItemStack2);
	        this.experienceList.put(ItemStack2, Float.valueOf(xp));
	}

 
 	private boolean func_151397_a(ItemStack p_151397_1_, ItemStack p_151397_2_) {
     return p_151397_2_.getItem() == p_151397_1_.getItem() && (p_151397_2_.getItemDamage() == 32767 || p_151397_2_.getItemDamage() == p_151397_1_.getItemDamage());
 	}

	public ItemStack getSmeltingResult(ItemStack itemStack) {
	    Iterator iterator = this.smeltingList.entrySet().iterator();
	    Entry entry;
	
	    do {
	        if (!iterator.hasNext()) {
	            return null;
	        }
	        entry = (Entry)iterator.next();
	    }
	    while (!this.func_151397_a(itemStack, (ItemStack)entry.getKey()));
	    return (ItemStack)entry.getValue();
	}

	public Map<ItemStack, ItemStack> getSmeltingList() {
		return this.smeltingList;
	}
}
