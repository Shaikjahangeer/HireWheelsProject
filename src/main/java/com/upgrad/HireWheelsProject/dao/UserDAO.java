package com.upgrad.HireWheelsProject.dao;


import com.upgrad.HireWheelsProject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("UserDAO")
public interface UserDAO extends  JpaRepository<User, Integer>  {

    User findByEmailAndPassword(String email, String password);
    User findByEmailAndMobile(String email, String mobileNo);
    User findByEmail(String email);
    User findByMobile(String mobileNo);
}