package net.demo.stream.controller;

import net.demo.stream.provider.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
/**
 * Description:
 *
 * @author tz
 * @date 23/1/2022 下午 4:59
 */
@RestController
public class SendMessageController {
  @Resource private IMessageProvider messageProvider;

  @GetMapping(value = "/sendMessage")
  public String sendMessage() {
    return messageProvider.send();
  }
}
