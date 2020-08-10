package com.upgrad.HireWheelsProject.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Booking {
    @Id
    @Column(name = "booking_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int booking_id;

    @Column( nullable = false)
    private Date pickup_date;

    @Column( nullable = false)
    private Date dropoff_date;

    @Column( nullable = false)
    private Date booking_date;

    @Column( nullable = false,columnDefinition = "NUMBER(10,2)")
    private Double amount;

    @ManyToOne
    User user;

}
