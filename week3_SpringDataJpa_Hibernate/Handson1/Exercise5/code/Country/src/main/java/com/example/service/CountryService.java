package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Country;
import com.example.repository.CountryRepository;

@Service
public class CountryService {
	@Autowired
	private CountryRepository repository;
	public Country getCountry(String code)
	{
		return repository.findByCode(code);
	}

    public Country addCountry(Country country) {
        if (repository.existsById(country.getCode())) {
            throw new RuntimeException("Country already exists with code: " + country.getCode());
        }
        return repository.save(country);
    }

    public Country updateCountry(Country country) {
        if (!repository.existsById(country.getCode())) {
            throw new RuntimeException("Country does not exist with code: " + country.getCode());
        }
        return repository.save(country);
    }

    public void deleteCountry(String code) {
        repository.deleteById(code);
    }

    public List<Country> searchCountriesByName(String partialName) {
        return repository.findByNameContainingIgnoreCase(partialName);
    }
}
