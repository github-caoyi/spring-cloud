package com.cy.provider2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author cy
 * @Date 2020/7/14 16:23
 * @Description
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/sayhello",method = RequestMethod.GET)
    public String sayhello(@RequestParam("consumerName")String name){
        return "I`m provider 2 ,Hello "+name+" !";
    }
}
