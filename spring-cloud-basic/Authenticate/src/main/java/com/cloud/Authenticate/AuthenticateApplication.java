package com.cloud.Authenticate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Starter class hai jaha sai appication run hoti hai
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AuthenticateApplication {
	public static void main( String[] args ) {
		SpringApplication.run(AuthenticateApplication.class, args);
	}
	
	/*
	 * @Bean public WebMvcConfigurer corsConfig() { WebMvcConfigurer w = new
	 * WebMvcConfigurer() {
	 * 
	 * public void addCorsMappings(CorsRegistry registry) {
	 * registry.addMapping("/**").allowedOrigins("http://localhost:4200"); } };
	 * return w; }
	 */
 
}
