package com.cfyifei.gui.recipes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.cfyifei.item.FoodcraftItems;
import com.cfyifei.itemstack.FoodcraftItemStack;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipePressureCooker {
	
	private static final RecipePressureCooker recipe = new RecipePressureCooker();
	public Map stack1 = new HashMap();
	
	public static RecipePressureCooker cooking() {
        return recipe;
    }
	 
	private RecipePressureCooker(){
		addrecipe(FoodcraftItems.Itemfan,FoodcraftItems.Itemfan,FoodcraftItems.Itemfan,new ItemStack(FoodcraftItems.ItemBaifan));
		addrecipe(FoodcraftItems.ItemBaifan,FoodcraftItems.ItemBaifan,FoodcraftItems.ItemBaifan,new ItemStack(FoodcraftItems.ItemXifan,3));
		addrecipe(Items.egg,FoodcraftItems.ItemJiangyou,FoodcraftItems.ItemCong,new ItemStack(FoodcraftItems.ItemDangeng));
		addrecipe(Item.getItemFromBlock(Blocks.brown_mushroom),FoodcraftItems.ItemJitui,FoodcraftItems.ItemYan,new ItemStack(FoodcraftItems.ItemMogudunjitang));
		addrecipe(Items.cooked_fish,FoodcraftItems.ItemCong,FoodcraftItems.ItemCong,new ItemStack(FoodcraftItems.ItemQingzhenyu));
		addrecipe(FoodcraftItems.ItemBaifan,Items.egg,Items.cooked_porkchop,new ItemStack(FoodcraftItems.ItemPidanshourouzhou));
	}
	
	public void addrecipe(Item Input1 ,Item Input2 ,Item Input3 ,ItemStack Output){
		Item[] Items = {Input1,Input2,Input3};
		stack1.put(new FoodcraftItemStack(Items), Output);
	}
	 private boolean isItemStackEqual(FoodcraftItemStack ItemStack1, FoodcraftItemStack ItemStack2) {
	     return ItemStack2.Stack[0] == ItemStack1.Stack[0] &&
	            ItemStack2.Stack[1] == ItemStack1.Stack[1] &&
	            ItemStack2.Stack[2] == ItemStack1.Stack[2];
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