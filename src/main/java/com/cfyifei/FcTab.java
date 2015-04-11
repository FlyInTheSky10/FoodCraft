package com.cfyifei;

import com.cfyifei.item.ModItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class FcTab extends CreativeTabs{
	
	public FcTab() {
		super("FoodCraft");
	}

@Override
	public Item getTabIconItem() {
		return ModItem.ItemChaotudousifan;
	}
	}
