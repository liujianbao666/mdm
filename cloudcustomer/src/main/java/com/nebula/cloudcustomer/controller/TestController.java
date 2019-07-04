package com.nebula.cloudcustomer.controller;

import com.nebula.cloudcustomer.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping(value = "/test")
    public String test(@RequestParam String name) {

        return testService.hello(name);
    }

}