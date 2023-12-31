package com.example.blogfollow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BlogFollowApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogFollowApplication.class, args);
    }

}
