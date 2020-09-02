package com.zhao.sian.cloud.client;


import com.zhao.sian.cloud.fallback.FallbackFialHandler;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "zhao-nacos-provider", fallback = FallbackFialHandler.class)
public interface NacosProviderServiceClient{

    @GetMapping(value = "/cloud/hello")
    String getMessage(@RequestParam String message);

    @GetMapping(value = "/test")
    String test(@RequestParam String message);
}