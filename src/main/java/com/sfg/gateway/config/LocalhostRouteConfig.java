package com.sfg.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LocalhostRouteConfig {

    @Bean
    public RouteLocator localhostRoutes(final RouteLocatorBuilder builder) {
        return builder.routes().route("beer-service",
            r -> r.path("/api/v1/beer*", "/api/v1/beer/*", "/api/v1/beerUpc/*").uri("http://localhost:9090")).build();
    }

}
