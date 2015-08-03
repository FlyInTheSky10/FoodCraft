package com.cfyifei.gui.recipes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.cfyifei.item.ModItem;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;



public class Nmjrecipe {
	private static final Nmjrecipe smeltingBase = new Nmjrecipe();
	public Map smeltingList = new HashMap();
    private Map experienceList = new HashMap();
    public static Nmjrecipe smelting()
    {
        return smeltingBase;
    }
    
    private Nmjrecipe()
    {
        this.itemregister(ModItem.ItemDami, new ItemStack(ModItem.Itemfan), 0.7F);
        this.itemregister(Items.wheat, new ItemStack(ModItem.ItemMianfen , 2), 0.5F);
        this.itemregister(ModItem.ItemHuashen, new ItemStack(ModItem.ItemHuashenyou), 0.5F);
        this.itemregister(ModItem.ItemDouzi, new ItemStack(ModItem.ItemDoujiang), 0.5F);
        this.itemregister(Items.potato, new ItemStack(ModItem.ItemDianfen,8), 0.5F);
        this.register(new ItemStack(Items.dye,1,3), new ItemStack(ModItem.ItemQiaokelifen), 0.5F);
        this.itemregister(ModItem.ItemNuomi,  new ItemStack(ModItem.ItemNuomifen,3), 0.5F);
        this.itemregister(ModItem.ItemHongdou,  new ItemStack(ModItem.ItemDousha,2), 0.5F);
    }
   
	     
	
	public void blockregister(Block Block, ItemStack ItemStack, float xp)
    {
        this.itemregister(Item.getItemFromBlock(Block), ItemStack, xp);
    }
	  
	public void itemregister(Item Item, ItemStack ItemStack, float xp)
	    {
	        this.register(new ItemStack(Item, 1, 32767), ItemStack, xp);
	    }

 public void register(ItemStack ItemStack, ItemStack ItemStack2, float xp)
	    {
	        this.smeltingList.put(ItemStack, ItemStack2);
	        this.experienceList.put(ItemStack2, Float.valueOf(xp));
	    }

 
 private boolean GG(ItemStack ItemStack1, ItemStack ItemStack2)
 {
     return ItemStack2.getItem() == ItemStack1.getItem() && (ItemStack2.getItemDamage() == 32767 || ItemStack2.getItemDamage() == ItemStack1.getItemDamage());
 }

public ItemStack getSmeltingResult(ItemStack itemStack) {
    Iterator iterator = this.smeltingList.entrySet().iterator();
    Entry entry;

    do
    {
        if (!iterator.hasNext())
        {
            return null;
        }

        entry = (Entry)iterator.next();
    }
    while (!this.GG(itemStack, (ItemStack)entry.getKey()));

    return (ItemStack)entry.getValue();
}

    public Map getSmeltingList()
    {
        return this.smeltingList;
    }
}
