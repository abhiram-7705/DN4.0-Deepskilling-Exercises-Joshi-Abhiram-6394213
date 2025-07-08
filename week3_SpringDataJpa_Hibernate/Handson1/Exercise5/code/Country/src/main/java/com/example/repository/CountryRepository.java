package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {
	
	public Country findByCode(String code);
	 List<Country> findByNameContainingIgnoreCase(String partialName);

}
