package com.upgrad.HireWheelsProject.dao;

import com.upgrad.HireWheelsProject.entities.RequestStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("RequestStatusDAO")
public interface RequestStatusDAO extends JpaRepository<RequestStatus,Integer> {

}