package com.cfyifei.item;

import java.util.List;






import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemJam extends Item{
	
	String[] s = new String[]{"ItemPutaoGJ","ItemJinputaoGJ","ItemLiGJ","ItemTaoziGJ","ItemJuziGJ","ItemNingmengGJ","ItemCaomeiGJ","ItemYeziGJ"};
	
	public ItemJam() {
		this.setHasSubtypes(true);
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack p_77636_1_) {
		return p_77636_1_.getItemDamage() == 1;
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
	public String getUnlocalizedName(ItemStack is1) {
		return s[is1.getItemDamage()];
	}
}
