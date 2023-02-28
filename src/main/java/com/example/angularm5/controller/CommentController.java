package com.example.angularm5.controller;

import com.example.angularm5.Service.Impl.CommentServiceImpl;
import com.example.angularm5.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    CommentServiceImpl commentService;

    @GetMapping("/product/{id}")
    public List<Comment> list(@PathVariable int id){
        return commentService.getAllByProduct(id);
    }

    @PostMapping
    public Comment save(@RequestBody Comment comment){
        return commentService.save(comment);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        commentService.delete(id);
    }

}
