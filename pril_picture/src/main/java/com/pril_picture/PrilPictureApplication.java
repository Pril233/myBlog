package com.pril_picture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableTransactionManagement
@EnableOpenApi
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.pril_common.feign")
@ComponentScan(basePackages = {
        "com.pril_common.config.feign",
        "com.pril_common.handler",
        "com.pril_common.config.redis",
        "com.pril_utils",
        "com.pril_picture"})
public class PrilPictureApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrilPictureApplication.class, args);
    }

}
