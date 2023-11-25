package com.example.blogarticle.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="title")
    private String title;
    @Column(name="text")
    private String text;
    @Column(name="writer_id")
    private int writeId;
}
