package com.pril_admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableTransactionManagement
@SpringBootApplication
@EnableOpenApi
@EnableDiscoveryClient
@EnableCaching
/*@EnableRabbit*/
@EnableFeignClients("com.pril_common.feign")
@ComponentScan(basePackages = {
        "com.pril_common.config",
        "com.pril_common.fallback",
        "com.pril_utils",
        "com.pril_admin",
        "com.pril_xo.utils",
        "com.pril_xo.service"
})
public class PrilAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrilAdminApplication.class, args);
    }

}
