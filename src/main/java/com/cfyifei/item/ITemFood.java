package com.cfyifei.item;

import net.minecraft.item.ItemFood;

public class ITemFood extends ItemFood{


		public ITemFood(int amount, float saturation, boolean isWolfFood, String name) {
			super(amount, saturation, isWolfFood);
			this.setUnlocalizedName(name);

		}
	}

