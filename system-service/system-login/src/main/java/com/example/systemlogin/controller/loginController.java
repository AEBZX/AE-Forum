package com.example.systemlogin.controller;
import com.example.systemlogin.entity.login;
import com.example.systemlogin.mapper.loginMapper;
import com.example.systemlogin.service.password;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class loginController {
    Logger logger= LoggerFactory.getLogger(loginController.class);
    @Autowired
    private password password;
    @Autowired
    private loginMapper loginMapper;
    @Data
    class BOOL{
        private boolean BOOL;
    }
    @GetMapping("/login")
    public BOOL login(@RequestParam("username") String username,
                      @RequestParam("password") String password){
        BOOL bool=new BOOL();
        bool.setBOOL(false);
        login login= loginMapper.findByUsername(username);
        if(login.getPassword().equals(password)){
            bool.setBOOL(true);
        }
        return bool;
    }
    @PostMapping("/register")
    public void register(@RequestBody login login){
        loginMapper.save(login);
    }
}
