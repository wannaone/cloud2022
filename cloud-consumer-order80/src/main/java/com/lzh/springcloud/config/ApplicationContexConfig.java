package com.lzh.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author lvzhuanghu
 * @Description //TODO
 * @PackageName com.lzh.springcloud.config
 * @Date 2022-05-17$
 */
@Configuration
public class ApplicationContexConfig {

    @Bean // 注入到容器
    @LoadBalanced //负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
