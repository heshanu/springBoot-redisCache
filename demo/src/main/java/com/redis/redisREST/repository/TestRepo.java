package com.redis.redisREST.repository;

import com.redis.redisREST.entity.StudentEntity;
import com.redis.redisREST.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepo extends JpaRepository<StudentEntity, Long> {
}
