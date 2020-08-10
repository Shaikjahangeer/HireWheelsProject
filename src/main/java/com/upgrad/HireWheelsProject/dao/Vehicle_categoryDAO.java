package com.upgrad.HireWheelsProject.dao;


import com.upgrad.HireWheelsProject.entities.Vehicle_category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("Vehicle_categoryDAO")
public interface Vehicle_categoryDAO extends JpaRepository<Vehicle_category,Integer> {

}