package com.pril_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PrilGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrilGatewayApplication.class, args);
    }

}
