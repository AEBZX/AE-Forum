package com.example.blogarticle.mapper;

import com.example.blogarticle.entity.comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface commentMapper extends JpaRepository<comment,Integer> {
    List<comment> findByBlog(Integer blog);
}
