package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.service.CountryService;
import com.cognizant.spring_learn.service.exception.CountryNotFoundException;

@SpringBootApplication
public class SpringLearnApplication {

    private static final Logger logger = LoggerFactory.getLogger(SpringLearnApplication.class);
    private static CountryService service;
	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringLearnApplication.class, args);
		service=context.getBean("countryService",CountryService.class);
		getCountryTest();
	}
    private static void getCountryTest() {
        logger.info("Start");
        try {
            Country country =service.findCountryByCode("IND");
            logger.info("Country: {}", country);
        } catch (CountryNotFoundException e) {
            logger.error("Country not found: ", e);
        }
        logger.info("End");
    }
}
