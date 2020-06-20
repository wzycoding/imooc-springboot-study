package com.imooc.springboot.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 应用启动类
 * 1.@EnableScheduling 允许当前应用开启定时任务
 * 2.@EnableAsync 开启异步支持
 */

@EnableScheduling
@EnableAsync
@SpringBootApplication
public class SpringBootStudyApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootStudyApplication.class, args);
    }
}
