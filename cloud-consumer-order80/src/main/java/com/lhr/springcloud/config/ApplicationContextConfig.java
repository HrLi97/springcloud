package com.lhr.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author lhr
 * @Date:2022/6/26 22:09
 * @Version 1.0
 */

/** 
 * @description:  RestTemplate是什么
 * @param: 简化了发起 HTTP 请求以及处理响应的过程，并且支持 REST 
 * @return:
 * @author LHR19970315
 * @date: 2022/6/29 15:43
 */

@Configuration
public class ApplicationContextConfig {
/**
 * @description:
 * @param: @LoadBalanced实现了负载均衡
 * @return: org.springframework.web.client.RestTemplate
 * @author LHR19970315
 * @date: 2022/6/29 15:41
 */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
