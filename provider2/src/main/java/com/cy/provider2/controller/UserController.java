package com.cy.provider2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author cy
 * @Date 2020/7/14 16:23
 * @Description
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/sayhello")
    public String sayhello(){
        return "I`m provider 2 ,Hello consumer!";
    }
}
