package com.cfyifei.gui.recipes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.cfyifei.item.ModItem;
import com.cfyifei.itemstack.CookingOutput;
import com.cfyifei.itemstack.FoodcraftItemStack;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Gygrecipe {

    private static final Gygrecipe smeltingBase = new Gygrecipe();
    public Map<FoodcraftItemStack, ItemStack> stack1 = new HashMap();

    public static Gygrecipe smelting() {
	return smeltingBase;
    }

    private Gygrecipe() {
	addrecipe(ModItem.Itemfan, ModItem.Itemfan, ModItem.Itemfan, new ItemStack(ModItem.ItemBaifan));
	addrecipe(ModItem.ItemBaifan, ModItem.ItemBaifan, ModItem.ItemBaifan, new ItemStack(ModItem.ItemXifan, 3));
	addrecipe(Items.egg, ModItem.ItemJiangyou, ModItem.ItemCong, new ItemStack(ModItem.ItemDangeng));
	addrecipe(Item.getItemFromBlock(Blocks.brown_mushroom), ModItem.ItemJitui, ModItem.ItemYan, new ItemStack(ModItem.ItemMogudunjitang));
	addrecipe(Items.cooked_fished, ModItem.ItemCong, ModItem.ItemCong, new ItemStack(ModItem.ItemQingzhenyu));
	addrecipe(ModItem.ItemBaifan, Items.egg, Items.cooked_porkchop, new ItemStack(ModItem.ItemPidanshourouzhou));
    }

    public void addrecipe(Item Input1, Item Input2, Item Input3, ItemStack Output) {
	Item[] Items = {Input1, Input2, Input3};
	stack1.put(new FoodcraftItemStack(Items), Output);
    }

    private boolean GG(FoodcraftItemStack ItemStack1, FoodcraftItemStack ItemStack2) {
	return ItemStack2.Stack[0] == ItemStack1.Stack[0]
		&& ItemStack2.Stack[1] == ItemStack1.Stack[1]
		&& ItemStack2.Stack[2] == ItemStack1.Stack[2];
    }

    public ItemStack getOutput(Item Input1, Item Input2, Item Input3) {
	Item[] Items = {Input1, Input2, Input3};
	FoodcraftItemStack fis = new FoodcraftItemStack(Items);

	Iterator iterator1 = stack1.entrySet().iterator();
	Entry entry1;

	do {
	    if (!iterator1.hasNext()) {
		return null;
	    }

	    entry1 = (Entry) iterator1.next();
	} while (!GG(fis, (FoodcraftItemStack) entry1.getKey()));

	ItemStack is1 = (ItemStack) entry1.getValue();

	return is1;

    }

    public Map<FoodcraftItemStack, ItemStack> getSmeltingList() {
	return this.stack1;
    }

}
