package com.sid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Tp3EurekaconfigRegistreApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp3EurekaconfigRegistreApplication.class, args);
    }

}
