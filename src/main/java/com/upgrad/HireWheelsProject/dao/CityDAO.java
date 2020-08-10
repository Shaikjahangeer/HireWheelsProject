package com.upgrad.HireWheelsProject.dao;


import com.upgrad.HireWheelsProject.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("CityDAO")
public interface CityDAO extends JpaRepository<City,Integer> {

}