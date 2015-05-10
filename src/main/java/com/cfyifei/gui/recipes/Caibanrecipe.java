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
import com.cfyifei.util.FcItemStack;

public class Caibanrecipe {
	private static final Caibanrecipe smeltingBase = new Caibanrecipe();
	public  Map stack1 = new HashMap();
    
	public static Caibanrecipe smelting()
    {
        return smeltingBase;
    }
	 
	private Caibanrecipe(){
//1,2,3 not null
addrecipe(Items.cooked_chicken ,Items.cooked_chicken ,Items.cooked_chicken ,new ItemStack(ModItem.ItemJichi,6));
//1,2 not null
addrecipe(Items.cooked_porkchop ,ModItem.ItemShucai,null,new ItemStack(ModItem.ItemJiaozixian,2));
addrecipe(Items.cooked_chicken ,Items.cooked_chicken ,null,new ItemStack(ModItem.ItemDajirou,4));
addrecipe(ModItem.ItemDajirou ,ModItem.ItemDajirou ,null,new ItemStack(ModItem.ItemZhongjirou,4));
addrecipe(ModItem.ItemZhongjirou ,ModItem.ItemZhongjirou ,null,new ItemStack(ModItem.ItemXiaojirou,4));
//1 not null
addrecipe(Items.potato ,null,null,new ItemStack(ModItem.ItemTudoupian,3));
addrecipe(ModItem.ItemTudoupian ,null,null,new ItemStack(ModItem.ItemTudousi,8));
addrecipe(Items.cooked_chicken ,null,null,new ItemStack(ModItem.ItemJitui,2));
addrecipe(ModItem.ItemDoufu ,null,null,new ItemStack(ModItem.ItemDoufusi,3));
addrecipe(Items.carrot ,null,null,new ItemStack(ModItem.ItemLuobosi,3));
addrecipe(ModItem.ItemMianpi ,null,null,new ItemStack(ModItem.ItemMianfensi,3));
	}
	
	public void addrecipe(Item Input1 ,Item Input2 ,Item Input3 ,ItemStack Output){
		Item[] Items = {Input1,Input2,Input3};
		stack1.put(new FcItemStack(Items), Output);
	}
	 private boolean GG(FcItemStack ItemStack1, FcItemStack ItemStack2)
	 {
	     return ItemStack2.Stack[0] == ItemStack1.Stack[0] &&
	            ItemStack2.Stack[1] == ItemStack1.Stack[1] &&
	            ItemStack2.Stack[2] == ItemStack1.Stack[2]
	    		 ;
	 }
	 
	public ItemStack getOutput(Item Input1,Item Input2,Item Input3){
		Item[] Items = {Input1,Input2,Input3};
		FcItemStack fis = new FcItemStack(Items);
		
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
	    while (!GG(fis, (FcItemStack)entry1.getKey()));

	    ItemStack is1 = (ItemStack)entry1.getValue();
	    
	    
	    return is1;	    	    
	    

	}
	
	
}
