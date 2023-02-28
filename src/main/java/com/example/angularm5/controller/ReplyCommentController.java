package com.example.angularm5.controller;

import com.example.angularm5.Service.Impl.ReplyCommentServiceImpl;
import com.example.angularm5.model.ReplyComment;
import com.example.angularm5.respository.ReplyCommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/replyComment")
public class ReplyCommentController {

    @Autowired
    ReplyCommentServiceImpl replyCommentService;
    @Autowired
    private ReplyCommentRepo replyCommentRepo;

    @GetMapping("/comment/{id}")
    public List<ReplyComment> replyCommentList(@PathVariable int id){
        return replyCommentRepo.findAllByComment_Id(id);
    }

    @PostMapping
    public ReplyComment save(@RequestBody ReplyComment replyComment){
        return replyCommentService.save(replyComment);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        replyCommentService.delete(id);
    }

    @GetMapping("/{id}")
    public ReplyComment findById(@PathVariable int id){
        return replyCommentService.findById(id);
    }
}
