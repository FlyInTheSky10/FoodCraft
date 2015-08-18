package com.cfyifei.nei;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;






import com.cfyifei.gui.recipes.YZJrecipe;
import com.cfyifei.gui.tileentitys.TileEntityYZJ;
import com.cfyifei.item.ModItem;

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

public class YZJRecipeHandler extends TemplateRecipeHandler {
	//*********************************************************************************************************************************************************************
	public class SmeltingPair extends CachedRecipe
    {
        public SmeltingPair(ItemStack ingred, ItemStack result) {
            ingred.stackSize = 1;
            //加槽
            this.ingred = new PositionedStack(ingred, 55 - 5, 21 - 11);
            this.result = new PositionedStack(result, 127 - 5, 21 - 11);
            oil = new PositionedStack(new ItemStack(ModItem.ItemHuashenyou), 34 - 5, 49 - 11);
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
            if (stack != null)
                stacks.add(stack);
            stacks.add(oil);
            return stacks;
        }
        public PositionedStack getOtherStack() {
        	
            return afuels.get((cycleticks / 48) % afuels.size()).stack;
        }

        PositionedStack ingred;
        PositionedStack result;
        PositionedStack oil;
    }
	//*********************************************************************************************************************************************************************
    public static class FuelPair
    {
        public FuelPair(ItemStack ingred, int burnTime) {
            this.stack = new PositionedStack(ingred, 92 - 5, 49 - 11, false);
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
    	transferRects.add(new RecipeTransferRect(new Rectangle(92 - 5, 30 - 11, 22, 17), "frying"));
    }

    @Override
    public Class<? extends GuiContainer> getGuiClass() {
    	//GUI类
        return com.cfyifei.gui.guis.GuiYZJ.class;
    }

    @Override
    public String getRecipeName() {
    	//名字
        return NEIClientUtils.translate("tile.YZJ.name");
    }

    @Override
    public TemplateRecipeHandler newInstance() {
        if (afuels == null || afuels.isEmpty())
            findFuels();
        return super.newInstance();
    }

    @Override
    public void loadCraftingRecipes(String outputId, Object... results) {
        if (outputId.equals("frying") && getClass() == YZJRecipeHandler.class) {//don't want subclasses getting a hold of this
            Map<ItemStack, ItemStack> recipes = (Map<ItemStack, ItemStack>) YZJrecipe.smelting().getSmeltingList();
            for (Entry<ItemStack, ItemStack> recipe : recipes.entrySet())
                arecipes.add(new SmeltingPair(recipe.getKey(), recipe.getValue()));
        } else
            super.loadCraftingRecipes(outputId, results);
    }

    @Override
    public void loadCraftingRecipes(ItemStack result) {
        Map<ItemStack, ItemStack> recipes = (Map<ItemStack, ItemStack>) YZJrecipe.smelting().getSmeltingList();
        for (Entry<ItemStack, ItemStack> recipe : recipes.entrySet())
            if (NEIServerUtils.areStacksSameType(recipe.getValue(), result))
                arecipes.add(new SmeltingPair(recipe.getKey(), recipe.getValue()));
    }

    @Override
    public void loadUsageRecipes(String inputId, Object... ingredients) {
        if (inputId.equals("fuel") && getClass() == YZJRecipeHandler.class)//don't want subclasses getting a hold of this
            loadCraftingRecipes("frying");
        else
            super.loadUsageRecipes(inputId, ingredients);
    }

    @Override
    public void loadUsageRecipes(ItemStack ingredient) {
        Map<ItemStack, ItemStack> recipes = (Map<ItemStack, ItemStack>) YZJrecipe.smelting().getSmeltingList();
        for (Entry<ItemStack, ItemStack> recipe : recipes.entrySet())
            if (NEIServerUtils.areStacksSameTypeCrafting(recipe.getKey(), ingredient)) {
                SmeltingPair arecipe = new SmeltingPair(recipe.getKey(), recipe.getValue());
                arecipe.setIngredientPermutation(Arrays.asList(arecipe.ingred), ingredient);
                arecipes.add(arecipe);
            }
    }

    @Override
    public String getGuiTexture() {
    	//材质
        return "foodcraft:textures/gui/nei/yzj.png";
    }

    @Override
    public void drawExtras(int recipe) {
    	//进度条
      //drawProgressBar(X, Y, TX, TY, W, H, Ticks, direction);
    	drawProgressBar(89 - 5, 20 - 11, 176, 14, 22, 17, 48, 0);
        drawProgressBar(119 - 5, 52 - 11, 176, 0, 14, 14, 48, 7);
        
        drawProgressBar(15 - 5, 1, 176, 31, 11, 58,48, 3);
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

    private static void findFuels() {
        afuels = new ArrayList<FuelPair>();
        Set<Item> efuels = excludedFuels();
        for (ItemStack item : ItemList.items)
            if (!efuels.contains(item.getItem())) {
                int burnTime = TileEntityYZJ.getItemBurnTime(item);
                if (burnTime > 0)
                    afuels.add(new FuelPair(item.copy(), burnTime));
            }
    }

    @Override
    public String getOverlayIdentifier() {
    	//覆盖标识符
        return "frying";
    }

}
