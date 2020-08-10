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
public class City {
    @Id
    @Column(name = "city_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int city_id;
    @Column(nullable = false)
    private String city_name;

    @OneToMany(mappedBy = "city")
    List<Location> locations;


    public City(){ }

    public City(String city_name){
        this.city_name=city_name;
    }

}
