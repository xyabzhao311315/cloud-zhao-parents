package com.zhao.sian.cloud.controller;

import com.zhao.sian.cloud.client.NacosProviderServiceClient;
import com.zhao.sian.cloud.service.NacosProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosConsumerFeignController {

    @Autowired
    private NacosProviderService providerService;

    @GetMapping(value = "/cloud/hello")
    public String echo() {
        return providerService.getMessage();
    }
}