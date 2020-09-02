package com.zhao.sian.cloud.service;

import com.zhao.sian.cloud.client.NacosProviderServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private NacosProviderServiceClient providerServiceClient;

    public String test(){
        providerServiceClient.test("test0");
        throw new IllegalArgumentException("error");
    }

}
