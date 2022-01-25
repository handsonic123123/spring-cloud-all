package net.wanho.pay.service.impl;

import net.wanho.common.po.Payment;
import net.wanho.pay.mapper.PaymentDao;
import net.wanho.pay.service.PaymentService;
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