package com.zhao.sian.cloud.service;

import com.zhao.sian.cloud.client.NacosProviderServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NacosProviderService {

    @Autowired
    private NacosProviderServiceClient providerServiceClient;

    public String getMessage() {
        String test = "test";
        String message = providerServiceClient.getMessage(test);
        return message;
    }
}
