package com.example.query.mapper;

import com.example.query.entity.desktop;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface desktopMapper {
    List<desktop> findAll();
    desktop findById(Integer id);
    List<desktop> findByPage(Map<String,Object> map);
    long findByCount();
}
