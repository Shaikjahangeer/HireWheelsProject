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
public class Vehicle_category {
    @Id
    @Column(name = "vehicle_category_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false, unique = true)
    private  String vehicle_category_name;

    @OneToMany(mappedBy = "vehicleCategory")
    List<Vehicle_subcategory> vehicleSubcategories;

    public void setVehicleCategoryName(String car) {
    }
}
