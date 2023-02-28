package com.example.angularm5.Service.interfacePack;

import com.example.angularm5.Service.CrudService;
import com.example.angularm5.model.ReplyComment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IReplyCommentService extends CrudService<ReplyComment> {
    @Override
    List<ReplyComment> getAll();

    @Override
    ReplyComment save(ReplyComment replyComment);

    @Override
    void delete(int id);

    @Override
    ReplyComment findById(int id);
}
