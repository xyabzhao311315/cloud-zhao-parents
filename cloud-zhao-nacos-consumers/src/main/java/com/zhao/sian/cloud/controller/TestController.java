package com.zhao.sian.cloud.controller;

import com.zhao.sian.cloud.client.NacosProviderServiceClient;
import com.zhao.sian.cloud.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestService testService;
    @GetMapping("/test")
    public String test(){
        String test = testService.test();
        return test;
    }
}


