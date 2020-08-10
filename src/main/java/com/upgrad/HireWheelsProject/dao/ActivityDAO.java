package com.upgrad.HireWheelsProject.dao;


import com.upgrad.HireWheelsProject.entities.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("ActivityDAO")
public interface ActivityDAO extends JpaRepository<Activity,Integer> {

}