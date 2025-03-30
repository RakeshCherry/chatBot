package com.springboot.ChatBot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class OpenAPIConfiguration {

    @Value("${openapi.server.url}")
    private String api_url;

    @Bean
    public RestClient restClient(){
        return RestClient.builder()
                .baseUrl(api_url)
                .build();
    }
}
