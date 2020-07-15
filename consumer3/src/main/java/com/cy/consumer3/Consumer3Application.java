package com.cy.consumer3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;


@SpringBootApplication
@EnableEurekaClient //表明这是一个eureka客户端
@EnableFeignClients //
@EnableHystrix
@EnableHystrixDashboard //开启仪表盘
public class Consumer3Application {

    public static void main(String[] args) throws UnknownHostException {
//        SpringApplication.run(Consumer3Application.class, args);
        ConfigurableApplicationContext application = SpringApplication.run(Consumer3Application.class, args);
        Environment env = application.getEnvironment();
        String ip = InetAddress.getLocalHost().getHostAddress();
        String port = env.getProperty("server.port");
        String path = env.getProperty("server.servlet.context-path");
        System.out.println("\n----------------------------------------------------------\n\t" +
                "Application  is running! Access URLs:\n\t" +
                "Local: \t\thttp://localhost:" + port + path + "/\n\t" +
                "External: \thttp://" + ip + ":" + port + path + "/\n\t" +
                "swagger-ui: \t\thttp://" + ip + ":" + port + path + "/doc.html\n" +
                "HystrixDashboard: \t\thttp://" + ip + ":" + port + path + "/hystrix\n" +
                "----------------------------------------------------------");
    }


}
