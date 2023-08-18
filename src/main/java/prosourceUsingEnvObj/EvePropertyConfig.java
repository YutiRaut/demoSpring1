package prosourceUsingEnvObj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration

//@PropertySource("classpath:mail.properties")
//@PropertySource("classpath:application.properties")
//@PropertySource("file:/C:/Users/rarti/Desktop/text.properties")

@PropertySources({
        @PropertySource("classpath:mail.properties"),
        @PropertySource("classpath:application.properties"),
        @PropertySource("file:/C:/Users/rarti/Desktop/text.properties")
})
public class EvePropertyConfig {

    @Bean
    public EvePropertyClass propertyClass() {
        return new EvePropertyClass();
    }

}


