package net.wanho.order.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import net.wanho.common.po.Payment;
import net.wanho.common.vo.CommonResult;
import net.wanho.order.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
/**
 * Description:
 *
 * @author tz
 * @date 18/1/2022 下午 1:49
 */
@RestController
@Slf4j
//@DefaultProperties(defaultFallback = "paymentGlobalFallbackMethod")
public class OrderFeignController {

  @Resource private PaymentFeignService paymentFeignService;

  @GetMapping(value = "/consumer/payment/get/{id}")
  public CommonResult<Payment> paymentConsul(@PathVariable("id") Long id){
    return paymentFeignService.paymentConsul(id);
  }


  @GetMapping("/consumer/payment/circuit/{id}")
  public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
    return paymentFeignService.paymentCircuitBreaker(id);
  }

  //  @PostMapping("/hello")
  //  public String hello(@RequestBody Payment name) {
  //    return paymentFeignService.hello(name);
  //  }

  //  @GetMapping(value = "/consumer/payment/get/{id}")
  //  public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
  //    return paymentFeignService.getPaymentById(id);
  //  }

  @GetMapping("/consumer/payment/hystrix/timeout/{id}")
  @HystrixCommand(
      fallbackMethod = "paymentTimeOutFallbackMethod",
      commandProperties = {
        @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")
      })
  public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
    String result = paymentFeignService.paymentInfo_TimeOut(id);
    return result;
  }

  //  // 善后方法
  //  public String paymentTimeOutFallbackMethod(@PathVariable("id") Integer id) {
  //    return "我是消费者80,对方支付系统繁忙请10秒钟后再试或者自己运行出错请检查自己,o(╥﹏╥)o";
  //  }

  //  // 下面是全局fallback方法
  //  public String paymentGlobalFallbackMethod() {
  //    return "Global异常处理信息，请稍后再试，/(ㄒoㄒ)/~~";
  //  }

}
