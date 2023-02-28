package com.example.angularm5.Service.Impl;

import com.example.angularm5.Service.interfacePack.ICommentService;
import com.example.angularm5.model.Comment;
import com.example.angularm5.respository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements ICommentService {
    @Autowired
    CommentRepo commentRepo;

    @Override
    public List<Comment> getAll() {
        return (List<Comment>) commentRepo.findAll();
    }

    @Override
    public Comment save(Comment comment) {
        return commentRepo.save(comment);
    }

    @Override
    public void delete(int id) {
        commentRepo.deleteById(id);
    }

    @Override
    public Comment findById(int id) {
        return commentRepo.findById(id).get();
    }

    public List<Comment> getAllByProduct(int id){
        return commentRepo.getAllByProduct_Id(id);
    }

}
