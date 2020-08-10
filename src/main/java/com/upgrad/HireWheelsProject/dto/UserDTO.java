package com.upgrad.HireWheelsProject.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserDTO {
    int userId;
    String first_name;
    String last_name;
    String password;
    String email;
    String mobile_no;
    int wallet_money;
    int RoleId;
    List<Integer> bookingIds;


    public String getfirst_name() {
        return last_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public int getWallet_money() {
        return wallet_money;
    }

    public int getRoleId() {
        return RoleId;
    }





}
