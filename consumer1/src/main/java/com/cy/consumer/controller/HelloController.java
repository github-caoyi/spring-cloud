package com.cy.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author cy
 * @Date 2020/7/14 9:35
 * @Description 使用了RestTemplate进行访问生产者
 **/
@RestController
public class HelloController {

    @Bean
    @LoadBalanced
    public RestTemplate getResttemplate() {
        return new RestTemplate();
    }

    @Autowired
    private RestTemplate resttemplate;

    @RequestMapping("/hello")
    public String hello() {
        //指出服务地址   http://{服务提供者应用名名称}/{具体的controller}
        String url = "http://provider/user/sayhello";

        //返回值类型和我们的业务返回值一致
        return resttemplate.getForObject(url, String.class);

    }
}