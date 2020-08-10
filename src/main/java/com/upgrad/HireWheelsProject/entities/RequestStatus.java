package com.upgrad.HireWheelsProject.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "request_status")
public class RequestStatus {

    @Id
    @Column(name = "request_status_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "request_status_name" , nullable = false , unique = true)
    private String requestStatusName;

    @OneToMany(mappedBy = "requestStatus")
    List<Request> requests;
}

