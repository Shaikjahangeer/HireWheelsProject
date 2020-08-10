package com.upgrad.HireWheelsProject.dao;


import com.upgrad.HireWheelsProject.entities.Fuel_type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("Fuel_typeDAO")
public interface Fuel_typeDAO extends JpaRepository<Fuel_type,Integer> {

}