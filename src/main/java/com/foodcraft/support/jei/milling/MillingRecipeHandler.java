package com.foodcraft.support.jei.milling;

import com.foodcraft.support.jei.FcRecipeHandler;
import com.foodcraft.support.jei.FcRecipeUids;
import mezz.jei.api.recipe.IRecipeWrapper;

import javax.annotation.Nonnull;

public class MillingRecipeHandler extends FcRecipeHandler<MillingRecipeWrapper> {
    @Override
    public boolean isRecipeValid(@Nonnull MillingRecipeWrapper millingRecipeWrapper) {
        return millingRecipeWrapper.getInputs().size() > 0 && millingRecipeWrapper.getOutputs().size() == 1;
    }

    @Nonnull
    @Override
    public Class<MillingRecipeWrapper> getRecipeClass() {
        return MillingRecipeWrapper.class;
    }

    @Nonnull
    @Override
    public String getRecipeCategoryUid() {
        return FcRecipeUids.MILLING;
    }

    @Nonnull
    @Override
    public IRecipeWrapper getRecipeWrapper(@Nonnull MillingRecipeWrapper recipeWrapper) {
        return recipeWrapper;
    }
}
