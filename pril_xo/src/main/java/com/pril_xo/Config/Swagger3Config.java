package com.pril_xo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

@Configuration
@EnableOpenApi
public class Swagger3Config {
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo());
    }

    /**
     * 页面基础信息
     */
    private ApiInfo apiInfo() {
        // 作者信息
        Contact contact = new Contact("dijianze", "https://www.baidu.com", "123456@qq.com");
        return new ApiInfo(
                "Pril Blog的接口文档",
                "项目描述",
                "1.0",
                "https://www.baidu.com/",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }
}
