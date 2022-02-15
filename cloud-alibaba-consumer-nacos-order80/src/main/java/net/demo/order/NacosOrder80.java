package net.demo.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Description:
 *
 * @author tz
 * @date 24/1/2022 上午 11:36
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosOrder80 {
    public static void main(String[] args) {
    SpringApplication.run(NacosOrder80.class, args);
    }
}
