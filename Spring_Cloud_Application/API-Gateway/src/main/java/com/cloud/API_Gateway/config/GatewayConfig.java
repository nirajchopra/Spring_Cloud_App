package com.cloud.API_Gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes().route("auth", r -> r.path("/auth/**").uri("lb://service01"))
				.route("service02", r -> r.path("/service02/**").uri("lb://service02"))
				.route("EMS", r -> r.path("/EMS/**").uri("lb://EMS")).build();
	}

}
