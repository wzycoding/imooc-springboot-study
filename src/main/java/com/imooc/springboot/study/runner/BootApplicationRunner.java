package com.imooc.springboot.study.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 描述：ApplicationRunner实现开机启动
 *
 * @Author wzy
 * @Date 2020/6/21 10:08
 * @Version V1.0
 **/
@Order(2)
@Slf4j
@Component
public class BootApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("This is BootApplicationRunner...");
    }
}
