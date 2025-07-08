package com.cognizant.spring_learn.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.spring_learn.service.CountryService;
import com.cognizant.spring_learn.service.exception.CountryNotFoundException;


@RestController
@RequestMapping("/api")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/getCountry")
    public String getCountry(@RequestParam String code) throws CountryNotFoundException {
        return countryService.findCountryByCode(code).toString();
    }
}
