package com.cfyifei.gui.item;

import java.util.List;

import com.cfyifei.gui.blocks.BlockPDG;
import com.cfyifei.gui.blocks.ModGui;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class ItemBlockPDG extends ItemBlock {
	public ItemBlockPDG(Block block) {
		super(block);
	}
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack item, EntityPlayer player, List list, boolean par4) {
		list.add(StatCollector.translateToLocal("gui.UseF.name") + BlockPDG.getFrequencyOfUse(item));
	}
}
