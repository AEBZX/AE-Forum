package com.example.blogfollow.mapper;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.blogfollow.entity.follows;

import java.util.List;

public interface followsMapper extends JpaRepository<follows,Integer> {
    Page<follows> findByFollow(Integer follow, Pageable pageable);
    Page<follows> findByFollowYou(Integer followYou,Pageable pageable);
    List<follows> findByFollow(Integer follow);
    List<follows> findByFollowYou(Integer followYou);
    follows findByFollowAndFollowYou(Integer follow,Integer followYou);
}
