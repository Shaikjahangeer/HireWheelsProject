package com.upgrad.HireWheelsProject.dao;


import com.upgrad.HireWheelsProject.entities.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("RequestDAO")
public interface RequestDAO extends JpaRepository<Request,Integer> {

}