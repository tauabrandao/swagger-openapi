package com.brandao.mstransaction.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;

@OpenAPIDefinition(info = @Info(
        title = "Transaction Service API",
        version = "v1",
        description = "Transaction microservice documentation"
))
public class OpenApiConfiguration {

    @Bean
    public OpenAPI openApi(){
        return new OpenAPI().components(new Components())
                .info(new io.swagger.v3.oas.models.info.Info()
                        .title("Transaction service API")
                        .version("v1"));
    }
}