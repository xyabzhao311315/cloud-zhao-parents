package com.zhao.sian.cloud.fallback;

import com.zhao.sian.cloud.client.NacosProviderServiceClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class FallbackFialHandler implements NacosProviderServiceClient{


    @Override
    public String getMessage(String message) {
        return null;
    }

    @Override
    public String test(String message) {
        return "fail---------------------";
    }
}
