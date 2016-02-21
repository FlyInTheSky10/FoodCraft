package com.foodcraft.support.nei;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.foodcraft.gui.recipes.RecipePan;
import com.foodcraft.gui.tileentities.TileEntityMill;
import com.foodcraft.itemstack.CookingOutput;

import net.minecraft.block.Block;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import codechicken.nei.ItemList;
import codechicken.nei.NEIClientUtils;
import codechicken.nei.NEIServerUtils;
import codechicken.nei.PositionedStack;
import codechicken.nei.recipe.TemplateRecipeHandler;
import codechicken.nei.recipe.TemplateRecipeHandler.CachedRecipe;
import codechicken.nei.recipe.TemplateRecipeHandler.RecipeTransferRect;

public class PanRecipeHandler extends TemplateRecipeHandler {
	//*********************************************************************************************************************************************************************
	public class SmeltingPair extends CachedRecipe
    {
        public SmeltingPair(ItemStack ingred, ItemStack result) {
            ingred.stackSize = 1;
            this.ingred = new PositionedStack(ingred, 42 - 5, 36 - 11);
            this.result = new PositionedStack(result, 105 - 5, 36 - 11);
        }

        public List<PositionedStack> getIngredients() {
            return getCycledIngredients(cycleticks / 48, Arrays.asList(ingred));
        }

        public PositionedStack getResult() {
            return result;
        }

        public List<PositionedStack> getOtherStacks() {
            ArrayList<PositionedStack> stacks = new ArrayList<PositionedStack>();
            PositionedStack stack = getOtherStack();
            if (stack != null)
                stacks.add(stack);
            return stacks;
        }


        PositionedStack ingred;
        PositionedStack result;
        PositionedStack oil;
        PositionedStack bad;
        
    }
	//*********************************************************************************************************************************************************************
    public static class FuelPair
    {
        public FuelPair(ItemStack ingred, int burnTime) {
            this.burnTime = burnTime;
        }

        public PositionedStack stack;
        public int burnTime;
    }
  //*********************************************************************************************************************************************************************
    public static ArrayList<FuelPair> afuels;
    public static HashSet<Block> efuels;

    @Override
    public void loadTransferRects() {
    	transferRects.add(new RecipeTransferRect(new Rectangle(72 - 5, 39 - 11, 22, 12), "PDGcooking"));
    }

    @Override
    public Class<? extends GuiContainer> getGuiClass() {
        return com.foodcraft.gui.guis.GuiPan.class;
    }

    @Override
    public String getRecipeName() {
        return NEIClientUtils.translate("tile.PDG.name");
    }

    @Override
    public TemplateRecipeHandler newInstance() {
        return super.newInstance();
    }

    @Override
    public void loadCraftingRecipes(String outputId, Object... results) {
        if (outputId.equals("PDGcooking") && getClass() == PanRecipeHandler.class) {//don't want subclasses getting a hold of this
            Map<ItemStack, CookingOutput> recipes = (Map<ItemStack, CookingOutput>) RecipePan.smelting().getSmeltingList();
            for (Entry<ItemStack, CookingOutput> recipe : recipes.entrySet())
                arecipes.add(new SmeltingPair(recipe.getKey(), recipe.getValue().getItemStack()));
        } else
            super.loadCraftingRecipes(outputId, results);
    }

    @Override
    public void loadCraftingRecipes(ItemStack result) {
        Map<ItemStack, CookingOutput> recipes = (Map<ItemStack, CookingOutput>) RecipePan.smelting().getSmeltingList();
        for (Entry<ItemStack, CookingOutput> recipe : recipes.entrySet())
            if (NEIServerUtils.areStacksSameType(recipe.getValue().getItemStack(), result))
                arecipes.add(new SmeltingPair(recipe.getKey(), recipe.getValue().getItemStack()));
    }

    @Override
    public void loadUsageRecipes(String inputId, Object... ingredients) {
        if (inputId.equals("fuel") && getClass() == PanRecipeHandler.class)//don't want subclasses getting a hold of this
            loadCraftingRecipes("PDGcooking");
        else
            super.loadUsageRecipes(inputId, ingredients);
    }

    @Override
    public void loadUsageRecipes(ItemStack ingredient) {
        Map<ItemStack, CookingOutput> recipes = (Map<ItemStack, CookingOutput>) RecipePan.smelting().getSmeltingList();
        for (Entry<ItemStack, CookingOutput> recipe : recipes.entrySet())
            if (NEIServerUtils.areStacksSameTypeCrafting(recipe.getKey(), ingredient)) {
                SmeltingPair arecipe = new SmeltingPair(recipe.getKey(), recipe.getValue().getItemStack());
                arecipe.setIngredientPermutation(Arrays.asList(arecipe.ingred), ingredient);
                arecipes.add(arecipe);
            }
    }

    @Override
    public String getGuiTexture() {
        return "foodcraft:textures/gui/nei/pdg.png";
    }

    @Override
    public void drawExtras(int recipe) {
    	drawProgressBar(69 - 5, 36 - 11, 176, 14, 22, 17, 48, 0);
        drawProgressBar(78 - 5, 16 - 11, 176, 0, 14, 14, 48, 7);
    }

    private static Set<Item> excludedFuels() {
        Set<Item> efuels = new HashSet<Item>();
        efuels.add(Item.getItemFromBlock(Blocks.brown_mushroom));
        efuels.add(Item.getItemFromBlock(Blocks.red_mushroom));
        efuels.add(Item.getItemFromBlock(Blocks.standing_sign));
        efuels.add(Item.getItemFromBlock(Blocks.wall_sign));
        efuels.add(Item.getItemFromBlock(Blocks.trapped_chest));
        return efuels;
    }


    @Override
    public String getOverlayIdentifier() {
        return "PDGcooking";
    }

}
