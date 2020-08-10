package com.upgrad.HireWheelsProject.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class Request {

    @Id
    @Column(name = "request_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "user_comments")
    private String userComments;

    @Column(name = "admin_comments")
    private String adminComments;

    @ManyToOne
    @JoinColumn(name = "userId")
    User users;

    @ManyToOne
    Activity activity;

    @ManyToOne
    @JoinColumn(name = "request_status_id")
    RequestStatus requestStatus;

    @ManyToOne
    Vehicle vehicle;
}