package com.cy.consumer3.controller;

import com.cy.consumer3.client.UserClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author cy
 * @Date 2020/7/15 18:033
 * @Description
 **/
@RestController
public class HelloController {
    @Autowired
    private UserClient userClient;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "helloFallback")
    public String hello(){
        return userClient.sayHello("Consumer3");
    }

    public String helloFallback(){
        return "您请求的数据没拿到，我是hystrix返回的默认数据--hi,baby!";
    }
}
