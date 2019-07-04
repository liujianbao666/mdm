package com.nebula.cloudclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudclientApplication.class, args);
    }

}
