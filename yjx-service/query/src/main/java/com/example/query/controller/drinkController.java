package com.example.query.controller;

import com.example.query.entity.drink;
import com.example.query.mapper.drinkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/drink")
public class drinkController {
    @Autowired
    private drinkMapper drinkMapper;
    @GetMapping("/findAll")
    public List<drink> findAll() {
        return drinkMapper.findAll();
    }

    @GetMapping("/{id}")
    public drink findById(@PathVariable("id") Integer id) {
        return drinkMapper.findById(id);
    }
}
