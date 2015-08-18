package com.cfyifei.itemstack;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GuoCooking {

	public Item StapleInput1,StapleInput2,StapleInput3,
	StapleInput4,ingredients1,ingredients2,ingredients3
	,ingredients4,ingredients5,ingredients6,ingredients7
	,ingredients8;
	
	public GuoCooking(Item StapleInput1,Item StapleInput2,Item StapleInput3,
			Item StapleInput4,Item ingredients1,Item ingredients2,Item ingredients3
			,Item ingredients4,Item ingredients5,Item ingredients6,Item ingredients7
			,Item ingredients8
			) {
		this.StapleInput1 = StapleInput1;
     	this.StapleInput2 = StapleInput2;
		this.StapleInput3 = StapleInput3;
		this.StapleInput4 = StapleInput4;
		
		this.ingredients1 = ingredients1;
     	this.ingredients2 = ingredients2;
		this.ingredients3 = ingredients3;
		this.ingredients4 = ingredients4;
		this.ingredients5 = ingredients5;
		this.ingredients6 = ingredients6;
		this.ingredients7 = ingredients7;
		this.ingredients8 = ingredients8;
	}
}
