package com.example.query.controller;

import com.example.query.entity.desktop;
import com.example.query.mapper.desktopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/desktop")
public class desktopController {
    @Autowired
    private desktopMapper desktopMapper;
    @GetMapping("/findAll")
    public List<desktop> findAll(){
        return desktopMapper.findAll();
    }
    @GetMapping("/{id}")
    public desktop findById(@PathVariable Integer id){
        return desktopMapper.findById(id);
    }
}
