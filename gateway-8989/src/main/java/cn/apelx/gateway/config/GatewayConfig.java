package cn.apelx.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 路由配置类
 *
 * @author apelx
 * @since 2020-11-02
 */
//@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("user_route", r -> r.path("/user/**").uri("http://localhost:9999/"))
                .route("product_route", r -> r.path("/product/**").uri("http://localhost:9998/"))
                .build();
    }
}
