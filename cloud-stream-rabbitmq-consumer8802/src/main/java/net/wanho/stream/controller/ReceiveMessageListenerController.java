package net.wanho.stream.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
/**
 * Description:
 *
 * @author tz
 * @date 23/1/2022 下午 5:55
 */
@Component
@EnableBinding(Sink.class)
public class ReceiveMessageListenerController {
  @Value("${server.port}")
  private String serverPort;

  @StreamListener(Sink.INPUT)
  public void input(Message<String> message) {
    System.out.println("消费者1号,----->接受到的消息: " + message.getPayload() + "\t  port: " + serverPort);
  }
}
