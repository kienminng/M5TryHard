package com.example.angularm5.controller;

import com.example.angularm5.Service.Impl.JwtService;
import com.example.angularm5.Service.Impl.UserServiceImpl;
import com.example.angularm5.model.User;
import com.example.angularm5.model.dto.UserToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/login")
public class LoginAPI {
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserServiceImpl userService;
    @Autowired
    JwtService jwtService;



    @PostMapping
    public UserToken login(@RequestBody User user){
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token = jwtService.createToken(authentication);
        User user1 = userService.findByUsername(user.getUsername());
        UserToken accountToken = new UserToken(user1.getId(),user1.getUsername(),token,user1.getRole());
        return accountToken;
    }
}
