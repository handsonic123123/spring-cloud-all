package net.demo.common.config;

/**
 * Description:
 *
 * @author tz
 * @date 16/1/2022 下午 2:06
 */
public class RabbitMQConfig {
    /**
     * Description:队列主题名称
     *
     */
    public static final String RABBITMQ_DEMO_TOPIC="rabbitmqDemoTopic";

    /**
     * Description:DIRECT交换机名称
     *
     */
    public static final String RABBITMQ_DEMO_DIRECT_EXCHANGE="rabbitmqDemoDirectExchange";

    /**
     * Description: DIRECT交换机和队列绑定的匹配键
     *
     */
    public static final String RABBITMQ_DEMO_DIRECT_ROUTING="rabbitmqDemoDirectRouting";



}
