package com.cognizant.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country,String> {
	@Query("SELECT c FROM Country c WHERE LOWER(c.name) LIKE LOWER(CONCAT('%', :name, '%')) ORDER BY c.name ASC")
	public List<Country> findByName(String name);
	
	@Query("SELECT c FROM Country c WHERE LOWER(c.name) LIKE LOWER(CONCAT(:letter, '%')) ORDER BY c.name ASC")
	public List<Country> findByLetter(String letter);
}
