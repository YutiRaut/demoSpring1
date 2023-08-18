package importAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BirdConfig {
    @Bean
    public Eagle eagle() {
        return new Eagle();
    }

    @Bean
    public Ostrich ostrich() {
        return new Ostrich();
    }

    @Bean
    public Peacock peacock() {
        return new Peacock();
    }
}