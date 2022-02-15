package net.demo.pay.controller;

import lombok.extern.slf4j.Slf4j;
import net.demo.common.po.Payment;
import net.demo.common.vo.CommonResult;
import net.demo.pay.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * Description:
 *
 * @author tz
 * @date 13/1/2022 下午 3:38
 */
@RestController
@Slf4j
public class PaymentController {
  @Resource private PaymentService paymentService;

  @Value("${server.port}")
  private String serverPort;

  @Resource private DiscoveryClient discoveryClient;

  @GetMapping("/payment/feign/timeout")
  public String paymentFeignTimeOut() {
    try {
      TimeUnit.SECONDS.sleep(3);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return serverPort;
  }

  @GetMapping(value = "/payment/consul")
  public String paymentConsul() {
    return "springcloud with consul: " + serverPort + "\t" + UUID.randomUUID().toString();
  }

  /**
   * Description:
   *
   * @author tz
   * @date 13/1/2022 下午 3:39
   * @param payment
   * @return net.wanho.pay.vo.CommonResult
   */
  @PostMapping(value = "/payment/create")
  public CommonResult create(@RequestBody Payment payment) {
    int result = paymentService.create(payment);
    log.info("*****插入结果：" + result);

    if (result > 0) {
      return new CommonResult(200, "插入数据库成功", result);
    } else {
      return new CommonResult(444, "插入数据库失败", null);
    }
  }

  @GetMapping(value = "/payment/get/{id}")
  public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
    Payment payment = paymentService.getPaymentById(id);

    if (payment != null) {
      return new CommonResult(200, "查询成功,serverPort" + serverPort, payment);
    } else {
      return new CommonResult(444, "没有对应记录,查询ID: " + id, null);
    }
  }

  @GetMapping("/discovery")
  public Object discovery() {
    List<String> services = discoveryClient.getServices();
    services.forEach(
        ele -> {
          log.info("******ele" + ele);
          List<ServiceInstance> instances = discoveryClient.getInstances(ele);
          instances.forEach(
              ele1 -> {
                log.info(String.valueOf(ele1.getMetadata()));
              });
        });
    return 0;
  }
}
