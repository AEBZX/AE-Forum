package com.example.blogimage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.blogimage.entity.image;
import com.example.blogimage.mapper.imageMapper;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@RestController
public class imageController {
    @Autowired
    private imageMapper mapper;
    @PostMapping("/")
    public image upload(@RequestParam("file") MultipartFile file){
        byte[] bytes= new byte[0];
        try {
            bytes = new byte[file.getBytes().length];
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bytes = file.getBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }
        image image=new image();
        image.setValue(bytes);
        image.setName(file.getName());
        return mapper.save(image);
    }
    @GetMapping("/{id}")
    public byte[] getFiles(@PathVariable("id") Integer id){
        Optional<image> image=mapper.findById(id);
        image image1=image.get();
        return image1.getValue();
    }
}
