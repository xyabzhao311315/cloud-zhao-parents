package com.zhao.sian.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class NacosController {
    @GetMapping(value = "/cloud/hello")
    public String echo(@RequestParam String message) {
        return "Hello Nacos Discovery Word"+message;
    }
}