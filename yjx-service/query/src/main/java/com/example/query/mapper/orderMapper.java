package com.example.query.mapper;

import com.example.query.entity.order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface orderMapper {
    List<order> findAll();
    int insert(order order);
    order findByDesktopId(Integer desktopId);
    void delete();
}
