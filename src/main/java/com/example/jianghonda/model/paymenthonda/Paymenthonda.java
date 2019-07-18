package com.example.jianghonda.model.paymenthonda;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Paymenthonda{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String honda_id;
    private String payment_honda;
}