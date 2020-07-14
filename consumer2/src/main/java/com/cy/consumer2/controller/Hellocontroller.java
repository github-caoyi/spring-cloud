package com.cy.consumer2.controller;

import com.cy.consumer2.service.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author cy
 * @Date 2020/7/14 18:03
 * @Description
 **/
@RestController
public class Hellocontroller {
    @Autowired
    private UserClient feignClient;
    /**
     * 此处的mapping是一级controller，调用方法里边绑定了二级的conroller，相当于用http完成一次转发
     * @return
     */
    @RequestMapping("/hello")
    public String hello(){
        return feignClient.sayHello();
    }
}
