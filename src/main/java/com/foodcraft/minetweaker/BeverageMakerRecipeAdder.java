package com.foodcraft.minetweaker;

import com.foodcraft.api.RecipeAdder;
import minetweaker.api.item.IItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BeverageMakerRecipeAdder extends AbstractRecipeAdder {

    private Item input;
    private ItemStack output;
    private boolean isMilk, isCold;

    public BeverageMakerRecipeAdder(IItemStack input, IItemStack output, boolean isMilk, boolean isCold) {
        this.input = MineTweakerCompact.toStack(input).getItem();
        this.output = MineTweakerCompact.toStack(output);
        this.isMilk = isMilk;
        this.isCold = isCold;
    }

    @Override
    public void apply() {
        RecipeAdder.addBeverageMakingMachineRecipe(input, isMilk, isCold, output);
    }

    @Override
    public String describe() {
        return "Add extra beverage maker recipe(s) for Foodcraft.";
    }

}
