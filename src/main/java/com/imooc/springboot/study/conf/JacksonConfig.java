package com.imooc.springboot.study.conf;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

/**
 * 描述：Jackson的配置
 *
 * @Author wzy
 * @Date 2020/6/21 21:20
 * @Version V1.0
 **/
@Configuration
public class JacksonConfig {

    public ObjectMapper getObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        // 不存在是null的key
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        return mapper;
    }
}
