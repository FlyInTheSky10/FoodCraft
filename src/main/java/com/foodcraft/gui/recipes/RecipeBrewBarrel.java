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

public class RecipeBrewBarrel {
	
	private static final RecipeBrewBarrel recipe = new RecipeBrewBarrel();
	private Map stack1 = new HashMap();
    
	public static RecipeBrewBarrel brewing() {
        return recipe;
    }
	 
	private RecipeBrewBarrel(){
		addrecipe(FoodcraftItems.ItemBeans, FoodcraftItems.ItemFlour, FoodcraftItems.ItemSalt, new ItemStack(FoodcraftItems.ItemSoySauce,16));
		addrecipe(FoodcraftItems.ItemBeans, FoodcraftItems.ItemBeans, Items.sugar, new ItemStack(FoodcraftItems.ItemVinegar,16));
		addrecipe(FoodcraftItems.ItemGrapes, FoodcraftItems.ItemGrapes, FoodcraftItems.ItemGrapes, new ItemStack(FoodcraftItems.ItemGrapeWine,3));
		addrecipe(FoodcraftItems.ItemGrapeWine, FoodcraftItems.ItemGrapeWine, FoodcraftItems.ItemGrapeWine, new ItemStack(FoodcraftItems.ItemRedWine,9));
		addrecipe(FoodcraftItems.ItemRice, FoodcraftItems.ItemRice, FoodcraftItems.ItemRice, new ItemStack(FoodcraftItems.ItemSpirit,3));
		addrecipe(Items.apple, Items.apple, Items.apple, new ItemStack(FoodcraftItems.ItemCider,3));
		addrecipe(Items.golden_apple, Items.golden_apple, Items.golden_apple, new ItemStack(FoodcraftItems.ItemGoldenCider,3));
		addrecipe(FoodcraftItems.ItemGoldenGrape, FoodcraftItems.ItemGoldenGrape, FoodcraftItems.ItemGoldenGrape, new ItemStack(FoodcraftItems.ItemGoldenGrapeWine,3));
		addrecipe(FoodcraftItems.ItemLi, FoodcraftItems.ItemLi, FoodcraftItems.ItemLi, new ItemStack(FoodcraftItems.ItemLizijiu,3));
		addrecipe(FoodcraftItems.ItemLizhi, FoodcraftItems.ItemLizhi, FoodcraftItems.ItemLizhi, new ItemStack(FoodcraftItems.ItemLizhijiu,3));
		addrecipe(FoodcraftItems.ItemTaozi, FoodcraftItems.ItemTaozi, FoodcraftItems.ItemTaozi, new ItemStack(FoodcraftItems.ItemTaozijiu,3));
		addrecipe(FoodcraftItems.ItemShiliu, FoodcraftItems.ItemShiliu, FoodcraftItems.ItemShiliu, new ItemStack(FoodcraftItems.ItemShiliujiu,3));
		addrecipe(FoodcraftItems.ItemNingmeng, FoodcraftItems.ItemNingmeng, FoodcraftItems.ItemNingmeng, new ItemStack(FoodcraftItems.ItemNingmengjiu,3));
		addrecipe(FoodcraftItems.ItemMangguo, FoodcraftItems.ItemMangguo, FoodcraftItems.ItemMangguo, new ItemStack(FoodcraftItems.ItemMangguojiu,3));
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
	 
	public ItemStack getOutput(Item Input1,Item Input2,Item Input3){
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
