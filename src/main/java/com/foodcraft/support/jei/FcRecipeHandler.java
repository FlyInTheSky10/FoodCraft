package com.foodcraft.support.jei;

import mezz.jei.api.recipe.IRecipeHandler;

import javax.annotation.Nonnull;

public abstract class FcRecipeHandler<T> implements IRecipeHandler<T> {
    @Override
    public boolean isRecipeValid(@Nonnull T t) {
        return true;
    }
}
