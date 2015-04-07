package com.cfyifei;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;


public class FcTab extends CreativeTabs{
	
	public FcTab() {
		super("FoodCraft");
		// TODO 自动生成的构造函数存根
	}

@Override
	public Item getTabIconItem() {
		return Items.bed;
	}
	}
