package com.imooc.springboot.study.service;

import com.alibaba.fastjson.JSON;
import com.imooc.springboot.service.ISplitService;
import com.imooc.springboot.study.conf.SpringBootConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 描述：Split Starter测试
 *
 * @Author wzy
 * @Date 2020/6/22 10:14
 * @Version V1.0
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class SplitServiceTest {
    @Autowired
    private ISplitService splitService;

    @Autowired
    private SpringBootConfig springBootConfig;

    @Test
    public void testSplitVersion() {
        log.info("split version: {}", JSON.toJSONString(
                splitService.split(springBootConfig.getVersion())));
    }
}
