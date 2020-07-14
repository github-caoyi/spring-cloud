package com.cy.consumer2.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author cy
 * @Date 2020/7/14 18:12
 * @Description @FeignClient指定了访问的是哪个生产者应用
 * @Param
 * @return
 **/
@FeignClient("provider")
public interface UserClient {

    /**
     * @Author cy
     * @Date 2020/7/14 18:18
     * @Description @RequestMapping里的参数是生产者的具体服务的访问路径
     * @Param
     * @return
     **/
    @RequestMapping("/user/sayhello")
    String sayHello();
}
