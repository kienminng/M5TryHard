package com.example.angularm5.respository;

import com.example.angularm5.model.Comment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CommentRepo extends PagingAndSortingRepository<Comment,Integer> {
    @Query("select c from Comment c where c.product.id=:id")
    List<Comment> getAllByProduct_Id(int id);
}
