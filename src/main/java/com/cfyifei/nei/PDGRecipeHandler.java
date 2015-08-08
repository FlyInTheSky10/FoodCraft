package com.cfyifei.nei;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.cfyifei.gui.recipes.PDGrecipe;
import com.cfyifei.gui.tileentitys.TileEntityNmj;
import com.cfyifei.itemstack.CookingOutput;

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

public class PDGRecipeHandler extends TemplateRecipeHandler {

    //*********************************************************************************************************************************************************************
    public class SmeltingPair extends CachedRecipe {

	public SmeltingPair(ItemStack ingred, ItemStack result) {
	    ingred.stackSize = 1;
	    //加槽
	    this.ingred = new PositionedStack(ingred, 42 - 5, 36 - 11);
	    this.result = new PositionedStack(result, 105 - 5, 36 - 11);
	    /* oil = new PositionedStack(new ItemStack((Item)null), 15 - 5, 36 - 11);
	     bad = new PositionedStack(new ItemStack((Item)null), 134 - 5, 36 - 11);*/
	}

	public List<PositionedStack> getIngredients() {
	    //获得材料
	    return getCycledIngredients(cycleticks / 48, Arrays.asList(ingred));
	}

	public PositionedStack getResult() {
	    //获得产物
	    return result;
	}

	public List<PositionedStack> getOtherStacks() {
	    ArrayList<PositionedStack> stacks = new ArrayList<PositionedStack>();
	    PositionedStack stack = getOtherStack();
	    if (stack != null) {
		stacks.add(stack);
	    }
	    //stacks.add(oil);
	    //stacks.add(bad);
	    return stacks;
	}

	PositionedStack ingred;
	PositionedStack result;
	PositionedStack oil;
	PositionedStack bad;

    }

    //*********************************************************************************************************************************************************************
    public static class FuelPair {

	public FuelPair(ItemStack ingred, int burnTime) {
	    //this.stack = new PositionedStack(ingred, 80 - 5, 54 - 11, false);
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
	//Gui点击
	transferRects.add(new RecipeTransferRect(new Rectangle(72 - 5, 39 - 11, 22, 12), "PDGcooking"));
    }

    @Override
    public Class<? extends GuiContainer> getGuiClass() {
	//GUI类
	return com.cfyifei.gui.guis.GuiPDG.class;
    }

    @Override
    public String getRecipeName() {
	//名字
	return NEIClientUtils.translate("tile.PDG.name");
    }

    @Override
    public TemplateRecipeHandler newInstance() {
	return super.newInstance();
    }

    @Override
    public void loadCraftingRecipes(String outputId, Object... results) {
	if (outputId.equals("PDGcooking") && getClass() == PDGRecipeHandler.class) {//don't want subclasses getting a hold of this
	    Map<ItemStack, CookingOutput> recipes = (Map<ItemStack, CookingOutput>) PDGrecipe.smelting().getSmeltingList();
	    for (Entry<ItemStack, CookingOutput> recipe : recipes.entrySet()) {
		arecipes.add(new SmeltingPair(recipe.getKey(), recipe.getValue().is));
	    }
	} else {
	    super.loadCraftingRecipes(outputId, results);
	}
    }

    @Override
    public void loadCraftingRecipes(ItemStack result) {
	Map<ItemStack, CookingOutput> recipes = (Map<ItemStack, CookingOutput>) PDGrecipe.smelting().getSmeltingList();
	for (Entry<ItemStack, CookingOutput> recipe : recipes.entrySet()) {
	    if (NEIServerUtils.areStacksSameType(recipe.getValue().is, result)) {
		arecipes.add(new SmeltingPair(recipe.getKey(), recipe.getValue().is));
	    }
	}
    }

    @Override
    public void loadUsageRecipes(String inputId, Object... ingredients) {
	if (inputId.equals("fuel") && getClass() == PDGRecipeHandler.class)//don't want subclasses getting a hold of this
	{
	    loadCraftingRecipes("PDGcooking");
	} else {
	    super.loadUsageRecipes(inputId, ingredients);
	}
    }

    @Override
    public void loadUsageRecipes(ItemStack ingredient) {
	Map<ItemStack, CookingOutput> recipes = (Map<ItemStack, CookingOutput>) PDGrecipe.smelting().getSmeltingList();
	for (Entry<ItemStack, CookingOutput> recipe : recipes.entrySet()) {
	    if (NEIServerUtils.areStacksSameTypeCrafting(recipe.getKey(), ingredient)) {
		SmeltingPair arecipe = new SmeltingPair(recipe.getKey(), recipe.getValue().is);
		arecipe.setIngredientPermutation(Arrays.asList(arecipe.ingred), ingredient);
		arecipes.add(arecipe);
	    }
	}
    }

    @Override
    public String getGuiTexture() {
	//材质
	return "foodcraft:textures/gui/nei/pdg.png";
    }

    @Override
    public void drawExtras(int recipe) {
	//进度条
	//drawProgressBar(X, Y, TX, TY, W, H, Ticks, direction);
	drawProgressBar(69 - 5, 36 - 11, 176, 14, 22, 17, 48, 0);
	drawProgressBar(78 - 5, 16 - 11, 176, 0, 14, 14, 48, 7);
    }

    private static Set<Item> excludedFuels() {
	Set<Item> efuels = new HashSet<Item>();
	efuels.add(Item.getItemFromBlock(Blocks.brown_mushroom));
	efuels.add(Item.getItemFromBlock(Blocks.red_mushroom));
	efuels.add(Item.getItemFromBlock(Blocks.standing_sign));
	efuels.add(Item.getItemFromBlock(Blocks.wall_sign));
	efuels.add(Item.getItemFromBlock(Blocks.wooden_door));
	efuels.add(Item.getItemFromBlock(Blocks.trapped_chest));
	return efuels;
    }

    @Override
    public String getOverlayIdentifier() {
	//覆盖标识符
	return "PDGcooking";
    }

}
