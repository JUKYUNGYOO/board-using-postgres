package com.example.wospringmvc.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="freeboard")
public class Freeboard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long freeid;
    private String content;
    private String title;
    private String writer;



}
