package com.example.systemlogin.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "username")
    private String username;
    @Column(name="password")
    private String password;
}
