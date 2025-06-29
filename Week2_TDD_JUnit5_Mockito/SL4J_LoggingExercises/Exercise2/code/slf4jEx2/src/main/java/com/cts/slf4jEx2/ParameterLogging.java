package com.cts.slf4jEx2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterLogging {
	
	private static final Logger logger=LoggerFactory.getLogger(ParameterLogging.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.info("this is an example of parameter passing to logger: {}","parameter passed !!");
		logger.info("this is an example of passing an integer as parameter :{}",20);
	}

}
