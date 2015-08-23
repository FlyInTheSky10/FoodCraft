package com.cfyifei.api;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.cfyifei.gui.recipes.*;
/**
 * 
 * FoodCraft API.
 * You can use this class to interact on Foodcraft.
 *
 */
public class AddRecipe {
/**
 * Add Recipe in the Mill.
 */
	public static void AddMillRecipe(Item Input, ItemStack Output, float xp) {	
	  RecipeMill.smelting().itemregister(Input, Output, xp);
}
	/**
	 * Add Recipe in the Pan.
	 */	
	public static void AddPanRecipe(Item Input, ItemStack Output, float xp, int min, int max) {	
		RecipePan.smelting().itemregister(Input, Output, xp, min, max);
	}
	/**
	 * Add Recipe in the frying machine.
	 */		
	public static void AddFryingMachineRecipe(Item Input, ItemStack Output, float xp) {	
		RecipeFrying.frying().itemregister(Input, Output, xp);
	}
	/**
	 * Add Recipe in the pressure cooker.
	 */		
	public static void AddPressureCookerRecipe(Item Input1,Item Input2,Item Input3,ItemStack Output) {	
		RecipePressureCooker.cooking().addrecipe(Input1, Input2, Input3,Output);
	}
	/**
	 * Add Recipe in the chopping board.
	 * If you don't need three slots, you can fill in the null.
	 */		
	public static void AddChoppingBoardRecipe(Item Input1,Item Input2,Item Input3,ItemStack Output) {	
		RecipeChoppingBoard.chopping().addrecipe(Input1, Input2, Input3,Output);
	}
	/**
	 * Add Recipe in the brew barrel.
	 * 
	 */		
	public static void AddBrewBarrelRecipe(Item Input1,Item Input2,Item Input3,ItemStack Output) {	
		RecipeBrewBarrel.brewing().addrecipe(Input1, Input2, Input3,Output);
	}
	/**
	 * Add Recipe in the beverage making machine.
	 * 
	 */		
	public static void AddBeverageMakingMachineRecipe(Item Input ,boolean isMilk ,boolean iscold,ItemStack Output) {	
		RecipeBeverageMaking.making().addrecipeItem(Input, isMilk, iscold, Output);
	}
	/**
	 * Add Recipe in the pot.
	 * If you don't need to more slots, you can fill in the ModItem.ItemNull.
	 */		
	public static void AddPotRecipe(Item StapleInput1,Item StapleInput2,Item StapleInput3,
			Item StapleInput4,Item ingredients1,Item ingredients2,Item ingredients3
			,Item ingredients4,Item ingredients5,Item ingredients6,Item ingredients7
			,Item ingredients8,ItemStack Output, int min, int max) {	
		RecipePot.smelting().addrecipeItem(StapleInput1, StapleInput2, StapleInput3, StapleInput4, ingredients1, ingredients2, ingredients3, ingredients4, ingredients5, ingredients6, ingredients7, ingredients8, Output, min, max);
	}
}
