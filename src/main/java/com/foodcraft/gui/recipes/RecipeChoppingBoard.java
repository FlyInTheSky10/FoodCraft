package com.foodcraft.gui.recipes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.foodcraft.init.FoodcraftItems;
import com.foodcraft.itemstack.FoodcraftItemStack;

public class RecipeChoppingBoard {
	
	private static final RecipeChoppingBoard recipe = new RecipeChoppingBoard();
	private  Map stack1 = new HashMap();
    
	public static RecipeChoppingBoard chopping() {
        return recipe;
    }
	 
	private RecipeChoppingBoard(){
		//3 not null
		addrecipe(null ,Items.cooked_chicken,null,new ItemStack(FoodcraftItems.ItemChickenWing,2));//1�����Ǽ��� 2������
		//1,2 not null
		addrecipe(Items.cooked_porkchop ,FoodcraftItems.ItemVegetable,null,new ItemStack(FoodcraftItems.ItemDumplingMeat,2));
		addrecipe(Items.cooked_chicken ,Items.cooked_chicken ,null,new ItemStack(FoodcraftItems.ItemBigChicken,4));//2�����Ǽ��� 4������
		addrecipe(FoodcraftItems.ItemBigChicken ,FoodcraftItems.ItemBigChicken ,null,new ItemStack(FoodcraftItems.ItemMediumChicken,4));
		addrecipe(FoodcraftItems.ItemMediumChicken ,FoodcraftItems.ItemMediumChicken ,null,new ItemStack(FoodcraftItems.ItemSmallChicken,4));
		//1 not null
		addrecipe(Items.potato ,null,null,new ItemStack(FoodcraftItems.ItemPotatoChips,3));
		addrecipe(FoodcraftItems.ItemPotatoChips ,null,null,new ItemStack(FoodcraftItems.ItemPotatoesWire,8));
		addrecipe(Items.cooked_chicken ,null,null,new ItemStack(FoodcraftItems.ItemDrumstick,2));//1�����Ǽ��� 2������
		addrecipe(FoodcraftItems.ItemTofu ,null,null,new ItemStack(FoodcraftItems.ItemTofuStrip,3));
		addrecipe(Items.carrot ,null,null,new ItemStack(FoodcraftItems.ItemCarrotStrip,3));
		addrecipe(FoodcraftItems.ItemDumplingWrappers ,null,null,new ItemStack(FoodcraftItems.ItemFlourSilk,3));
		addrecipe(FoodcraftItems.ItemCookedSquidMeat ,null,null,new ItemStack(FoodcraftItems.ItemSquidSlices,3));
		addrecipe(FoodcraftItems.ItemBailuobo ,null,null,new ItemStack(FoodcraftItems.ItemBailuobosi,3));
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
