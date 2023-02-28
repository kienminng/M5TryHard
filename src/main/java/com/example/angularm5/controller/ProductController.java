package com.example.angularm5.controller;

import com.example.angularm5.Service.Impl.ProductServiceImpl;
import com.example.angularm5.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductServiceImpl productService;

    @GetMapping("/list")
    public List<Product> list(){
        return productService.getAll();
    }

    @PostMapping
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        productService.delete(id);
    }
}
