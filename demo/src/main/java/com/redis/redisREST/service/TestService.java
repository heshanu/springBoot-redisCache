package com.redis.redisREST.service;

import com.redis.redisREST.entity.StudentEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TestService {
    List<StudentEntity> getAll();

    StudentEntity findStudent(Long id);
}
