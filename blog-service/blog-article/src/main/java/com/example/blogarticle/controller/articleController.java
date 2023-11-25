package com.example.blogarticle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.blogarticle.entity.article;
import com.example.blogarticle.mapper.articleMapper;

import java.util.List;

@RestController
public class articleController {
    @Autowired
    private articleMapper mapper;
    @GetMapping("/findByTitle/{title}")
    public List<article> findByTitle(@PathVariable("title") String title){
        return mapper.findByTitleContaining(title);
    }
    @GetMapping("/findByWrite/{id}")
    public List<article> findByWrite(@PathVariable("id") Integer id){
        return mapper.findByWriteId(id);
    }
    @GetMapping("/{id}")
    public article findById(@PathVariable("id") Integer id){
        return mapper.findById(id).get();
    }
    @PostMapping("/")
    public void insert(@RequestBody article article){
        mapper.save(article);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        mapper.deleteById(id);
    }
    static void merge_sort_recursive(int[] arr, int[] result, int start, int end) {
        if (start >= end)
            return;
        int len = end - start, mid = (len >> 1) + start;
        int start1 = start, end1 = mid;
        int start2 = mid + 1, end2 = end;
        merge_sort_recursive(arr, result, start1, end1);
        merge_sort_recursive(arr, result, start2, end2);
        int k = start;
        while (start1 <= end1 && start2 <= end2)
            result[k++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
        while (start1 <= end1)
            result[k++] = arr[start1++];
        while (start2 <= end2)
            result[k++] = arr[start2++];
        for (k = start; k <= end; k++)
            arr[k] = result[k];
    }
    public static void merge_sort(int[] arr) {
        int len = arr.length;
        int[] result = new int[len];
        merge_sort_recursive(arr, result, 0, len - 1);
    }
}
