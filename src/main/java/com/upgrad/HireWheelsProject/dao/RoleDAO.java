package com.upgrad.HireWheelsProject.dao;


import com.upgrad.HireWheelsProject.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("RoleDAO")
public interface RoleDAO extends JpaRepository<Role,Integer> {


    Role findByUserRoleName(String Role);
}