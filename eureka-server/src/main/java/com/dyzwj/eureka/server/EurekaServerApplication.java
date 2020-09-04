package com.dyzwj.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName EurekaServerApplication.java
 * @Description TODO
 * @createTime 2020年08月18日 17:39:00
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
