package com.lzh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author lvzhuanghu
 * @Description //TODO
 * @PackageName com.lzh.springcloud
 * @Date 2022-05-18$
 */
@SpringBootApplication
@EnableEurekaServer
public class EureKaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EureKaMain7001.class,args);
    }
}
