package com.cfyifei.gui.recipes;

import com.cfyifei.item.ModItem;
import com.cfyifei.itemstack.CookingOutput;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class PDGrecipe {
    private static final PDGrecipe smeltingBase = new PDGrecipe();
    private Map<ItemStack, CookingOutput> smeltingList = new HashMap();
    private Map experienceList = new HashMap();

    private PDGrecipe() {
        this.itemregister(Items.egg, new ItemStack(ModItem.ItemJianjidan), 0.5F, 250, 400);
        this.itemregister(ModItem.ItemMianfen, new ItemStack(ModItem.ItemLaobing), 0.5F, 250, 350);
        this.itemregister(ModItem.ItemJiaozi, new ItemStack(ModItem.ItemJianjiao), 0.5F, 350, 400);
        this.itemregister(ModItem.ItemTudoupian, new ItemStack(ModItem.ItemChaotudoupian), 0.5F, 225, 325);
        this.itemregister(ModItem.ItemMianfensi, new ItemStack(ModItem.ItemMahua), 0.5F, 300, 380);
        this.itemregister(ModItem.ItemYumi, new ItemStack(ModItem.ItemBaoyumihua), 0.5F, 250, 330);
    }

    public static PDGrecipe smelting() {
        return smeltingBase;
    }

    public void blockregister(Block Block, ItemStack ItemStack, float xp, int min, int max) {
        this.itemregister(Item.getItemFromBlock(Block), ItemStack, xp, min, max);
    }

    public void itemregister(Item Item, ItemStack ItemStack, float xp, int min, int max) {
        this.register(new ItemStack(Item, 1, 32767), ItemStack, xp, min, max);
    }

    public void register(ItemStack ItemStack, ItemStack ItemStack2, float xp, int min, int max) {
        this.smeltingList.put(ItemStack, new CookingOutput(ItemStack2, min, max));
        this.experienceList.put(ItemStack2, Float.valueOf(xp));
    }


    private boolean func_151397_a(ItemStack p_151397_1_, ItemStack p_151397_2_) {
        return p_151397_2_.getItem() == p_151397_1_.getItem() && (p_151397_2_.getMetadata() == 32767 || p_151397_2_.getMetadata() == p_151397_1_.getMetadata());
    }

    public CookingOutput getSmeltingResult(ItemStack itemStack) {
        Iterator iterator = this.smeltingList.entrySet().iterator();
        Entry entry;

        do {
            if (!iterator.hasNext()) {
                return null;
            }

            entry = (Entry) iterator.next();
        }
        while (!this.func_151397_a(itemStack, (ItemStack) entry.getKey()));

        return (CookingOutput) entry.getValue();
    }

    public Map<ItemStack, CookingOutput> getSmeltingList() {
        return this.smeltingList;
    }
}
