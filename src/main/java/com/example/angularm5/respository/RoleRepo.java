package com.example.angularm5.respository;

import com.example.angularm5.model.Role;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RoleRepo extends PagingAndSortingRepository<Role,Integer> {
}
