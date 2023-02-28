package com.example.angularm5.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    private String avatar;
    private String address;
    private String phoneNumber;
    private boolean status;
    @ManyToOne
    private Role role;
}
