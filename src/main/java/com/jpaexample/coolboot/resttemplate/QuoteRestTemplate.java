package com.jpaexample.coolboot.resttemplate;

import com.jpaexample.coolboot.resttemplate.dto.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


public class QuoteRestTemplate {

    private Quote quote;
    private RestTemplate restTemplate;

    public QuoteRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        initQuote();
    }

    public Quote getQuote() {
        return quote;
    }


    private void initQuote() {
        quote = restTemplate.getForObject("https://quoters.apps.pcfone.io/api/random", Quote.class);
    }


}
