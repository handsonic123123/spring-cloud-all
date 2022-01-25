package net.wanho.order.service;

import net.wanho.common.po.Payment;
import net.wanho.common.vo.CommonResult;
import net.wanho.order.service.fallback.PaymentFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Description:
 *
 * @author tz
 * @date 18/1/2022 下午 1:48
 */
@FeignClient(value = "cloud-payment-service", fallback = PaymentFallbackService.class)
public interface PaymentFeignService {

  //  /**
  //   * Description:
  //   *
  //   * @author tz
  //   * @date 18/1/2022 下午 1:50
  //   * @param id
  //   * @return net.wanho.common.vo.CommonResult<net.wanho.common.po.Payment>
  //   */
  //  @GetMapping(value = "/payment/get/{id}")
  //  public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

  @GetMapping("/payment/hystrix/ok/{id}")
  public String paymentInfo_OK(@PathVariable("id") Integer id);

  @GetMapping("/payment/hystrix/timeout/{id}")
  public String paymentInfo_TimeOut(@PathVariable("id") Integer id);

  @GetMapping("/payment/circuit/{id}")
  public String paymentCircuitBreaker(@PathVariable("id") Integer id);

  @GetMapping(value = "/payment/get/{id}")
  public CommonResult<Payment> paymentConsul(@PathVariable("id") Long id);
}
