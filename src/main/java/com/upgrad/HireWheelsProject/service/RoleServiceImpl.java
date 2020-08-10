package com.upgrad.HireWheelsProject.service;

import com.upgrad.HireWheelsProject.dao.RoleDAO;
import com.upgrad.HireWheelsProject.entities.Role;
import com.upgrad.HireWheelsProject.exception.UserRoleNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("Role service")
public class RoleServiceImpl implements RoleService{

    @Autowired
    @Qualifier("RoleDAO")
    RoleDAO RoleDAO;

    @Override
    public Role acceptRoleDetails(Role Role) {
        return RoleDAO.save(Role);
    }

    @Override
    public Role findRoleDetails(int RoleId) throws UserRoleNotFoundException {
        Role savedUserRole = RoleDAO.findById(RoleId).get();
        if(savedUserRole == null){
            throw  new UserRoleNotFoundException("User role not found for id : " + RoleId);
        }
        return  savedUserRole;
    }
}

