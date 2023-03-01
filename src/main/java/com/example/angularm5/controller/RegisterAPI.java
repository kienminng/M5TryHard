package com.example.angularm5.controller;

import com.example.angularm5.Service.Impl.UserServiceImpl;
import com.example.angularm5.model.Role;
import com.example.angularm5.model.User;
import com.example.angularm5.respository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/register")
public class RegisterAPI {
    @Autowired
    UserServiceImpl userService;
    @Autowired
    private UserRepo userRepo;

    @PostMapping
    public void save(@RequestBody User user){
        List<Role> roles = new ArrayList<>();
        Role role = new Role();
        role.setId(2);
        roles.add(role);
        user.setStatus(1);
        user.setRole(roles);
        userService.save(user);
    }
}
