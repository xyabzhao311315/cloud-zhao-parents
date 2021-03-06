package com.zhao.sian.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosZhaoProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosZhaoProviderApplication.class, args);
    }
}
