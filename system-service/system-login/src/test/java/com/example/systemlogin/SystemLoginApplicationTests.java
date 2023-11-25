package com.example.systemlogin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.systemlogin.service.password;

@SpringBootTest
class SystemLoginApplicationTests {
    @Autowired
    private password password;
    @Test
    void contextLoads() {
        System.out.println(password.pass("123456"));
    }

}
