package com.example.angularm5.Service.interfacePack;

import com.example.angularm5.Service.CrudService;
import com.example.angularm5.model.Comment;

import java.util.List;

public interface ICommentService extends CrudService<Comment> {
    @Override
    List<Comment> getAll();

    @Override
    Comment save(Comment comment);

    @Override
    void delete(int id);

    @Override
    Comment findById(int id);
}
