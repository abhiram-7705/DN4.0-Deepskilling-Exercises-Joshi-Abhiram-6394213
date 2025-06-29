package com.cts.slf4jEx3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
	private static final Logger logger=LoggerFactory.getLogger(LoggingExample.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.info("log 1 created....");
		logger.info("log 2 created....");
		logger.debug("log debug 1 created...");
	}

}
