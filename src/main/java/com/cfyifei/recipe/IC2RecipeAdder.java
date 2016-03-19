package com.cfyifei.recipe;

import com.cfyifei.gui.recipes.Nmjrecipe;
import com.cfyifei.gui.recipes.Tpjrecipe;
import com.cfyifei.item.ModItem;
import ic2.api.recipe.RecipeInputItemStack;
import net.minecraft.item.ItemStack;

import java.util.Iterator;
import java.util.Map.Entry;

public class IC2RecipeAdder {

    public IC2RecipeAdder() {
        init();
    }

    public void init() {
        Nmjrecipe nmj = Nmjrecipe.smelting();
        Iterator iterator = nmj.smeltingList.entrySet().iterator();
        Entry entry;
        while (iterator.hasNext()) {
            entry = (Entry) iterator.next();
            ic2.api.recipe.Recipes.macerator.addRecipe(
                    new RecipeInputItemStack((ItemStack) entry.getKey()), null, (ItemStack) entry.getValue());
        }

        Tpjrecipe tpj = Tpjrecipe.smelting();
        tpj.addrecipeItem(ic2.core.Ic2Items.coffeePowder.getItem(), false, false, new ItemStack(ModItem.ItemKafei));
    }
}
