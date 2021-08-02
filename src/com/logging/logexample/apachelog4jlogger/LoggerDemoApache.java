package com.logging.logexample.apachelog4jlogger;

import org.apache.log4j.Logger;

public class LoggerDemoApache {
	
	private static final Logger LOG = Logger.getLogger(LoggerDemoApache.class);
	
	public static void main(String[] args) {
		
		LOG.info("Apache log4j : Main excecution started.......");
		
		try {
			int a = 89;
			LOG.warn("Starting to perform operation : division by zero....");
			int b = a/0;
			System.out.println(b);
		}
		catch (ArithmeticException e) {
			LOG.error(e);
		}
		finally {
			LOG.info("Execution completed..");
		}
		System.out.println("Logger ends here..");
	}
}
