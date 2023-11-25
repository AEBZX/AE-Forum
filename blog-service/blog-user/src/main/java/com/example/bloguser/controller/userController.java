package com.example.bloguser.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.*;
import com.example.bloguser.mapper.userMapper;
import com.example.bloguser.entity.user;

import javax.mail.internet.MimeMessage;
import java.util.Optional;

@RestController
public class userController {
    @Autowired
    private userMapper mapper;
    @Autowired
    private JavaMailSender mailSender;
    @GetMapping("/{size}/{page}")
    public Page<user> findAll(@PathVariable("size") Integer size,
                              @PathVariable("page") Integer page){
        Pageable pageable= PageRequest.of(page,size);
        return mapper.findAll(pageable);
    }
    @GetMapping("/{id}")
    public Optional<user> findById(@PathVariable("id") Integer id){
        return mapper.findById(id);
    }
    @GetMapping("/findByUsername/{username}")
    public user findByUsername(@PathVariable("username") String username){
        return mapper.findByUsername(username);
    }
    @GetMapping("/sender")
    public void sender(@RequestParam("text") String text,
                       @RequestParam("to") String to) throws Exception{
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, false);
        helper.setFrom("3647049231@qq.com");
        helper.setTo(to);
        helper.setSubject("验证码");
        helper.setText(text);
        mailSender.send(message);
    }
    @GetMapping("/findByPassword/{password}")
    public user findByPassword(@PathVariable("password") String password){
        return mapper.findByPassword(password);
    }
    @GetMapping("/find")
    public user find(@RequestParam("username") String username,
                     @RequestParam("password") String password){
        return mapper.findByUsernameAndPassword(username,password);
    }
    @PostMapping("/")
    public user insert(@RequestBody user user){
        return mapper.save(user);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        mapper.deleteById(id);
    }
    @PatchMapping("/{id}/{imageId}")
    public void image(@PathVariable("id") Integer id,
                      @PathVariable("imageId") Integer imageId){
        Optional<user> user=mapper.findById(id);
        user user2=user.get();
        user2.setImage(imageId);
        mapper.save(user2);
    }
    @PatchMapping("/details/{username}/{details}")
    public void details(@PathVariable("username") String username,
                        @PathVariable("details") String details){
        user user=mapper.findByUsername(username);
        user.setDetails(details);
        mapper.save(user);
    }
    @PatchMapping("/findU/{username}/{new}")
    public user user(@PathVariable("username") String username,
                     @PathVariable("new") String New){
        user user=mapper.findByUsername(username);
        user.setUsername(username);
        return mapper.save(user);
    }
    @Data
    static class Bool{
        boolean login;
    }
}
