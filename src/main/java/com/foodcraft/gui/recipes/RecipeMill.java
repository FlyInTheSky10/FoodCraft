package com.foodcraft.gui.recipes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.foodcraft.init.FoodcraftItems;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;



public class RecipeMill {

    private static final RecipeMill smeltingBase = new RecipeMill();
    private Map smeltingList = new HashMap();
    private Map experienceList = new HashMap();

    public static RecipeMill smelting() {
        return smeltingBase;
    }

    private RecipeMill() {
        this.itemregister(FoodcraftItems.ItemDami, new ItemStack(FoodcraftItems.Itemfan), 0.7F);
        this.itemregister(Items.wheat, new ItemStack(FoodcraftItems.ItemMianfen , 2), 0.5F);
        this.itemregister(FoodcraftItems.ItemHuashen, new ItemStack(FoodcraftItems.ItemHuashenyou), 0.5F);
        this.itemregister(FoodcraftItems.ItemDouzi, new ItemStack(FoodcraftItems.ItemDoujiang), 0.5F);
        this.itemregister(Items.potato, new ItemStack(FoodcraftItems.ItemDianfen,8), 0.5F);
        this.register(new ItemStack(Items.dye,1,3), new ItemStack(FoodcraftItems.ItemQiaokelifen), 0.5F);
        this.itemregister(FoodcraftItems.ItemNuomi,  new ItemStack(FoodcraftItems.ItemNuomifen,3), 0.5F);
        this.itemregister(FoodcraftItems.ItemHongdou,  new ItemStack(FoodcraftItems.ItemDousha,2), 0.5F);
    }



    public void blockregister(Block Block, ItemStack ItemStack, float xp) {
        this.itemregister(Item.getItemFromBlock(Block), ItemStack, xp);
    }

    public void itemregister(Item Item, ItemStack ItemStack, float xp) {
        this.register(new ItemStack(Item, 1, 32767), ItemStack, xp);
    }

    public void register(ItemStack ItemStack, ItemStack ItemStack2, float xp) {
        this.smeltingList.put(ItemStack, ItemStack2);
        this.experienceList.put(ItemStack2, Float.valueOf(xp));
    }


    private boolean func_151397_a(ItemStack p_151397_1_, ItemStack p_151397_2_) {
        return p_151397_2_.getItem() == p_151397_1_.getItem() && (p_151397_2_.getItemDamage() == 32767 || p_151397_2_.getItemDamage() == p_151397_1_.getItemDamage());
    }

    public ItemStack getSmeltingResult(ItemStack itemStack) {
        Iterator iterator = this.smeltingList.entrySet().iterator();
        Entry entry;

        do {
            if (!iterator.hasNext()) {
                return null;
            }
            entry = (Entry)iterator.next();
        } while (!this.func_151397_a(itemStack, (ItemStack)entry.getKey()));
        return (ItemStack)entry.getValue();
    }

    public Map<ItemStack, ItemStack> getSmeltingList() {
        return this.smeltingList;
    }
}
