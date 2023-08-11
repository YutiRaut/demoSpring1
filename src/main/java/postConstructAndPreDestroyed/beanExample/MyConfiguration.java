package postConstructAndPreDestroyed.beanExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import postConstructAndPreDestroyed.beanExample.MyBean;

@Configuration
public class MyConfiguration {

    @Bean
    @Scope(value="singleton")
//    @Scope(value="prototype")
    public MyBean myBean() {
        return new MyBean();
    }

}
