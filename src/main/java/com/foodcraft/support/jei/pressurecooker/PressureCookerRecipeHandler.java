package com.foodcraft.support.jei.pressurecooker;

import com.foodcraft.support.jei.FcRecipeHandler;
import com.foodcraft.support.jei.FcRecipeUids;
import mezz.jei.api.recipe.IRecipeWrapper;

import javax.annotation.Nonnull;

public class PressureCookerRecipeHandler extends FcRecipeHandler<PressureCookerRecipeWrapper> {
    @Override
    public boolean isRecipeValid(@Nonnull PressureCookerRecipeWrapper pressureCookerRecipeWrapper) {
        return pressureCookerRecipeWrapper.getInputs().size() > 0 && pressureCookerRecipeWrapper.getOutputs().size() == 1;
    }

    @Nonnull
    @Override
    public Class<PressureCookerRecipeWrapper> getRecipeClass() {
        return PressureCookerRecipeWrapper.class;
    }

    @Nonnull
    @Override
    public String getRecipeCategoryUid() {
        return FcRecipeUids.PRESSURE_COOKER;
    }

    @Nonnull
    @Override
    public IRecipeWrapper getRecipeWrapper(@Nonnull PressureCookerRecipeWrapper recipe) {
        return recipe;
    }
}
