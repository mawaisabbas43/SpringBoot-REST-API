package com.springbootrest.config;

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

/*
    URL for UI:http://localhost:8080/swagger-ui/
    URL for Swagger API:http://localhost:8080/v2/api-docs
    with below property for SpringBoot 2.6.2 and Swagger 3.0
    spring.mvc.pathmatch.matching-strategy=ant_path_matcher
*/
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfo());//Optional
    }

    private ApiInfo getApiInfo() {
        return new ApiInfoBuilder()
                .title("SpringBoot Rest Api")
                .version("1.0")
                .description("Api for SpringBoot Rest application")
                .contact(new Contact("Awais", "www.test.com", "mawaisabbas43@gmail.com"))
                .license("Apache licence version 2.0")
                .build();
    }

    //If UI not working including  //} extends WebMvcConfigurationSupport { //above at class
    //    @Override
//    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("swagger-ui.html")
//                .addResourceLocations("classpath:/META-INF/resources/");
//
//        registry.addResourceHandler("/webjars/**")
//                .addResourceLocations("classpath:/META-INF/resources/webjars/");
//    }
}
