package com.example.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.model.Country;
import com.example.service.CountryService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/getCountry")
    public Country getCountry(@RequestParam String code) {
        return countryService.getCountry(code);
    }

    @PostMapping("/addCountry")
    public Country addCountry(@RequestBody Country country) {
        return countryService.addCountry(country);
    }

    @PutMapping("/updateCountry")
    public Country updateCountry(@RequestBody Country country) {
        return countryService.updateCountry(country);
    }

    @DeleteMapping("/deleteCountry")
    public void deleteCountry(@RequestParam String code) {
        countryService.deleteCountry(code);
    }

    @GetMapping("/search")
    public List<Country> searchCountries(@RequestParam String name) {
        return countryService.searchCountriesByName(name);
    }
}
