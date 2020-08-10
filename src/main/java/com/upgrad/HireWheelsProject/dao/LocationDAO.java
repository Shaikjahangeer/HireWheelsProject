package com.upgrad.HireWheelsProject.dao;


import com.upgrad.HireWheelsProject.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("LocationDAO")
public interface LocationDAO extends JpaRepository<Location,Integer> {

}