package com.brandao.msstock.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;

@OpenAPIDefinition(info = @Info(
        title = "Stock Service API",
        version = "v1",
        description = "Stock microservice documentation"
))
public class OpenApiConfiguration {

    @Bean
    public OpenAPI openApi(){
        return new OpenAPI().components(new Components())
                .info(new io.swagger.v3.oas.models.info.Info()
                        .title("Stock service API")
                        .version("v1"));
    }
}