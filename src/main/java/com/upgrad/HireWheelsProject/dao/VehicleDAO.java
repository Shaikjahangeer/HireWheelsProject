package com.upgrad.HireWheelsProject.dao;


import com.upgrad.HireWheelsProject.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("VehicleDAO")
public interface VehicleDAO extends JpaRepository<Vehicle,Integer> {

}