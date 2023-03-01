package com.example.angularm5.model.dto;

import com.example.angularm5.model.Role;

import java.util.List;

public class UserToken {
    private int id;
    private String username;
    private String token;

    private List<Role> roles;
}
