package com.example.jianghonda.model.producthonda;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Producthonda{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String honda_id;
    private String product_honda;
}