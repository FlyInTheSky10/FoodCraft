package com.foodcraft.minetweaker;

import com.foodcraft.api.RecipeAdder;
import minetweaker.api.item.IItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PanRecipeAdder extends AbstractRecipeAdder {

    private Item input;
    private ItemStack output;
    private float xp;
    private int minHeat, maxHeat;

    public PanRecipeAdder(IItemStack input, IItemStack output, float xpAmount, int minHeat, int maxHeat) {
        this.input = MineTweakerCompact.toStack(input).getItem();
        this.output = MineTweakerCompact.toStack(output);
        this.xp = xpAmount;
        this.minHeat = minHeat;
        this.maxHeat = maxHeat;
    }

    @Override
    public void apply() {
        RecipeAdder.addPanRecipe(input, output, xp, minHeat, maxHeat);
    }

    @Override
    public String describe() {
        return "Added extra pan recipe(s) for Foodcraft.";
    }

}
