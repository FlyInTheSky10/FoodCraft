package com.cfyifei.gui.item;

import com.cfyifei.gui.blocks.BlockPDG;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

import java.util.List;

public class ItemBlockPDG extends ItemBlock {
    public ItemBlockPDG(Block block) {
        super(block);
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack item, EntityPlayer player, List list, boolean par4) {
        list.add(StatCollector.translateToLocal("gui.UseF.name") + BlockPDG.getFrequencyOfUse(item));
    }
}
