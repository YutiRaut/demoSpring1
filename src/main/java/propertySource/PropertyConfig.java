package propertySource;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:mail.properties")
@PropertySource("classpath:application.properties")
@PropertySource("file:/C:/Users/rarti/Desktop/text.properties")

//@PropertySources({
//        @PropertySource("classpath:mail.properties")  ,
//       @PropertySource("classpath:application.properties"),
//        @PropertySource("file:/C:/Users/rarti/Desktop/text.properties")
//})
public class PropertyConfig {

    @Bean
    public PropertyClass propertyClass() {
        return new PropertyClass();
    }

}
