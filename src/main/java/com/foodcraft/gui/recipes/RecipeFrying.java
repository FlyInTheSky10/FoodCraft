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



public class RecipeFrying {
	
	private static final RecipeFrying recipe = new RecipeFrying();
    private Map smeltingList = new HashMap();
    private Map experienceList = new HashMap();
    
    public static RecipeFrying frying() {
        return recipe;
    }
    
    private RecipeFrying() {
        this.itemregister(FoodcraftItems.ItemDrumstick,  new ItemStack(FoodcraftItems.ItemFriedDrumstick), 0.5F);//chicken leg
        this.itemregister(FoodcraftItems.ItemDoughTwist,  new ItemStack(FoodcraftItems.ItemFriedDoughTwist), 0.5F);//ma hua
        this.itemregister(FoodcraftItems.ItemSpringRolls,  new ItemStack(FoodcraftItems.ItemFriedSpringRolls), 0.5F);//spring roll
        this.itemregister(Items.bread,  new ItemStack(FoodcraftItems.ItemFriedBread), 0.5F);//bread
        this.itemregister(FoodcraftItems.ItemPotatoChips,  new ItemStack(FoodcraftItems.ItemChips), 0.5F);//potato chips
        this.itemregister(FoodcraftItems.ItemNewYearCake,  new ItemStack(FoodcraftItems.ItemFriedNewYearCake), 0.5F);//new year cake
        this.itemregister(FoodcraftItems.ItemTofu,  new ItemStack(FoodcraftItems.ItemFriedTofu), 0.5F);//tofu
        this.itemregister(FoodcraftItems.ItemPotatoesWire,  new ItemStack(FoodcraftItems.ItemFrenchFries), 0.5F);//french fries
        this.itemregister(FoodcraftItems.ItemBigChicken,  new ItemStack(FoodcraftItems.ItemOriginalRecipe), 0.5F);//Original Recipe chicken
        this.itemregister(FoodcraftItems.ItemMediumChicken,  new ItemStack(FoodcraftItems.ItemFriedChicken), 0.5F);//fried chicken
        this.itemregister(FoodcraftItems.ItemSmallChicken,  new ItemStack(FoodcraftItems.ItemPopcornChicken), 0.5F);//popcorn chicken
        this.itemregister(FoodcraftItems.ItemChickenWing,  new ItemStack(FoodcraftItems.ItemOrleansWing), 0.5F);//orlean chicken wings
        this.itemregister(FoodcraftItems.ItemFlour,  new ItemStack(FoodcraftItems.ItemYoutiao), 0.5F);//youtiao
        this.itemregister(FoodcraftItems.ItemSausage,  new ItemStack(FoodcraftItems.ItemFriedSausage), 0.5F);
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

 
	 private boolean isItemStackEqual(ItemStack p_151397_1_, ItemStack p_151397_2_) {
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
	    while (!this.isItemStackEqual(itemStack, (ItemStack)entry.getKey()));
	    return (ItemStack)entry.getValue();
	}
	
	public Map<ItemStack, ItemStack> getSmeltingList() {
		return this.smeltingList;
	}
}
