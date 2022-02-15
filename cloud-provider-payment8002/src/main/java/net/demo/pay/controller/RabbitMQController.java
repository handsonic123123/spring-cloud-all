package net.demo.pay.controller;

import net.demo.pay.service.RabbitMQService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
/**
 * Description:
 *
 * @author tz
 * @date 16/1/2022 下午 2:22
 */
@RestController
@RequestMapping("/mall/rabbitmq")
public class RabbitMQController {
    @Resource
    private RabbitMQService rabbitMQService;
    /**
     * Description:
     *
     * @author tz
     * @date 16/1/2022 下午 3:44
     * @param msg
     * @return java.lang.String
     */
    
    
    @PostMapping("/sendMsg")
    public String sendMsg(@RequestParam(name = "msg") String msg) throws Exception {
        return rabbitMQService.sendMsg(msg);
    }
}