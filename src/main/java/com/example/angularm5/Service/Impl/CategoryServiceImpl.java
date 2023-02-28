package com.example.angularm5.Service.Impl;

import com.example.angularm5.Service.interfacePack.ICategoryService;
import com.example.angularm5.model.Category;
import com.example.angularm5.respository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    CategoryRepo categoryRepo;

    @Override
    public List<Category> getAll() {
        return (List<Category>) categoryRepo.findAll();
    }

    @Override
    public Category save(Category category) {
        return categoryRepo.save(category);
    }

    @Override
    public void delete(int id) {
        categoryRepo.deleteById(id);
    }

    @Override
    public Category findById(int id) {
        return categoryRepo.findById(id).get();
    }
}
