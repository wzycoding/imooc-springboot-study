package com.imooc.springboot.study.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 *
 * 描述：异步处理服务
 * @author wzy
 * @date 2020/6/20 21:44
 * @version V1.0
 **/
@Slf4j
@Service
public class AsyncService {
    @Async("getAsyncExecutor")
    public void asyncProcess() throws InterruptedException {
        log.info("async process task, current thread name -> {}",
                Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(2);
    }

    @Async
    public Future<Integer> asyncProcessHasReturn() throws InterruptedException {
        log.info("async process task, current thread name -> {}",
                Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(2);
        return new AsyncResult<>(100);
    }

}
