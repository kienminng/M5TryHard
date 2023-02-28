package com.example.angularm5.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nameProduct;
    private String img;
    private double price;
    private int quantity;
    private boolean status;
    @ManyToOne
    private User user;
}
