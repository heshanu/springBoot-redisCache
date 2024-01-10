package com.redis.redisREST;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.redis.core.RedisHash;

@SpringBootApplication
@EnableCaching
public class RedisRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisRestApplication.class, args);

	}

}
