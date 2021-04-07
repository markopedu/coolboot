package com.jpaexample.coolboot.resttemplate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.annotation.RequestScope;

@Configuration
public class QuoteRestTemplateConfig {

    @Bean
    @RequestScope
    public QuoteRestTemplate getQuoteRestTemplate() {
        return new QuoteRestTemplate(new RestTemplate());
    }
}
