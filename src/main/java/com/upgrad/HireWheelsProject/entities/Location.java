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
public class Location {
    @Id
    @Column(name = "location_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String location_name;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String pincode;

    @ManyToOne
    City city;

    @OneToMany(mappedBy = "location")
    List<Booking> bookings;

    @OneToMany(mappedBy = "location")
    List<Vehicle> vehicles;


}
