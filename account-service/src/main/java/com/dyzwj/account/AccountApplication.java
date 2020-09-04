package com.dyzwj.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName AccountApplication.java
 * @Description TODO
 * @createTime 2020年08月18日 17:49:00
 */

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class AccountApplication {

    public static void main(String[] args) {

        SpringApplication.run(AccountApplication.class,args);
    }

}
