package dima;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Test {
    @Bean
    public Robot robot(){
        return new ModelT1000(hand(),leg());
    }
    @Bean
    public Hand hand(){
        return new HandSony();
    }
    @Bean
    public Leg leg(){
        return new LegSony();
    }
}
