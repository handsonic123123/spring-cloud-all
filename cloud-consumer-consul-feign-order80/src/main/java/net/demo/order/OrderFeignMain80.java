package net.demo.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 * Description:
 * 
 * @author tz
 * @date 18/1/2022 下午 1:44
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
@RibbonClient(name = "cloud-payment-service")
public class OrderFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class, args);
    }
}