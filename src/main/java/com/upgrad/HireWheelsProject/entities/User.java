package com.upgrad.HireWheelsProject.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

//import sun.security.util.Length;

@Data
@Getter
@Setter
@Entity
@Table(name="User")
public class User {
    @Id
    @Column(name = "users_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="SEQUENCE1")
   // @SequenceGenerator(name="SEQUENCE1", sequenceName="SEQUENCE1", allocationSize=1)
    private int id;

    @Column(nullable = false)
    private String first_name;

    @Column
    private  String last_name;

    @Column(nullable = false , columnDefinition = "varchar(50) check (length(password)>5)")
    private  String password;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private  String mobile_no;

    @Column(nullable = false , columnDefinition = "NUMBER(10,2) DEFAULT(100000.00)")
    private double wallet_money;

    @ManyToOne
    @JsonBackReference
    Role Role;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public double getWallet_money() {
        return wallet_money;
    }

    public void setWallet_money(double wallet_money) {
        this.wallet_money = wallet_money;
    }

    public Role getUserRole() {
        return Role;
    }

    public void setUserRole(Role userRole) {
        this.Role = userRole;
    }

    @OneToMany(mappedBy = "user")
    List<Booking> bookings;


}
