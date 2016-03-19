package com.cfyifei.config;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NERLogManager {
    public static final Logger NERLogger = LogManager.getLogger("foodcraft");

    /**
     * debugLog����
     *
     * @param message DebugLog��Ϣ
     */
    public static void deBugLog(String message) {
        NERLogger.debug(message);
    }

    /**
     * error����
     *
     * @param message Error��Ϣ
     */
    public static void error(String message) {
        NERLogger.error(message);
    }

    /**
     * log����(INFO)
     *
     * @param message Log��Ϣ
     */
    public static void log(String message) {
        NERLogger.info(message);
    }

    /**
     * log����(�Զ�����ʾ���)
     *
     * @param level   Log��ʾ���
     * @param message Log��Ϣ
     */
    public static void log(Level level, String message) {
        NERLogger.log(level, message);
    }

    public static void warn(String message) {
        NERLogger.warn(message);
    }

}
