package com.example.bloguser.mapper;

import com.example.bloguser.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userMapper extends JpaRepository<user,Integer> {
    user findByUsername(String username);
    user findByPassword(String password);
    user findByUsernameAndPassword(String username,String password);
}
