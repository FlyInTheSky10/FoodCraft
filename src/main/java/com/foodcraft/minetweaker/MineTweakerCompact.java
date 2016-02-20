package com.foodcraft.minetweaker;

import minetweaker.MineTweakerAPI;
import minetweaker.api.item.IItemStack;
import minetweaker.api.minecraft.MineTweakerMC;
import net.minecraft.item.ItemStack;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenClass("mods.FoodCraft")
public class MineTweakerCompact {

    /**
     * Add extra recipes to mill.
     * @param input The ingredient
     * @param output The crafting result
     * @param xpAmount The amount of xp point you get after crafting
     */
    @ZenMethod
    public static void addMillRecipe(IItemStack input, IItemStack output, float xpAmount) {
        MineTweakerAPI.apply(new MillRecipeAdder(input, output, xpAmount));
    }

    /**
     * Add extra recipes to pan.
     * @param input The ingredient
     * @param output The crafting result
     * @param xpAmount The amount of xp point you get after crafting
     * @param minHeat The lower bound of required heat value
     * @param maxHeat The upper bound of required heat value
     */
    @ZenMethod
    public static void addPanRecipe(IItemStack input, IItemStack output, float xpAmount, int minHeat, int maxHeat) {
        MineTweakerAPI.apply(new PanRecipeAdder(input, output, xpAmount, minHeat, maxHeat));
    }

    /**
     * Add extra recipes to frying pan.
     * @param input The ingredient
     * @param output The crafting result
     * @param xpAmount The amount of xp point you get after crafting
     */
    @ZenMethod
    public static void addFryingRecipe(IItemStack input, IItemStack output, float xpAmount) {
        MineTweakerAPI.apply(new FryingRecipeAdder(input, output, xpAmount));
    }

    /**
     * Add extra recipes to pressure cooker
     * @param input1 The ingredient1 The 1st input ingredients
     * @param input2 The ingredient2 The 2nd input ingredients
     * @param input3 The ingredient3 The 3rd input ingredients
     * @param output The crafting result
     */
    @ZenMethod
    public static void addPressureCookerRecipe(IItemStack input1, IItemStack input2, IItemStack input3, IItemStack output) {
        MineTweakerAPI.apply(new PressureCookerRecipeAdder(input1, input2, input3, output));
    }

    /**
     * Add extra recipes to pressure cooker
     * @param input1 The ingredient1 The 1st input ingredients
     * @param input2 The ingredient2 The 2nd input ingredients
     * @param input3 The ingredient3 The 3rd input ingredients
     * @param output The crafting result
     */
    @ZenMethod
    public static void addChoppingBoardRecipe(IItemStack input1, IItemStack input2, IItemStack input3, IItemStack output) {
        MineTweakerAPI.apply(new ChoppingRecipeAdder(input1, input2, input3, output));
    }

    /**
     * Add extra recipes to brewing barrel.
     * @param input1 The ingredient1 The 1st input ingredients
     * @param input2 The ingredient2 The 2nd input ingredients
     * @param input3 The ingredient3 The 3rd input ingredients
     * @param output The crafting result
     */
    @ZenMethod
    public static void addBarrelBrewRecipe(IItemStack input1, IItemStack input2, IItemStack input3, IItemStack output) {
        MineTweakerAPI.apply(new BrewingRecipeAdder(input1, input2, input3, output));
    }

    /**
     * Add extra recipes to beverage maker.
     * @param input The ingredient
     * @param output The crafting result
     * @param isMilk The flag to determine whether it's milk or not
     * @param isCold The flag to determine whether it's cold or not
     */
    @ZenMethod
    public static void addBeverageMakerRecipe(IItemStack input, IItemStack output, boolean isMilk, boolean isCold) {
        MineTweakerAPI.apply(new BeverageMakerRecipeAdder(input, output, isMilk, isCold));
    }

    /**
     * Add extra recipes to pot.
     * @param inputStaple The staple ingredients, should not more than 4, or extra stuff will be ignored
     * @param inputVice The vice ingredients, should not more than 8, or extra stuff will be ignored
     * @param output The crafting result
     * @param minHeat The lower bound of required heat value
     * @param maxHeat The upper bound of required heat value
     */
    @ZenMethod
    public static void addPotRecipe(IItemStack[] inputStaple, IItemStack[] inputVice, IItemStack output, int minHeat, int maxHeat) {
        MineTweakerAPI.apply(new PotRecipeAdder(inputStaple, inputVice, output, minHeat, maxHeat));
    }

    /**
     * For convenience.
     * @param aMTStack The IItemStack that will be converted.
     */
    public static ItemStack toStack(IItemStack aMTStack) {
        return MineTweakerMC.getItemStack(aMTStack);
    }

}
