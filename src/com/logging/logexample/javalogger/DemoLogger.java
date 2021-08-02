package com.logging.logexample.javalogger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoLogger {
	
	private final static Logger LOG = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public void makeSomeLog() {
		LOG.log(Level.INFO, "Log Message");
	}
}
