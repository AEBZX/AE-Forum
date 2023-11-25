package com.example.query.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class food implements Serializable {
    private Integer id;
    private String name;
    private Integer money;
}
