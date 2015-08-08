package com.cfyifei.gui.item;

import java.util.List;

import com.cfyifei.gui.blocks.BlockGuo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class ItemBlockGuo extends ItemBlock {

    public ItemBlockGuo(Block block) {
	super(block);
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack item, EntityPlayer player, List list, boolean par4) {
	list.add(StatCollector.translateToLocal("gui.UseF.name") + BlockGuo.getFrequencyOfUse(item));
    }
}
