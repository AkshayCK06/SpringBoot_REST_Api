package com.example.api.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.Entity.City;
import com.example.api.Repo.CityRepository;

@Service
public class Cityservice {
    
CityRepository cityRepository;

@Autowired
public Cityservice(CityRepository cityRepository) {
    this.cityRepository = cityRepository;
}

//ccreate operation

public City saveCity(City c){
    return cityRepository.save(c);
}

public List<City> getallFields(){
    System.out.println("=================getallFields=====================");
    return cityRepository.findAll();
}



}
