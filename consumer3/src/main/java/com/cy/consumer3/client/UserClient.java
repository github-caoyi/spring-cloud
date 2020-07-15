package com.cy.consumer3.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author cy
 * @Date 2020/7/14 18:12
 * @Description @FeignClient指定了访问的是哪个生产者应用，
 * 对应application.yml中spring.application.name
 **/
@FeignClient(name="provider",path = "/user")
public interface UserClient {

    /**
     * @Author cy
     * @Date 2020/7/15 18:18
     * @Description @RequestMapping里的参数限定访问的生产者的具体方法
     * @Param @RequestParam指定传递参数的名称即key，值为形参的值
     * @return
     **/
    @RequestMapping(value = "/sayhello",method = RequestMethod.GET)
    String sayHello(@RequestParam("consumerName") String name);

}
