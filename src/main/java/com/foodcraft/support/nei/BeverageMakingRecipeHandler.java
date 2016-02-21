package com.foodcraft.support.nei;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.foodcraft.gui.recipes.RecipeBeverageMaking;
import com.foodcraft.gui.tileentities.TileEntityBeverageMaking;
import com.foodcraft.init.FoodcraftItems;
import com.foodcraft.itemstack.BeverageMaking;

import net.minecraft.block.Block;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import codechicken.nei.ItemList;
import codechicken.nei.NEIClientUtils;
import codechicken.nei.NEIServerUtils;
import codechicken.nei.PositionedStack;
import codechicken.nei.recipe.TemplateRecipeHandler;
import codechicken.nei.recipe.TemplateRecipeHandler.CachedRecipe;
import codechicken.nei.recipe.TemplateRecipeHandler.RecipeTransferRect;

public class BeverageMakingRecipeHandler extends TemplateRecipeHandler {
	boolean isMilk2, iscold2;
	//*********************************************************************************************************************************************************************
	public class SmeltingPair extends CachedRecipe
    {
        public SmeltingPair(BeverageMaking tpjMaking, ItemStack result) {
           
        	tpjMaking.getItemStack().stackSize = 1;
        	boolean isMilk = tpjMaking.isMilk();
        	boolean iscold = tpjMaking.iscold();
            this.ingred = new PositionedStack(tpjMaking.getItemStack(), 34 - 5, 27 - 11);
            this.result = new PositionedStack(result, 82 - 5, 27 - 11);
            
            if(isMilk){
            	slot = new PositionedStack(new ItemStack(Items.milk_bucket), 34 - 5, 55 - 11);
            }

            if(!isMilk){
            	slot = new PositionedStack(new ItemStack(FoodcraftItems.Itemwater), 34 - 5, 55 - 11);
            }
            
            
            if(iscold){
            	cold = new PositionedStack(new ItemStack(Blocks.ice), 115 - 5, 48 - 11);
            }
            else{
            	cold = new PositionedStack(new ItemStack(Items.coal), 115 - 5, 16 - 11);
            }
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
            if(slot != null){
            	  stacks.add(slot);
            }
            if(cold != null){
          	  stacks.add(cold);
          }
            return stacks;
        }
        public PositionedStack getOtherStack() {     
			return null;
        }
        PositionedStack slot;
        PositionedStack cold;
        PositionedStack ingred;
        PositionedStack result;
    }
	//*********************************************************************************************************************************************************************
  //*********************************************************************************************************************************************************************
    public static HashSet<Block> efuels;

    @Override
    public void loadTransferRects() {
    	transferRects.add(new RecipeTransferRect(new Rectangle(58 - 5, 30 - 11, 24, 17), "Tpjmaking"));
    }

    @Override
    public Class<? extends GuiContainer> getGuiClass() {
        return com.foodcraft.gui.guis.GuiBeverageMaking.class;
    }

    @Override
    public String getRecipeName() {
        return NEIClientUtils.translate("tile.Tpj.name");
    }

    @Override
    public TemplateRecipeHandler newInstance() {
        return super.newInstance();
    }

    @Override
    public void loadCraftingRecipes(String outputId, Object... results) {
        if (outputId.equals("Tpjmaking") && getClass() == BeverageMakingRecipeHandler.class) {//don't want subclasses getting a hold of this
            Map<BeverageMaking, ItemStack> recipes = (Map<BeverageMaking, ItemStack>) RecipeBeverageMaking.making().getSmeltingList();
            for (Entry<BeverageMaking, ItemStack> recipe : recipes.entrySet())
                arecipes.add(new SmeltingPair(recipe.getKey(), recipe.getValue()));
        } else
            super.loadCraftingRecipes(outputId, results);
    }

    @Override
    public void loadCraftingRecipes(ItemStack result) {
        Map<BeverageMaking, ItemStack> recipes = (Map<BeverageMaking, ItemStack>) RecipeBeverageMaking.making().getSmeltingList();
        for (Entry<BeverageMaking, ItemStack> recipe : recipes.entrySet())
            if (NEIServerUtils.areStacksSameType(recipe.getValue(), result))
                arecipes.add(new SmeltingPair(recipe.getKey(), recipe.getValue()));
    }

    @Override
    public void loadUsageRecipes(String inputId, Object... ingredients) {
        if (inputId.equals("fuel") && getClass() == BeverageMakingRecipeHandler.class)//don't want subclasses getting a hold of this
            loadCraftingRecipes("Tpjmaking");
        else
            super.loadUsageRecipes(inputId, ingredients);
    }

    @Override
    public void loadUsageRecipes(ItemStack ingredient) {
        Map<BeverageMaking, ItemStack> recipes = (Map<BeverageMaking, ItemStack>) RecipeBeverageMaking.making().getSmeltingList();
        for (Entry<BeverageMaking, ItemStack> recipe : recipes.entrySet())
            if (NEIServerUtils.areStacksSameTypeCrafting(recipe.getKey().getItemStack(), ingredient)) {
                SmeltingPair arecipe = new SmeltingPair(recipe.getKey(), recipe.getValue());
                arecipe.setIngredientPermutation(Arrays.asList(arecipe.ingred), ingredient);
                arecipes.add(arecipe);
            }
    }

    @Override
    public String getGuiTexture() {
        return "foodcraft:textures/gui/nei/tpj.png";
    }

    @Override
    public void drawExtras(int recipe) {
    	drawProgressBar(55 - 5, 26 - 11, 176, 14, 24, 17, 48, 0);
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
        return "Tpjmaking";
    }

}
