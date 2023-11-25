package com.example.query.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class drink implements Serializable {
    private Integer id;
    private String name;
    private Integer money;
}
