package com.cfyifei.gui.recipes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.cfyifei.item.ModItem;
import com.cfyifei.util.FcItemStack;
import com.cfyifei.util.FcTpjItemStack;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Tpjrecipe {
	private static final Tpjrecipe smeltingBase = new Tpjrecipe();
	public Map stack1 = new HashMap();
	public static Tpjrecipe smelting()
    {
        return smeltingBase;
    }
	 
	private Tpjrecipe(){
		//hot		 
		addrecipeItem(ModItem.ItemQiaokeli, false, false, new ItemStack(ModItem.ItemQiaokelishui));
		addrecipeItem(ModItem.ItemQiaokeli, true, false, new ItemStack(ModItem.ItemQiaokelinai));
		addrecipeItem(Items.carrot, false, false, new ItemStack(ModItem.ItemHuluobozhi));
		addrecipeItem(ModItem.ItemShucai, false, false, new ItemStack(ModItem.ItemShucaizhi));
		addrecipeItem(ModItem.ItemDoujiang, true, false, new ItemStack(ModItem.ItemDounai));
		addrecipeItem(Item.getItemFromBlock(Blocks.leaves), false, false, new ItemStack(ModItem.ItemCha));
		addrecipeItem(ModItem.ItemCha, true, false, new ItemStack(ModItem.ItemNaicha));
		//cold
		addrecipeItem(Items.apple, false, true, new ItemStack(ModItem.ItemPingguozhi));
		addrecipeItem(ModItem.ItemPutao, false, true, new ItemStack(ModItem.ItemPutaozhi));
		addrecipeItem(Items.golden_apple, false, true, new ItemStack(ModItem.ItemJinpingguozhi));
		addrecipeItem(ModItem.ItemJinputao, false, true, new ItemStack(ModItem.ItemJinputaozhi));
		addrecipe(new ItemStack(Items.dye,1,15), false, true, new ItemStack(ModItem.ItemXuebi));
		addrecipeItem(Items.dye, false, true, new ItemStack(ModItem.ItemKele));
		addrecipeItem(Items.melon, false, true, new ItemStack(ModItem.ItemXiguazhi));
	}
	
	public void addrecipeItem(Item Input ,boolean isMilk ,boolean iscold,ItemStack Output){
		stack1.put(new FcTpjItemStack(new ItemStack(Input), isMilk, iscold), Output);
	}
	
	public void addrecipe(ItemStack Input ,boolean isMilk ,boolean iscold,ItemStack Output){

		stack1.put(new FcTpjItemStack(Input, isMilk, iscold), Output);
	}
	 private boolean GG(FcTpjItemStack ItemStack1, FcTpjItemStack ItemStack2)
	 {
	     return ItemStack2.Item.getItemDamage() == ItemStack1.Item.getItemDamage() &&
	    		 ItemStack2.Item.getItem() == ItemStack1.Item.getItem() &&
	            ItemStack2.isMilk == ItemStack1.isMilk &&
	            ItemStack2.iscold == ItemStack1.iscold
	    		 ;
	 }
	 
	public ItemStack getOutput(ItemStack Input ,boolean isMilk ,boolean iscold){

		FcTpjItemStack fis = new FcTpjItemStack(Input, isMilk, iscold);
		
		Iterator iterator1 = stack1.entrySet().iterator();
	    Entry entry1;
		
	    do
	    {
	        if (!iterator1.hasNext())
	        {
	            return null;
	        }

	        entry1 = (Entry)iterator1.next();
	    }
	    while (!GG(fis, (FcTpjItemStack)entry1.getKey()));

	    ItemStack is1 = (ItemStack)entry1.getValue();
	    
	    
	    return is1;	    	    
	    

	}
	
	
}

