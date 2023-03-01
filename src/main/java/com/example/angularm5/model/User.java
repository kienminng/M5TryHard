package com.example.angularm5.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

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
    private int status;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> role;
}
