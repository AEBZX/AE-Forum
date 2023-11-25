package com.example.query.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class desktop implements Serializable {
    private Integer id;
    private Integer floor;
    private Integer address;
    private Integer number;
    private Integer desktop;
}
