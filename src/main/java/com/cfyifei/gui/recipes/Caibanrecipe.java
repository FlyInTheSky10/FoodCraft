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

public class Caibanrecipe {
	private static final Caibanrecipe smeltingBase = new Caibanrecipe();
	public  Map stack1 = new HashMap();
    
	public static Caibanrecipe smelting()
    {
        return smeltingBase;
    }
	 
	private Caibanrecipe(){
//3 not null
addrecipe(null ,Items.cooked_chicken,null,new ItemStack(ModItem.ItemJichi,2));//1个格都是鸡肉 2个鸡翅
//1,2 not null
addrecipe(Items.cooked_porkchop ,ModItem.ItemShucai,null,new ItemStack(ModItem.ItemJiaozixian,2));
addrecipe(Items.cooked_chicken ,Items.cooked_chicken ,null,new ItemStack(ModItem.ItemDajirou,4));//2个格都是鸡肉 4个大鸡肉
addrecipe(ModItem.ItemDajirou ,ModItem.ItemDajirou ,null,new ItemStack(ModItem.ItemZhongjirou,4));
addrecipe(ModItem.ItemZhongjirou ,ModItem.ItemZhongjirou ,null,new ItemStack(ModItem.ItemXiaojirou,4));
//1 not null
addrecipe(Items.potato ,null,null,new ItemStack(ModItem.ItemTudoupian,3));
addrecipe(ModItem.ItemTudoupian ,null,null,new ItemStack(ModItem.ItemTudousi,8));
addrecipe(Items.cooked_chicken ,null,null,new ItemStack(ModItem.ItemJitui,2));//1个格都是鸡肉 2个鸡腿
addrecipe(ModItem.ItemDoufu ,null,null,new ItemStack(ModItem.ItemDoufusi,3));
addrecipe(Items.carrot ,null,null,new ItemStack(ModItem.ItemLuobosi,3));
addrecipe(ModItem.ItemMianpi ,null,null,new ItemStack(ModItem.ItemMianfensi,3));
addrecipe(ModItem.ItemShuyouyurou ,null,null,new ItemStack(ModItem.ItemYouyusi,3));
addrecipe(ModItem.ItemBailuobo ,null,null,new ItemStack(ModItem.ItemBailuobosi,3));
	}
	
	public void addrecipe(Item Input1 ,Item Input2 ,Item Input3 ,ItemStack Output){
		Item[] Items = {Input1,Input2,Input3};
		stack1.put(new FoodcraftItemStack(Items), Output);
	}
	 private boolean GG(FoodcraftItemStack ItemStack1, FoodcraftItemStack ItemStack2)
	 {
	     return ItemStack2.Stack[0] == ItemStack1.Stack[0] &&
	            ItemStack2.Stack[1] == ItemStack1.Stack[1] &&
	            ItemStack2.Stack[2] == ItemStack1.Stack[2]
	    		 ;
	 }
	 
	public ItemStack getOutput(Item Input1,Item Input2,Item Input3){
		Item[] Items = {Input1,Input2,Input3};
		FoodcraftItemStack fis = new FoodcraftItemStack(Items);
		
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
	    while (!GG(fis, (FoodcraftItemStack)entry1.getKey()));

	    ItemStack is1 = (ItemStack)entry1.getValue();
	    
	    
	    return is1;	    	    
	    

	}

	public Map<FoodcraftItemStack, ItemStack> getSmeltingList() {
		// TODO 自动生成的方法存根
		return this.stack1;
	}
	
	
}
