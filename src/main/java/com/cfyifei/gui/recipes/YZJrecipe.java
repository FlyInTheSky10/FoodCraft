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



public class YZJrecipe {
	private static final YZJrecipe smeltingBase = new YZJrecipe();
    private Map smeltingList = new HashMap();
    private Map experienceList = new HashMap();
    public static YZJrecipe smelting()
    {
        return smeltingBase;
    }
    
    private YZJrecipe()
    {
        this.itemregister(ModItem.ItemJitui,  new ItemStack(ModItem.ItemZhajitui), 0.5F);//chicken leg
        this.itemregister(ModItem.ItemMahua,  new ItemStack(ModItem.ItemZhamahua), 0.5F);//ma hua
        this.itemregister(ModItem.ItemChunjuan,  new ItemStack(ModItem.ItemZhachunjuan), 0.5F);//spring roll
        this.itemregister(Items.bread,  new ItemStack(ModItem.ItemZhamianbao), 0.5F);//bread
        this.itemregister(ModItem.ItemTudoupian,  new ItemStack(ModItem.ItemShupian), 0.5F);//potato chips
        this.itemregister(ModItem.ItemNiangao,  new ItemStack(ModItem.ItemZhaniangao), 0.5F);//new year cake
        this.itemregister(ModItem.ItemDoufu,  new ItemStack(ModItem.ItemZhadoufu), 0.5F);//tofu
        this.itemregister(ModItem.ItemTudousi,  new ItemStack(ModItem.ItemShutiao), 0.5F);//french fries
        this.itemregister(ModItem.ItemDajirou,  new ItemStack(ModItem.ItemYuanweijikuai), 0.5F);//Original Recipe chicken
        this.itemregister(ModItem.ItemZhongjirou,  new ItemStack(ModItem.ItemJikuai), 0.5F);//fried chicken
        this.itemregister(ModItem.ItemXiaojirou,  new ItemStack(ModItem.ItemJimihua), 0.5F);//popcorn chicken
        this.itemregister(ModItem.ItemJichi,  new ItemStack(ModItem.ItemAeljichi), 0.5F);//orlean chicken wings
        this.itemregister(ModItem.ItemMianfen,  new ItemStack(ModItem.ItemYoutiao), 0.5F);//youtiao
        this.itemregister(ModItem.ItemXiangchang,  new ItemStack(ModItem.ItemZhaxiangchang), 0.5F);
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

public Map<ItemStack, ItemStack> getSmeltingList() {
	return this.smeltingList;
}
}
