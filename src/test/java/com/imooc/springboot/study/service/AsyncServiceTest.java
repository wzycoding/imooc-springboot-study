package com.imooc.springboot.study.service;

import com.imooc.springboot.study.async.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * 描述：测试异步服务
 *
 * @Author wzy
 * @Date 2020/6/20 23:00
 * @Version V1.0
 **/
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class AsyncServiceTest {
    @Autowired
    private AsyncService asyncService;

    @Test
    public void testAsyncProcess() throws InterruptedException {

        asyncService.asyncProcess();
        log.info("coming in testAsyncProcess...");
    }

    @Test
    public void testAsyncProcessHasReturn() throws InterruptedException, ExecutionException, TimeoutException {
        long start = System.currentTimeMillis();

        Future<Integer> result = asyncService.asyncProcessHasReturn();
        // 超过1s抛出异常
        log.info("get async task value: {}", result.get(1, TimeUnit.SECONDS));
        log.info("time elapse for async task: {}ms ",
                System.currentTimeMillis() - start);
    }
}
