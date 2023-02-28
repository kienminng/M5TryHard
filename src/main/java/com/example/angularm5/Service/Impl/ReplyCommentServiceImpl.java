package com.example.angularm5.Service.Impl;

import com.example.angularm5.Service.interfacePack.IReplyCommentService;
import com.example.angularm5.model.ReplyComment;
import com.example.angularm5.respository.ReplyCommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReplyCommentServiceImpl implements IReplyCommentService {
    @Autowired
    ReplyCommentRepo replyCommentRepo;

    @Override
    public List<ReplyComment> getAll() {
        return (List<ReplyComment>) replyCommentRepo.findAll();
    }

    public List<ReplyComment> getAllByComment_Id(int id){
        return replyCommentRepo.findAllByComment_Id(id);
    }

    @Override
    public ReplyComment save(ReplyComment replyComment) {
        return replyCommentRepo.save(replyComment);
    }

    @Override
    public void delete(int id) {
        replyCommentRepo.deleteById(id);
    }

    @Override
    public ReplyComment findById(int id) {
        return replyCommentRepo.findById(id).get();
    }
}
