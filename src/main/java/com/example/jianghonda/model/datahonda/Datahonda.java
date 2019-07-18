package com.example.jianghonda.model.datahonda;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Datahonda{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String honda_id;
    private String data_honda;
    private String detail;
    private String image;
    


}