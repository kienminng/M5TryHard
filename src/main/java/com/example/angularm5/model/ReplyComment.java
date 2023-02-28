package com.example.angularm5.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ReplyComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String content;
    @ManyToOne
    Comment comment;
    @ManyToOne
    User user;
}
