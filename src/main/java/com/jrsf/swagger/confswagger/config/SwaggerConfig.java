package com.jrsf.swagger.confswagger.config;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.Collections;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

  @Bean
  public Docket swApi(){
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(metaInfo())
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.jrsf.swagger.confswagger"))
        .paths(regex("/rest.*"))
        .build();
  }

  @Bean
  public ApiInfo metaInfo(){
    return new ApiInfo(
        "Example of API",
        "Example of api with swagger 2.",
        "2.0",
        "Terms of Service",
        new Contact(
            "SysFactoring",
            "http://github.com/rabbittrix",
            "rabbittrix@hotmail.com"),
            "Apache License Version 2.0",
            "http://apache.org/licesen.html",
        Collections.emptyList()
        );
  }

}
