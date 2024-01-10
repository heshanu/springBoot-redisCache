package com.redis.redisREST.serviceImpl;

import com.redis.redisREST.entity.StudentEntity;
import com.redis.redisREST.repository.TestRepo;
import com.redis.redisREST.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class TestServiceImpl implements TestService {
   @Autowired
    private TestRepo testRepo;
    @Override
    public List<StudentEntity> getAll() {
        System.out.println("Get all students");
        return testRepo.findAll();
    }
    @Override

    public StudentEntity findStudent(Long id) {
        try{
            return testRepo.findById((long) id).get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
