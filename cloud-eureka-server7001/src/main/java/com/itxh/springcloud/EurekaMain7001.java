package com.itxh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurakaMain7001
 * @Description TODO
 * @Author 93524
 * @Date 2020/12/2 19:48
 * @Version 1.0
 */
@SpringBootApplication
// 此注解 表示 当前项目为 Eureka的服务端，即注册中心
@EnableEurekaServer
public class EurekaMain7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class,args);
    }

}
