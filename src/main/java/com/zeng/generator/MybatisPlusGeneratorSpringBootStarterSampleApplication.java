package com.zeng.generator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * @author zengzhanliang
 */
@SpringBootApplication
@MapperScan("com.zeng.generator.mapper")
public class MybatisPlusGeneratorSpringBootStarterSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusGeneratorSpringBootStarterSampleApplication.class, args);
    }

}
