package net.wanho.order;

import net.wanho.common.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Description:
 *
 * @author tz
 * @date 16/1/2022 下午 2:26
 */
@Component
@RabbitListener(queuesToDeclare = @Queue(RabbitMQConfig.RABBITMQ_DEMO_TOPIC))
public class RabbitConsumer {

  @RabbitHandler
  public void process(Map map) {
    System.out.println("消费者RabbitConsumer从RabbitMQ服务端消费消息："+map.toString());
  }
}
