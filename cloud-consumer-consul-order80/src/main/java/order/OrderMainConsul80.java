package order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import rule.MyRule;

/**
 * Description:
 *
 * @author tz
 * @date 17/1/2022 上午 10:24
 */
@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "cloud-payment-service", configuration = MyRule.class)
public class OrderMainConsul80 {
  public static void main(String[] args) {
    SpringApplication.run(OrderMainConsul80.class, args);
  }
}
