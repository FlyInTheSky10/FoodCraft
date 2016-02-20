package com.foodcraft.gui.recipes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.foodcraft.init.FoodcraftItems;
import com.foodcraft.itemstack.FoodcraftItemStack;

public class RecipeChoppingBoard {

    private static final RecipeChoppingBoard recipe = new RecipeChoppingBoard();
    private  Map stack1 = new HashMap();

    public static RecipeChoppingBoard chopping() {
        return recipe;
    }

    private RecipeChoppingBoard() {
        //3 not null
        addrecipe(null ,Items.cooked_chicken,null,new ItemStack(FoodcraftItems.ItemJichi,2));//1个格都是鸡肉 2个鸡翅
        //1,2 not null
        addrecipe(Items.cooked_porkchop ,FoodcraftItems.ItemShucai,null,new ItemStack(FoodcraftItems.ItemJiaozixian,2));
        addrecipe(Items.cooked_chicken ,Items.cooked_chicken ,null,new ItemStack(FoodcraftItems.ItemDajirou,4));//2个格都是鸡肉 4个大鸡肉
        addrecipe(FoodcraftItems.ItemDajirou ,FoodcraftItems.ItemDajirou ,null,new ItemStack(FoodcraftItems.ItemZhongjirou,4));
        addrecipe(FoodcraftItems.ItemZhongjirou ,FoodcraftItems.ItemZhongjirou ,null,new ItemStack(FoodcraftItems.ItemXiaojirou,4));
        //1 not null
        addrecipe(Items.potato ,null,null,new ItemStack(FoodcraftItems.ItemTudoupian,3));
        addrecipe(FoodcraftItems.ItemTudoupian ,null,null,new ItemStack(FoodcraftItems.ItemTudousi,8));
        addrecipe(Items.cooked_chicken ,null,null,new ItemStack(FoodcraftItems.ItemJitui,2));//1个格都是鸡肉 2个鸡腿
        addrecipe(FoodcraftItems.ItemDoufu ,null,null,new ItemStack(FoodcraftItems.ItemDoufusi,3));
        addrecipe(Items.carrot ,null,null,new ItemStack(FoodcraftItems.ItemLuobosi,3));
        addrecipe(FoodcraftItems.ItemMianpi ,null,null,new ItemStack(FoodcraftItems.ItemMianfensi,3));
        addrecipe(FoodcraftItems.ItemShuyouyurou ,null,null,new ItemStack(FoodcraftItems.ItemYouyusi,3));
        addrecipe(FoodcraftItems.ItemBailuobo ,null,null,new ItemStack(FoodcraftItems.ItemBailuobosi,3));
    }

    public void addrecipe(Item Input1 ,Item Input2 ,Item Input3 ,ItemStack Output) {
        Item[] Items = {Input1,Input2,Input3};
        stack1.put(new FoodcraftItemStack(Items), Output);
    }
    private boolean isItemStackEqual(FoodcraftItemStack ItemStack1, FoodcraftItemStack ItemStack2) {
        return ItemStack2.getItems()[0] == ItemStack1.getItems()[0] &&
               ItemStack2.getItems()[1] == ItemStack1.getItems()[1] &&
               ItemStack2.getItems()[2] == ItemStack1.getItems()[2];
    }

    public ItemStack getOutput(Item Input1,Item Input2,Item Input3) {
        Item[] Items = {Input1,Input2,Input3};
        FoodcraftItemStack fis = new FoodcraftItemStack(Items);
        Iterator iterator1 = stack1.entrySet().iterator();
        Entry entry1;
        do {
            if (!iterator1.hasNext()) {
                return null;
            }
            entry1 = (Entry)iterator1.next();
        } while (!isItemStackEqual(fis, (FoodcraftItemStack)entry1.getKey()));
        ItemStack is1 = (ItemStack)entry1.getValue();
        return is1;
    }

    public Map<FoodcraftItemStack, ItemStack> getSmeltingList() {
        return this.stack1;
    }
}
