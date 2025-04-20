package br.kpsantiago.Challange.WebApi.ApiDocs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig
{
    public OpenAPI openApi()
    {
        var apiInfo = new Info();
        apiInfo.setDescription("Desafio de uma API para aprender a fazer deploy de aplicações Java");
        apiInfo.setTitle("Basic Bank API");
        apiInfo.setVersion("1");

        return new OpenAPI().info(apiInfo);
    }
}
