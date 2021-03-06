package net.demo.order.controller;

import lombok.extern.slf4j.Slf4j;
import net.demo.common.po.Payment;
import net.demo.common.vo.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
/**
 * Description:
 *
 * @author tz
 * @date 13/1/2022 下午 4:20
 */
@Slf4j
@RestController
public class OrderController {

  public static final String PAYMENT_URL = "http://192.168.36.179:8001";

  @Resource private RestTemplate restTemplate;

  @GetMapping("/consumer/payment/create")
  public CommonResult<Payment> create(Payment payment) {
    return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
  }

  @GetMapping("/consumer/payment/get/{id}")
  public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
    return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
  }

  // ====================> zipkin+sleuth
  @GetMapping("/consumer/payment/zipkin")
  public String paymentZipkin() {
    String result =
        restTemplate.getForObject("http://CLOUD-PAYMENT-SERVICE" + "/payment/zipkin/", String.class);
    return result;
  }
}
