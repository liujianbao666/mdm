package com.nebula.cloudcustomer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "cloudclient")
public interface TestService {
    @RequestMapping("/test")
    String hello(@RequestParam String name);
}