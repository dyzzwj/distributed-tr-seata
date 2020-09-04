package com.dyzwj.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName OrderApplication.java
 * @Description TODO
 * @createTime 2020年08月18日 20:48:00
 */

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }
}
