package com.example.blogfollow.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class follows {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="follow")
    private Integer follow;
    @Column(name="follow_you")
    private Integer followYou;
}
