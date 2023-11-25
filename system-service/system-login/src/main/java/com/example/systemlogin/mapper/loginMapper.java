package com.example.systemlogin.mapper;
import com.example.systemlogin.entity.login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface loginMapper extends JpaRepository<login,Integer> {
    login findByUsername(String username);
}
