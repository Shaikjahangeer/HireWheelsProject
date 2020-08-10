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
public class Fuel_type {
    @Id
    @Column(name = "fuel_type_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(unique = true, nullable = false)
    private String fuel_type;
    public Fuel_type(){ }

    public Fuel_type(String fuel_type){
        this.fuel_type=fuel_type;
    }

    @OneToMany(mappedBy = "city")
    List<Location> locations;

    public void setFuel_type(String petrol) {
    }
}
