package net.demo.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * Description:
 *
 * @author tz
 * @date 28/1/2022 下午 1:23
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MainApp8401 {
  public static void main(String[] args) {
    SpringApplication.run(MainApp8401.class, args);
  }
}
