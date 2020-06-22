package com.imooc.springboot.study.endpoint;

import org.springframework.boot.actuate.autoconfigure.endpoint.condition.ConditionalOnEnabledEndpoint;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述：自定义端点配置类
 *
 * @Author wzy
 * @Date 2020/6/22 9:07
 * @Version V1.0
 **/
@Configuration
public class DatetimeAndPointConfig {

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnEnabledEndpoint
    public DateTimeEndPoint dateTimeEndPoint() {
        return new DateTimeEndPoint();
    }
}
