package com.foodcraft.minetweaker;

import minetweaker.IUndoableAction;

public abstract class AbstractRecipeAdder implements IUndoableAction {

    @Override
    public boolean canUndo() {
        return false;
    }

    @Override
    public String describeUndo() {
        return null;
    }

    @Override
    public Object getOverrideKey() {
        return null;
    }

    @Override
    public void undo() {

    }
}
