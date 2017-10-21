package com.foodcraft.support.jei.choppingboard;

import com.foodcraft.support.jei.FcRecipeHandler;
import com.foodcraft.support.jei.FcRecipeUids;
import mezz.jei.api.recipe.IRecipeWrapper;

import javax.annotation.Nonnull;

public class ChoppingBoardRecipeHandler extends FcRecipeHandler<ChoppingBoardRecipeWrapper> {
    @Override
    public boolean isRecipeValid(@Nonnull ChoppingBoardRecipeWrapper choppingBoardRecipeWrapper) {
        return choppingBoardRecipeWrapper.getInputs().size() > 0 && choppingBoardRecipeWrapper.getOutputs().size() == 1;
    }

    @Nonnull
    @Override
    public Class<ChoppingBoardRecipeWrapper> getRecipeClass() {
        return ChoppingBoardRecipeWrapper.class;
    }

    @Nonnull
    @Override
    public String getRecipeCategoryUid() {
        return FcRecipeUids.CHOPPING;
    }

    @Nonnull
    @Override
    public IRecipeWrapper getRecipeWrapper(@Nonnull ChoppingBoardRecipeWrapper recipe) {
        return recipe;
    }
}
