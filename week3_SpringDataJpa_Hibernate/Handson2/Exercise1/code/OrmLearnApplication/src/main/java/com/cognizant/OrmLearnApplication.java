package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.service.CountryService;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmLearnApplication {

	private static CountryService service;
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		
		service=context.getBean("countryService",CountryService.class);
		
		System.out.println(service.searchCountry("ou"));
		
		System.out.println(service.searchByLetter("S"));
	
	}

}
