package lazyInitializedBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(value = "lazyInitializedBean")
public class ApplicationConfig {

    @Bean
    @Lazy(value = false)
    public ApplicationOne applicationOne() {
        return new ApplicationOne();
    }

    @Bean
    @Lazy
    public ApplicationTwo applicationTwo() {
        return new ApplicationTwo();
    }
}
