package com.example.api.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api.Entity.City;

@Repository
public interface CityRepository extends JpaRepository<City,Integer> {

    
} 
