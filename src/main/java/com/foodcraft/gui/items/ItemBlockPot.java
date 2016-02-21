package com.foodcraft.gui.items;

import java.util.List;










import com.foodcraft.gui.blocks.BlockPot;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBlockPot extends ItemBlock {
	public ItemBlockPot(Block block) {
		super(block);
	}
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack item, EntityPlayer player, List list, boolean par4) {
		list.add(StatCollector.translateToLocal("gui.UseF.name") + BlockPot.getFrequencyOfUse(item));
	}
}
