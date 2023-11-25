package com.example.blogarticle.controller;

import com.example.blogarticle.entity.article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.blogarticle.entity.comment;
import com.example.blogarticle.mapper.commentMapper;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class commentController {
    @Autowired
    private commentMapper mapper;
    @GetMapping("/findByBlog/{blog}")
    public List<comment> findBy(@PathVariable("blog") Integer title){
        return mapper.findByBlog(title);
    }
    @GetMapping("/{id}")
    public comment findById(@PathVariable("id") Integer id){
        return mapper.findById(id).get();
    }
    @PostMapping("/")
    public comment saveOf(@RequestBody comment article){
        return mapper.save(article);
    }
    @DeleteMapping("/{id}")
    public void deleteThis(@PathVariable("id") Integer id){
        mapper.deleteById(id);
    }
}
