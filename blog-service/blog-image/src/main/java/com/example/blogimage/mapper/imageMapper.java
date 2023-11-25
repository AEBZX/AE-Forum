package com.example.blogimage.mapper;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.blogimage.entity.image;

public interface imageMapper extends JpaRepository<image,Integer> {
    image findByValue(byte[] value);
}
