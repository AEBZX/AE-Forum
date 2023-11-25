package com.example.query.mapper;

import com.example.query.entity.drink;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface drinkMapper {
    List<drink> findAll();
    drink findById(Integer id);
    List<drink> findByPage(Map<String,Object> map);
    long findByCount();
}
