package com.logging.logexample.javalogger;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerDemo {

	public static void main(String[] args) {
		DemoLogger demo = new DemoLogger();
		demo.makeSomeLog();
		
		LogManager logMgr = LogManager.getLogManager();
		Logger log = logMgr.getLogger(Logger.GLOBAL_LOGGER_NAME);
		log.log(Level.ALL, "Log from LoggerDemo class");

	}

}
