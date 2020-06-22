package com.imooc.springboot.study.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 描述：自定义的监控端点
 *
 * @Author wzy
 * @Date 2020/6/22 8:56
 * @Version V1.0
 **/
@Endpoint(id = "datetime")
public class DateTimeEndPoint {
    private String format = "yyyy-MM-dd HH:mm:ss";

    /**
     * 用来显示监控指标
     * @return
     */
    @ReadOperation
    public Map<String, Object> info() {
        Map<String, Object> info = new HashMap<>();
        info.put("name", "wzy");
        info.put("age", 19);
        info.put("datetime", new SimpleDateFormat(format).format(new Date()));

        return info;
    }

    /**
     * 动态更改监控指标
     * @param format
     */
    @WriteOperation
    public void setFormat(String format) {
        this.format = format;
    }
}
