package com.cfyifei.api;

public class FcAPI {
    /**
     * Get the mod name.
     */
    public static String getName() {
        return "FoodCraft";
    }

    /**
     * Get the mod version.
     */
    public static String getVersion() {
        return "1.2.0";
    }

    public static Class getFoodCraftClass() throws Exception {
        return Class.forName("com.cfyifei.FoodCraft");
    }


}
