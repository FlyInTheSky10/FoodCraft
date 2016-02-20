package com.foodcraft.minetweaker;

import com.foodcraft.api.RecipeAdder;
import minetweaker.api.item.IItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PotRecipeAdder extends AbstractRecipeAdder {

    private Item staple1, staple2, staple3, staple4;
    private Item ingre1, ingre2, ingre3, ingre4, ingre5, ingre6, ingre7, ingre8;
    private ItemStack output;
    private int minHeat, maxHeat;

    public PotRecipeAdder(IItemStack[] staples, IItemStack[] ingredients, IItemStack output, int minHeat, int maxHeat) {
        this.staple1 = MineTweakerCompact.toStack(staples[0]).getItem();
        this.staple2 = MineTweakerCompact.toStack(staples[1]).getItem();
        this.staple3 = MineTweakerCompact.toStack(staples[2]).getItem();
        this.staple4 = MineTweakerCompact.toStack(staples[3]).getItem();
        this.ingre1 = MineTweakerCompact.toStack(ingredients[0]).getItem();
        this.ingre2 = MineTweakerCompact.toStack(ingredients[1]).getItem();
        this.ingre3 = MineTweakerCompact.toStack(ingredients[2]).getItem();
        this.ingre4 = MineTweakerCompact.toStack(ingredients[3]).getItem();
        this.ingre5 = MineTweakerCompact.toStack(ingredients[4]).getItem();
        this.ingre6 = MineTweakerCompact.toStack(ingredients[5]).getItem();
        this.ingre7 = MineTweakerCompact.toStack(ingredients[6]).getItem();
        this.ingre8 = MineTweakerCompact.toStack(ingredients[7]).getItem();
        this.output = MineTweakerCompact.toStack(output);
        this.minHeat = minHeat;
        this.maxHeat = maxHeat;
    }

    @Override
    public void apply() {
        RecipeAdder.addPotRecipe(staple1, staple2, staple3, staple4, ingre1, ingre2, ingre3, ingre4, ingre5, ingre6, ingre7, ingre8, output, minHeat, maxHeat);
    }

    @Override
    public String describe() {
        return "Add extra pot recipe(s) for Foodcraft";
    }

}
