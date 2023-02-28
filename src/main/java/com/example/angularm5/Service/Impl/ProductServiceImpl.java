package com.example.angularm5.Service.Impl;

import com.example.angularm5.Service.interfacePack.IProductService;
import com.example.angularm5.model.Product;
import com.example.angularm5.respository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    ProductRepo productRepo;

    @Override
    public List<Product> getAll() {
        return (List<Product>) productRepo.findAll();
    }

    @Override
    public Product save(Product product) {
        return productRepo.save(product);
    }

    @Override
    public void delete(int id) {
        productRepo.deleteById(id);
    }

    @Override
    public Product findById(int id) {
        return productRepo.findById(id).get();
    }
}
