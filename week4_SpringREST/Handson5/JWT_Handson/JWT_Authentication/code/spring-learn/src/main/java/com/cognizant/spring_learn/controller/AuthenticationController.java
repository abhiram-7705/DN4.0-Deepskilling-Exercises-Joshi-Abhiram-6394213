package com.cognizant.spring_learn.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

	
	private static final Logger LOGGER=LoggerFactory.getLogger(AuthenticationController.class);
	
	@GetMapping("/authenticate")
	public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader)
	{
		LOGGER.info("started...");
		
		LOGGER.debug(authHeader);
		
		Map<String,String> map=new HashMap<String,String>();
		map.put("token","");
		
		LOGGER.info("ended...");
		return map;
	}
	
}
