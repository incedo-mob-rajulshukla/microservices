package com.incedo.politikberator.advisor.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
	
	@Bean
	public RestTemplate producesRestTemplate(){
		return new RestTemplate();
	}

}
