package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.model.Country;
import com.cognizant.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {
	
	private static CountryService service;
	
	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(OrmLearnApplication.class, args);
		
		service=context.getBean("countryService",CountryService.class);
		
		testAddCountry();
	}
	
	public static void testAddCountry()
	{
		Country country=new Country("SL","sri-lanka");
		service.addCountry(country);
	}

}
