package com.heling;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.heling.mapper")
@EnableTransactionManagement
public class ShardingSpherePractiseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingSpherePractiseApplication.class, args);
    }

}
