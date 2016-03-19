package com.cfyifei.nei;

import codechicken.nei.NEIClientUtils;
import codechicken.nei.NEIServerUtils;
import codechicken.nei.PositionedStack;
import codechicken.nei.recipe.TemplateRecipeHandler;
import com.cfyifei.gui.recipes.Tpjrecipe;
import com.cfyifei.item.ModItem;
import com.cfyifei.itemstack.TpjMaking;
import net.minecraft.block.Block;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.Map.Entry;

public class TpjRecipeHandler extends TemplateRecipeHandler {
    //*********************************************************************************************************************************************************************
    //*********************************************************************************************************************************************************************
    public static HashSet<Block> efuels;
    boolean isMilk2, iscold2;

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
        transferRects.add(new RecipeTransferRect(new Rectangle(58 - 5, 30 - 11, 24, 17), "Tpjmaking"));
    }

    @Override
    public Class<? extends GuiContainer> getGuiClass() {
        //GUI��
        return com.cfyifei.gui.guis.GuiTpj.class;
    }

    @Override
    public String getRecipeName() {
        //����
        return NEIClientUtils.translate("tile.Tpj.name");
    }

    @Override
    public TemplateRecipeHandler newInstance() {
        return super.newInstance();
    }

    @Override
    public void loadCraftingRecipes(String outputId, Object... results) {
        if (outputId.equals("Tpjmaking") && getClass() == TpjRecipeHandler.class) {//don't want subclasses getting a hold of this
            Map<TpjMaking, ItemStack> recipes = (Map<TpjMaking, ItemStack>) Tpjrecipe.smelting().getSmeltingList();
            for (Entry<TpjMaking, ItemStack> recipe : recipes.entrySet())
                arecipes.add(new SmeltingPair(recipe.getKey(), recipe.getValue()));
        } else
            super.loadCraftingRecipes(outputId, results);
    }

    @Override
    public void loadCraftingRecipes(ItemStack result) {
        Map<TpjMaking, ItemStack> recipes = (Map<TpjMaking, ItemStack>) Tpjrecipe.smelting().getSmeltingList();
        for (Entry<TpjMaking, ItemStack> recipe : recipes.entrySet())
            if (NEIServerUtils.areStacksSameType(recipe.getValue(), result))
                arecipes.add(new SmeltingPair(recipe.getKey(), recipe.getValue()));
    }

    @Override
    public void loadUsageRecipes(String inputId, Object... ingredients) {
        if (inputId.equals("fuel") && getClass() == TpjRecipeHandler.class)//don't want subclasses getting a hold of this
            loadCraftingRecipes("Tpjmaking");
        else
            super.loadUsageRecipes(inputId, ingredients);
    }

    @Override
    public void loadUsageRecipes(ItemStack ingredient) {
        Map<TpjMaking, ItemStack> recipes = (Map<TpjMaking, ItemStack>) Tpjrecipe.smelting().getSmeltingList();
        for (Entry<TpjMaking, ItemStack> recipe : recipes.entrySet())
            if (NEIServerUtils.areStacksSameTypeCrafting(recipe.getKey().itemStack, ingredient)) {
                SmeltingPair arecipe = new SmeltingPair(recipe.getKey(), recipe.getValue());
                arecipe.setIngredientPermutation(Arrays.asList(arecipe.ingred), ingredient);
                arecipes.add(arecipe);
            }
    }

    @Override
    public String getGuiTexture() {
        //����
        return "foodcraft:textures/gui/nei/tpj.png";
    }

    @Override
    public void drawExtras(int recipe) {
        //������
        //drawProgressBar(X, Y, TX, TY, W, H, Ticks, direction);
        drawProgressBar(55 - 5, 26 - 11, 176, 14, 24, 17, 48, 0);
    }

    @Override
    public String getOverlayIdentifier() {
        //���Ǳ�ʶ��
        return "Tpjmaking";
    }

    //*********************************************************************************************************************************************************************
    public class SmeltingPair extends CachedRecipe {
        PositionedStack slot;
        PositionedStack cold;
        PositionedStack ingred;
        PositionedStack result;

        public SmeltingPair(TpjMaking tpjMaking, ItemStack result) {

            tpjMaking.itemStack.stackSize = 1;
            boolean isMilk = tpjMaking.isMilk;
            boolean iscold = tpjMaking.isCold;
            //�Ӳ�
            this.ingred = new PositionedStack(tpjMaking.itemStack, 34 - 5, 27 - 11);
            this.result = new PositionedStack(result, 82 - 5, 27 - 11);

            if (isMilk) {
                slot = new PositionedStack(new ItemStack(Items.milk_bucket), 34 - 5, 55 - 11);
            }

            if (!isMilk) {
                slot = new PositionedStack(new ItemStack(ModItem.Itemwater), 34 - 5, 55 - 11);
            }


            if (iscold) {
                cold = new PositionedStack(new ItemStack(Blocks.ice), 115 - 5, 48 - 11);
            } else {
                cold = new PositionedStack(new ItemStack(Items.coal), 115 - 5, 16 - 11);
            }
        }

        public List<PositionedStack> getIngredients() {
            //��ò���
            return getCycledIngredients(cycleticks / 48, Arrays.asList(ingred));
        }

        public PositionedStack getResult() {
            //��ò���
            return result;
        }

        public List<PositionedStack> getOtherStacks() {
            ArrayList<PositionedStack> stacks = new ArrayList<PositionedStack>();
            PositionedStack stack = getOtherStack();
            if (stack != null)
                stacks.add(stack);
            if (slot != null) {
                stacks.add(slot);
            }
            if (cold != null) {
                stacks.add(cold);
            }
            return stacks;
        }

        public PositionedStack getOtherStack() {
            return null;
        }
    }

}
