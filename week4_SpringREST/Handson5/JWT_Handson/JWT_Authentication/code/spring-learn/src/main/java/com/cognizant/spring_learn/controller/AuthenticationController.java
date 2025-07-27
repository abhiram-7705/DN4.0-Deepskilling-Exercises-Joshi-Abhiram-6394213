package com.cognizant.spring_learn.controller;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class AuthenticationController {

	
	private static final Logger LOGGER=LoggerFactory.getLogger(AuthenticationController.class);
	
	@GetMapping("/authenticate")
	public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader)
	{
		LOGGER.info("started...");
		
		LOGGER.debug(authHeader);
		
		Map<String,String> map=new HashMap<String,String>();
		String user=getUser(authHeader);
		String token=generateJwt(user);
		map.put("token",token);
		LOGGER.debug("user : "+user);
		LOGGER.debug("token : "+token);
		LOGGER.info("ended...");
		return map;
	}
	private String getUser(String authHeader)
	{
		String encodedCredentials=authHeader.substring(6);
		String decoded=new String(Base64.getDecoder().decode(encodedCredentials));
		int idx=decoded.indexOf(":");
		return decoded.substring(0, idx);
	}
	private String generateJwt(String user)
	{
		JwtBuilder builder=Jwts.builder();
		builder.setSubject(user);
		builder.setIssuedAt(new Date());
		builder.setExpiration(new Date(new Date().getTime()+1200000));
		builder.signWith(SignatureAlgorithm.HS256, "secretkey");
		String token=builder.compact();
		return token;
	}
	
}
