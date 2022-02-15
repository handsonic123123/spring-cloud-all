package net.demo.pay.service.impl;

import net.demo.common.po.Payment;
import net.demo.pay.mapper.PaymentDao;
import net.demo.pay.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
 * Description:
 *
 * @author tz
 * @date 13/1/2022 下午 3:37
 */


@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}