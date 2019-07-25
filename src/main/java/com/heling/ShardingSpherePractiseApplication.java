package com.heling;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.heling.mapper")
@EnableTransactionManagement
@EnableConfigurationProperties
public class ShardingSpherePractiseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingSpherePractiseApplication.class, args);
    }

}
