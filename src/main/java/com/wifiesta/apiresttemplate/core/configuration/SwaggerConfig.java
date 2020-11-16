package com.wifiesta.apiresttemplate.core.configuration;

import java.util.Collections;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Swagger configuration file for the rest ws documentation
 *
 * @author charz
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api(CustomSettings settings) {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.wifiesta.apiresttemplate.core.controller"))
                .paths(PathSelectors.any()).build().apiInfo(apiInfo()).enable(settings.getEnableSwagger());
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("Charz++", "https://wifiesta.com", "carlos.becerra1234@gmail.com");
        ApiInfo apiInfo = new ApiInfo("API REST TEMPLATE API", "App description", "2.0.0", null, contact, null, null,
                Collections.emptyList());
        return apiInfo;
    }
}
