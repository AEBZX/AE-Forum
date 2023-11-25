package com.example.bloguser.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    @Column(name="image")
    private Integer image;
    @Column(name="mail")
    private String mail;
    @Column(name="details")
    private String details;
}
