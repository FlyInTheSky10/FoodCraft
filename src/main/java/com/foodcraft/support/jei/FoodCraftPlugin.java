package com.foodcraft.support.jei;

import com.foodcraft.gui.containers.ContainerChoppingBoard;
import com.foodcraft.gui.containers.ContainerMill;
import com.foodcraft.gui.containers.ContainerPressureCooker;
import com.foodcraft.gui.guis.GuiChoppingBoard;
import com.foodcraft.gui.guis.GuiMill;
import com.foodcraft.gui.guis.GuiPerssureCooker;
import com.foodcraft.gui.recipes.RecipeChoppingBoard;
import com.foodcraft.gui.recipes.RecipeMill;
import com.foodcraft.gui.recipes.RecipePressureCooker;
import com.foodcraft.itemstack.FoodcraftItemStack;
import com.foodcraft.support.jei.choppingboard.ChoppingBoardRecipeCategory;
import com.foodcraft.support.jei.choppingboard.ChoppingBoardRecipeHandler;
import com.foodcraft.support.jei.choppingboard.ChoppingBoardRecipeWrapper;
import com.foodcraft.support.jei.milling.MillingRecipeCategory;
import com.foodcraft.support.jei.milling.MillingRecipeHandler;
import com.foodcraft.support.jei.milling.MillingRecipeWrapper;
import com.foodcraft.support.jei.pressurecooker.PressureCookerRecipeCategory;
import com.foodcraft.support.jei.pressurecooker.PressureCookerRecipeHandler;
import com.foodcraft.support.jei.pressurecooker.PressureCookerRecipeWrapper;
import com.google.common.collect.Lists;
import mezz.jei.api.BlankModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.recipe.IRecipeWrapper;
import mezz.jei.api.recipe.transfer.IRecipeTransferRegistry;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.Map;

@JEIPlugin
public class FoodCraftPlugin extends BlankModPlugin {
    @Override
    public void register(@Nonnull IModRegistry registry) {
        registry.addRecipeCategories(new MillingRecipeCategory(registry.getJeiHelpers().getGuiHelper()), new ChoppingBoardRecipeCategory(registry.getJeiHelpers().getGuiHelper()), new PressureCookerRecipeCategory(registry.getJeiHelpers().getGuiHelper()));
        registry.addRecipeHandlers(new MillingRecipeHandler(), new ChoppingBoardRecipeHandler(), new PressureCookerRecipeHandler());
        List<IRecipeWrapper> recipes = Lists.newArrayListWithCapacity(RecipeMill.smelting().getSmeltingList().size());
        for (Map.Entry<ItemStack, ItemStack> entry : RecipeMill.smelting().getSmeltingList().entrySet())
            recipes.add(new MillingRecipeWrapper(entry));
        for (Map.Entry<FoodcraftItemStack, ItemStack> entry : RecipeChoppingBoard.chopping().getSmeltingList().entrySet())
            recipes.add(new ChoppingBoardRecipeWrapper(entry));
        for (Map.Entry<FoodcraftItemStack, ItemStack> entry : RecipePressureCooker.cooking().getSmeltingList().entrySet())
            recipes.add(new PressureCookerRecipeWrapper(entry));
        registry.addRecipes(recipes);
        registry.addRecipeClickArea(GuiMill.class, 75, 18, 24, 18, FcRecipeUids.MILLING);
        registry.addRecipeClickArea(GuiChoppingBoard.class, 96, 44, 18, 12, FcRecipeUids.CHOPPING);
        registry.addRecipeClickArea(GuiPerssureCooker.class, 117, 30, 24, 18, FcRecipeUids.PRESSURE_COOKER);

        IRecipeTransferRegistry recipeTransferRegistry = registry.getRecipeTransferRegistry();

        recipeTransferRegistry.addRecipeTransferHandler(ContainerMill.class, FcRecipeUids.MILLING, 0, 3, 3, 36);
        recipeTransferRegistry.addRecipeTransferHandler(ContainerChoppingBoard.class, FcRecipeUids.CHOPPING, 1, 4, 4, 36);
        recipeTransferRegistry.addRecipeTransferHandler(ContainerPressureCooker.class, FcRecipeUids.PRESSURE_COOKER, 0, 4, 6, 36);

    }
}
