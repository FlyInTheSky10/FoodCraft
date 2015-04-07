package com.cfyifei;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;

public class RemoveRecipe
{
	public static void removeAnyRecipe (ItemStack ItemStack)
	{
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		for (int i = 0; i < recipes.size(); i++)
		{
			IRecipe tmpRecipe = recipes.get(i);
			ItemStack recipeResult = tmpRecipe.getRecipeOutput();
			if (ItemStack.areItemStacksEqual(ItemStack, recipeResult)) recipes.remove(i--);
		}
	}

	public static void removeFurnaceRecipe (int ID, int metadata)
	{
		Map<List<Integer>, ItemStack> recipes = FurnaceRecipes.smelting().getSmeltingList();
		recipes.remove(Arrays.asList(ID, metadata));
	}

}