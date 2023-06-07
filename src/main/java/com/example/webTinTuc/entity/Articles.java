package com.example.webTinTuc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Articles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String tile;
    private String content;
//    private String url;
    private String author_id;
    private Integer category_id;
    private Date creat_at;

}
