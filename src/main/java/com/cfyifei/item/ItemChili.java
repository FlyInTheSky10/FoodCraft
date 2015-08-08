package com.cfyifei.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemChili extends ITemFood {

    public ItemChili() {
	super(3, 1F, false, "ItemLajiao");
    }

    protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {

	par3EntityPlayer.setFire(3);
    }

}
