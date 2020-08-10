package com.upgrad.HireWheelsProject.service;

import com.upgrad.HireWheelsProject.dao.UserDAO;
import com.upgrad.HireWheelsProject.dto.ForgetPWDDTO;
import com.upgrad.HireWheelsProject.entities.User;
import com.upgrad.HireWheelsProject.exception.UserAlreadyExistsException;
import com.upgrad.HireWheelsProject.exception.UserDetailsNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userDAO")
    UserDAO userDAO;

    @Override
    public User acceptUserDetails(User user) throws UserAlreadyExistsException {
        User savedUserEmail = userDAO.findByEmail(user.getEmail());
        User savedUserMobile = userDAO.findByMobile(user.getMobile_no());
        if(savedUserEmail != null || savedUserMobile != null){
            throw new UserAlreadyExistsException("User with email :" + user.getEmail() +
                    " User with mobile :" + user.getMobile_no() + "already exists" );
        }
        User savedUser = userDAO.save(user);
        return savedUser;
    }

    @Override
    public User updateUserDetails(int userId, User user) throws UserDetailsNotFoundException {
        User savedUser = findUserDetails(userId);
        User updatedUser = userDAO.save(user);
        return updatedUser;
    }

    @Override
    public User findUserDetails(int userId) throws UserDetailsNotFoundException {
        User savedUser = userDAO.findById(userId).get();
        if(savedUser == null) {
            throw new UserDetailsNotFoundException("user details not found for id : " + userId);
        }
        return savedUser;
    }

    @Override
    public User deleteUserDetails(int userId) {
        return null;
    }

    @Override
    public User updatePassword(ForgetPWDDTO forgetPWDDTO) {
        return null;
    }


}