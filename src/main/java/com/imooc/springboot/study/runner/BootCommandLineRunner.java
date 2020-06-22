package com.imooc.springboot.study.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 描述：BootCommandLineRunner
 *
 * @Author wzy
 * @Date 2020/6/21 10:20
 * @Version V1.0
 **/
@Slf4j
@Component
@Order(1)
public class BootCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("This is BootCommandLineRunner...");
    }
}
