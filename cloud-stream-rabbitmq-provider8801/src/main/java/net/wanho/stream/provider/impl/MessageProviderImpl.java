package net.wanho.stream.provider.impl;

import net.wanho.stream.provider.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;
/**
 * Description: 定义消息的推送管道
 *
 * @author tz
 * @date 23/1/2022 下午 4:57
 */
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {
  // 消息发送管道
  @Resource private MessageChannel output;

  @Override
  public String send() {
    String serial = UUID.randomUUID().toString();
    output.send(MessageBuilder.withPayload(serial).build());
    System.out.println("*****serial: " + serial);
    return null;
  }
}
