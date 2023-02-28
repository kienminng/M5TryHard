package com.example.angularm5.respository;

import com.example.angularm5.model.ReplyComment;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ReplyCommentRepo extends PagingAndSortingRepository<ReplyComment,Integer> {
    List<ReplyComment> findAllByComment_Id(int id);
}
