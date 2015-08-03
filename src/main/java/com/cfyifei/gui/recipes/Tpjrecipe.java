package com.cfyifei.gui.recipes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.cfyifei.item.ModItem;
import com.cfyifei.itemstack.FoodcraftItemStack;
import com.cfyifei.itemstack.TpjMaking;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Tpjrecipe {
	private static final Tpjrecipe smeltingBase = new Tpjrecipe();
	public Map<TpjMaking, ItemStack> stack1 = new HashMap();
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
		addrecipeItem(ModItem.ItemBailuobo, false, false, new ItemStack(ModItem.ItemBailuobozhi));
		addrecipeItem(ModItem.ItemFanqie, false, false, new ItemStack(ModItem.ItemFanqiezhi));
		addrecipeItem(ModItem.ItemYumi, false, false, new ItemStack(ModItem.ItemYumizhi));
		addrecipeItem(ModItem.ItemHuanggua, false, false, new ItemStack(ModItem.ItemHuangguazhi));
		//cold
		addrecipeItem(Items.apple, false, true, new ItemStack(ModItem.ItemPingguozhi));
		addrecipeItem(ModItem.ItemPutao, false, true, new ItemStack(ModItem.ItemPutaozhi));
		addrecipeItem(Items.golden_apple, false, true, new ItemStack(ModItem.ItemJinpingguozhi));
		addrecipeItem(ModItem.ItemJinputao, false, true, new ItemStack(ModItem.ItemJinputaozhi));
		addrecipe(new ItemStack(Items.dye,1,15), false, true, new ItemStack(ModItem.ItemXuebi));
		addrecipeItem(Items.dye, false, true, new ItemStack(ModItem.ItemKele));
		addrecipeItem(Items.melon, false, true, new ItemStack(ModItem.ItemXiguazhi));
		
		addrecipeItem(ModItem.ItemLi, false, true, new ItemStack(ModItem.ItemLizizhi));
		addrecipeItem(ModItem.ItemLizhi, false, true, new ItemStack(ModItem.ItemLizhizhi));
		addrecipeItem(ModItem.ItemTaozi, false, true, new ItemStack(ModItem.ItemTaozizhi));
		addrecipeItem(ModItem.ItemJuzi, false, true, new ItemStack(ModItem.ItemJuzizhi));
		addrecipeItem(ModItem.ItemPipa, false, true, new ItemStack(ModItem.ItemPipazhi));
		addrecipeItem(ModItem.ItemMangguo, false, true, new ItemStack(ModItem.ItemMangguozhi));
		addrecipeItem(ModItem.ItemNingmeng, false, true, new ItemStack(ModItem.ItemNingmengzhi));
		addrecipeItem(ModItem.ItemYouzi, false, true, new ItemStack(ModItem.ItemYouzizhi));
		addrecipeItem(ModItem.ItemShizi, false, true, new ItemStack(ModItem.ItemShizizhi));	
		addrecipeItem(ModItem.ItemMugua, false, true, new ItemStack(ModItem.ItemMuguazhi));		
		addrecipeItem(ModItem.ItemShanzha, false, true, new ItemStack(ModItem.ItemShanzhazhi));	
		addrecipeItem(ModItem.ItemShiliu, false, true, new ItemStack(ModItem.ItemShiliuzhi));
		addrecipeItem(ModItem.ItemHongzao, false, true, new ItemStack(ModItem.ItemHongzaozhi));
		addrecipeItem(ModItem.ItemCaomei, false, true, new ItemStack(ModItem.ItemCaomeizhi));
		addrecipeItem(ModItem.ItemYezi, false, true, new ItemStack(ModItem.ItemYezizhi));
		addrecipeItem(ModItem.ItemYingtao, false, true, new ItemStack(ModItem.ItemYingtaozhi));	
		addrecipeItem(ModItem.ItemXiangjiao, false, true, new ItemStack(ModItem.ItemXiangjiaozhi));		
		addrecipeItem(ModItem.ItemYezizhi, true, true, new ItemStack(ModItem.ItemYenai));				
	}
	
	public void addrecipeItem(Item Input ,boolean isMilk ,boolean iscold,ItemStack Output){
		stack1.put(new TpjMaking(new ItemStack(Input), isMilk, iscold), Output);
	}
	
	public void addrecipe(ItemStack Input ,boolean isMilk ,boolean iscold,ItemStack Output){

		stack1.put(new TpjMaking(Input, isMilk, iscold), Output);
	}
	 private boolean GG(TpjMaking ItemStack1, TpjMaking ItemStack2)
	 {
	     return ItemStack2.Item.getItemDamage() == ItemStack1.Item.getItemDamage() &&
	    		 ItemStack2.Item.getItem() == ItemStack1.Item.getItem() &&
	            ItemStack2.isMilk == ItemStack1.isMilk &&
	            ItemStack2.iscold == ItemStack1.iscold
	    		 ;
	 }
	 
	public ItemStack getOutput(ItemStack Input ,boolean isMilk ,boolean iscold){

		TpjMaking fis = new TpjMaking(Input, isMilk, iscold);
		
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
	    while (!GG(fis, (TpjMaking)entry1.getKey()));

	    ItemStack is1 = (ItemStack)entry1.getValue();
	    
	    
	    return is1;	    	    
	    

	}

	public Map<TpjMaking, ItemStack> getSmeltingList() {
		return this.stack1;
	}
	
	
}

