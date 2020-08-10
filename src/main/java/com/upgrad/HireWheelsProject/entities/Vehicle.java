package com.upgrad.HireWheelsProject.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Data
@Entity
public class Vehicle {
    @Id
    @Column(name = "vehicle_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private  String vehicle_model;
    @Column(nullable = false)
    private  char vehicle_number;
    @Column(nullable = false)
    private  String color;
    @Column(nullable = false)
    private  int availability_status;
    @Column(nullable = false)
    private String vehicle_image_url;

    @ManyToOne
    User user;

    @ManyToOne
    Vehicle_subcategory vehicleSubcategory;

    @ManyToOne
    Fuel_type fuelType;

    @ManyToOne
    Location location;

    @OneToMany(mappedBy = "vehicle")
    List<Booking> booking;

    @OneToMany(mappedBy = "vehicle")
    List<Request> request;

}
