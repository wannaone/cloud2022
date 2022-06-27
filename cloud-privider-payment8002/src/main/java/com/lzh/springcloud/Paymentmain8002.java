package com.lzh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author lvzhuanghu
 * @Description //TODO
 * @PackageName com.lzh.springcloud
 * @Date 2022-05-17$
 */

@SpringBootApplication
@EnableEurekaClient
public class Paymentmain8002 {
    public static void main(String[] args) {
        SpringApplication.run(Paymentmain8002.class,args);
    }
}
