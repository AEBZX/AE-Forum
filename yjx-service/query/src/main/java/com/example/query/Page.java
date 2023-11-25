package com.example.query;

import lombok.Data;

import java.util.List;
@Data
public class Page<T> {
    private int page;
    private int size;
    private List<T> data;
    private long total;
}


