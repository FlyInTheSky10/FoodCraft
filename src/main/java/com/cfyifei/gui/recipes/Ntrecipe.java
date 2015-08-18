package com.cfyifei.gui.recipes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.cfyifei.item.ModItem;
import com.cfyifei.itemstack.FoodcraftItemStack;

public class Ntrecipe {
	
	private static final Ntrecipe smeltingBase = new Ntrecipe();
	public Map stack1 = new HashMap();
    
	public static Ntrecipe smelting() {
        return smeltingBase;
    }
	 
	private Ntrecipe(){
		addrecipe(ModItem.ItemDouzi, ModItem.ItemMianfen, ModItem.ItemYan, new ItemStack(ModItem.ItemJiangyou,16));
		addrecipe(ModItem.ItemDouzi, ModItem.ItemDouzi, Items.sugar, new ItemStack(ModItem.ItemCu,16));
		addrecipe(ModItem.ItemPutao, ModItem.ItemPutao, ModItem.ItemPutao, new ItemStack(ModItem.ItemPutaojiu,3));
		addrecipe(ModItem.ItemPutaojiu, ModItem.ItemPutaojiu, ModItem.ItemPutaojiu, new ItemStack(ModItem.ItemHongjiu,9));
		addrecipe(ModItem.ItemDami, ModItem.ItemDami, ModItem.ItemDami, new ItemStack(ModItem.ItemBaijiu,3));
		addrecipe(Items.apple, Items.apple, Items.apple, new ItemStack(ModItem.ItemPingguojiu,3));
		addrecipe(Items.golden_apple, Items.golden_apple, Items.golden_apple, new ItemStack(ModItem.ItemJinpingguojiu,3));
		addrecipe(ModItem.ItemJinputao, ModItem.ItemJinputao, ModItem.ItemJinputao, new ItemStack(ModItem.ItemJinputaojiu,3));
		addrecipe(ModItem.ItemLi, ModItem.ItemLi, ModItem.ItemLi, new ItemStack(ModItem.ItemLizijiu,3));
		addrecipe(ModItem.ItemLizhi, ModItem.ItemLizhi, ModItem.ItemLizhi, new ItemStack(ModItem.ItemLizhijiu,3));
		addrecipe(ModItem.ItemTaozi, ModItem.ItemTaozi, ModItem.ItemTaozi, new ItemStack(ModItem.ItemTaozijiu,3));
		addrecipe(ModItem.ItemShiliu, ModItem.ItemShiliu, ModItem.ItemShiliu, new ItemStack(ModItem.ItemShiliujiu,3));
		addrecipe(ModItem.ItemNingmeng, ModItem.ItemNingmeng, ModItem.ItemNingmeng, new ItemStack(ModItem.ItemNingmengjiu,3));
		addrecipe(ModItem.ItemMangguo, ModItem.ItemMangguo, ModItem.ItemMangguo, new ItemStack(ModItem.ItemMangguojiu,3));
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
