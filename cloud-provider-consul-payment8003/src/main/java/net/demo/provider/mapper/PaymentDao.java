package net.demo.provider.mapper;


import net.demo.common.po.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Description: @Repository不用Spring的
 * 
 * @author tz
 * @date 13/1/2022 下午 3:31
 */

@Mapper
public interface PaymentDao
{
    /**
     * Description:
     *
     * @author tz
     * @date 13/1/2022 下午 3:32
     * @param payment
     * @return int
     */
    public int create(Payment payment);
    
    /**
     * Description: 
     *
     * @author tz
     * @date 13/1/2022 下午 3:33
     * @param id
     * @return net.wanho.pay.po.Payment
     */

    
    public Payment getPaymentById(@Param("id") Long id);
}