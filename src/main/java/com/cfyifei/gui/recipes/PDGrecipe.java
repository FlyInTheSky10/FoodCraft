package com.cfyifei.gui.recipes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.cfyifei.RemoveRecipe;
import com.cfyifei.item.ModItem;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class PDGrecipe {
	private static final PDGrecipe smeltingBase = new PDGrecipe();
    private Map smeltingList = new HashMap();
    private Map experienceList = new HashMap();
    public static PDGrecipe smelting()
    {
        return smeltingBase;
    }
    
    private PDGrecipe()
    {
        this.itemregister(Items.egg, new ItemStack(ModItem.ItemJianjidan), 0.5F);
        this.itemregister(ModItem.ItemMianfen, new ItemStack(ModItem.ItemLaobing), 0.5F);
        this.itemregister(ModItem.ItemJiaozi, new ItemStack(ModItem.ItemJianjiao), 0.5F);
        this.itemregister(ModItem.ItemTudoupian, new ItemStack(ModItem.ItemChaotudoupian), 0.5F);
        this.itemregister(ModItem.ItemMianfensi, new ItemStack(ModItem.ItemMahua), 0.5F);
        
        this.itemregister(Items.beef, new ItemStack(Items.cooked_beef), 0.5F);
        this.itemregister(Items.chicken, new ItemStack(Items.cooked_chicken), 0.5F);
        this.itemregister(Items.fish, new ItemStack(Items.cooked_fished), 0.5F);
        this.itemregister(Items.porkchop, new ItemStack(Items.cooked_porkchop), 0.5F);
        

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

 
 private boolean func_151397_a(ItemStack p_151397_1_, ItemStack p_151397_2_)
 {
     return p_151397_2_.getItem() == p_151397_1_.getItem() && (p_151397_2_.getItemDamage() == 32767 || p_151397_2_.getItemDamage() == p_151397_1_.getItemDamage());
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
    while (!this.func_151397_a(itemStack, (ItemStack)entry.getKey()));

    return (ItemStack)entry.getValue();
}
}
