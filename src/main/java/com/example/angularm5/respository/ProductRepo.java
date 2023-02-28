package com.example.angularm5.respository;

import com.example.angularm5.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepo extends PagingAndSortingRepository<Product,Integer> {
}
