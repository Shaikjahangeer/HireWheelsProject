package com.upgrad.HireWheelsProject.dao;

import com.upgrad.HireWheelsProject.entities.Vehicle_subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("Vehicle_subcategory")
public interface Vehicle_subcategoryDAO extends JpaRepository<Vehicle_subcategory,Integer> {

}