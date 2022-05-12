package com.example.aggregator.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class AggregatorConfig {

    @Bean
    public RestTemplate getTemplate()
    {
        RestTemplate template = new RestTemplate();
        return template;
    }
}
