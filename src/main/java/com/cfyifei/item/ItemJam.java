package com.cfyifei.item;

import java.util.List;







import com.cfyifei.FoodCraft;

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
		this.setCreativeTab(FoodCraft.FcTabShicai);
		this.setUnlocalizedName("ItemGuojiang");
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack) {
		return stack.getItemDamage() == 1;
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs tabs, List list) {
		list.add(new ItemStack(item, 1, 0));
		list.add(new ItemStack(item, 1, 1));
		list.add(new ItemStack(item, 1, 2));
		list.add(new ItemStack(item, 1, 3));
		list.add(new ItemStack(item, 1, 4));
		list.add(new ItemStack(item, 1, 5));
		list.add(new ItemStack(item, 1, 6));
		list.add(new ItemStack(item, 1, 7));
	}
	public String getUnlocalizedName(ItemStack is1) {
		return s[is1.getItemDamage()];
	}
}
