package com.imooc.springboot.study.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.imooc.springboot.study.conf.SpringBootConfig;
import com.imooc.springboot.study.vo.Imoocer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 描述：测试Controller
 */
@Slf4j
@RestController
@RequestMapping("/springboot")
public class TestController {
    @Value("${imooc.springboot.version}")
    private String version;

    @Value("${imooc.springboot.name}")
    private String name;

    private final SpringBootConfig springBootConfig;

    /**
     * ObjectMapper
     */
    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    public TestController(SpringBootConfig springBootConfig) {
        this.springBootConfig = springBootConfig;
    }


    /**
     * 使用第一种注入方式
     */
    @GetMapping("/conf_inject_1")
    public void firstConfInject() {
        log.info("first conf inject: {}, {}", version, name);
    }

    /**
     * 使用第二种注入方式
     */
    @GetMapping("/conf_inject_2")
    public void secondConfInject() {
        log.info("second conf inject: {}, {}",
                springBootConfig.getVersion(), springBootConfig.getName());
    }

    /**
     * jackson
     * @return
     * @throws Exception
     */
    @GetMapping("/jackson")
    public Imoocer jackson() throws Exception {
        Imoocer imoocer = Imoocer.builder()
                .name("wzy")
                .address("杭州")
                .age(20)
                .registerTime(new Date())
                .build();
        String jsonImoocer = objectMapper.writeValueAsString(imoocer);
        log.info("imoocer jackson: {}", jsonImoocer);
        return objectMapper.readValue(jsonImoocer, Imoocer.class);
    }

}
