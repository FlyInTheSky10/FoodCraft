package com.cfyifei.config;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NERLogManager
{
	public static final Logger NERLogger = LogManager.getLogger("foodcraft");
	
	/**
	 * debugLog方法
	 * @param message DebugLog信息
	 */
	public static void deBugLog(String message)
	{
		NERLogger.debug(message);
	}
	
	/**
	 * error方法
	 * @param message Error信息
	 */
	public static void error(String message)
	{
		NERLogger.error(message);
	}
	
	/**
	 * log方法(INFO)
	 * @param message Log信息
	 */
	public static void log(String message)
	{
		NERLogger.info(message);
	}
	
	/**
	 * log方法(自定义显示类别)
	 * @param level Log显示类别
	 * @param message Log信息
	 */
	public static void log(Level level, String message)
	{
		NERLogger.log(level, message);
	}
	
	public static void warn(String message)
	{
		NERLogger.warn(message);
	}
	
}
