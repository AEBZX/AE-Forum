package com.example.query.mapper;

import com.example.query.entity.food;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface foodMapper {
    List<food> findAll();
    food findById(Integer id);
    List<food> findByPage(Map<String,Object> map);
    long findByCount();
}
