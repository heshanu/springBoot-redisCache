package com.redis.redisREST.controller;

import com.redis.redisREST.entity.StudentEntity;
import com.redis.redisREST.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {
    @Autowired
    private TestService testService;
    @GetMapping("/")
    public String test() {
        return "Hello World";
    }

    @GetMapping("/test")
    public List<StudentEntity> getAll() {
        try {
            System.out.println("Get all students");
            return testService.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    @GetMapping("/test/{studentId}")
    @Cacheable(value = "students", key = "#studentId")
    public StudentEntity findStudent(@PathVariable Long studentId){
        try{
            return testService.findStudent(studentId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
