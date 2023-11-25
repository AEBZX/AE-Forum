package com.example.query.controller;

import com.example.query.entity.order;
import com.example.query.mapper.orderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class orderController {
    @Autowired
    private orderMapper orderMapper;
    @GetMapping("/findAll")
    public List<order> findAll(){
        return orderMapper.findAll();
    }
    @PostMapping("/insert")
    public void insert(@RequestBody order order){
        orderMapper.insert(order);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        orderMapper.delete();
    }
}
