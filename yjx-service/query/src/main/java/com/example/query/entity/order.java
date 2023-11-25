package com.example.query.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class order implements Serializable {
    private Integer id;
    private Integer desktopId;
    private String drink;
    private String food;
}
