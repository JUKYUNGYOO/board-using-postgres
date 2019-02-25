package com.example.wospringmvc.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="freeboard")
public class Freeboard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="freeId")
    private Long freeId;

    @Column(name="content")
    private String content;

    @Column(name="title")
    private String title;
    @Column(name="writer")
    private String writer;

    public Long getFreeId() {
        return freeId;
    }

    public void setFreeId(Long freeId) {
        this.freeId = freeId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
