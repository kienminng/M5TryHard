package com.example.angularm5.respository;

import com.example.angularm5.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepo extends PagingAndSortingRepository<User,Integer> {
    @Query("select u from User u where u.username=:username")
    User findByUsername(String username);

}
