package com.example.query.controller;

import com.example.query.entity.food;
import com.example.query.mapper.foodMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/food")
public class foodController {
    @Autowired
    private foodMapper foodMapper;
    @GetMapping("/findAll")
    public List<food> findAll(){
        return foodMapper.findAll();
    }
    @GetMapping("/{id}")
    public food findById(@PathVariable("id") Integer id){
        return foodMapper.findById(id);
    }
}
