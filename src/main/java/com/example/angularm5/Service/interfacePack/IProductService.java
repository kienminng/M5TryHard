package com.example.angularm5.Service.interfacePack;

import com.example.angularm5.Service.CrudService;
import com.example.angularm5.model.Product;

import java.util.List;

public interface IProductService extends CrudService<Product> {
    @Override
    List<Product> getAll();

    @Override
    Product save(Product product);

    @Override
    void delete(int id);

    @Override
    Product findById(int id);
}
