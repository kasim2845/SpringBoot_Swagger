package com.abc.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2//開啟Swagger2
public class SwaggerConfig {

	@Bean
	public Docket createRestApi() {
	   return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
	        .select()
	        .apis(RequestHandlerSelectors.basePackage("com.abc.demo.controller"))
	        .paths(PathSelectors.any()).build();
	}

	private ApiInfo apiInfo() {
	   return new ApiInfoBuilder().title("Decision Manage Swagger RESTful APIs")
	        .description("Decision API")
//	        .termsOfServiceUrl("http://swagger.io/")
	        .contact(new Contact("Google", "127.0.0.1", "google.com"))
	        .version("1.0")
	        .build();

	}
}
