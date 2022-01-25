package net.wanho.role;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 *
 * @author tz
 * @date 18/1/2022 下午 2:01
 */
@Configuration
public class LoadBalanceRule {
    @Bean
    public IRule myLoadBalanceRule(){
        return new RandomRule();
    }
}
