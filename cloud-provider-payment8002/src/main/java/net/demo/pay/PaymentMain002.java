package net.demo.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Description: 
 * 
 * @author tz
 * @date 16/1/2022 上午 12:23
 */

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain002{
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain002.class, args);
    }
}