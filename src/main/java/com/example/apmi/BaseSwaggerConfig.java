package com.example.apmi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2

public class BaseSwaggerConfig {

    protected ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("APMI SAMPLE TEST")
                .description("APMI SAMPLE TEST")
                .termsOfServiceUrl("http://wormwood.com.sg/")
                .version("1.0.0")
                .build();
    }

    @Bean
    public Docket swaggerSpringfoxDocket(Environment env) {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .forCodeGeneration(true)
                .genericModelSubstitutes(ResponseEntity.class)
                .directModelSubstitute(java.sql.Timestamp.class, Long.class)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.apmi.controller"))
                .paths((PathSelectors.any()))
                .build();
        return docket;
    }
}