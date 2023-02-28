package com.example.angularm5.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String content;
    private int rate;
    private Date date;
    @ManyToOne(fetch = FetchType.EAGER)
    private User client;
    @ManyToOne(fetch = FetchType.EAGER)
    private Product product;
}
