package com.pril_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableScheduling
@EnableTransactionManagement
@SpringBootApplication
@EnableOpenApi
@EnableDiscoveryClient
@EnableAsync
@EnableFeignClients("com.pril_common.feign")
@ComponentScan(basePackages = {
        "com.pril_common.config",
        "com.pril_common.fallback",
        "com.pril_utils",
        "com.pril_xo.utils",
        "com.pril_web",
        "com.pril_xo.service"})
public class PrilWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrilWebApplication.class, args);
    }

}
