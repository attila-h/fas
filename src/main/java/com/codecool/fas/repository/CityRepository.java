package com.codecool.fas.repository;

import com.codecool.fas.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City,Long> {
    List<City> findByCityImageNotNull();
    City findFirstByCountryNameEqualsIgnoreCase(String countryName);
}
