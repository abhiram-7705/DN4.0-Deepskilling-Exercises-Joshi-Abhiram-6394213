package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.model.Country;
import com.cognizant.repository.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository repository;
	
	
	public List<Country> searchCountry(String code)
	{
		return repository.findByName(code);
	}
	public List<Country> searchByLetter(String letter)
	{
		return repository.findByLetter(letter);
	}
	
}
