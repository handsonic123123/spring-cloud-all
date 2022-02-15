package net.demo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Description:
 *
 * @author tz
 * @date 24/1/2022 上午 11:07
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosPayment9001 {
  public static void main(String[] args) {
    SpringApplication.run(NacosPayment9001.class, args);
  }
}
