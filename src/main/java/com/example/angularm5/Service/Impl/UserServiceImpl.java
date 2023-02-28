package com.example.angularm5.Service.Impl;

import com.example.angularm5.Service.interfacePack.IUserService;
import com.example.angularm5.model.User;
import com.example.angularm5.respository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserRepo userRepo;

    @Override
    public List<User> getAll() {
        return (List<User>) userRepo.findAll();
    }

    @Override
    public User save(User user) {
        return userRepo.save(user);
    }

    @Override
    public void delete(int id) {
        userRepo.deleteById(id);
    }

    @Override
    public User findById(int id) {
        return userRepo.findById(id).get();
    }

    public User findByUsername(String username){
        return userRepo.findByUsername(username);
    }
}
