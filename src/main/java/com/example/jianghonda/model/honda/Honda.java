package com.example.jianghonda.model.honda;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Honda{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String img_honda;
    private String name_honda;
    private String video_honda;
    private String category_name;


}
