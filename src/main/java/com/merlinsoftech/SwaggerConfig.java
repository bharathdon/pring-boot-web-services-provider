package com.merlinsoftech;

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
@EnableSwagger2
public class SwaggerConfig {
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("com.merlinsoftech.controller"))              
          .paths(PathSelectors.any())                          
          .build().apiInfo(apiEndPointInfo());
    }

    private ApiInfo apiEndPointInfo(){
	    return  new ApiInfoBuilder().title("SPRING REST PRODUCER").description("SPRING REST PRODUCER")
                .contact(new Contact("bharath","abc.com","dongisharapu999@gmail.com"))
                .licenseUrl("abc.com").version("1.0.0").build();
    }
}
