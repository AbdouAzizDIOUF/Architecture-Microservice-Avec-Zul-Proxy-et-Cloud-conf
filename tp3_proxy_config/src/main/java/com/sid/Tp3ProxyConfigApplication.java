package com.sid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableDiscoveryClient // visible au niveau du service d'enregistrement
@SpringBootApplication
public class Tp3ProxyConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp3ProxyConfigApplication.class, args);
    }

}
