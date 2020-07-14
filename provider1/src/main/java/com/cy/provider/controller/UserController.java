package com.cy.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Author cy
 * @Date 2020/7/13 17:15
 * @Description 使用了Feign进行访问生产者
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/sayhello")
    public String sayhello(){
        return "I`m provider 1 ,Hello consumer!";
    }
}
