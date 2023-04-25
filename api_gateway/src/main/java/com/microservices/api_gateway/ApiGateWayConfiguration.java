package com.microservices.api_gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGateWayConfiguration {

	@Bean
	public RouteLocator getwayRouter(RouteLocatorBuilder builder) {
		
		return builder.routes()
				.route(p -> p.path("/get")
									.uri("http://httpbin.org:80"))
				.route(p->p.path("/computer/**").uri("lb://computer-player"))
				.route(p -> p.path("/human/**").uri("lb://human-player"))
				.build();
	}
}
