package net.demo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Description:
 *
 * @author tz
 * @date 17/1/2022 下午 2:26
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulPayment8003 {
    public static void main(String[] args) {
        SpringApplication.run(ConsulPayment8003.class, args);
    }
}
