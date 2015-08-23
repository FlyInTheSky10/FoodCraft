package com.cfyifei.gui.recipes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.cfyifei.item.FoodcraftItems;
import com.cfyifei.itemstack.TpjMaking;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipeBeverageMaking {
	
	private static final RecipeBeverageMaking recipe = new RecipeBeverageMaking();
	public Map stack1 = new HashMap();
	
	public static RecipeBeverageMaking making() {
        return recipe;
    }
	 
	private RecipeBeverageMaking(){
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
		stack1.put(new TpjMaking(new ItemStack(Input), isMilk, iscold), Output);
	}
	
	public void addrecipe(ItemStack Input ,boolean isMilk ,boolean iscold,ItemStack Output) {
		stack1.put(new TpjMaking(Input, isMilk, iscold), Output);
	}
	 private boolean isItemStackEqual(TpjMaking ItemStack1, TpjMaking ItemStack2)
	 {
	     return ItemStack2.Item.getItemDamage() == ItemStack1.Item.getItemDamage() &&
	    		 ItemStack2.Item.getItem() == ItemStack1.Item.getItem() &&
	            ItemStack2.isMilk == ItemStack1.isMilk &&
	            ItemStack2.iscold == ItemStack1.iscold;
	 }
	 
	public ItemStack getOutput(ItemStack Input ,boolean isMilk ,boolean iscold) {

		TpjMaking fis = new TpjMaking(Input, isMilk, iscold);	
		Iterator iterator1 = stack1.entrySet().iterator();
	    Entry entry1;
	    do {
	        if (!iterator1.hasNext()) {
	            return null;
	        }
	        entry1 = (Entry)iterator1.next();
	    }
	    while (!isItemStackEqual(fis, (TpjMaking)entry1.getKey()));
	    ItemStack is1 = (ItemStack)entry1.getValue(); 
	    return is1;	    	    
	}

	public Map<TpjMaking, ItemStack> getSmeltingList() {
		return this.stack1;
	}
}

