package com.cfyifei.nei;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.cfyifei.gui.recipes.Caibanrecipe;
import com.cfyifei.item.ModItem;
import com.cfyifei.itemstack.FoodcraftItemStack;

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

public class CaibanRecipeHandler extends TemplateRecipeHandler {

    //*********************************************************************************************************************************************************************
    public class SmeltingPair extends CachedRecipe {

	public SmeltingPair(FoodcraftItemStack foodcraftItemStack, ItemStack result) {
	    ItemStack[] is = new ItemStack[foodcraftItemStack.Stack.length];
	    int w = 0;
	    for (Item item : foodcraftItemStack.Stack) {
		if (item == null) {
		    is[w] = new ItemStack(ModItem.ItemNull);
		    w += 1;
		    continue;
		}
		is[w] = new ItemStack(item);
		w += 1;
	    }
	    ingred = new PositionedStack[foodcraftItemStack.Stack.length];
	    //加槽

	    this.ingred[0] = new PositionedStack(is[0], 70 - 5, 21 - 11);
	    this.ingred[1] = new PositionedStack(is[1], 97 - 5, 21 - 11);
	    this.ingred[2] = new PositionedStack(is[2], 124 - 5, 21 - 11);

	    this.result = new PositionedStack(result, 97 - 5, 53 - 11);

	    water = new PositionedStack(new ItemStack(ModItem.ItemCaidao), 31 - 5, 21 - 11);
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
	    stacks.add(water);
	    return stacks;
	}

	PositionedStack ingred[];
	PositionedStack result;
	PositionedStack water;
    }
    //*********************************************************************************************************************************************************************
    //*********************************************************************************************************************************************************************
    public static HashSet<Block> efuels;

    @Override
    public void loadTransferRects() {
	//Gui点击
	transferRects.add(new RecipeTransferRect(new Rectangle(97 - 5, 43 - 11, 15, 13), "Chopping"));
    }

    @Override
    public Class<? extends GuiContainer> getGuiClass() {
	//GUI类
	return com.cfyifei.gui.guis.GuiCaiban.class;
    }

    @Override
    public String getRecipeName() {
	//名字
	return NEIClientUtils.translate("tile.Caiban.name");
    }

    @Override
    public TemplateRecipeHandler newInstance() {
	return super.newInstance();
    }

    @Override
    public void loadCraftingRecipes(String outputId, Object... results) {
	if (outputId.equals("Chopping") && getClass() == CaibanRecipeHandler.class) {//don't want subclasses getting a hold of this
	    Map<FoodcraftItemStack, ItemStack> recipes = (Map<FoodcraftItemStack, ItemStack>) Caibanrecipe.smelting().getSmeltingList();
	    for (Entry<FoodcraftItemStack, ItemStack> recipe : recipes.entrySet()) {
		arecipes.add(new SmeltingPair(recipe.getKey(), recipe.getValue()));
	    }
	} else {
	    super.loadCraftingRecipes(outputId, results);
	}
    }

    @Override
    public void loadCraftingRecipes(ItemStack result) {
	Map<FoodcraftItemStack, ItemStack> recipes = (Map<FoodcraftItemStack, ItemStack>) Caibanrecipe.smelting().getSmeltingList();
	for (Entry<FoodcraftItemStack, ItemStack> recipe : recipes.entrySet()) {
	    if (NEIServerUtils.areStacksSameType(recipe.getValue(), result)) {
		arecipes.add(new SmeltingPair(recipe.getKey(), recipe.getValue()));
	    }
	}
    }

    @Override
    public void loadUsageRecipes(String inputId, Object... ingredients) {
	if (inputId.equals("fuel") && getClass() == CaibanRecipeHandler.class)//don't want subclasses getting a hold of this
	{
	    loadCraftingRecipes("Chopping");
	} else {
	    super.loadUsageRecipes(inputId, ingredients);
	}
    }

    @Override
    public void loadUsageRecipes(ItemStack ingredient) {
	Map<FoodcraftItemStack, ItemStack> recipes = (Map<FoodcraftItemStack, ItemStack>) Caibanrecipe.smelting().getSmeltingList();
	for (Entry<FoodcraftItemStack, ItemStack> recipe : recipes.entrySet()) {
	    if (NEIServerUtils.areStacksSameTypeCrafting(new ItemStack(recipe.getKey().Stack[0]), ingredient)
		    && NEIServerUtils.areStacksSameTypeCrafting(new ItemStack(recipe.getKey().Stack[1]), ingredient)
		    && NEIServerUtils.areStacksSameTypeCrafting(new ItemStack(recipe.getKey().Stack[2]), ingredient)) {
		SmeltingPair arecipe = new SmeltingPair(recipe.getKey(), recipe.getValue());
		arecipe.setIngredientPermutation(Arrays.asList(arecipe.ingred), ingredient);
		arecipes.add(arecipe);
	    }
	}
    }

    @Override
    public String getGuiTexture() {
	//材质
	return "foodcraft:textures/gui/nei/caiban.png";
    }

    @Override
    public void drawExtras(int recipe) {
	//进度条
	//drawProgressBar(X, Y, TX, TY, W, H, Ticks, direction);
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
	return "Chopping";
    }

}
