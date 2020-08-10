package com.upgrad.HireWheelsProject.service;


import com.upgrad.HireWheelsProject.dto.ForgetPWDDTO;
import com.upgrad.HireWheelsProject.entities.User;
import com.upgrad.HireWheelsProject.exception.UserAlreadyExistsException;
import com.upgrad.HireWheelsProject.exception.UserDetailsNotFoundException;

public interface UserService {
    User acceptUserDetails(User user) throws UserAlreadyExistsException;
    User updateUserDetails(int userId, User user) throws UserDetailsNotFoundException;
    User findUserDetails(int userId) throws UserDetailsNotFoundException;
    User deleteUserDetails(int userId);
    User updatePassword(ForgetPWDDTO forgetPWDDTO);
}