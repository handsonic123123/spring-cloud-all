package net.demo.pay.service;


import net.demo.common.po.Payment;
import org.apache.ibatis.annotations.Param;
/**
 * Description: 
 * 
 * @author tz
 * @date 13/1/2022 下午 3:36
 */


public interface PaymentService
{
    /**
     * Description: 
     *
     * @author tz
     * @date 13/1/2022 下午 3:36
     * @param payment
     * @return int
     */
    
    
    public int create(Payment payment);
    
    /**
     * Description: 
     *
     * @author tz
     * @date 13/1/2022 下午 3:39
     * @param id
     * @return net.wanho.pay.po.Payment
     */
    
    
    public Payment getPaymentById(@Param("id") Long id);
}