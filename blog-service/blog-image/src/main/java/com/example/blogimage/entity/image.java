package com.example.blogimage.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="value")
    private byte[] value;
    @Column(name="name")
    private String name;
}
