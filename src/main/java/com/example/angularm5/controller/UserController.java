package com.example.angularm5.controller;

import com.example.angularm5.Service.Impl.UserServiceImpl;
import com.example.angularm5.model.User;
import com.example.angularm5.respository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceImpl userService;
    @Autowired
    private UserRepo userRepo;

    @GetMapping("/list")
    public List<User> getAll() {
        return userService.getAll();
    }

    @PostMapping
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        userService.delete(id);
    }

    @PostMapping("/lock/{id}")
    public void lock(@PathVariable int id){
        User user = userService.findById(id);
        user.setStatus(2);
        userService.save(user);
    }

    @GetMapping("/showUser/{id}")
    public User showProfile(@PathVariable int id){
        return userRepo.findById(id).get();
    }


}
