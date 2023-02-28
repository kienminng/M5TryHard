package com.example.angularm5.respository;

import com.example.angularm5.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ProductRepo extends PagingAndSortingRepository<Product,Integer> {
    @Query("select p from Product p where p.category.name=:name")
    List<Product> getAllByCategory_Name(String name);
}
