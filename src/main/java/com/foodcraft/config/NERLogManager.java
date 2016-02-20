package com.foodcraft.config;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NERLogManager {
    public static final Logger NERLogger = LogManager.getLogger("foodcraft");

    public static void deBugLog(String message) {
        NERLogger.debug(message);
    }

    public static void error(String message) {
        NERLogger.error(message);
    }

    public static void log(String message) {
        NERLogger.info(message);
    }

    public static void log(Level level, String message) {
        NERLogger.log(level, message);
    }

    public static void warn(String message) {
        NERLogger.warn(message);
    }

}