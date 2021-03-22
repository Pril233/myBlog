package com.pril_sms;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableRabbit
@EnableFeignClients("com.pril_common.feign")
@ComponentScan(basePackages = {
        "com.pril_utils",
        "com.pril_common.config.feign",
        "com.pril_common.fallback",
        "com.pril_sms",
})
public class PrilSmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrilSmsApplication.class, args);
    }

}
