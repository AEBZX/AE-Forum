package com.example.blogarticle.mapper;
import com.example.blogarticle.entity.article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface articleMapper extends JpaRepository<article,Integer> {
    List<article> findByTitleContaining(String title);
    List<article> findByWriteId(Integer id);
}
