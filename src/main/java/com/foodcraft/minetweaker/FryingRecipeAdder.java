package com.foodcraft.minetweaker;

import com.foodcraft.api.RecipeAdder;
import minetweaker.api.item.IItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FryingRecipeAdder extends AbstractRecipeAdder {

    private Item input;
    private ItemStack output;
    private float xp;

    public FryingRecipeAdder(IItemStack input, IItemStack output, float xpAmount) {
        this.input = MineTweakerCompact.toStack(input).getItem();
        this.output = MineTweakerCompact.toStack(output);
        this.xp = xpAmount;
    }

    @Override
    public void apply() {
        RecipeAdder.addFryingMachineRecipe(input, output, xp);
    }

    @Override
    public String describe() {
        return "Added extra frying machine recipe(s) for Foodcarft.";
    }

}
