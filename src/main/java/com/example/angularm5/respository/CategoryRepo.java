package com.example.angularm5.respository;

import com.example.angularm5.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CategoryRepo extends PagingAndSortingRepository<Category,Integer> {
}
