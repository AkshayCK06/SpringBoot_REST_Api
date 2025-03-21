package com.example.api.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "City")
public class City {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(nullable = true)
    private String Name;

    
    @Column(name = "CountryCode", nullable = true)
    private String CountryCode;
    

    @Column(nullable = true)
    private String District;


    @Column(nullable = true)
    private int Population;

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    public void printallFields(City c){
        // System.out.println("ID: "+c.getID());
        System.out.println("Name: "+c.getName());
        System.out.println("CountryCode: "+c.getCountryCode());
        System.out.println("District: "+c.getDistrict());
        System.out.println("Population: "+c.getPopulation());
    }
}
