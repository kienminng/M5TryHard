package com.example.angularm5.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class BillDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.EAGER)
    private Bill bill;
    @ManyToOne(fetch = FetchType.EAGER)
    private User client;
    @ManyToOne
    private Product product;
}
