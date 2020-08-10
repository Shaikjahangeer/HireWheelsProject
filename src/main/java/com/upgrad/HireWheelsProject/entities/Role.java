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
public class Role {
    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column(unique =  true, nullable = false)
    String role_name;

   public Role(){

   }

    public Role(String role_name) {
        this.role_name = role_name;
    }

    public void setRoleName(String admin) {
    }
    @ManyToMany
    @JoinTable(name = "Role")
    List<User> user;
}
