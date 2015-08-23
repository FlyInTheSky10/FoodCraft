package com.cfyifei.gui.recipes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.cfyifei.item.FoodcraftItems;
import com.cfyifei.itemstack.CookingOutput;
import com.cfyifei.itemstack.GuoCooking;

public class RecipePot {
	
	private static final RecipePot smeltingBase = new RecipePot();
	public  Map<GuoCooking, CookingOutput> stack1 = new HashMap();
    
	public static RecipePot smelting() {
        return smeltingBase;
    }
	 
	private RecipePot(){
		addrecipeItem(Items.egg, FoodcraftItems.ItemFanqie, FoodcraftItems.ItemBaifan, FoodcraftItems.ItemNull,FoodcraftItems.ItemHuashenyou, FoodcraftItems.ItemYan, Items.sugar, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemFanqiechaojidanfan), 400, 500);
		addrecipeItem(FoodcraftItems.ItemTudousi, FoodcraftItems.ItemCong, FoodcraftItems.ItemBaifan, FoodcraftItems.ItemNull,FoodcraftItems.ItemHuashenyou, FoodcraftItems.ItemYan, FoodcraftItems.ItemJiangyou, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemChaotudousifan), 450, 500);
		addrecipeItem(Items.cooked_fish, FoodcraftItems.ItemLajiao, FoodcraftItems.ItemBaifan, FoodcraftItems.ItemNull,FoodcraftItems.ItemHuashenyou, FoodcraftItems.ItemYan, FoodcraftItems.ItemJiangyou, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemDuojiaoyutou),350,450);
		addrecipeItem(FoodcraftItems.ItemDoufu, FoodcraftItems.ItemDouban, FoodcraftItems.ItemBaifan, FoodcraftItems.ItemNull,FoodcraftItems.ItemHuashenyou, FoodcraftItems.ItemYan, FoodcraftItems.ItemDianfen, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemMapodoufufan), 400, 500);
		addrecipeItem(FoodcraftItems.ItemQingjiao, Items.potato, FoodcraftItems.ItemQiezi, FoodcraftItems.ItemBaifan,FoodcraftItems.ItemHuashenyou, FoodcraftItems.ItemYan, Items.sugar, FoodcraftItems.ItemJiangyou, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemDisanxian), 450, 500);
		addrecipeItem(Items.cooked_porkchop, FoodcraftItems.ItemLajiao, Items.carrot, FoodcraftItems.ItemBaifan,FoodcraftItems.ItemHuashenyou, FoodcraftItems.ItemYan, Items.sugar, FoodcraftItems.ItemCu, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemYuxiangrousi),350,450);
		addrecipeItem(Items.cooked_chicken, FoodcraftItems.ItemHuashen, FoodcraftItems.ItemLajiao, FoodcraftItems.ItemBaifan,FoodcraftItems.ItemHuashenyou, FoodcraftItems.ItemYan, Items.sugar, FoodcraftItems.ItemCu, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemGongbaojiding), 400, 500);
		addrecipeItem(Items.cooked_porkchop, FoodcraftItems.ItemBaifan, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull,FoodcraftItems.ItemHuashenyou, FoodcraftItems.ItemYan, Items.sugar, FoodcraftItems.ItemJiangyou, FoodcraftItems.ItemCu, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemHongshaoroufan), 450, 500);
		addrecipeItem(Items.cooked_porkchop, FoodcraftItems.ItemLajiao, FoodcraftItems.ItemBaifan, FoodcraftItems.ItemNull,FoodcraftItems.ItemHuashenyou, FoodcraftItems.ItemYan, Items.sugar, FoodcraftItems.ItemDouban, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemHuiguoroufan),350,450);
		addrecipeItem(FoodcraftItems.ItemNuomituan, FoodcraftItems.ItemHuashentangyuanxian, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull,FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemTangyuan), 400, 500);
		addrecipeItem(FoodcraftItems.ItemNuomituan, FoodcraftItems.ItemDousha, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull,FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemTangyuan), 400, 500);
		addrecipeItem(Items.cooked_chicken, FoodcraftItems.ItemCong, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull,Items.sugar, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemBaiqiuji), 450, 500);
		addrecipeItem(Items.cooked_chicken, FoodcraftItems.ItemLajiao, FoodcraftItems.ItemCong, FoodcraftItems.ItemNull,FoodcraftItems.ItemHuashenyou, FoodcraftItems.ItemYan, Items.sugar, FoodcraftItems.ItemDouban, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemKoushuiji), 450, 500);
		addrecipeItem(Items.cooked_chicken, FoodcraftItems.ItemLajiao, FoodcraftItems.ItemHuashen, FoodcraftItems.ItemNull,FoodcraftItems.ItemHuashenyou, FoodcraftItems.ItemYan, Items.sugar, FoodcraftItems.ItemJiangyou, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemLaziji),350,450);
		addrecipeItem(Items.cooked_chicken, FoodcraftItems.ItemQingjiao, FoodcraftItems.ItemShucai, FoodcraftItems.ItemNull,FoodcraftItems.ItemHuashenyou, FoodcraftItems.ItemYan, FoodcraftItems.ItemJiangyou, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemCongyouji), 400, 500);
		addrecipeItem(FoodcraftItems.ItemJichi, FoodcraftItems.ItemKele, FoodcraftItems.ItemBaifan, FoodcraftItems.ItemNull,FoodcraftItems.ItemHuashenyou, FoodcraftItems.ItemYan, FoodcraftItems.ItemJiangyou, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemKelejichifan), 450, 500);
		addrecipeItem(Items.cooked_fish, FoodcraftItems.ItemLajiao, FoodcraftItems.ItemCong, FoodcraftItems.ItemNull,FoodcraftItems.ItemHuashenyou, FoodcraftItems.ItemYan, FoodcraftItems.ItemJiangyou, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemMalayu),350,450);
		addrecipeItem(Items.cooked_fish, FoodcraftItems.ItemLajiao, FoodcraftItems.ItemCong, FoodcraftItems.ItemShucai,FoodcraftItems.ItemHuashenyou, FoodcraftItems.ItemYan, FoodcraftItems.ItemJiangyou, FoodcraftItems.ItemDianfen, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemSuancaiyu), 450, 500);
		addrecipeItem(Items.cooked_chicken, FoodcraftItems.ItemGalikuai, Items.potato, FoodcraftItems.ItemBaifan,FoodcraftItems.ItemHuashenyou, FoodcraftItems.ItemYan, FoodcraftItems.ItemJiangyou, FoodcraftItems.ItemDianfen, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemGalijiroufan), 400, 500);
		addrecipeItem(Items.cooked_beef, FoodcraftItems.ItemLajiao, FoodcraftItems.ItemShucai, FoodcraftItems.ItemNull,FoodcraftItems.ItemHuashenyou, FoodcraftItems.ItemYan, FoodcraftItems.ItemDianfen, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemShuizhuniurou),350,450);
		addrecipeItem(Items.egg, FoodcraftItems.ItemCong, FoodcraftItems.ItemLajiao, FoodcraftItems.ItemBaifan,FoodcraftItems.ItemHuashenyou, FoodcraftItems.ItemYan, FoodcraftItems.ItemJiangyou, FoodcraftItems.ItemDianfen, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, FoodcraftItems.ItemNull, new ItemStack(FoodcraftItems.ItemRibendoufu),350,450);
	}
	
	public void addrecipeItem(Item StapleInput1,Item StapleInput2,Item StapleInput3,
			Item StapleInput4,Item ingredients1,Item ingredients2,Item ingredients3
			,Item ingredients4,Item ingredients5,Item ingredients6,Item ingredients7
			,Item ingredients8,ItemStack Output, int min, int max) {
		stack1.put(new GuoCooking(StapleInput1, StapleInput2, StapleInput3, StapleInput4, ingredients1, 
				ingredients2, ingredients3, ingredients4, ingredients5, ingredients6, ingredients7, ingredients8), new CookingOutput(Output,min,max));		
	}

	 private boolean GG(GuoCooking ItemStack1, GuoCooking ItemStack2) {
		return 
ItemStack1.StapleInput1 == ItemStack2.StapleInput1 && ItemStack1.StapleInput2 == ItemStack2.StapleInput2 &&
ItemStack1.StapleInput3 == ItemStack2.StapleInput3 && ItemStack1.StapleInput4 == ItemStack2.StapleInput4 &&
ItemStack1.ingredients1 == ItemStack2.ingredients1 && ItemStack1.ingredients2 == ItemStack2.ingredients2 &&
ItemStack1.ingredients3 == ItemStack2.ingredients3 && ItemStack1.ingredients4 == ItemStack2.ingredients4 &&
ItemStack1.ingredients5 == ItemStack2.ingredients5 && ItemStack1.ingredients6 == ItemStack2.ingredients6 &&
ItemStack1.ingredients7 == ItemStack2.ingredients7 && ItemStack1.ingredients8 == ItemStack2.ingredients8;
	 } 
		public Item IStapleInput1;
		public Item IStapleInput2;
		public Item IStapleInput3;
		public Item IStapleInput4;
		public Item Iingredients1;
		public Item Iingredients2;
		public Item Iingredients3;
		public Item Iingredients4;
		public Item Iingredients5;
		public Item Iingredients6;
		public Item Iingredients7;
		public Item Iingredients8;
		
	public CookingOutput getOutput(ItemStack StapleInput1,ItemStack StapleInput2,ItemStack StapleInput3,
			ItemStack StapleInput4,ItemStack ingredients1,ItemStack ingredients2,ItemStack ingredients3
			,ItemStack ingredients4,ItemStack ingredients5,ItemStack ingredients6,ItemStack ingredients7
			,ItemStack ingredients8
		) {
		if(ingredients1 != null){Iingredients1 = ingredients1.getItem();}else{Iingredients1 = FoodcraftItems.ItemNull;}
		if(ingredients2 != null){Iingredients2 = ingredients2.getItem();}else{Iingredients2 = FoodcraftItems.ItemNull;}
		if(ingredients3 != null){Iingredients3 = ingredients3.getItem();}else{Iingredients3 = FoodcraftItems.ItemNull;}
		if(ingredients4 != null){Iingredients4 = ingredients4.getItem();}else{Iingredients4 = FoodcraftItems.ItemNull;}
		if(ingredients5 != null){Iingredients5 = ingredients5.getItem();}else{Iingredients5 = FoodcraftItems.ItemNull;}
		if(ingredients6 != null){Iingredients6 = ingredients6.getItem();}else{Iingredients6 = FoodcraftItems.ItemNull;}
		if(ingredients7 != null){Iingredients7 = ingredients7.getItem();}else{Iingredients7 = FoodcraftItems.ItemNull;}
		if(ingredients8 != null){Iingredients8 = ingredients8.getItem();}else{Iingredients8 = FoodcraftItems.ItemNull;}
		if(StapleInput1 != null){IStapleInput1 = StapleInput1.getItem();}else{IStapleInput1 = FoodcraftItems.ItemNull;}
		if(StapleInput2 != null){IStapleInput2 = StapleInput2.getItem();}else{IStapleInput2 = FoodcraftItems.ItemNull;}
		if(StapleInput3 != null){IStapleInput3 = StapleInput3.getItem();}else{IStapleInput3 = FoodcraftItems.ItemNull;}
		if(StapleInput4 != null){IStapleInput4 = StapleInput4.getItem();}else{IStapleInput4 = FoodcraftItems.ItemNull;}
		GuoCooking fis = new GuoCooking(IStapleInput1, IStapleInput2, IStapleInput3, IStapleInput4, Iingredients1, 
					Iingredients2, Iingredients3, Iingredients4, Iingredients5, Iingredients6, Iingredients7, Iingredients8);
		Iterator iterator1 = stack1.entrySet().iterator();
	    Entry entry1;	
	    do {
	        if (!iterator1.hasNext()) {
	            return null;
	        }
	        entry1 = (Entry)iterator1.next();
	    }
	    while (!GG(fis, (GuoCooking)entry1.getKey()));
	    CookingOutput is1 = (CookingOutput)entry1.getValue();  
	    return is1;	    	    
	}

	public Map<GuoCooking, CookingOutput> getSmeltingList() {
		return this.stack1;
	}
}
