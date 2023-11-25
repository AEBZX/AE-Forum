package com.example.blogarticle.entity;

import javax.persistence.*;

@Entity
public class comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="writer")
    private Integer writer;
    @Column(name="label")
    private String label;
    @Column(name="blog")
    private Integer blog;
}
