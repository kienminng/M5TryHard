package com.example.angularm5.respository;

import com.example.angularm5.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepo extends PagingAndSortingRepository<User,Integer> {
    @Query("select u from User u where u.username=:username")
    User findByUsername(String username);

//    @Query(nativeQuery = true, value =
//            "INSERT INTO user_roles (`user_id_user`, `roles_id`) VALUES (idUser=: idUser, 2)")
//    void setRole(@Param("idAccount") int idUser);

}
