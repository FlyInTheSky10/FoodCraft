package com.foodcraft.gui.recipes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.foodcraft.init.FoodcraftItems;
import com.foodcraft.itemstack.BeverageMaking;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipeBeverageMaking {
	
	private static final RecipeBeverageMaking recipe = new RecipeBeverageMaking();
	private Map stack1 = new HashMap();
	
	public static RecipeBeverageMaking making() {
        return recipe;
    }
	 
	private RecipeBeverageMaking() {
		//hot		 
		addrecipeItem(FoodcraftItems.ItemQiaokeli, false, false, new ItemStack(FoodcraftItems.ItemQiaokelishui));
		addrecipeItem(FoodcraftItems.ItemQiaokeli, true, false, new ItemStack(FoodcraftItems.ItemQiaokelinai));
		addrecipeItem(Items.carrot, false, false, new ItemStack(FoodcraftItems.ItemHuluobozhi));
		addrecipeItem(FoodcraftItems.ItemShucai, false, false, new ItemStack(FoodcraftItems.ItemShucaizhi));
		addrecipeItem(FoodcraftItems.ItemDoujiang, true, false, new ItemStack(FoodcraftItems.ItemDounai));
		addrecipeItem(Item.getItemFromBlock(Blocks.leaves), false, false, new ItemStack(FoodcraftItems.ItemCha));
		addrecipeItem(FoodcraftItems.ItemCha, true, false, new ItemStack(FoodcraftItems.ItemNaicha));
		//cold
		addrecipeItem(Items.apple, false, true, new ItemStack(FoodcraftItems.ItemPingguozhi));
		addrecipeItem(FoodcraftItems.ItemPutao, false, true, new ItemStack(FoodcraftItems.ItemPutaozhi));
		addrecipeItem(Items.golden_apple, false, true, new ItemStack(FoodcraftItems.ItemJinpingguozhi));
		addrecipeItem(FoodcraftItems.ItemJinputao, false, true, new ItemStack(FoodcraftItems.ItemJinputaozhi));
		addrecipe(new ItemStack(Items.dye,1,15), false, true, new ItemStack(FoodcraftItems.ItemXuebi));
		addrecipeItem(Items.dye, false, true, new ItemStack(FoodcraftItems.ItemKele));
		addrecipeItem(Items.melon, false, true, new ItemStack(FoodcraftItems.ItemXiguazhi));
		

		addrecipeItem(FoodcraftItems.ItemLi, false, true, new ItemStack(FoodcraftItems.ItemLizizhi));
		addrecipeItem(FoodcraftItems.ItemLizhi, false, true, new ItemStack(FoodcraftItems.ItemLizhizhi));
		addrecipeItem(FoodcraftItems.ItemTaozi, false, true, new ItemStack(FoodcraftItems.ItemTaozizhi));
		addrecipeItem(FoodcraftItems.ItemJuzi, false, true, new ItemStack(FoodcraftItems.ItemJuzizhi));
		addrecipeItem(FoodcraftItems.ItemPipa, false, true, new ItemStack(FoodcraftItems.ItemPipazhi));
		addrecipeItem(FoodcraftItems.ItemMangguo, false, true, new ItemStack(FoodcraftItems.ItemMangguozhi));
		addrecipeItem(FoodcraftItems.ItemNingmeng, false, true, new ItemStack(FoodcraftItems.ItemNingmengzhi));
		addrecipeItem(FoodcraftItems.ItemYouzi, false, true, new ItemStack(FoodcraftItems.ItemYouzizhi));
		addrecipeItem(FoodcraftItems.ItemShizi, false, true, new ItemStack(FoodcraftItems.ItemShizizhi));	
		addrecipeItem(FoodcraftItems.ItemMugua, false, true, new ItemStack(FoodcraftItems.ItemMuguazhi));		
		addrecipeItem(FoodcraftItems.ItemShanzha, false, true, new ItemStack(FoodcraftItems.ItemShanzhazhi));	
		addrecipeItem(FoodcraftItems.ItemShiliu, false, true, new ItemStack(FoodcraftItems.ItemShiliuzhi));
		addrecipeItem(FoodcraftItems.ItemHongzao, false, true, new ItemStack(FoodcraftItems.ItemHongzaozhi));
		addrecipeItem(FoodcraftItems.ItemCaomei, false, true, new ItemStack(FoodcraftItems.ItemCaomeizhi));
		addrecipeItem(FoodcraftItems.ItemYezi, false, true, new ItemStack(FoodcraftItems.ItemYezizhi));
		addrecipeItem(FoodcraftItems.ItemYingtao, false, true, new ItemStack(FoodcraftItems.ItemYingtaozhi));	
		addrecipeItem(FoodcraftItems.ItemXiangjiao, false, true, new ItemStack(FoodcraftItems.ItemXiangjiaozhi));		
		addrecipeItem(FoodcraftItems.ItemYezizhi, true, true, new ItemStack(FoodcraftItems.ItemYenai));				
	}
	
	public void addrecipeItem(Item Input ,boolean isMilk ,boolean iscold,ItemStack Output) {
		stack1.put(new BeverageMaking(new ItemStack(Input), isMilk, iscold), Output);
	}
	
	public void addrecipe(ItemStack Input ,boolean isMilk ,boolean iscold,ItemStack Output) {
		stack1.put(new BeverageMaking(Input, isMilk, iscold), Output);
	}
	 private boolean isItemStackEqual(BeverageMaking ItemStack1, BeverageMaking ItemStack2)
	 {
	     return ItemStack2.getItemStack().getItemDamage() == ItemStack1.getItemStack().getItemDamage() &&
	    		 ItemStack2.getItemStack().getItem() == ItemStack1.getItemStack().getItem() &&
	            ItemStack2.isMilk() == ItemStack1.isMilk() &&
	            ItemStack2.iscold() == ItemStack1.iscold();
	 }
	 
	public ItemStack getOutput(ItemStack Input ,boolean isMilk ,boolean iscold) {

		BeverageMaking fis = new BeverageMaking(Input, isMilk, iscold);	
		Iterator iterator1 = stack1.entrySet().iterator();
	    Entry entry1;
	    do {
	        if (!iterator1.hasNext()) {
	            return null;
	        }
	        entry1 = (Entry)iterator1.next();
	    }
	    while (!isItemStackEqual(fis, (BeverageMaking)entry1.getKey()));
	    ItemStack is1 = (ItemStack)entry1.getValue(); 
	    return is1;	    	    
	}

	public Map<BeverageMaking, ItemStack> getSmeltingList() {
		return this.stack1;
	}
}

