package com.cfyifei.item;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ItemBinggan extends ITemFood {

    public ItemBinggan(int amount, float saturation, boolean isWolfFood,
	    String name) {
	super((int) saturation, saturation, isWolfFood, name);
	this.setHasSubtypes(true);
    }

    String[] s = new String[]{"ItemPutaoBG", "ItemJinputaoBG", "ItemLiBG", "ItemTaoziBG", "ItemJuziBG", "ItemNingmengBG", "ItemCaomeiBG", "ItemYeziBG"};
    IIcon[] ii = new IIcon[8];

    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack p_77636_1_) {
	return p_77636_1_.getItemDamage() == 1;
    }

    @Override
    protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {

	if (par1ItemStack.getItemDamage() == 1) {
	    par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 1200, 1));
	    par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1200, 1));
	    par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 1200, 1));
	}

    }

    @SideOnly(Side.CLIENT)
    public void getSubItems(Item p_150895_1_, CreativeTabs p_150895_2_, List p_150895_3_) {
	p_150895_3_.add(new ItemStack(p_150895_1_, 1, 0));
	p_150895_3_.add(new ItemStack(p_150895_1_, 1, 1));
	p_150895_3_.add(new ItemStack(p_150895_1_, 1, 2));
	p_150895_3_.add(new ItemStack(p_150895_1_, 1, 3));
	p_150895_3_.add(new ItemStack(p_150895_1_, 1, 4));
	p_150895_3_.add(new ItemStack(p_150895_1_, 1, 5));
	p_150895_3_.add(new ItemStack(p_150895_1_, 1, 6));
	p_150895_3_.add(new ItemStack(p_150895_1_, 1, 7));
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister p_94581_1_) {
	for (int i1 = 0; i1 < 8; i1++) {
	    ii[i1] = p_94581_1_.registerIcon("foodcraft:" + s[i1]);
	}
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int int1) {
	return ii[int1];
    }

    public String getUnlocalizedName(ItemStack is1) {
	return s[is1.getItemDamage()];
    }
}
