package net.demo.pay.service;

/**
 * Description:
 *
 * @author tz
 * @date 16/1/2022 下午 2:20
 */
public interface RabbitMQService {

    public String sendMsg(String msg) throws Exception;


}
