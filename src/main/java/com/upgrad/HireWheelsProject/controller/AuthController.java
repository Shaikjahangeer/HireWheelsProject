package com.upgrad.HireWheelsProject.controller;

import com.upgrad.HireWheelsProject.dto.CustomResponse;
import com.upgrad.HireWheelsProject.dto.ForgetPWDDTO;
import com.upgrad.HireWheelsProject.dto.UserDTO;
import com.upgrad.HireWheelsProject.entities.User;
import com.upgrad.HireWheelsProject.exception.UserAlreadyExistsException;
import com.upgrad.HireWheelsProject.exception.GlobalExceptionHandler;
import com.upgrad.HireWheelsProject.exception.UserRoleNotFoundException;
import com.upgrad.HireWheelsProject.service.UserService;
import com.upgrad.HireWheelsProject.util.DTOEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class AuthController {
    @Autowired
    UserService userService;

    @Autowired
    DTOEntityMapper dtoEntityMapper;

    @PostMapping("/users")
    public ResponseEntity userSignUp(@RequestBody UserDTO userDTO) throws GlobalExceptionHandler, UserRoleNotFoundException, UserAlreadyExistsException {
        ResponseEntity responseEntity = null;
        User newUser = dtoEntityMapper.convertUserDTOUser(userDTO);
        User functionReturn = userService.acceptUserDetails(newUser);
        if (functionReturn != null) {
            CustomResponse response = new CustomResponse(new Date(), "User Successfully Signed Up", 200);
            responseEntity = new ResponseEntity(response, HttpStatus.OK);
        }
        return responseEntity;
    }

    @PutMapping("/users/password")
    public ResponseEntity changePassword(@RequestBody ForgetPWDDTO forgetPWDDTO) throws Exception {
        ResponseEntity responseEntity = null;
        User functionReturn = userService.updatePassword(forgetPWDDTO);
        if (functionReturn != null) {
            CustomResponse response = new CustomResponse(new Date(), "Password Successfully Changed", 200);
            return new ResponseEntity(response, HttpStatus.OK);
        }
        return responseEntity;
    }
}
