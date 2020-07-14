package com.cy.consumer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient //表明这是一个eureka客户端
@EnableFeignClients
public class Consumer2Application {

    public static void main(String[] args) {
        SpringApplication.run(Consumer2Application.class, args);
    }

}
