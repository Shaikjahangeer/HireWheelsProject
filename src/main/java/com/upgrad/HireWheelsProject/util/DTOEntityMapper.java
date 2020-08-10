package com.upgrad.HireWheelsProject.util;

import com.upgrad.HireWheelsProject.dto.UserDTO;
import com.upgrad.HireWheelsProject.entities.User;
import com.upgrad.HireWheelsProject.exception.UserRoleNotFoundException;
import com.upgrad.HireWheelsProject.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DTOEntityMapper {

    @Autowired
    RoleService RoleService;

    public User convertUserDTOUser(UserDTO userDTO) throws UserRoleNotFoundException {
        User user = new User();
        user.setFirst_name(userDTO.getfirst_name());
        user.setLast_name(userDTO.getLast_name());
        user.setWallet_money(userDTO.getWallet_money());
        user.setPassword(userDTO.getPassword());
        user.setEmail(userDTO.getEmail());
        user.setUserRole(RoleService.findRoleDetails(userDTO.getRoleId()));
        return user;
    }
}
