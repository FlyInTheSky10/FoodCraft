package com.cfyifei.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockCake;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockDangao extends BlockCake {
    String[] s = new String[]{"BlockPutaoDG", "BlockJinputaoDG", "BlockLiDG", "BlockTaoziDG", "BlockJuziDG", "BlockNingmengDG", "BlockCaomeiDG", "BlockYeziDG"};
    private IIcon field_150039_M;
    private IIcon field_150038_a;
    private IIcon field_150037_b;

    public BlockDangao() {
        this.disableStats();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_) {
        return Item.getItemFromBlock(this);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister p_149651_1_) {
        this.blockIcon = p_149651_1_.registerIcon(this.getTextureName() + "_side");
        this.field_150039_M = p_149651_1_.registerIcon("cake_inner");
        this.field_150038_a = p_149651_1_.registerIcon(this.getTextureName() + "_top");
        this.field_150037_b = p_149651_1_.registerIcon("cake_bottom");
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
        return p_149691_1_ == 1 ? this.field_150038_a : (p_149691_1_ == 0 ? this.field_150037_b : (p_149691_2_ > 0 && p_149691_1_ == 4 ? this.field_150039_M : this.blockIcon));
    }
}
