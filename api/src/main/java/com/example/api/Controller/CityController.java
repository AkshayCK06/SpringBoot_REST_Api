package com.example.api.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.Entity.City;
import com.example.api.Repo.CityRepository;
import com.example.api.Service.Cityservice;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/v1")
public class CityController {
    
    private Cityservice cityservice;
    
    public CityController(Cityservice city) {
        this.cityservice = city;
    }

    @PostMapping("/city")
    public ResponseEntity<City> postCityFields(@RequestBody City entity) {
        //TODO: process POST request
        entity.printallFields(entity);

        City newCity = cityservice.saveCity(entity);
        return ResponseEntity.ok(newCity);
    }

    @GetMapping("/getCities")
    public List<City> getMethodName() {
        System.out.println("=======================from controller==================");
        List<City> response = cityservice.getallFields();
        for (City city : response) {
            System.out.println("in resp:: "+city);
        }
        return response;
    }
    
    

    
}
