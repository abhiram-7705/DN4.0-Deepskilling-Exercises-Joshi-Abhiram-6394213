package com.cognizant.spring_learn.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.repository.CountryRepository;
import com.cognizant.spring_learn.service.exception.CountryNotFoundException;


@Service
public class CountryService {
	@Autowired
	private CountryRepository repository;
	 @Transactional
	    public Country findCountryByCode(String countryCode) throws CountryNotFoundException {
	        Optional<Country> result = repository.findById(countryCode);
	        if (!result.isPresent()) {
	            throw new CountryNotFoundException("Country with code " + countryCode + " not found.");
	        }
	        return result.get();
	    }
}
