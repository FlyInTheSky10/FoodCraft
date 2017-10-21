package com.foodcraft.support.jei.choppingboard;

import com.foodcraft.support.jei.FcRecipeUids;
import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.recipe.BlankRecipeCategory;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import javax.annotation.Nonnull;

public class ChoppingBoardRecipeCategory extends BlankRecipeCategory {
    @Nonnull
    private final IDrawable background;
    @Nonnull
    private final String localizedName;

    public ChoppingBoardRecipeCategory(IGuiHelper guiHelper) {
        ResourceLocation location = new ResourceLocation("foodcraft:textures/gui/nei/caiban.png");
        background = guiHelper.createDrawable(location, 69, 20, 140 - 69 + 1, 69 - 20 + 1);
        localizedName = StatCollector.translateToLocal("tile.Caiban.name");
    }

    @Nonnull
    @Override
    public String getUid() {
        return FcRecipeUids.CHOPPING;
    }

    @Nonnull
    @Override
    public String getTitle() {
        return localizedName;
    }

    @Nonnull
    @Override
    public IDrawable getBackground() {
        return background;
    }

    @Override
    public void setRecipe(@Nonnull IRecipeLayout recipeLayout, @Nonnull IRecipeWrapper recipeWrapper) {
        IGuiItemStackGroup stackGroup = recipeLayout.getItemStacks();
        stackGroup.init(0, true, 0, 0);
        stackGroup.init(1, true, 97 - 69 - 1, 0);
        stackGroup.init(2, true, 124 - 69 - 1, 0);
        stackGroup.init(3, false, 97 - 69 - 1, 53 - 20 - 1);
        if (recipeWrapper.getInputs().size() > 0)
            stackGroup.set(0, (ItemStack) recipeWrapper.getInputs().get(0));
            if (recipeWrapper.getInputs().size() > 1)
                stackGroup.set(1, (ItemStack) recipeWrapper.getInputs().get(1));
                if (recipeWrapper.getInputs().size() == 3)
                    stackGroup.set(2, (ItemStack) recipeWrapper.getInputs().get(2));
        if (recipeWrapper.getOutputs().size() > 0)
            stackGroup.set(3, recipeWrapper.getOutputs());
    }
}
