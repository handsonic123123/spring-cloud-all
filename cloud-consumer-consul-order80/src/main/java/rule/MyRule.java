package rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description:
 *
 * @author tz
 * @date 17/1/2022 下午 4:48
 */
@Configuration
public class MyRule {
    @Bean
    public IRule rule(){
        return new RandomRule();
    }

}
