package com.foodcraft.gui.recipes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.foodcraft.init.FoodcraftItems;
import com.foodcraft.itemstack.FoodcraftItemStack;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipePressureCooker {
	
	private static final RecipePressureCooker recipe = new RecipePressureCooker();
	private Map stack1 = new HashMap();
	
	public static RecipePressureCooker cooking() {
        return recipe;
    }
	 
	private RecipePressureCooker(){
		addrecipe(FoodcraftItems.ItemMilledRice,FoodcraftItems.ItemMilledRice,FoodcraftItems.ItemMilledRice,new ItemStack(FoodcraftItems.ItemCookedRice));
		addrecipe(FoodcraftItems.ItemCookedRice,FoodcraftItems.ItemCookedRice,FoodcraftItems.ItemCookedRice,new ItemStack(FoodcraftItems.ItemPorridge,3));
		addrecipe(Items.egg,FoodcraftItems.ItemSoySauce,FoodcraftItems.ItemScallion,new ItemStack(FoodcraftItems.ItemEggSoup));
		addrecipe(Item.getItemFromBlock(Blocks.brown_mushroom),FoodcraftItems.ItemDrumstick,FoodcraftItems.ItemSalt,new ItemStack(FoodcraftItems.ItemMogudunjitang));
		addrecipe(Items.cooked_fish,FoodcraftItems.ItemScallion,FoodcraftItems.ItemScallion,new ItemStack(FoodcraftItems.ItemQingzhenyu));
		addrecipe(FoodcraftItems.ItemCookedRice,Items.egg,Items.cooked_porkchop,new ItemStack(FoodcraftItems.ItemPreservedEggPorridge));
	}
	
	public void addrecipe(Item Input1 ,Item Input2 ,Item Input3 ,ItemStack Output){
		Item[] Items = {Input1,Input2,Input3};
		stack1.put(new FoodcraftItemStack(Items), Output);
	}
	 private boolean isItemStackEqual(FoodcraftItemStack ItemStack1, FoodcraftItemStack ItemStack2) {
	     return ItemStack2.getItems()[0] == ItemStack1.getItems()[0] &&
	            ItemStack2.getItems()[1] == ItemStack1.getItems()[1] &&
	            ItemStack2.getItems()[2] == ItemStack1.getItems()[2];
	 }
	 
	public ItemStack getOutput(Item Input1,Item Input2,Item Input3) {
		Item[] Items = {Input1,Input2,Input3};
		FoodcraftItemStack fis = new FoodcraftItemStack(Items);
		
		Iterator iterator1 = stack1.entrySet().iterator();
	    Entry entry1;
		
	    do {
	        if (!iterator1.hasNext()) {
	            return null;
	        }
	        entry1 = (Entry)iterator1.next();
	    }
	    while (!isItemStackEqual(fis, (FoodcraftItemStack)entry1.getKey()));
	    ItemStack is1 = (ItemStack)entry1.getValue();        
	    return is1;	    	        
	}

	public Map<FoodcraftItemStack, ItemStack> getSmeltingList() {
		return this.stack1;
	}
}