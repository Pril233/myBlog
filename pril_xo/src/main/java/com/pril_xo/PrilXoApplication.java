package com.pril_xo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;


@SpringBootApplication
@EnableOpenApi
public class PrilXoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrilXoApplication.class, args);
    }

}
