package net.wanho.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.ZonedDateTime;

/**
 * Description:
 *
 * @author tz
 * @date 21/1/2022 上午 10:49
 */
@Configuration
public class GatewayConfig {

  @Bean
  public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
    return builder
        .routes()
        .route("payment_route", r -> r.path("/payment/get/**").uri("lb://cloud-payment-service"))
        .route("payment_route2", r -> r.path("/payment/lb/**").uri("lb://cloud-payment-service"))
        .route(
            r ->
                r.path("/consumer/payment/get/**")
                    .and()
                    .after(ZonedDateTime.parse("2022-01-21T17:05:43.096+08:00[Asia/Shanghai]"))
//                  .and().cookie("name", "tz")
                    .uri("lb://cloud-consumer-service")
                    .id("order_route"))
        .build();
  }
}
