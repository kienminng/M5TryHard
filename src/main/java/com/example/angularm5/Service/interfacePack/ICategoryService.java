package com.example.angularm5.Service.interfacePack;

import com.example.angularm5.Service.CrudService;
import com.example.angularm5.model.Category;

import java.util.List;

public interface ICategoryService extends CrudService<Category> {
    @Override
    List<Category> getAll();

    @Override
    Category save(Category category);

    @Override
    void delete(int id);

    @Override
    Category findById(int id);
}
