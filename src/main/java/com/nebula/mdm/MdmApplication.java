package com.nebula.mdm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MdmApplication {

    public static void main(String[] args) {
        SpringApplication.run(MdmApplication.class, args);
    }

}
