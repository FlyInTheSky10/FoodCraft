package com.foodcraft.minetweaker;

import com.foodcraft.api.RecipeAdder;
import minetweaker.IUndoableAction;
import minetweaker.MineTweakerAPI;
import minetweaker.api.item.IItemStack;
import minetweaker.api.minecraft.MineTweakerMC;
import net.minecraft.item.Item;
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

    public abstract static class AbstractRecipeAdder implements IUndoableAction {

        @Override
        public boolean canUndo() {
            return false;
        }

        @Override
        public String describeUndo() {
            return null;
        }

        @Override
        public Object getOverrideKey() {
            return null;
        }

        @Override
        public void undo() {

        }
    }

    public static class MillRecipeAdder extends AbstractRecipeAdder {

        private Item input;
        private ItemStack output;
        private float xp;

        public MillRecipeAdder(IItemStack input, IItemStack output, float xpAmount) {
            this.input = toStack(input).getItem();
            this.output = toStack(output);
            this.xp = xpAmount;
        }

        @Override
        public void apply() {
            RecipeAdder.AddMillRecipe(input, output, xp);
        }

        @Override
        public String describe() {
            return "Add extra mill recipe(s) for Foodcraft.";
        }

    }

    public static class PanRecipeAdder extends AbstractRecipeAdder {

        private Item input;
        private ItemStack output;
        private float xp;
        private int minHeat, maxHeat;

        public PanRecipeAdder(IItemStack input, IItemStack output, float xpAmount, int minHeat, int maxHeat) {
            this.input = toStack(input).getItem();
            this.output = toStack(output);
            this.xp = xpAmount;
            this.minHeat = minHeat;
            this.maxHeat = maxHeat;
        }

        @Override
        public void apply() {
            RecipeAdder.AddPanRecipe(input, output, xp, minHeat, maxHeat);
        }

        @Override
        public String describe() {
            return "Added extra pan recipe(s) for Foodcraft.";
        }

    }

    public static class FryingRecipeAdder extends AbstractRecipeAdder {

        private Item input;
        private ItemStack output;
        private float xp;

        public FryingRecipeAdder(IItemStack input, IItemStack output, float xpAmount) {
            this.input = toStack(input).getItem();
            this.output = toStack(output);
            this.xp = xpAmount;
        }

        @Override
        public void apply() {
            RecipeAdder.AddFryingMachineRecipe(input, output, xp);
        }

        @Override
        public String describe() {
            return "Added extra frying machine recipe(s) for Foodcarft.";
        }

    }

    public static class PressureCookerRecipeAdder extends AbstractRecipeAdder {

        private Item input1, input2, input3;
        private ItemStack output;

        public PressureCookerRecipeAdder (IItemStack input1, IItemStack input2, IItemStack input3, IItemStack output) {
            this.input1 = toStack(input1).getItem();
            this.input2 = toStack(input2).getItem();
            this.input3 = toStack(input3).getItem();
            this.output = toStack(output);
        }

        @Override
        public void apply() {
            RecipeAdder.AddPressureCookerRecipe(input1, input2, input3, output);
        }

        @Override
        public String describe() {
            return "Add extra pressure cooker recipe(s) for Foodcraft.";
        }

    }

    public static class ChoppingRecipeAdder extends AbstractRecipeAdder {

        private Item input1, input2, input3;
        private ItemStack output;

        public ChoppingRecipeAdder (IItemStack input1, IItemStack input2, IItemStack input3, IItemStack output) {
            this.input1 = toStack(input1).getItem();
            this.input2 = toStack(input2).getItem();
            this.input3 = toStack(input3).getItem();
            this.output = toStack(output);
        }

        @Override
        public void apply() {
            RecipeAdder.AddChoppingBoardRecipe(input1, input2, input3, output);
        }

        @Override
        public String describe() {
            return "Add extra chopping board recipe(s) for Foodcraft.";
        }

    }

    public static class BrewingRecipeAdder extends AbstractRecipeAdder {

        private Item input1, input2, input3;
        private ItemStack output;

        public BrewingRecipeAdder (IItemStack input1, IItemStack input2, IItemStack input3, IItemStack output) {
            this.input1 = toStack(input1).getItem();
            this.input2 = toStack(input2).getItem();
            this.input3 = toStack(input3).getItem();
            this.output = toStack(output);
        }

        @Override
        public void apply() {
            RecipeAdder.AddBrewBarrelRecipe(input1, input2, input3, output);
        }

        @Override
        public String describe() {
            return "Add extra barrel brewing recipe(s) for Foodcraft.";
        }

    }

    public static class BeverageMakerRecipeAdder extends AbstractRecipeAdder {

        private Item input;
        private ItemStack output;
        private boolean isMilk, isCold;

        public BeverageMakerRecipeAdder (IItemStack input, IItemStack output, boolean isMilk, boolean isCold) {
            this.input = toStack(input).getItem();
            this.output = toStack(output);
            this.isMilk = isMilk;
            this.isCold = isCold;
        }

        @Override
        public void apply() {
            RecipeAdder.AddBeverageMakingMachineRecipe(input, isMilk, isCold, output);
        }

        @Override
        public String describe() {
            return "Add extra beverage maker recipe(s) for Foodcraft.";
        }

    }

    public static class PotRecipeAdder extends AbstractRecipeAdder {

        private Item staple1, staple2, staple3, staple4;
        private Item ingre1, ingre2, ingre3, ingre4, ingre5, ingre6, ingre7, ingre8;
        private ItemStack output;
        private int minHeat, maxHeat;

        public PotRecipeAdder(IItemStack[] staples, IItemStack[] ingredients, IItemStack output, int minHeat, int maxHeat) {
            this.staple1 = toStack(staples[0]).getItem();
            this.staple2 = toStack(staples[1]).getItem();
            this.staple3 = toStack(staples[2]).getItem();
            this.staple4 = toStack(staples[3]).getItem();
            this.ingre1 = toStack(ingredients[0]).getItem();
            this.ingre2 = toStack(ingredients[1]).getItem();
            this.ingre3 = toStack(ingredients[2]).getItem();
            this.ingre4 = toStack(ingredients[3]).getItem();
            this.ingre5 = toStack(ingredients[4]).getItem();
            this.ingre6 = toStack(ingredients[5]).getItem();
            this.ingre7 = toStack(ingredients[6]).getItem();
            this.ingre8 = toStack(ingredients[7]).getItem();
            this.output = toStack(output);
            this.minHeat = minHeat;
            this.maxHeat = maxHeat;
        }

        @Override
        public void apply() {
            RecipeAdder.AddPotRecipe(staple1, staple2, staple3, staple4, ingre1, ingre2, ingre3, ingre4, ingre5, ingre6, ingre7, ingre8, output, minHeat, maxHeat);
        }

        @Override
        public String describe() {
            return "Add extra pot recipe(s) for Foodcraft";
        }

    }

    /**For convenience. 
     * @param aMTStack The IItemStack that will be converted.*/
    public static ItemStack toStack(IItemStack aMTStack) {
        return MineTweakerMC.getItemStack(aMTStack);
    }

}
