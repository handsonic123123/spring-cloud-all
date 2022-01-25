package net.wanho.order.service.fallback;

import net.wanho.common.po.Payment;
import net.wanho.common.vo.CommonResult;
import net.wanho.order.service.PaymentFeignService;
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
