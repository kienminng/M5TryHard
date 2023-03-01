package com.example.angularm5.model.dto;

import com.example.angularm5.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import java.util.List;

@Data
@AllArgsConstructor
public class UserToken {
    private int id;
    private String username;
    private String token;

    private List<Role> roles;
}
