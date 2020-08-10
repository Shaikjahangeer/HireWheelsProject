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
public class Vehicle_subcategory {
    @Id
    @Column(name = "vehicle_subcategory_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false, unique = true)
    private String vehicle_subcategory_name;
    @Column(nullable = false)
    private int price_per_day;

    @ManyToOne
    Vehicle_category vehicleCategory;

    @OneToMany(mappedBy = "vehicleSubcategory" )
    List<Vehicle> vehicle;

    public void setVehicleTypeName(String suv) {
    }

    public void setCostPerHour(int i) {
    }
}
