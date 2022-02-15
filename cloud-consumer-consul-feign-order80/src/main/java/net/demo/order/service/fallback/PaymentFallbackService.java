package net.demo.order.service.fallback;

import net.demo.common.po.Payment;
import net.demo.common.vo.CommonResult;
import net.demo.order.service.PaymentFeignService;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author tz
 * @date 19/1/2022 下午 2:52
 */
@Component
public class PaymentFallbackService implements PaymentFeignService {
  @Override
  public String paymentInfo_OK(Integer id) {
    return "----paymentInfo_OK-fallback-o(╥﹏╥)o";
  }

  @Override
  public String paymentInfo_TimeOut(Integer id) {
    return "----paymentInfo_TimeOut fallback,o(╥﹏╥)o";
  }

  @Override
  public String paymentCircuitBreaker(Integer id) {
    return "----paymentCircuitBreaker fallback,o(╥﹏╥)o";
  }

  @Override
  public CommonResult<Payment> paymentConsul(Long id) {
    return null;
  }
}
