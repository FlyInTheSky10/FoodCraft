package com.foodcraft.minetweaker;

import com.foodcraft.api.RecipeAdder;
import minetweaker.api.item.IItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BrewingRecipeAdder extends AbstractRecipeAdder {

    private Item input1, input2, input3;
    private ItemStack output;

    public BrewingRecipeAdder(IItemStack input1, IItemStack input2, IItemStack input3, IItemStack output) {
        this.input1 = MineTweakerCompact.toStack(input1).getItem();
        this.input2 = MineTweakerCompact.toStack(input2).getItem();
        this.input3 = MineTweakerCompact.toStack(input3).getItem();
        this.output = MineTweakerCompact.toStack(output);
    }

    @Override
    public void apply() {
        RecipeAdder.addBrewBarrelRecipe(input1, input2, input3, output);
    }

    @Override
    public String describe() {
        return "Add extra barrel brewing recipe(s) for Foodcraft.";
    }

}
