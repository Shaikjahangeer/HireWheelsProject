package com.upgrad.HireWheelsProject.dao;

import com.upgrad.HireWheelsProject.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("BookingDAO")
public interface BookingDAO extends JpaRepository<Booking,Integer> {

}