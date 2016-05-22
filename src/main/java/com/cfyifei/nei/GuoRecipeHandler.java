package com.cfyifei.nei;

import codechicken.nei.NEIClientUtils;
import codechicken.nei.NEIServerUtils;
import codechicken.nei.PositionedStack;
import codechicken.nei.recipe.TemplateRecipeHandler;
import com.cfyifei.gui.recipes.Guorecipe;
import com.cfyifei.itemstack.CookingOutput;
import com.cfyifei.itemstack.PotCooking;
import net.minecraft.block.Block;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.Map.Entry;

public class GuoRecipeHandler extends TemplateRecipeHandler {
    //*********************************************************************************************************************************************************************
    public static HashSet<Block> efuels;
    //*********************************************************************************************************************************************************************

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
    public void loadTransferRects() {
        //Gui���
        transferRects.add(new RecipeTransferRect(new Rectangle(94 - 5, 17 - 11, 24, 17), "Guocooking"));
    }

    @Override
    public Class<? extends GuiContainer> getGuiClass() {
        //GUI��
        return com.cfyifei.gui.guis.GuiGuo.class;
    }

    @Override
    public String getRecipeName() {
        //����
        return NEIClientUtils.translate("tile.Guo.name");
    }

    @Override
    public TemplateRecipeHandler newInstance() {
        return super.newInstance();
    }

    @Override
    public void loadCraftingRecipes(String outputId, Object... results) {
        if (outputId.equals("Guocooking") && getClass() == GuoRecipeHandler.class) {//don't want subclasses getting a hold of this
            Map<PotCooking, CookingOutput> recipes = (Map<PotCooking, CookingOutput>) Guorecipe.smelting().getSmeltingList();
            for (Entry<PotCooking, CookingOutput> recipe : recipes.entrySet())
                arecipes.add(new SmeltingPair(recipe.getKey(), recipe.getValue().is));
        } else
            super.loadCraftingRecipes(outputId, results);
    }

    @Override
    public void loadCraftingRecipes(ItemStack result) {
        Map<PotCooking, CookingOutput> recipes = (Map<PotCooking, CookingOutput>) Guorecipe.smelting().getSmeltingList();
        for (Entry<PotCooking, CookingOutput> recipe : recipes.entrySet())
            if (NEIServerUtils.areStacksSameType(recipe.getValue().is, result))
                arecipes.add(new SmeltingPair(recipe.getKey(), recipe.getValue().is));
    }

    @Override
    public void loadUsageRecipes(String inputId, Object... ingredients) {
        if (inputId.equals("fuel") && getClass() == GuoRecipeHandler.class)//don't want subclasses getting a hold of this
            loadCraftingRecipes("Guocooking");
        else
            super.loadUsageRecipes(inputId, ingredients);
    }

    @Override
    public void loadUsageRecipes(ItemStack ingredient) {
        Map<PotCooking, CookingOutput> recipes = (Map<PotCooking, CookingOutput>) Guorecipe.smelting().getSmeltingList();
        for (Entry<PotCooking, CookingOutput> recipe : recipes.entrySet())
            if (NEIServerUtils.areStacksSameTypeCrafting(new ItemStack(recipe.getKey().StapleInput1), ingredient) &&
                    NEIServerUtils.areStacksSameTypeCrafting(new ItemStack(recipe.getKey().StapleInput2), ingredient) &&
                    NEIServerUtils.areStacksSameTypeCrafting(new ItemStack(recipe.getKey().StapleInput3), ingredient) &&
                    NEIServerUtils.areStacksSameTypeCrafting(new ItemStack(recipe.getKey().StapleInput4), ingredient) &&
                    NEIServerUtils.areStacksSameTypeCrafting(new ItemStack(recipe.getKey().ingredients1), ingredient) &&
                    NEIServerUtils.areStacksSameTypeCrafting(new ItemStack(recipe.getKey().ingredients2), ingredient) &&
                    NEIServerUtils.areStacksSameTypeCrafting(new ItemStack(recipe.getKey().ingredients3), ingredient) &&
                    NEIServerUtils.areStacksSameTypeCrafting(new ItemStack(recipe.getKey().ingredients4), ingredient) &&
                    NEIServerUtils.areStacksSameTypeCrafting(new ItemStack(recipe.getKey().ingredients5), ingredient) &&
                    NEIServerUtils.areStacksSameTypeCrafting(new ItemStack(recipe.getKey().ingredients6), ingredient) &&
                    NEIServerUtils.areStacksSameTypeCrafting(new ItemStack(recipe.getKey().ingredients7), ingredient) &&
                    NEIServerUtils.areStacksSameTypeCrafting(new ItemStack(recipe.getKey().ingredients8), ingredient)) {
                SmeltingPair arecipe = new SmeltingPair(recipe.getKey(), recipe.getValue().is);
                arecipe.setIngredientPermutation(Arrays.asList(arecipe.ingred), ingredient);
                arecipes.add(arecipe);
            }
    }

    @Override
    public String getGuiTexture() {
        //����
        return "foodcraft:textures/gui/nei/guo.png";
    }

    @Override
    public void drawExtras(int recipe) {
        //������
        //drawProgressBar(X, Y, TX, TY, W, H, Ticks, direction);
        drawProgressBar(94 - 5, 17 - 11, 176, 14, 24, 17, 48, 0);
        drawProgressBar(82 - 5, 58 - 11, 176, 0, 14, 14, 48, 7);
    }

    @Override
    public String getOverlayIdentifier() {
        //���Ǳ�ʶ��
        return "Guocooking";
    }

    //*********************************************************************************************************************************************************************
    public class SmeltingPair extends CachedRecipe {
        PositionedStack[] ingred = new PositionedStack[12];
        PositionedStack result;

        public SmeltingPair(PotCooking guoCooking, ItemStack result) {
            //�Ӳ�'
            this.ingred[0] = new PositionedStack(new ItemStack(guoCooking.StapleInput1), 18 - 5, 17 - 11);
            this.ingred[1] = new PositionedStack(new ItemStack(guoCooking.StapleInput2), 36 - 5, 17 - 11);
            this.ingred[2] = new PositionedStack(new ItemStack(guoCooking.StapleInput3), 54 - 5, 17 - 11);
            this.ingred[3] = new PositionedStack(new ItemStack(guoCooking.StapleInput4), 72 - 5, 17 - 11);
            this.ingred[4] = new PositionedStack(new ItemStack(guoCooking.ingredients1), 18 - 5, 39 - 11);
            this.ingred[5] = new PositionedStack(new ItemStack(guoCooking.ingredients2), 36 - 5, 39 - 11);
            this.ingred[6] = new PositionedStack(new ItemStack(guoCooking.ingredients3), 54 - 5, 39 - 11);
            this.ingred[7] = new PositionedStack(new ItemStack(guoCooking.ingredients4), 72 - 5, 39 - 11);
            this.ingred[8] = new PositionedStack(new ItemStack(guoCooking.ingredients5), 90 - 5, 39 - 11);
            this.ingred[9] = new PositionedStack(new ItemStack(guoCooking.ingredients6), 108 - 5, 39 - 11);
            this.ingred[10] = new PositionedStack(new ItemStack(guoCooking.ingredients7), 126 - 5, 39 - 11);
            this.ingred[11] = new PositionedStack(new ItemStack(guoCooking.ingredients8), 144 - 5, 39 - 11);
            this.result = new PositionedStack(result, 126 - 5, 17 - 11);
        }

        public List<PositionedStack> getIngredients() {
            //��ò���
            return getCycledIngredients(cycleticks / 48, Arrays.asList(ingred));
        }

        public PositionedStack getResult() {
            //��ò���
            return result;
        }
    }

}
