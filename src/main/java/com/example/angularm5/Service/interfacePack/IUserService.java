package com.example.angularm5.Service.interfacePack;

import com.example.angularm5.Service.CrudService;
import com.example.angularm5.model.User;

import java.util.List;

public interface IUserService extends CrudService<User> {
    @Override
    List<User> getAll();

    @Override
    User save(User user);

    @Override
    void delete(int id);

    @Override
    User findById(int id);


}
