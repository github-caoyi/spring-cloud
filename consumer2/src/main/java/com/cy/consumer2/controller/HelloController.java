package com.cy.consumer2.controller;

import com.cy.consumer2.service.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author cy
 * @Date 2020/7/14 18:03
 * @Description
 **/
@RestController
public class HelloController {
    @Autowired
    private UserClient feignClient;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return feignClient.sayHello("Consumer2");
    }
}
