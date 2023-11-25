package com.example.blogfollow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import com.example.blogfollow.entity.follows;
import com.example.blogfollow.mapper.followsMapper;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
public class followsController {
    @Autowired
    private followsMapper mapper;
    @GetMapping("/follow/{follow}/{page}/{size}")
    public Page<follows> follows(@PathVariable("follow") Integer follow,
                                 @PathVariable("page") Integer page,
                                 @PathVariable("size") Integer size){
        Pageable pageable= PageRequest.of(page,size);
        return mapper.findByFollow(follow,pageable);
    }
    @GetMapping("/follow/{follow}")
    public List<follows> follow(@PathVariable("follow") Integer follow){
        return mapper.findByFollow(follow);
    }
    @GetMapping("/you/{you}")
    public List<follows> you(@PathVariable("you") Integer you){
        return mapper.findByFollowYou(you);
    }
    @GetMapping("/you/{you}/{page}/{size}")
    public Page<follows> yous(@PathVariable("you") Integer you,
                              @PathVariable("page") Integer page,
                              @PathVariable("size") Integer size){
        Pageable pageable=PageRequest.of(page,size);
        return mapper.findByFollowYou(you,pageable);
    }
    @GetMapping("/find/{follow}/{you}")
    public follows find(@PathVariable("follow") Integer follow,
                        @PathVariable("you") Integer you){
        return mapper.findByFollowAndFollowYou(follow,you);
    }
    @PostMapping("/")
    public void insert(@RequestBody follows follows){
        boolean a=true;
        follows follow=mapper.findByFollowAndFollowYou(follows.getFollow(),follows.getFollowYou());
        if(follow!=null){
            a=false;
        }
        if(a){
            mapper.save(follows);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        mapper.deleteById(id);
    }
}
