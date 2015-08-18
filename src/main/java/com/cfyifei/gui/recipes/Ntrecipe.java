package com.cfyifei.gui.recipes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.cfyifei.item.FoodcraftItems;
import com.cfyifei.itemstack.FoodcraftItemStack;

public class Ntrecipe {
	
	private static final Ntrecipe smeltingBase = new Ntrecipe();
	public Map stack1 = new HashMap();
    
	public static Ntrecipe smelting() {
        return smeltingBase;
    }
	 
	private Ntrecipe(){
		addrecipe(FoodcraftItems.ItemDouzi, FoodcraftItems.ItemMianfen, FoodcraftItems.ItemYan, new ItemStack(FoodcraftItems.ItemJiangyou,16));
		addrecipe(FoodcraftItems.ItemDouzi, FoodcraftItems.ItemDouzi, Items.sugar, new ItemStack(FoodcraftItems.ItemCu,16));
		addrecipe(FoodcraftItems.ItemPutao, FoodcraftItems.ItemPutao, FoodcraftItems.ItemPutao, new ItemStack(FoodcraftItems.ItemPutaojiu,3));
		addrecipe(FoodcraftItems.ItemPutaojiu, FoodcraftItems.ItemPutaojiu, FoodcraftItems.ItemPutaojiu, new ItemStack(FoodcraftItems.ItemHongjiu,9));
		addrecipe(FoodcraftItems.ItemDami, FoodcraftItems.ItemDami, FoodcraftItems.ItemDami, new ItemStack(FoodcraftItems.ItemBaijiu,3));
		addrecipe(Items.apple, Items.apple, Items.apple, new ItemStack(FoodcraftItems.ItemPingguojiu,3));
		addrecipe(Items.golden_apple, Items.golden_apple, Items.golden_apple, new ItemStack(FoodcraftItems.ItemJinpingguojiu,3));
		addrecipe(FoodcraftItems.ItemJinputao, FoodcraftItems.ItemJinputao, FoodcraftItems.ItemJinputao, new ItemStack(FoodcraftItems.ItemJinputaojiu,3));
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
	 private boolean GG(FoodcraftItemStack ItemStack1, FoodcraftItemStack ItemStack2) {
	     return ItemStack2.Stack[0] == ItemStack1.Stack[0] &&
	            ItemStack2.Stack[1] == ItemStack1.Stack[1] &&
	            ItemStack2.Stack[2] == ItemStack1.Stack[2];
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
	    while (!GG(fis, (FoodcraftItemStack)entry1.getKey()));
	    ItemStack is1 = (ItemStack)entry1.getValue();
	    return is1;	    	    
	}

	public Map<FoodcraftItemStack, ItemStack> getSmeltingList() {
		return this.stack1;
	}
}
