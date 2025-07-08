package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.model.Country;
import com.cognizant.repository.CountryRepository;

import jakarta.transaction.Transactional;

@Service
public class CountryService {
	@Autowired
	private CountryRepository repository;
	@Transactional
	public void addCountry(Country country)
	{
		repository.save(country);
		display(country.getCode());
	}
	public void display(String code)
	{
		System.out.println("country inserted");
		System.out.println(repository.getByCode(code).toString());
	}

}
