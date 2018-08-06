package com.org.marketplace;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class JobMarketplaceApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(JobMarketplaceApplication.class);

	public static void main(String[] args) {
		LOGGER.info("Starting Job Marketplace APP");
		SpringApplication.run(JobMarketplaceApplication.class, args);
	}
	
}
